package net.opentrends.training.service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
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

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this employee.
    *
    * @return the employee ID of this employee
    */
    @Override
    public long getEmployeeId() {
        return _employee.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee.
    *
    * @param employeeId the employee ID of this employee
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee.setEmployeeId(employeeId);
    }

    /**
    * Returns the employee name of this employee.
    *
    * @return the employee name of this employee
    */
    @Override
    public java.lang.String getEmployeeName() {
        return _employee.getEmployeeName();
    }

    /**
    * Sets the employee name of this employee.
    *
    * @param employeeName the employee name of this employee
    */
    @Override
    public void setEmployeeName(java.lang.String employeeName) {
        _employee.setEmployeeName(employeeName);
    }

    /**
    * Returns the house name of this employee.
    *
    * @return the house name of this employee
    */
    @Override
    public java.lang.String getHouseName() {
        return _employee.getHouseName();
    }

    /**
    * Sets the house name of this employee.
    *
    * @param houseName the house name of this employee
    */
    @Override
    public void setHouseName(java.lang.String houseName) {
        _employee.setHouseName(houseName);
    }

    /**
    * Returns the street of this employee.
    *
    * @return the street of this employee
    */
    @Override
    public java.lang.String getStreet() {
        return _employee.getStreet();
    }

    /**
    * Sets the street of this employee.
    *
    * @param street the street of this employee
    */
    @Override
    public void setStreet(java.lang.String street) {
        _employee.setStreet(street);
    }

    /**
    * Returns the city of this employee.
    *
    * @return the city of this employee
    */
    @Override
    public java.lang.String getCity() {
        return _employee.getCity();
    }

    /**
    * Sets the city of this employee.
    *
    * @param city the city of this employee
    */
    @Override
    public void setCity(java.lang.String city) {
        _employee.setCity(city);
    }

    /**
    * Returns the district of this employee.
    *
    * @return the district of this employee
    */
    @Override
    public java.lang.String getDistrict() {
        return _employee.getDistrict();
    }

    /**
    * Sets the district of this employee.
    *
    * @param district the district of this employee
    */
    @Override
    public void setDistrict(java.lang.String district) {
        _employee.setDistrict(district);
    }

    /**
    * Returns the pincode of this employee.
    *
    * @return the pincode of this employee
    */
    @Override
    public java.lang.String getPincode() {
        return _employee.getPincode();
    }

    /**
    * Sets the pincode of this employee.
    *
    * @param pincode the pincode of this employee
    */
    @Override
    public void setPincode(java.lang.String pincode) {
        _employee.setPincode(pincode);
    }

    /**
    * Returns the phone of this employee.
    *
    * @return the phone of this employee
    */
    @Override
    public java.lang.String getPhone() {
        return _employee.getPhone();
    }

    /**
    * Sets the phone of this employee.
    *
    * @param phone the phone of this employee
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _employee.setPhone(phone);
    }

    /**
    * Returns the department of this employee.
    *
    * @return the department of this employee
    */
    @Override
    public java.lang.String getDepartment() {
        return _employee.getDepartment();
    }

    /**
    * Sets the department of this employee.
    *
    * @param department the department of this employee
    */
    @Override
    public void setDepartment(java.lang.String department) {
        _employee.setDepartment(department);
    }

    /**
    * Returns the designation of this employee.
    *
    * @return the designation of this employee
    */
    @Override
    public java.lang.String getDesignation() {
        return _employee.getDesignation();
    }

    /**
    * Sets the designation of this employee.
    *
    * @param designation the designation of this employee
    */
    @Override
    public void setDesignation(java.lang.String designation) {
        _employee.setDesignation(designation);
    }

    /**
    * Returns the salary of this employee.
    *
    * @return the salary of this employee
    */
    @Override
    public long getSalary() {
        return _employee.getSalary();
    }

    /**
    * Sets the salary of this employee.
    *
    * @param salary the salary of this employee
    */
    @Override
    public void setSalary(long salary) {
        _employee.setSalary(salary);
    }

    /**
    * Returns the email of this employee.
    *
    * @return the email of this employee
    */
    @Override
    public java.lang.String getEmail() {
        return _employee.getEmail();
    }

    /**
    * Sets the email of this employee.
    *
    * @param email the email of this employee
    */
    @Override
    public void setEmail(java.lang.String email) {
        _employee.setEmail(email);
    }

    /**
    * Returns the adharno of this employee.
    *
    * @return the adharno of this employee
    */
    @Override
    public java.lang.String getAdharno() {
        return _employee.getAdharno();
    }

    /**
    * Sets the adharno of this employee.
    *
    * @param adharno the adharno of this employee
    */
    @Override
    public void setAdharno(java.lang.String adharno) {
        _employee.setAdharno(adharno);
    }

    /**
    * Returns the file entry ID of this employee.
    *
    * @return the file entry ID of this employee
    */
    @Override
    public long getFileEntryId() {
        return _employee.getFileEntryId();
    }

    /**
    * Sets the file entry ID of this employee.
    *
    * @param fileEntryId the file entry ID of this employee
    */
    @Override
    public void setFileEntryId(long fileEntryId) {
        _employee.setFileEntryId(fileEntryId);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(
        net.opentrends.training.service.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.service.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public net.opentrends.training.service.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public net.opentrends.training.service.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
