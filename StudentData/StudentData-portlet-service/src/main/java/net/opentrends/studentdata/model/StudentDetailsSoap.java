package net.opentrends.studentdata.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentDetailsSoap implements Serializable {
    private long _studentId;
    private String _studentName;
    private String _department;
    private long _semester;
    private long _groupId;

    public StudentDetailsSoap() {
    }

    public static StudentDetailsSoap toSoapModel(StudentDetails model) {
        StudentDetailsSoap soapModel = new StudentDetailsSoap();

        soapModel.setStudentId(model.getStudentId());
        soapModel.setStudentName(model.getStudentName());
        soapModel.setDepartment(model.getDepartment());
        soapModel.setSemester(model.getSemester());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static StudentDetailsSoap[] toSoapModels(StudentDetails[] models) {
        StudentDetailsSoap[] soapModels = new StudentDetailsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentDetailsSoap[][] toSoapModels(StudentDetails[][] models) {
        StudentDetailsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentDetailsSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentDetailsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentDetailsSoap[] toSoapModels(List<StudentDetails> models) {
        List<StudentDetailsSoap> soapModels = new ArrayList<StudentDetailsSoap>(models.size());

        for (StudentDetails model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentDetailsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _studentId;
    }

    public void setPrimaryKey(long pk) {
        setStudentId(pk);
    }

    public long getStudentId() {
        return _studentId;
    }

    public void setStudentId(long studentId) {
        _studentId = studentId;
    }

    public String getStudentName() {
        return _studentName;
    }

    public void setStudentName(String studentName) {
        _studentName = studentName;
    }

    public String getDepartment() {
        return _department;
    }

    public void setDepartment(String department) {
        _department = department;
    }

    public long getSemester() {
        return _semester;
    }

    public void setSemester(long semester) {
        _semester = semester;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
