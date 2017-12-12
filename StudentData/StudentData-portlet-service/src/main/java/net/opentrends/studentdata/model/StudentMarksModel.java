package net.opentrends.studentdata.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the StudentMarks service. Represents a row in the &quot;StudentData_StudentMarks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.studentdata.model.impl.StudentMarksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarks
 * @see net.opentrends.studentdata.model.impl.StudentMarksImpl
 * @see net.opentrends.studentdata.model.impl.StudentMarksModelImpl
 * @generated
 */
public interface StudentMarksModel extends BaseModel<StudentMarks> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a student marks model instance should use the {@link StudentMarks} interface instead.
     */

    /**
     * Returns the primary key of this student marks.
     *
     * @return the primary key of this student marks
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this student marks.
     *
     * @param primaryKey the primary key of this student marks
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the mark ID of this student marks.
     *
     * @return the mark ID of this student marks
     */
    public long getMarkId();

    /**
     * Sets the mark ID of this student marks.
     *
     * @param markId the mark ID of this student marks
     */
    public void setMarkId(long markId);

    /**
     * Returns the student ID of this student marks.
     *
     * @return the student ID of this student marks
     */
    public long getStudentId();

    /**
     * Sets the student ID of this student marks.
     *
     * @param studentId the student ID of this student marks
     */
    public void setStudentId(long studentId);

    /**
     * Returns the mark1 of this student marks.
     *
     * @return the mark1 of this student marks
     */
    public long getMark1();

    /**
     * Sets the mark1 of this student marks.
     *
     * @param mark1 the mark1 of this student marks
     */
    public void setMark1(long mark1);

    /**
     * Returns the mark2 of this student marks.
     *
     * @return the mark2 of this student marks
     */
    public long getMark2();

    /**
     * Sets the mark2 of this student marks.
     *
     * @param mark2 the mark2 of this student marks
     */
    public void setMark2(long mark2);

    /**
     * Returns the mark3 of this student marks.
     *
     * @return the mark3 of this student marks
     */
    public long getMark3();

    /**
     * Sets the mark3 of this student marks.
     *
     * @param mark3 the mark3 of this student marks
     */
    public void setMark3(long mark3);

    /**
     * Returns the mark4 of this student marks.
     *
     * @return the mark4 of this student marks
     */
    public long getMark4();

    /**
     * Sets the mark4 of this student marks.
     *
     * @param mark4 the mark4 of this student marks
     */
    public void setMark4(long mark4);

    /**
     * Returns the mark5 of this student marks.
     *
     * @return the mark5 of this student marks
     */
    public long getMark5();

    /**
     * Sets the mark5 of this student marks.
     *
     * @param mark5 the mark5 of this student marks
     */
    public void setMark5(long mark5);

    /**
     * Returns the total of this student marks.
     *
     * @return the total of this student marks
     */
    public long getTotal();

    /**
     * Sets the total of this student marks.
     *
     * @param total the total of this student marks
     */
    public void setTotal(long total);

    /**
     * Returns the group ID of this student marks.
     *
     * @return the group ID of this student marks
     */
    public long getGroupId();

    /**
     * Sets the group ID of this student marks.
     *
     * @param groupId the group ID of this student marks
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
        net.opentrends.studentdata.model.StudentMarks studentMarks);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.studentdata.model.StudentMarks> toCacheModel();

    @Override
    public net.opentrends.studentdata.model.StudentMarks toEscapedModel();

    @Override
    public net.opentrends.studentdata.model.StudentMarks toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}