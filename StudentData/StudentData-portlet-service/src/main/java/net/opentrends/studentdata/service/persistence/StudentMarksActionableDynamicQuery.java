package net.opentrends.studentdata.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.studentdata.model.StudentMarks;
import net.opentrends.studentdata.service.StudentMarksLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class StudentMarksActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StudentMarksActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StudentMarksLocalServiceUtil.getService());
        setClass(StudentMarks.class);

        setClassLoader(net.opentrends.studentdata.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("markId");
    }
}
