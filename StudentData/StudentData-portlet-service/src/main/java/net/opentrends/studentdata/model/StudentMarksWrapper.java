package net.opentrends.studentdata.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StudentMarks}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarks
 * @generated
 */
public class StudentMarksWrapper implements StudentMarks,
    ModelWrapper<StudentMarks> {
    private StudentMarks _studentMarks;

    public StudentMarksWrapper(StudentMarks studentMarks) {
        _studentMarks = studentMarks;
    }

    @Override
    public Class<?> getModelClass() {
        return StudentMarks.class;
    }

    @Override
    public String getModelClassName() {
        return StudentMarks.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("markId", getMarkId());
        attributes.put("studentId", getStudentId());
        attributes.put("mark1", getMark1());
        attributes.put("mark2", getMark2());
        attributes.put("mark3", getMark3());
        attributes.put("mark4", getMark4());
        attributes.put("mark5", getMark5());
        attributes.put("total", getTotal());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long markId = (Long) attributes.get("markId");

        if (markId != null) {
            setMarkId(markId);
        }

        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        Long mark1 = (Long) attributes.get("mark1");

        if (mark1 != null) {
            setMark1(mark1);
        }

        Long mark2 = (Long) attributes.get("mark2");

        if (mark2 != null) {
            setMark2(mark2);
        }

        Long mark3 = (Long) attributes.get("mark3");

        if (mark3 != null) {
            setMark3(mark3);
        }

        Long mark4 = (Long) attributes.get("mark4");

        if (mark4 != null) {
            setMark4(mark4);
        }

        Long mark5 = (Long) attributes.get("mark5");

        if (mark5 != null) {
            setMark5(mark5);
        }

        Long total = (Long) attributes.get("total");

        if (total != null) {
            setTotal(total);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    /**
    * Returns the primary key of this student marks.
    *
    * @return the primary key of this student marks
    */
    @Override
    public long getPrimaryKey() {
        return _studentMarks.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student marks.
    *
    * @param primaryKey the primary key of this student marks
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _studentMarks.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the mark ID of this student marks.
    *
    * @return the mark ID of this student marks
    */
    @Override
    public long getMarkId() {
        return _studentMarks.getMarkId();
    }

    /**
    * Sets the mark ID of this student marks.
    *
    * @param markId the mark ID of this student marks
    */
    @Override
    public void setMarkId(long markId) {
        _studentMarks.setMarkId(markId);
    }

    /**
    * Returns the student ID of this student marks.
    *
    * @return the student ID of this student marks
    */
    @Override
    public long getStudentId() {
        return _studentMarks.getStudentId();
    }

    /**
    * Sets the student ID of this student marks.
    *
    * @param studentId the student ID of this student marks
    */
    @Override
    public void setStudentId(long studentId) {
        _studentMarks.setStudentId(studentId);
    }

    /**
    * Returns the mark1 of this student marks.
    *
    * @return the mark1 of this student marks
    */
    @Override
    public long getMark1() {
        return _studentMarks.getMark1();
    }

    /**
    * Sets the mark1 of this student marks.
    *
    * @param mark1 the mark1 of this student marks
    */
    @Override
    public void setMark1(long mark1) {
        _studentMarks.setMark1(mark1);
    }

    /**
    * Returns the mark2 of this student marks.
    *
    * @return the mark2 of this student marks
    */
    @Override
    public long getMark2() {
        return _studentMarks.getMark2();
    }

    /**
    * Sets the mark2 of this student marks.
    *
    * @param mark2 the mark2 of this student marks
    */
    @Override
    public void setMark2(long mark2) {
        _studentMarks.setMark2(mark2);
    }

    /**
    * Returns the mark3 of this student marks.
    *
    * @return the mark3 of this student marks
    */
    @Override
    public long getMark3() {
        return _studentMarks.getMark3();
    }

    /**
    * Sets the mark3 of this student marks.
    *
    * @param mark3 the mark3 of this student marks
    */
    @Override
    public void setMark3(long mark3) {
        _studentMarks.setMark3(mark3);
    }

    /**
    * Returns the mark4 of this student marks.
    *
    * @return the mark4 of this student marks
    */
    @Override
    public long getMark4() {
        return _studentMarks.getMark4();
    }

    /**
    * Sets the mark4 of this student marks.
    *
    * @param mark4 the mark4 of this student marks
    */
    @Override
    public void setMark4(long mark4) {
        _studentMarks.setMark4(mark4);
    }

    /**
    * Returns the mark5 of this student marks.
    *
    * @return the mark5 of this student marks
    */
    @Override
    public long getMark5() {
        return _studentMarks.getMark5();
    }

    /**
    * Sets the mark5 of this student marks.
    *
    * @param mark5 the mark5 of this student marks
    */
    @Override
    public void setMark5(long mark5) {
        _studentMarks.setMark5(mark5);
    }

    /**
    * Returns the total of this student marks.
    *
    * @return the total of this student marks
    */
    @Override
    public long getTotal() {
        return _studentMarks.getTotal();
    }

    /**
    * Sets the total of this student marks.
    *
    * @param total the total of this student marks
    */
    @Override
    public void setTotal(long total) {
        _studentMarks.setTotal(total);
    }

    /**
    * Returns the group ID of this student marks.
    *
    * @return the group ID of this student marks
    */
    @Override
    public long getGroupId() {
        return _studentMarks.getGroupId();
    }

    /**
    * Sets the group ID of this student marks.
    *
    * @param groupId the group ID of this student marks
    */
    @Override
    public void setGroupId(long groupId) {
        _studentMarks.setGroupId(groupId);
    }

    @Override
    public boolean isNew() {
        return _studentMarks.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _studentMarks.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _studentMarks.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _studentMarks.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _studentMarks.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _studentMarks.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _studentMarks.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _studentMarks.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _studentMarks.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _studentMarks.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _studentMarks.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StudentMarksWrapper((StudentMarks) _studentMarks.clone());
    }

    @Override
    public int compareTo(
        net.opentrends.studentdata.model.StudentMarks studentMarks) {
        return _studentMarks.compareTo(studentMarks);
    }

    @Override
    public int hashCode() {
        return _studentMarks.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.studentdata.model.StudentMarks> toCacheModel() {
        return _studentMarks.toCacheModel();
    }

    @Override
    public net.opentrends.studentdata.model.StudentMarks toEscapedModel() {
        return new StudentMarksWrapper(_studentMarks.toEscapedModel());
    }

    @Override
    public net.opentrends.studentdata.model.StudentMarks toUnescapedModel() {
        return new StudentMarksWrapper(_studentMarks.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _studentMarks.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _studentMarks.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentMarks.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentMarksWrapper)) {
            return false;
        }

        StudentMarksWrapper studentMarksWrapper = (StudentMarksWrapper) obj;

        if (Validator.equals(_studentMarks, studentMarksWrapper._studentMarks)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public StudentMarks getWrappedStudentMarks() {
        return _studentMarks;
    }

    @Override
    public StudentMarks getWrappedModel() {
        return _studentMarks;
    }

    @Override
    public void resetOriginalValues() {
        _studentMarks.resetOriginalValues();
    }
}
