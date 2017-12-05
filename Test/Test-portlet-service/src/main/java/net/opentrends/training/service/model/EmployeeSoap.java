package net.opentrends.training.service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _employeeId;
    private long _groupId;
    private String _employeeName;
    private String _houseName;
    private String _street;
    private String _city;
    private String _district;
    private String _pincode;
    private String _phone;
    private String _department;
    private String _designation;
    private long _salary;
    private String _email;
    private String _adharno;
    private long _fileEntryId;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setEmployeeName(model.getEmployeeName());
        soapModel.setHouseName(model.getHouseName());
        soapModel.setStreet(model.getStreet());
        soapModel.setCity(model.getCity());
        soapModel.setDistrict(model.getDistrict());
        soapModel.setPincode(model.getPincode());
        soapModel.setPhone(model.getPhone());
        soapModel.setDepartment(model.getDepartment());
        soapModel.setDesignation(model.getDesignation());
        soapModel.setSalary(model.getSalary());
        soapModel.setEmail(model.getEmail());
        soapModel.setAdharno(model.getAdharno());
        soapModel.setFileEntryId(model.getFileEntryId());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(long pk) {
        setEmployeeId(pk);
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getEmployeeName() {
        return _employeeName;
    }

    public void setEmployeeName(String employeeName) {
        _employeeName = employeeName;
    }

    public String getHouseName() {
        return _houseName;
    }

    public void setHouseName(String houseName) {
        _houseName = houseName;
    }

    public String getStreet() {
        return _street;
    }

    public void setStreet(String street) {
        _street = street;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public String getDistrict() {
        return _district;
    }

    public void setDistrict(String district) {
        _district = district;
    }

    public String getPincode() {
        return _pincode;
    }

    public void setPincode(String pincode) {
        _pincode = pincode;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public String getDepartment() {
        return _department;
    }

    public void setDepartment(String department) {
        _department = department;
    }

    public String getDesignation() {
        return _designation;
    }

    public void setDesignation(String designation) {
        _designation = designation;
    }

    public long getSalary() {
        return _salary;
    }

    public void setSalary(long salary) {
        _salary = salary;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getAdharno() {
        return _adharno;
    }

    public void setAdharno(String adharno) {
        _adharno = adharno;
    }

    public long getFileEntryId() {
        return _fileEntryId;
    }

    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;
    }
}
