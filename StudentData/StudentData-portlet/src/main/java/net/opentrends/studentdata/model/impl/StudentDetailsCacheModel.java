package net.opentrends.studentdata.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.studentdata.model.StudentDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing StudentDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetails
 * @generated
 */
public class StudentDetailsCacheModel implements CacheModel<StudentDetails>,
    Externalizable {
    public long studentId;
    public String studentName;
    public String department;
    public long semester;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{studentId=");
        sb.append(studentId);
        sb.append(", studentName=");
        sb.append(studentName);
        sb.append(", department=");
        sb.append(department);
        sb.append(", semester=");
        sb.append(semester);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public StudentDetails toEntityModel() {
        StudentDetailsImpl studentDetailsImpl = new StudentDetailsImpl();

        studentDetailsImpl.setStudentId(studentId);

        if (studentName == null) {
            studentDetailsImpl.setStudentName(StringPool.BLANK);
        } else {
            studentDetailsImpl.setStudentName(studentName);
        }

        if (department == null) {
            studentDetailsImpl.setDepartment(StringPool.BLANK);
        } else {
            studentDetailsImpl.setDepartment(department);
        }

        studentDetailsImpl.setSemester(semester);
        studentDetailsImpl.setGroupId(groupId);

        studentDetailsImpl.resetOriginalValues();

        return studentDetailsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        studentId = objectInput.readLong();
        studentName = objectInput.readUTF();
        department = objectInput.readUTF();
        semester = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(studentId);

        if (studentName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(studentName);
        }

        if (department == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(department);
        }

        objectOutput.writeLong(semester);
        objectOutput.writeLong(groupId);
    }
}
