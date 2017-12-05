package net.opentrends.training.service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.training.service.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long employeeId;
    public long groupId;
    public String employeeName;
    public String houseName;
    public String street;
    public String city;
    public String district;
    public String pincode;
    public String phone;
    public String department;
    public String designation;
    public long salary;
    public String email;
    public String adharno;
    public long fileEntryId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", employeeName=");
        sb.append(employeeName);
        sb.append(", houseName=");
        sb.append(houseName);
        sb.append(", street=");
        sb.append(street);
        sb.append(", city=");
        sb.append(city);
        sb.append(", district=");
        sb.append(district);
        sb.append(", pincode=");
        sb.append(pincode);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", department=");
        sb.append(department);
        sb.append(", designation=");
        sb.append(designation);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", email=");
        sb.append(email);
        sb.append(", adharno=");
        sb.append(adharno);
        sb.append(", fileEntryId=");
        sb.append(fileEntryId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);
        employeeImpl.setGroupId(groupId);

        if (employeeName == null) {
            employeeImpl.setEmployeeName(StringPool.BLANK);
        } else {
            employeeImpl.setEmployeeName(employeeName);
        }

        if (houseName == null) {
            employeeImpl.setHouseName(StringPool.BLANK);
        } else {
            employeeImpl.setHouseName(houseName);
        }

        if (street == null) {
            employeeImpl.setStreet(StringPool.BLANK);
        } else {
            employeeImpl.setStreet(street);
        }

        if (city == null) {
            employeeImpl.setCity(StringPool.BLANK);
        } else {
            employeeImpl.setCity(city);
        }

        if (district == null) {
            employeeImpl.setDistrict(StringPool.BLANK);
        } else {
            employeeImpl.setDistrict(district);
        }

        if (pincode == null) {
            employeeImpl.setPincode(StringPool.BLANK);
        } else {
            employeeImpl.setPincode(pincode);
        }

        if (phone == null) {
            employeeImpl.setPhone(StringPool.BLANK);
        } else {
            employeeImpl.setPhone(phone);
        }

        if (department == null) {
            employeeImpl.setDepartment(StringPool.BLANK);
        } else {
            employeeImpl.setDepartment(department);
        }

        if (designation == null) {
            employeeImpl.setDesignation(StringPool.BLANK);
        } else {
            employeeImpl.setDesignation(designation);
        }

        employeeImpl.setSalary(salary);

        if (email == null) {
            employeeImpl.setEmail(StringPool.BLANK);
        } else {
            employeeImpl.setEmail(email);
        }

        if (adharno == null) {
            employeeImpl.setAdharno(StringPool.BLANK);
        } else {
            employeeImpl.setAdharno(adharno);
        }

        employeeImpl.setFileEntryId(fileEntryId);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readLong();
        groupId = objectInput.readLong();
        employeeName = objectInput.readUTF();
        houseName = objectInput.readUTF();
        street = objectInput.readUTF();
        city = objectInput.readUTF();
        district = objectInput.readUTF();
        pincode = objectInput.readUTF();
        phone = objectInput.readUTF();
        department = objectInput.readUTF();
        designation = objectInput.readUTF();
        salary = objectInput.readLong();
        email = objectInput.readUTF();
        adharno = objectInput.readUTF();
        fileEntryId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeId);
        objectOutput.writeLong(groupId);

        if (employeeName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employeeName);
        }

        if (houseName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(houseName);
        }

        if (street == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(street);
        }

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        if (district == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(district);
        }

        if (pincode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pincode);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        if (department == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(department);
        }

        if (designation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(designation);
        }

        objectOutput.writeLong(salary);

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (adharno == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(adharno);
        }

        objectOutput.writeLong(fileEntryId);
    }
}
