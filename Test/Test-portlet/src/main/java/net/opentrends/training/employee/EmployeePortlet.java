package net.opentrends.training.employee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import net.opentrends.training.service.model.Employee;
import net.opentrends.training.service.permissions.EmployeePermissions;
import net.opentrends.training.service.service.EmployeeLocalServiceUtil;
import net.opentrends.training.service.service.impl.EmployeeLocalServiceImpl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class EmployeePortlet
 */
public class EmployeePortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(EmployeePortlet.class);
	public long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	public String DOCUMENT_FOLDER_NAME = "imageupload";
	public String FOLDER_DESC = "uploaded files";

	public void addEmployeeAction(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException, PortletException {
		// EmployeeLocalServiceUtil.addEmployee(request, response);
		long employeeId = CounterLocalServiceUtil.increment(Employee.class.getName());
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		EmployeePermissions.addCheck(themeDisplay);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Employee.class.getName(), request);
		User user = PortalUtil.getUser(request);

		Employee employee = null;
		employee = EmployeeLocalServiceUtil.createEmployee(employeeId);
		employee.setEmployeeName(request.getParameter("employeeName"));
		employee.setHouseName(request.getParameter("houseName"));
		employee.setStreet(request.getParameter("street"));
		employee.setCity(request.getParameter("city"));
		employee.setDistrict(request.getParameter("district"));
		employee.setPincode(request.getParameter("pincode"));
		employee.setDepartment(request.getParameter("department"));
		employee.setPhone(request.getParameter("phone"));
		employee.setDesignation(request.getParameter("designation"));
		employee.setAdharno(request.getParameter("aadharNumber"));
		employee.setEmail(request.getParameter("email"));
		employee.setSalary(ParamUtil.getLong(request, "salary"));
		employee.setGroupId(themeDisplay.getScopeGroupId());
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream fileStream = uploadPortletRequest.getFileAsStream("fileUpload");
		if (fileStream != null) {
			employee.setFileEntryId(uploadFile(employee, request, response));
		}

		EmployeeLocalServiceUtil.addEmployee(employee, user, serviceContext);

	}

	public void editEmployeeAction(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException, PortletException {
		Long employeeId = Long.parseLong(ParamUtil.getString(request, "employeeId"));
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
		employee.setEmployeeName(request.getParameter("employeeName"));
		employee.setHouseName(request.getParameter("houseName"));
		employee.setStreet(request.getParameter("street"));
		employee.setCity(request.getParameter("city"));
		employee.setDistrict(request.getParameter("district"));
		employee.setPincode(request.getParameter("pincode"));
		employee.setDepartment(request.getParameter("department"));
		employee.setPhone(request.getParameter("phone"));
		employee.setDesignation(request.getParameter("designation"));
		employee.setAdharno(request.getParameter("aadharNumber"));
		employee.setEmail(request.getParameter("email"));
		employee.setSalary(ParamUtil.getLong(request, "salary"));
		employee.setGroupId(themeDisplay.getScopeGroupId());
		long fileEntryId = Long.parseLong(request.getParameter("fileEntryId"));
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream fileStream = uploadPortletRequest.getFileAsStream("fileUpload");
		if (fileStream != null) {
			if (fileEntryId > 0) {
				updateFile(employee, request, response);
			} else {
				employee.setFileEntryId(uploadFile(employee, request, response));
			}
		}
		EmployeeLocalServiceUtil.updateEmployee(employee);
		response.setRenderParameter("mvcPath", "/html/employee/view.jsp");
	}

	public void deleteEmployeeAction(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		Long employeeId = Long.parseLong(ParamUtil.getString(request, "deleteKey"));
		Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
		if (employee.getFileEntryId() > 0) {
			DLFileEntryLocalServiceUtil.deleteDLFileEntry(employee.getFileEntryId());
		}
		EmployeeLocalServiceUtil.deleteEmployee(employeeId);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Employee.class.getName(), request);
		ResourceLocalServiceUtil.deleteResource(serviceContext.getCompanyId(), Employee.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, employeeId);
		response.setRenderParameter("mvcPath", "/html/employee/view.jsp");
	}

	public Long uploadFile(Employee employee, ActionRequest request, ActionResponse response)
			throws IOException, SystemException, PortalException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		createFolder(themeDisplay, request);
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream inputStream = uploadPortletRequest.getFileAsStream("fileUpload");
		long fileEntryId = 0;
		if (inputStream != null) {

			long repositoryId = themeDisplay.getScopeGroupId();
			String filename = uploadPortletRequest.getFileName("fileUpload");
			File file = uploadPortletRequest.getFile("fileUpload");
			String mimeType = MimeTypesUtil.getContentType(file);
			String title = employee.getEmployeeName() + "-" + employee.getEmployeeId() + " display pic";
			String description = "Display picture for " + employee.getEmployeeName();
			Map<String, Fields> fieldsMap = new HashMap<String, Fields>();
			FileEntry fileEntry = null;

			Folder folder = getFolder(themeDisplay);
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), request);
				_log.info("db enter");
				// fileEntry=DLFileEntryServiceUtil.addFileEntry(folder.getGroupId(),
				// repositoryId, folder.getFolderId(), filename, mimeType,
				// title, description, "", 0, fieldsMap, file, null,
				// file.length(), serviceContext);
				/*
				 * fileEntry =
				 * DLFileEntryLocalServiceUtil.addFileEntry(serviceContext.
				 * getUserId(), folder.getGroupId(), repositoryId,
				 * folder.getFolderId(), filename, mimeType, title, description,
				 * "", 0, fieldsMap, file, null, file.length(), serviceContext);
				 */
				fileEntry = DLAppLocalServiceUtil.addFileEntry(serviceContext.getUserId(), repositoryId,
						folder.getFolderId(), filename, mimeType, title, description, "", file, serviceContext);
				_log.info("entry id=" + fileEntry.getFileEntryId());
				fileEntryId = fileEntry.getFileEntryId();
			} catch (PortalException | SystemException exception) {
				exception.printStackTrace();
				_log.error(exception.getMessage());
			}
		}
		return fileEntryId;
	}

	public void createFolder(ThemeDisplay themeDisplay, ActionRequest request) {

		Folder folder = null;

		ServiceContext serviceContext;
		boolean folderExist = folderExist(themeDisplay);
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();

			try {
				serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), request);
				folder = DLAppServiceUtil.addFolder(repositoryId, PARENT_FOLDER_ID, DOCUMENT_FOLDER_NAME, FOLDER_DESC,
						serviceContext);
			} catch (PortalException | SystemException exception) {
				_log.error(exception.getMessage());
			}
		}
	}

	public Folder getFolder(ThemeDisplay themeDisplay) {
		long repositoryId = themeDisplay.getScopeGroupId();
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, DOCUMENT_FOLDER_NAME);
		} catch (PortalException | SystemException exception) {
			_log.error(exception.getMessage());
		}
		return folder;
	}

	public boolean folderExist(ThemeDisplay themeDisplay) {
		boolean existResult = false;
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			DLAppServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, DOCUMENT_FOLDER_NAME);
			existResult = true;
		} catch (Exception exception) {
			_log.error(exception.getMessage());
		}
		return existResult;
	}

	public void updateFile(Employee employee, ActionRequest request, ActionResponse response) throws IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream inputStream = uploadPortletRequest.getFileAsStream("fileUpload");
		if (inputStream != null) {
			String filename = uploadPortletRequest.getFileName("fileUpload");

			File file = uploadPortletRequest.getFile("fileUpload");
			String mimeType = uploadPortletRequest.getContentType("fileUpload");
			String title = employee.getEmployeeName() + "-" + employee.getEmployeeId() + " display pic";
			String description = "Display picture for " + employee.getEmployeeName();

			ServiceContext serviceContext;
			try {
				serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), request);
				System.out.println("Filename===>" + filename);
				/*
				 * DLAppServiceUtil.updateFileEntry(employee.getFileEntryId(),
				 * filename, mimeType, title, description, "", true, file,
				 * serviceContext);
				 */
				DLAppLocalServiceUtil.updateFileEntry(serviceContext.getUserId(), employee.getFileEntryId(), filename,
						mimeType, title, description, "", true, file, serviceContext);

			} catch (PortalException | SystemException exception) {
				_log.error(exception.getMessage());
				exception.printStackTrace();
			}
		}
	}

}
