package net.opentrends.studentdata.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StudentDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetails
 * @generated
 */
public class StudentDetailsWrapper implements StudentDetails,
    ModelWrapper<StudentDetails> {
    private StudentDetails _studentDetails;

    public StudentDetailsWrapper(StudentDetails studentDetails) {
        _studentDetails = studentDetails;
    }

    @Override
    public Class<?> getModelClass() {
        return StudentDetails.class;
    }

    @Override
    public String getModelClassName() {
        return StudentDetails.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentId", getStudentId());
        attributes.put("studentName", getStudentName());
        attributes.put("department", getDepartment());
        attributes.put("semester", getSemester());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        String studentName = (String) attributes.get("studentName");

        if (studentName != null) {
            setStudentName(studentName);
        }

        String department = (String) attributes.get("department");

        if (department != null) {
            setDepartment(department);
        }

        Long semester = (Long) attributes.get("semester");

        if (semester != null) {
            setSemester(semester);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    /**
    * Returns the primary key of this student details.
    *
    * @return the primary key of this student details
    */
    @Override
    public long getPrimaryKey() {
        return _studentDetails.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student details.
    *
    * @param primaryKey the primary key of this student details
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _studentDetails.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the student ID of this student details.
    *
    * @return the student ID of this student details
    */
    @Override
    public long getStudentId() {
        return _studentDetails.getStudentId();
    }

    /**
    * Sets the student ID of this student details.
    *
    * @param studentId the student ID of this student details
    */
    @Override
    public void setStudentId(long studentId) {
        _studentDetails.setStudentId(studentId);
    }

    /**
    * Returns the student name of this student details.
    *
    * @return the student name of this student details
    */
    @Override
    public java.lang.String getStudentName() {
        return _studentDetails.getStudentName();
    }

    /**
    * Sets the student name of this student details.
    *
    * @param studentName the student name of this student details
    */
    @Override
    public void setStudentName(java.lang.String studentName) {
        _studentDetails.setStudentName(studentName);
    }

    /**
    * Returns the department of this student details.
    *
    * @return the department of this student details
    */
    @Override
    public java.lang.String getDepartment() {
        return _studentDetails.getDepartment();
    }

    /**
    * Sets the department of this student details.
    *
    * @param department the department of this student details
    */
    @Override
    public void setDepartment(java.lang.String department) {
        _studentDetails.setDepartment(department);
    }

    /**
    * Returns the semester of this student details.
    *
    * @return the semester of this student details
    */
    @Override
    public long getSemester() {
        return _studentDetails.getSemester();
    }

    /**
    * Sets the semester of this student details.
    *
    * @param semester the semester of this student details
    */
    @Override
    public void setSemester(long semester) {
        _studentDetails.setSemester(semester);
    }

    /**
    * Returns the group ID of this student details.
    *
    * @return the group ID of this student details
    */
    @Override
    public long getGroupId() {
        return _studentDetails.getGroupId();
    }

    /**
    * Sets the group ID of this student details.
    *
    * @param groupId the group ID of this student details
    */
    @Override
    public void setGroupId(long groupId) {
        _studentDetails.setGroupId(groupId);
    }

    @Override
    public boolean isNew() {
        return _studentDetails.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _studentDetails.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _studentDetails.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _studentDetails.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _studentDetails.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _studentDetails.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _studentDetails.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _studentDetails.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _studentDetails.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _studentDetails.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _studentDetails.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StudentDetailsWrapper((StudentDetails) _studentDetails.clone());
    }

    @Override
    public int compareTo(
        net.opentrends.studentdata.model.StudentDetails studentDetails) {
        return _studentDetails.compareTo(studentDetails);
    }

    @Override
    public int hashCode() {
        return _studentDetails.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.studentdata.model.StudentDetails> toCacheModel() {
        return _studentDetails.toCacheModel();
    }

    @Override
    public net.opentrends.studentdata.model.StudentDetails toEscapedModel() {
        return new StudentDetailsWrapper(_studentDetails.toEscapedModel());
    }

    @Override
    public net.opentrends.studentdata.model.StudentDetails toUnescapedModel() {
        return new StudentDetailsWrapper(_studentDetails.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _studentDetails.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _studentDetails.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentDetails.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentDetailsWrapper)) {
            return false;
        }

        StudentDetailsWrapper studentDetailsWrapper = (StudentDetailsWrapper) obj;

        if (Validator.equals(_studentDetails,
                    studentDetailsWrapper._studentDetails)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public StudentDetails getWrappedStudentDetails() {
        return _studentDetails;
    }

    @Override
    public StudentDetails getWrappedModel() {
        return _studentDetails;
    }

    @Override
    public void resetOriginalValues() {
        _studentDetails.resetOriginalValues();
    }
}
