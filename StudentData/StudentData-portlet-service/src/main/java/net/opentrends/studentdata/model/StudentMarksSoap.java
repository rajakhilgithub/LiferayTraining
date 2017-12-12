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
public class StudentMarksSoap implements Serializable {
    private long _markId;
    private long _studentId;
    private long _mark1;
    private long _mark2;
    private long _mark3;
    private long _mark4;
    private long _mark5;
    private long _total;
    private long _groupId;

    public StudentMarksSoap() {
    }

    public static StudentMarksSoap toSoapModel(StudentMarks model) {
        StudentMarksSoap soapModel = new StudentMarksSoap();

        soapModel.setMarkId(model.getMarkId());
        soapModel.setStudentId(model.getStudentId());
        soapModel.setMark1(model.getMark1());
        soapModel.setMark2(model.getMark2());
        soapModel.setMark3(model.getMark3());
        soapModel.setMark4(model.getMark4());
        soapModel.setMark5(model.getMark5());
        soapModel.setTotal(model.getTotal());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static StudentMarksSoap[] toSoapModels(StudentMarks[] models) {
        StudentMarksSoap[] soapModels = new StudentMarksSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StudentMarksSoap[][] toSoapModels(StudentMarks[][] models) {
        StudentMarksSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StudentMarksSoap[models.length][models[0].length];
        } else {
            soapModels = new StudentMarksSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StudentMarksSoap[] toSoapModels(List<StudentMarks> models) {
        List<StudentMarksSoap> soapModels = new ArrayList<StudentMarksSoap>(models.size());

        for (StudentMarks model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StudentMarksSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _markId;
    }

    public void setPrimaryKey(long pk) {
        setMarkId(pk);
    }

    public long getMarkId() {
        return _markId;
    }

    public void setMarkId(long markId) {
        _markId = markId;
    }

    public long getStudentId() {
        return _studentId;
    }

    public void setStudentId(long studentId) {
        _studentId = studentId;
    }

    public long getMark1() {
        return _mark1;
    }

    public void setMark1(long mark1) {
        _mark1 = mark1;
    }

    public long getMark2() {
        return _mark2;
    }

    public void setMark2(long mark2) {
        _mark2 = mark2;
    }

    public long getMark3() {
        return _mark3;
    }

    public void setMark3(long mark3) {
        _mark3 = mark3;
    }

    public long getMark4() {
        return _mark4;
    }

    public void setMark4(long mark4) {
        _mark4 = mark4;
    }

    public long getMark5() {
        return _mark5;
    }

    public void setMark5(long mark5) {
        _mark5 = mark5;
    }

    public long getTotal() {
        return _total;
    }

    public void setTotal(long total) {
        _total = total;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
