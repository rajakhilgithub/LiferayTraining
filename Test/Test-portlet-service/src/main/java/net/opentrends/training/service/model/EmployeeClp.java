package net.opentrends.training.service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.training.service.service.ClpSerializer;
import net.opentrends.training.service.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
    private long _employeeId;
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
    private BaseModel<?> _employeeRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.service.ClpSerializer.class;

    public EmployeeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("employeeName", getEmployeeName());
        attributes.put("houseName", getHouseName());
        attributes.put("street", getStreet());
        attributes.put("city", getCity());
        attributes.put("district", getDistrict());
        attributes.put("pincode", getPincode());
        attributes.put("phone", getPhone());
        attributes.put("department", getDepartment());
        attributes.put("designation", getDesignation());
        attributes.put("salary", getSalary());
        attributes.put("email", getEmail());
        attributes.put("adharno", getAdharno());
        attributes.put("fileEntryId", getFileEntryId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        String employeeName = (String) attributes.get("employeeName");

        if (employeeName != null) {
            setEmployeeName(employeeName);
        }

        String houseName = (String) attributes.get("houseName");

        if (houseName != null) {
            setHouseName(houseName);
        }

        String street = (String) attributes.get("street");

        if (street != null) {
            setStreet(street);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        String district = (String) attributes.get("district");

        if (district != null) {
            setDistrict(district);
        }

        String pincode = (String) attributes.get("pincode");

        if (pincode != null) {
            setPincode(pincode);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String department = (String) attributes.get("department");

        if (department != null) {
            setDepartment(department);
        }

        String designation = (String) attributes.get("designation");

        if (designation != null) {
            setDesignation(designation);
        }

        Long salary = (Long) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String adharno = (String) attributes.get("adharno");

        if (adharno != null) {
            setAdharno(adharno);
        }

        Long fileEntryId = (Long) attributes.get("fileEntryId");

        if (fileEntryId != null) {
            setFileEntryId(fileEntryId);
        }
    }

    @Override
    public long getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employeeRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmployeeName() {
        return _employeeName;
    }

    @Override
    public void setEmployeeName(String employeeName) {
        _employeeName = employeeName;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeName", String.class);

                method.invoke(_employeeRemoteModel, employeeName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHouseName() {
        return _houseName;
    }

    @Override
    public void setHouseName(String houseName) {
        _houseName = houseName;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setHouseName", String.class);

                method.invoke(_employeeRemoteModel, houseName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStreet() {
        return _street;
    }

    @Override
    public void setStreet(String street) {
        _street = street;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setStreet", String.class);

                method.invoke(_employeeRemoteModel, street);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCity() {
        return _city;
    }

    @Override
    public void setCity(String city) {
        _city = city;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setCity", String.class);

                method.invoke(_employeeRemoteModel, city);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDistrict() {
        return _district;
    }

    @Override
    public void setDistrict(String district) {
        _district = district;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDistrict", String.class);

                method.invoke(_employeeRemoteModel, district);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPincode() {
        return _pincode;
    }

    @Override
    public void setPincode(String pincode) {
        _pincode = pincode;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPincode", String.class);

                method.invoke(_employeeRemoteModel, pincode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhone() {
        return _phone;
    }

    @Override
    public void setPhone(String phone) {
        _phone = phone;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_employeeRemoteModel, phone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDepartment() {
        return _department;
    }

    @Override
    public void setDepartment(String department) {
        _department = department;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartment", String.class);

                method.invoke(_employeeRemoteModel, department);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDesignation() {
        return _designation;
    }

    @Override
    public void setDesignation(String designation) {
        _designation = designation;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDesignation", String.class);

                method.invoke(_employeeRemoteModel, designation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(long salary) {
        _salary = salary;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", long.class);

                method.invoke(_employeeRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_employeeRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAdharno() {
        return _adharno;
    }

    @Override
    public void setAdharno(String adharno) {
        _adharno = adharno;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setAdharno", String.class);

                method.invoke(_employeeRemoteModel, adharno);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setFileEntryId", long.class);

                method.invoke(_employeeRemoteModel, fileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setEmployeeId(getEmployeeId());
        clone.setEmployeeName(getEmployeeName());
        clone.setHouseName(getHouseName());
        clone.setStreet(getStreet());
        clone.setCity(getCity());
        clone.setDistrict(getDistrict());
        clone.setPincode(getPincode());
        clone.setPhone(getPhone());
        clone.setDepartment(getDepartment());
        clone.setDesignation(getDesignation());
        clone.setSalary(getSalary());
        clone.setEmail(getEmail());
        clone.setAdharno(getAdharno());
        clone.setFileEntryId(getFileEntryId());

        return clone;
    }

    @Override
    public int compareTo(Employee employee) {
        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", employeeName=");
        sb.append(getEmployeeName());
        sb.append(", houseName=");
        sb.append(getHouseName());
        sb.append(", street=");
        sb.append(getStreet());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", district=");
        sb.append(getDistrict());
        sb.append(", pincode=");
        sb.append(getPincode());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", department=");
        sb.append(getDepartment());
        sb.append(", designation=");
        sb.append(getDesignation());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", adharno=");
        sb.append(getAdharno());
        sb.append(", fileEntryId=");
        sb.append(getFileEntryId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.service.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeName</column-name><column-value><![CDATA[");
        sb.append(getEmployeeName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>houseName</column-name><column-value><![CDATA[");
        sb.append(getHouseName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>street</column-name><column-value><![CDATA[");
        sb.append(getStreet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>district</column-name><column-value><![CDATA[");
        sb.append(getDistrict());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pincode</column-name><column-value><![CDATA[");
        sb.append(getPincode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phone</column-name><column-value><![CDATA[");
        sb.append(getPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>department</column-name><column-value><![CDATA[");
        sb.append(getDepartment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>designation</column-name><column-value><![CDATA[");
        sb.append(getDesignation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>adharno</column-name><column-value><![CDATA[");
        sb.append(getAdharno());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
        sb.append(getFileEntryId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
