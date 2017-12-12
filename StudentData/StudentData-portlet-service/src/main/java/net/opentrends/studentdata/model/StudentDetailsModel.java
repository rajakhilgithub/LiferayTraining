package net.opentrends.studentdata.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the StudentDetails service. Represents a row in the &quot;StudentData_StudentDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.studentdata.model.impl.StudentDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetails
 * @see net.opentrends.studentdata.model.impl.StudentDetailsImpl
 * @see net.opentrends.studentdata.model.impl.StudentDetailsModelImpl
 * @generated
 */
public interface StudentDetailsModel extends BaseModel<StudentDetails> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a student details model instance should use the {@link StudentDetails} interface instead.
     */

    /**
     * Returns the primary key of this student details.
     *
     * @return the primary key of this student details
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this student details.
     *
     * @param primaryKey the primary key of this student details
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the student ID of this student details.
     *
     * @return the student ID of this student details
     */
    public long getStudentId();

    /**
     * Sets the student ID of this student details.
     *
     * @param studentId the student ID of this student details
     */
    public void setStudentId(long studentId);

    /**
     * Returns the student name of this student details.
     *
     * @return the student name of this student details
     */
    @AutoEscape
    public String getStudentName();

    /**
     * Sets the student name of this student details.
     *
     * @param studentName the student name of this student details
     */
    public void setStudentName(String studentName);

    /**
     * Returns the department of this student details.
     *
     * @return the department of this student details
     */
    @AutoEscape
    public String getDepartment();

    /**
     * Sets the department of this student details.
     *
     * @param department the department of this student details
     */
    public void setDepartment(String department);

    /**
     * Returns the semester of this student details.
     *
     * @return the semester of this student details
     */
    public long getSemester();

    /**
     * Sets the semester of this student details.
     *
     * @param semester the semester of this student details
     */
    public void setSemester(long semester);

    /**
     * Returns the group ID of this student details.
     *
     * @return the group ID of this student details
     */
    public long getGroupId();

    /**
     * Sets the group ID of this student details.
     *
     * @param groupId the group ID of this student details
     */
    public void setGroupId(long groupId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        net.opentrends.studentdata.model.StudentDetails studentDetails);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.studentdata.model.StudentDetails> toCacheModel();

    @Override
    public net.opentrends.studentdata.model.StudentDetails toEscapedModel();

    @Override
    public net.opentrends.studentdata.model.StudentDetails toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
