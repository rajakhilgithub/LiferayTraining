package net.opentrends.candidate.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.candidate.model.Registration;
import net.opentrends.candidate.service.RegistrationLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RegistrationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RegistrationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RegistrationLocalServiceUtil.getService());
        setClass(Registration.class);

        setClassLoader(net.opentrends.candidate.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
