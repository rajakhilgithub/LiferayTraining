package net.opentrends.training.service.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;

import net.opentrends.training.service.model.Employee;
import net.opentrends.training.service.service.EmployeeLocalServiceUtil;
import net.opentrends.training.service.service.base.EmployeeLocalServiceBaseImpl;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link net.opentrends.training.service.service.EmployeeLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.service.base.EmployeeLocalServiceBaseImpl
 * @see net.opentrends.training.service.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * net.opentrends.training.service.service.EmployeeLocalServiceUtil} to
	 * access the employee local service.
	 */

	public String getPreviewtImageUrl(long fileEntryId, ThemeDisplay themeDisplay)
			throws PortalException, SystemException {
		FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);
		FileVersion fileVersion = null;
		try {
			fileVersion = fileEntry.getLatestFileVersion();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String imageUrl = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/"
				+ fileEntry.getGroupId() + "/" + fileEntry.getFolderId() + "/" + fileEntry.getTitle();
		// String imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion,
		// themeDisplay, "", true, true);
		return imageUrl;
	}

	public Employee addEmployee(Employee employee, User user, ServiceContext serviceContext)
			throws PortalException, SystemException {

		EmployeeLocalServiceUtil.addEmployee(employee);
		resourceLocalService.addResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
				user.getUserId(), Employee.class.getName(), employee.getEmployeeId(), false, true, true);
		return employee;
	}
}
