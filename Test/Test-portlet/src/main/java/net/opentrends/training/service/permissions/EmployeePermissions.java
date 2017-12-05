package net.opentrends.training.service.permissions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;

import net.opentrends.training.service.model.Employee;
import net.opentrends.training.service.service.EmployeeLocalServiceUtil;

public class EmployeePermissions {

	public static void check(PermissionChecker permissionChecker, long employeeId, String actionId)
			throws SystemException, PortalException {
		if (!contains(permissionChecker, employeeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long employeeId, String actionId)
			throws SystemException, PortalException {
		Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
		return permissionChecker.hasPermission(employee.getGroupId(), Employee.class.getName(),
				employee.getEmployeeId(), actionId);
	}

	public static void addCheck(ThemeDisplay themeDisplay) throws SystemException, PortalException {
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();
		if (!(permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Employee.class.getName(),
				themeDisplay.getUserId(), "ADD_EMPLOYEE"))) {
			throw new PrincipalException();

		}
	}
}
