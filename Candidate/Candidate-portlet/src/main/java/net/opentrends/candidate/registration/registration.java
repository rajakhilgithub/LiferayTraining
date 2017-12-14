package net.opentrends.candidate.registration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.ImageProcessorUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.candidate.model.Registration;
import net.opentrends.candidate.permissions.RegistrationPermissions;
import net.opentrends.candidate.service.RegistrationLocalServiceUtil;

/**
 * Portlet implementation class registration
 */
public class registration extends MVCPortlet {
	public long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static Log logs = LogFactoryUtil.getLog(Registration.class.getName());

	public void registerAction(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException, IOException {
		long id = CounterLocalServiceUtil.increment(Registration.class.getName());
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		RegistrationPermissions.addCheck(themeDisplay);

		Registration register = RegistrationLocalServiceUtil.createRegistration(id);
		register.setName(request.getParameter("name"));
		register.setEmail(request.getParameter("email"));
		register.setCity(request.getParameter("city"));
		register.setMobileNo(request.getParameter("mobileNo"));
		register.setUserId(themeDisplay.getUserId());
		register.setGroupId(themeDisplay.getScopeGroupId());
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream photoFileInputStream = uploadPortletRequest.getFileAsStream("photoFileEntry");
		if (photoFileInputStream != null) {
			String title = register.getId() + "-" + register.getName() + " photo";
			String description = "photo for " + register.getName();
			register.setPhotoFileEntryId(uploadFile(register, request, response, "Photo", "photo folder", themeDisplay,
					"photoFileEntry", title, description));
		}
		InputStream resumeFileInputStream = uploadPortletRequest.getFileAsStream("resumeFileEntry");
		if (resumeFileInputStream != null) {
			String title = register.getId() + "-" + register.getName() + " resume";
			String description = "resume for " + register.getName();
			register.setResumeFileEntryId(uploadFile(register, request, response, "Resume", "resume folder",
					themeDisplay, "resumeFileEntry", title, description));
		}

		RegistrationLocalServiceUtil.addRegistration(register);
		ResourceLocalServiceUtil.addResources(themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(),
				themeDisplay.getUserId(), Registration.class.getName(), id, false, true, true);
		logs.info("registration success");
	}

	public long uploadFile(Registration register, ActionRequest request, ActionResponse response, String folderName,
			String folderDesc, ThemeDisplay themeDisplay, String fieldName, String title, String description)
			throws IOException {
		createFolder(folderName, folderDesc, request, themeDisplay);
		long fileEntryId = 0;
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream fileStream = uploadPortletRequest.getFileAsStream(fieldName);
		if (fileStream != null) {
			File file = uploadPortletRequest.getFile(fieldName);
			String fileName = uploadPortletRequest.getFileName(fieldName);
			String mimeType = MimeTypesUtil.getContentType(file);
			Folder folder = getFolder(folderName, themeDisplay);
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), request);
				FileEntry fileEntry = DLAppLocalServiceUtil.addFileEntry(serviceContext.getUserId(),
						serviceContext.getScopeGroupId(), folder.getFolderId(), fileName, mimeType, title, description,
						"", file, serviceContext);
				fileEntryId = fileEntry.getFileEntryId();
			} catch (SystemException | PortalException exception) {
				logs.error(exception.getMessage());
				exception.printStackTrace();
			}
			logs.info("fileentry success");
		}
		return fileEntryId;
	}

	public void createFolder(String folderName, String folderDesc, ActionRequest request, ThemeDisplay themeDisplay) {
		Folder folder = null;
		boolean folderExistResult = folderExist(folderName, themeDisplay);
		ServiceContext serviceContext;
		if (!folderExistResult) {
			try {
				serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), request);
				folder = DLAppLocalServiceUtil.addFolder(serviceContext.getUserId(), serviceContext.getScopeGroupId(),
						PARENT_FOLDER_ID, folderName, folderDesc, serviceContext);
			} catch (SystemException | PortalException exception) {
				logs.error(exception.getMessage());
				exception.printStackTrace();
			}
			logs.info("folder created");
		}
	}

	public boolean folderExist(String folderName, ThemeDisplay themeDisplay) {
		long repositoryId = themeDisplay.getScopeGroupId();
		boolean result = false;
		try {
			DLAppLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, folderName);
			result = true;
		} catch (Exception exception) {
			logs.error(exception.getMessage());
			exception.printStackTrace();
		}
		return result;
	}

	public Folder getFolder(String folderName, ThemeDisplay themeDisplay) {
		long repositoryId = themeDisplay.getScopeGroupId();
		Folder folder = null;
		try {
			folder = DLAppLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, folderName);
		} catch (Exception exception) {
			logs.error(exception.getMessage());
			exception.printStackTrace();
		}
		return folder;
	}

	public void editRegistration(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long key = Long.parseLong(ParamUtil.getString(request, "key"));
		Registration register = RegistrationLocalServiceUtil.getRegistration(key);
		register.setName(request.getParameter("name"));
		register.setEmail(request.getParameter("email"));
		register.setCity(request.getParameter("city"));
		register.setMobileNo(request.getParameter("mobileNo"));
		long photoFileEntryId = Long.parseLong(ParamUtil.getString(request, "photoFileEntryId"));
		long resumeFileEntryId = Long.parseLong(ParamUtil.getString(request, "resumeFileEntryId"));
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream photoFileInputStream = uploadPortletRequest.getFileAsStream("photoFileEntry");
		if (photoFileInputStream != null) {
			String title = register.getId() + "-" + register.getName() + " photo";
			String description = "photo for " + register.getName();
			if (photoFileEntryId > 0) {
				updateFile(request, response, photoFileEntryId, themeDisplay, "photoFileEntry", title, description);
			} else {
				register.setPhotoFileEntryId(uploadFile(register, request, response, "Photo", "photo folder",
						themeDisplay, "photoFileEntry", title, description));
			}
		}
		InputStream resumeFileInputStream = uploadPortletRequest.getFileAsStream("resumeFileEntry");
		if (resumeFileInputStream != null) {
			String title = register.getId() + "-" + register.getName() + " resume";
			String description = "resume for " + register.getName();
			if (resumeFileEntryId > 0) {
				updateFile(request, response, resumeFileEntryId, themeDisplay, "resumeFileEntry", title, description);

			} else {
				register.setResumeFileEntryId(uploadFile(register, request, response, "Resume", "resume folder",
						themeDisplay, "resumeFileEntry", title, description));
			}
		}
		RegistrationLocalServiceUtil.updateRegistration(register);
		logs.info("registration edit success");
	}

	public void updateFile(ActionRequest request, ActionResponse response, long fileEntryId, ThemeDisplay themeDisplay,
			String fieldName, String title, String description) throws IOException {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		InputStream fileStream = uploadPortletRequest.getFileAsStream(fieldName);
		if (fileStream != null) {
			String fileName = uploadPortletRequest.getFileName(fieldName);
			File file = uploadPortletRequest.getFile(fieldName);
			String mimeType = MimeTypesUtil.getContentType(file);
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), request);
				DLAppLocalServiceUtil.updateFileEntry(serviceContext.getUserId(), fileEntryId, fileName, mimeType,
						title, description, "", true, file, serviceContext);
			} catch (SystemException | PortalException exception) {
				logs.error(exception.getMessage());
				exception.printStackTrace();
			}
		}
	}

	public void deleteRegistration(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long key = Long.parseLong(ParamUtil.getString(request, "Key"));
		Registration register = RegistrationLocalServiceUtil.getRegistration(key);
		if (register.getPhotoFileEntryId() > 0) {
			DLAppLocalServiceUtil.deleteFileEntry(register.getPhotoFileEntryId());
		}
		if (register.getResumeFileEntryId() > 0) {
			DLAppLocalServiceUtil.deleteFileEntry(register.getResumeFileEntryId());
		}
		ResourceLocalServiceUtil.deleteResource(themeDisplay.getCompanyId(), Registration.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, register.getId());
		RegistrationLocalServiceUtil.deleteRegistration(register.getId());
		response.setRenderParameter("mvcPath", "/html/registration/view.jsp");
	}
}
