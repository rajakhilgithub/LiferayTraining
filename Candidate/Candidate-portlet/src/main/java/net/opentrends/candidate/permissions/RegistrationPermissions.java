package net.opentrends.candidate.permissions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;

import net.opentrends.candidate.model.Registration;
import net.opentrends.candidate.service.RegistrationLocalServiceUtil;

public class RegistrationPermissions {
	public static void check(PermissionChecker permissionChecker, String action, long candidateId)
			throws PortalException, SystemException {
		if (!contains(permissionChecker, action, candidateId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, String action, long candidateId)
			throws PortalException, SystemException {
		Registration register = RegistrationLocalServiceUtil.getRegistration(candidateId);
		return permissionChecker.hasPermission(register.getGroupId(), Registration.class.getName(), register.getId(),
				action);
	}

	public static void addCheck(ThemeDisplay themeDisplay) throws PrincipalException {
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();
		if (!permissionChecker.hasPermission(themeDisplay.getScopeGroupId(), Registration.class.getName(),
				themeDisplay.getUserId(), "ADD_REGISTRATION")) {
			throw new PrincipalException();
		}
	}
}
