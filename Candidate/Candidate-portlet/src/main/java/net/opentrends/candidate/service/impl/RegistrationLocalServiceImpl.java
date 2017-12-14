package net.opentrends.candidate.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.theme.ThemeDisplay;

import net.opentrends.candidate.model.Registration;
import net.opentrends.candidate.service.base.RegistrationLocalServiceBaseImpl;

/**
 * The implementation of the registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link net.opentrends.candidate.service.RegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.candidate.service.base.RegistrationLocalServiceBaseImpl
 * @see net.opentrends.candidate.service.RegistrationLocalServiceUtil
 */
public class RegistrationLocalServiceImpl extends RegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * net.opentrends.candidate.service.RegistrationLocalServiceUtil} to access
	 * the registration local service.
	 */
	public List<Registration> findByGroupId(long groupId) throws SystemException {

		return registrationPersistence.findBygroupId(groupId);

	}

	public String getImageUrl(FileEntry fileEntry, ThemeDisplay themeDisplay) {
		String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/"
				+ fileEntry.getGroupId() + "/" + fileEntry.getFolderId() + "/" + fileEntry.getTitle();

		return url;
	}
}
