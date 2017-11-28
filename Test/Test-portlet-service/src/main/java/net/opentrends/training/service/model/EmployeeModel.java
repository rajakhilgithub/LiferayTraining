package net.opentrends.training.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;emp_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.training.service.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.training.service.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @see net.opentrends.training.service.model.impl.EmployeeImpl
 * @see net.opentrends.training.service.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
     */

    /**
     * Returns the primary key of this employee.
     *
     * @return the primary key of this employee
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this employee.
     *
     * @param primaryKey the primary key of this employee
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the employee ID of this employee.
     *
     * @return the employee ID of this employee
     */
    public long getEmployeeId();

    /**
     * Sets the employee ID of this employee.
     *
     * @param employeeId the employee ID of this employee
     */
    public void setEmployeeId(long employeeId);

    /**
     * Returns the employee name of this employee.
     *
     * @return the employee name of this employee
     */
    @AutoEscape
    public String getEmployeeName();

    /**
     * Sets the employee name of this employee.
     *
     * @param employeeName the employee name of this employee
     */
    public void setEmployeeName(String employeeName);

    /**
     * Returns the house name of this employee.
     *
     * @return the house name of this employee
     */
    @AutoEscape
    public String getHouseName();

    /**
     * Sets the house name of this employee.
     *
     * @param houseName the house name of this employee
     */
    public void setHouseName(String houseName);

    /**
     * Returns the street of this employee.
     *
     * @return the street of this employee
     */
    @AutoEscape
    public String getStreet();

    /**
     * Sets the street of this employee.
     *
     * @param street the street of this employee
     */
    public void setStreet(String street);

    /**
     * Returns the city of this employee.
     *
     * @return the city of this employee
     */
    @AutoEscape
    public String getCity();

    /**
     * Sets the city of this employee.
     *
     * @param city the city of this employee
     */
    public void setCity(String city);

    /**
     * Returns the district of this employee.
     *
     * @return the district of this employee
     */
    @AutoEscape
    public String getDistrict();

    /**
     * Sets the district of this employee.
     *
     * @param district the district of this employee
     */
    public void setDistrict(String district);

    /**
     * Returns the pincode of this employee.
     *
     * @return the pincode of this employee
     */
    @AutoEscape
    public String getPincode();

    /**
     * Sets the pincode of this employee.
     *
     * @param pincode the pincode of this employee
     */
    public void setPincode(String pincode);

    /**
     * Returns the phone of this employee.
     *
     * @return the phone of this employee
     */
    @AutoEscape
    public String getPhone();

    /**
     * Sets the phone of this employee.
     *
     * @param phone the phone of this employee
     */
    public void setPhone(String phone);

    /**
     * Returns the department of this employee.
     *
     * @return the department of this employee
     */
    @AutoEscape
    public String getDepartment();

    /**
     * Sets the department of this employee.
     *
     * @param department the department of this employee
     */
    public void setDepartment(String department);

    /**
     * Returns the designation of this employee.
     *
     * @return the designation of this employee
     */
    @AutoEscape
    public String getDesignation();

    /**
     * Sets the designation of this employee.
     *
     * @param designation the designation of this employee
     */
    public void setDesignation(String designation);

    /**
     * Returns the salary of this employee.
     *
     * @return the salary of this employee
     */
    public long getSalary();

    /**
     * Sets the salary of this employee.
     *
     * @param salary the salary of this employee
     */
    public void setSalary(long salary);

    /**
     * Returns the email of this employee.
     *
     * @return the email of this employee
     */
    @AutoEscape
    public String getEmail();

    /**
     * Sets the email of this employee.
     *
     * @param email the email of this employee
     */
    public void setEmail(String email);

    /**
     * Returns the adharno of this employee.
     *
     * @return the adharno of this employee
     */
    @AutoEscape
    public String getAdharno();

    /**
     * Sets the adharno of this employee.
     *
     * @param adharno the adharno of this employee
     */
    public void setAdharno(String adharno);

    /**
     * Returns the file entry ID of this employee.
     *
     * @return the file entry ID of this employee
     */
    public long getFileEntryId();

    /**
     * Sets the file entry ID of this employee.
     *
     * @param fileEntryId the file entry ID of this employee
     */
    public void setFileEntryId(long fileEntryId);

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
        net.opentrends.training.service.model.Employee employee);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.training.service.model.Employee> toCacheModel();

    @Override
    public net.opentrends.training.service.model.Employee toEscapedModel();

    @Override
    public net.opentrends.training.service.model.Employee toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}