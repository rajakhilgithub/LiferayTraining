package net.opentrends.studentdata.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import net.opentrends.studentdata.model.StudentMarks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing StudentMarks in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarks
 * @generated
 */
public class StudentMarksCacheModel implements CacheModel<StudentMarks>,
    Externalizable {
    public long markId;
    public long studentId;
    public long mark1;
    public long mark2;
    public long mark3;
    public long mark4;
    public long mark5;
    public long total;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{markId=");
        sb.append(markId);
        sb.append(", studentId=");
        sb.append(studentId);
        sb.append(", mark1=");
        sb.append(mark1);
        sb.append(", mark2=");
        sb.append(mark2);
        sb.append(", mark3=");
        sb.append(mark3);
        sb.append(", mark4=");
        sb.append(mark4);
        sb.append(", mark5=");
        sb.append(mark5);
        sb.append(", total=");
        sb.append(total);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public StudentMarks toEntityModel() {
        StudentMarksImpl studentMarksImpl = new StudentMarksImpl();

        studentMarksImpl.setMarkId(markId);
        studentMarksImpl.setStudentId(studentId);
        studentMarksImpl.setMark1(mark1);
        studentMarksImpl.setMark2(mark2);
        studentMarksImpl.setMark3(mark3);
        studentMarksImpl.setMark4(mark4);
        studentMarksImpl.setMark5(mark5);
        studentMarksImpl.setTotal(total);
        studentMarksImpl.setGroupId(groupId);

        studentMarksImpl.resetOriginalValues();

        return studentMarksImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        markId = objectInput.readLong();
        studentId = objectInput.readLong();
        mark1 = objectInput.readLong();
        mark2 = objectInput.readLong();
        mark3 = objectInput.readLong();
        mark4 = objectInput.readLong();
        mark5 = objectInput.readLong();
        total = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(markId);
        objectOutput.writeLong(studentId);
        objectOutput.writeLong(mark1);
        objectOutput.writeLong(mark2);
        objectOutput.writeLong(mark3);
        objectOutput.writeLong(mark4);
        objectOutput.writeLong(mark5);
        objectOutput.writeLong(total);
        objectOutput.writeLong(groupId);
    }
}
