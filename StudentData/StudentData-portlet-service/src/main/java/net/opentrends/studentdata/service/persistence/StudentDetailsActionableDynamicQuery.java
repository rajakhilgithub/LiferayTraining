package net.opentrends.studentdata.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.studentdata.model.StudentDetails;
import net.opentrends.studentdata.service.StudentDetailsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class StudentDetailsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StudentDetailsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StudentDetailsLocalServiceUtil.getService());
        setClass(StudentDetails.class);

        setClassLoader(net.opentrends.studentdata.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("studentId");
    }
}
