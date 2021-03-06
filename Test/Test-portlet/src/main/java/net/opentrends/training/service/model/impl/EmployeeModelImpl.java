package net.opentrends.training.service.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.opentrends.training.service.model.Employee;
import net.opentrends.training.service.model.EmployeeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Employee service. Represents a row in the &quot;emp_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.opentrends.training.service.model.EmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeImpl
 * @see net.opentrends.training.service.model.Employee
 * @see net.opentrends.training.service.model.EmployeeModel
 * @generated
 */
public class EmployeeModelImpl extends BaseModelImpl<Employee>
    implements EmployeeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employee model instance should use the {@link net.opentrends.training.service.model.Employee} interface instead.
     */
    public static final String TABLE_NAME = "emp_Employee";
    public static final Object[][] TABLE_COLUMNS = {
            { "employeeId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "employeeName", Types.VARCHAR },
            { "houseName", Types.VARCHAR },
            { "street", Types.VARCHAR },
            { "city", Types.VARCHAR },
            { "district", Types.VARCHAR },
            { "pincode", Types.VARCHAR },
            { "phone", Types.VARCHAR },
            { "department", Types.VARCHAR },
            { "designation", Types.VARCHAR },
            { "salary", Types.BIGINT },
            { "email", Types.VARCHAR },
            { "adharno", Types.VARCHAR },
            { "fileEntryId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table emp_Employee (employeeId LONG not null primary key,groupId LONG,employeeName VARCHAR(75) null,houseName VARCHAR(75) null,street VARCHAR(75) null,city VARCHAR(75) null,district VARCHAR(75) null,pincode VARCHAR(75) null,phone VARCHAR(75) null,department VARCHAR(75) null,designation VARCHAR(75) null,salary LONG,email VARCHAR(75) null,adharno VARCHAR(75) null,fileEntryId LONG)";
    public static final String TABLE_SQL_DROP = "drop table emp_Employee";
    public static final String ORDER_BY_JPQL = " ORDER BY employee.employeeId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY emp_Employee.employeeId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.net.opentrends.training.service.model.Employee"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.net.opentrends.training.service.model.Employee"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.net.opentrends.training.service.model.Employee"),
            true);
    public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
    public static long EMPLOYEENAME_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.net.opentrends.training.service.model.Employee"));
    private static ClassLoader _classLoader = Employee.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Employee.class
        };
    private long _employeeId;
    private long _originalEmployeeId;
    private boolean _setOriginalEmployeeId;
    private long _groupId;
    private String _employeeName;
    private String _originalEmployeeName;
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
    private long _columnBitmask;
    private Employee _escapedModel;

    public EmployeeModelImpl() {
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
        attributes.put("groupId", getGroupId());
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

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
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
        _columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

        if (!_setOriginalEmployeeId) {
            _setOriginalEmployeeId = true;

            _originalEmployeeId = _employeeId;
        }

        _employeeId = employeeId;
    }

    public long getOriginalEmployeeId() {
        return _originalEmployeeId;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @Override
    public String getEmployeeName() {
        if (_employeeName == null) {
            return StringPool.BLANK;
        } else {
            return _employeeName;
        }
    }

    @Override
    public void setEmployeeName(String employeeName) {
        _columnBitmask |= EMPLOYEENAME_COLUMN_BITMASK;

        if (_originalEmployeeName == null) {
            _originalEmployeeName = _employeeName;
        }

        _employeeName = employeeName;
    }

    public String getOriginalEmployeeName() {
        return GetterUtil.getString(_originalEmployeeName);
    }

    @Override
    public String getHouseName() {
        if (_houseName == null) {
            return StringPool.BLANK;
        } else {
            return _houseName;
        }
    }

    @Override
    public void setHouseName(String houseName) {
        _houseName = houseName;
    }

    @Override
    public String getStreet() {
        if (_street == null) {
            return StringPool.BLANK;
        } else {
            return _street;
        }
    }

    @Override
    public void setStreet(String street) {
        _street = street;
    }

    @Override
    public String getCity() {
        if (_city == null) {
            return StringPool.BLANK;
        } else {
            return _city;
        }
    }

    @Override
    public void setCity(String city) {
        _city = city;
    }

    @Override
    public String getDistrict() {
        if (_district == null) {
            return StringPool.BLANK;
        } else {
            return _district;
        }
    }

    @Override
    public void setDistrict(String district) {
        _district = district;
    }

    @Override
    public String getPincode() {
        if (_pincode == null) {
            return StringPool.BLANK;
        } else {
            return _pincode;
        }
    }

    @Override
    public void setPincode(String pincode) {
        _pincode = pincode;
    }

    @Override
    public String getPhone() {
        if (_phone == null) {
            return StringPool.BLANK;
        } else {
            return _phone;
        }
    }

    @Override
    public void setPhone(String phone) {
        _phone = phone;
    }

    @Override
    public String getDepartment() {
        if (_department == null) {
            return StringPool.BLANK;
        } else {
            return _department;
        }
    }

    @Override
    public void setDepartment(String department) {
        _department = department;
    }

    @Override
    public String getDesignation() {
        if (_designation == null) {
            return StringPool.BLANK;
        } else {
            return _designation;
        }
    }

    @Override
    public void setDesignation(String designation) {
        _designation = designation;
    }

    @Override
    public long getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(long salary) {
        _salary = salary;
    }

    @Override
    public String getEmail() {
        if (_email == null) {
            return StringPool.BLANK;
        } else {
            return _email;
        }
    }

    @Override
    public void setEmail(String email) {
        _email = email;
    }

    @Override
    public String getAdharno() {
        if (_adharno == null) {
            return StringPool.BLANK;
        } else {
            return _adharno;
        }
    }

    @Override
    public void setAdharno(String adharno) {
        _adharno = adharno;
    }

    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Employee.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Employee toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Employee) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(getEmployeeId());
        employeeImpl.setGroupId(getGroupId());
        employeeImpl.setEmployeeName(getEmployeeName());
        employeeImpl.setHouseName(getHouseName());
        employeeImpl.setStreet(getStreet());
        employeeImpl.setCity(getCity());
        employeeImpl.setDistrict(getDistrict());
        employeeImpl.setPincode(getPincode());
        employeeImpl.setPhone(getPhone());
        employeeImpl.setDepartment(getDepartment());
        employeeImpl.setDesignation(getDesignation());
        employeeImpl.setSalary(getSalary());
        employeeImpl.setEmail(getEmail());
        employeeImpl.setAdharno(getAdharno());
        employeeImpl.setFileEntryId(getFileEntryId());

        employeeImpl.resetOriginalValues();

        return employeeImpl;
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

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) obj;

        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        EmployeeModelImpl employeeModelImpl = this;

        employeeModelImpl._originalEmployeeId = employeeModelImpl._employeeId;

        employeeModelImpl._setOriginalEmployeeId = false;

        employeeModelImpl._originalEmployeeName = employeeModelImpl._employeeName;

        employeeModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Employee> toCacheModel() {
        EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

        employeeCacheModel.employeeId = getEmployeeId();

        employeeCacheModel.groupId = getGroupId();

        employeeCacheModel.employeeName = getEmployeeName();

        String employeeName = employeeCacheModel.employeeName;

        if ((employeeName != null) && (employeeName.length() == 0)) {
            employeeCacheModel.employeeName = null;
        }

        employeeCacheModel.houseName = getHouseName();

        String houseName = employeeCacheModel.houseName;

        if ((houseName != null) && (houseName.length() == 0)) {
            employeeCacheModel.houseName = null;
        }

        employeeCacheModel.street = getStreet();

        String street = employeeCacheModel.street;

        if ((street != null) && (street.length() == 0)) {
            employeeCacheModel.street = null;
        }

        employeeCacheModel.city = getCity();

        String city = employeeCacheModel.city;

        if ((city != null) && (city.length() == 0)) {
            employeeCacheModel.city = null;
        }

        employeeCacheModel.district = getDistrict();

        String district = employeeCacheModel.district;

        if ((district != null) && (district.length() == 0)) {
            employeeCacheModel.district = null;
        }

        employeeCacheModel.pincode = getPincode();

        String pincode = employeeCacheModel.pincode;

        if ((pincode != null) && (pincode.length() == 0)) {
            employeeCacheModel.pincode = null;
        }

        employeeCacheModel.phone = getPhone();

        String phone = employeeCacheModel.phone;

        if ((phone != null) && (phone.length() == 0)) {
            employeeCacheModel.phone = null;
        }

        employeeCacheModel.department = getDepartment();

        String department = employeeCacheModel.department;

        if ((department != null) && (department.length() == 0)) {
            employeeCacheModel.department = null;
        }

        employeeCacheModel.designation = getDesignation();

        String designation = employeeCacheModel.designation;

        if ((designation != null) && (designation.length() == 0)) {
            employeeCacheModel.designation = null;
        }

        employeeCacheModel.salary = getSalary();

        employeeCacheModel.email = getEmail();

        String email = employeeCacheModel.email;

        if ((email != null) && (email.length() == 0)) {
            employeeCacheModel.email = null;
        }

        employeeCacheModel.adharno = getAdharno();

        String adharno = employeeCacheModel.adharno;

        if ((adharno != null) && (adharno.length() == 0)) {
            employeeCacheModel.adharno = null;
        }

        employeeCacheModel.fileEntryId = getFileEntryId();

        return employeeCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", groupId=");
        sb.append(getGroupId());
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
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.service.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
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
