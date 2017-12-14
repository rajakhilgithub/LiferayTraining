package net.opentrends.candidate.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import net.opentrends.candidate.model.Registration;
import net.opentrends.candidate.model.RegistrationModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Registration service. Represents a row in the &quot;candidate_Registration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link net.opentrends.candidate.model.RegistrationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegistrationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationImpl
 * @see net.opentrends.candidate.model.Registration
 * @see net.opentrends.candidate.model.RegistrationModel
 * @generated
 */
public class RegistrationModelImpl extends BaseModelImpl<Registration>
    implements RegistrationModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a registration model instance should use the {@link net.opentrends.candidate.model.Registration} interface instead.
     */
    public static final String TABLE_NAME = "candidate_Registration";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "email", Types.VARCHAR },
            { "city", Types.VARCHAR },
            { "mobileNo", Types.VARCHAR },
            { "photoFileEntryId", Types.BIGINT },
            { "resumeFileEntryId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "groupId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table candidate_Registration (id_ LONG not null primary key,name VARCHAR(75) null,email VARCHAR(75) null,city VARCHAR(75) null,mobileNo VARCHAR(75) null,photoFileEntryId LONG,resumeFileEntryId LONG,userId LONG,groupId LONG)";
    public static final String TABLE_SQL_DROP = "drop table candidate_Registration";
    public static final String ORDER_BY_JPQL = " ORDER BY registration.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY candidate_Registration.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.net.opentrends.candidate.model.Registration"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.net.opentrends.candidate.model.Registration"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.net.opentrends.candidate.model.Registration"),
            true);
    public static long GROUPID_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.net.opentrends.candidate.model.Registration"));
    private static ClassLoader _classLoader = Registration.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Registration.class
        };
    private long _id;
    private String _name;
    private String _email;
    private String _city;
    private String _mobileNo;
    private long _photoFileEntryId;
    private long _resumeFileEntryId;
    private long _userId;
    private String _userUuid;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _columnBitmask;
    private Registration _escapedModel;

    public RegistrationModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Registration.class;
    }

    @Override
    public String getModelClassName() {
        return Registration.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());
        attributes.put("email", getEmail());
        attributes.put("city", getCity());
        attributes.put("mobileNo", getMobileNo());
        attributes.put("photoFileEntryId", getPhotoFileEntryId());
        attributes.put("resumeFileEntryId", getResumeFileEntryId());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        String mobileNo = (String) attributes.get("mobileNo");

        if (mobileNo != null) {
            setMobileNo(mobileNo);
        }

        Long photoFileEntryId = (Long) attributes.get("photoFileEntryId");

        if (photoFileEntryId != null) {
            setPhotoFileEntryId(photoFileEntryId);
        }

        Long resumeFileEntryId = (Long) attributes.get("resumeFileEntryId");

        if (resumeFileEntryId != null) {
            setResumeFileEntryId(resumeFileEntryId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
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
    public String getMobileNo() {
        if (_mobileNo == null) {
            return StringPool.BLANK;
        } else {
            return _mobileNo;
        }
    }

    @Override
    public void setMobileNo(String mobileNo) {
        _mobileNo = mobileNo;
    }

    @Override
    public long getPhotoFileEntryId() {
        return _photoFileEntryId;
    }

    @Override
    public void setPhotoFileEntryId(long photoFileEntryId) {
        _photoFileEntryId = photoFileEntryId;
    }

    @Override
    public long getResumeFileEntryId() {
        return _resumeFileEntryId;
    }

    @Override
    public void setResumeFileEntryId(long resumeFileEntryId) {
        _resumeFileEntryId = resumeFileEntryId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Registration.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Registration toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Registration) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RegistrationImpl registrationImpl = new RegistrationImpl();

        registrationImpl.setId(getId());
        registrationImpl.setName(getName());
        registrationImpl.setEmail(getEmail());
        registrationImpl.setCity(getCity());
        registrationImpl.setMobileNo(getMobileNo());
        registrationImpl.setPhotoFileEntryId(getPhotoFileEntryId());
        registrationImpl.setResumeFileEntryId(getResumeFileEntryId());
        registrationImpl.setUserId(getUserId());
        registrationImpl.setGroupId(getGroupId());

        registrationImpl.resetOriginalValues();

        return registrationImpl;
    }

    @Override
    public int compareTo(Registration registration) {
        long primaryKey = registration.getPrimaryKey();

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

        if (!(obj instanceof Registration)) {
            return false;
        }

        Registration registration = (Registration) obj;

        long primaryKey = registration.getPrimaryKey();

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
        RegistrationModelImpl registrationModelImpl = this;

        registrationModelImpl._originalGroupId = registrationModelImpl._groupId;

        registrationModelImpl._setOriginalGroupId = false;

        registrationModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Registration> toCacheModel() {
        RegistrationCacheModel registrationCacheModel = new RegistrationCacheModel();

        registrationCacheModel.id = getId();

        registrationCacheModel.name = getName();

        String name = registrationCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            registrationCacheModel.name = null;
        }

        registrationCacheModel.email = getEmail();

        String email = registrationCacheModel.email;

        if ((email != null) && (email.length() == 0)) {
            registrationCacheModel.email = null;
        }

        registrationCacheModel.city = getCity();

        String city = registrationCacheModel.city;

        if ((city != null) && (city.length() == 0)) {
            registrationCacheModel.city = null;
        }

        registrationCacheModel.mobileNo = getMobileNo();

        String mobileNo = registrationCacheModel.mobileNo;

        if ((mobileNo != null) && (mobileNo.length() == 0)) {
            registrationCacheModel.mobileNo = null;
        }

        registrationCacheModel.photoFileEntryId = getPhotoFileEntryId();

        registrationCacheModel.resumeFileEntryId = getResumeFileEntryId();

        registrationCacheModel.userId = getUserId();

        registrationCacheModel.groupId = getGroupId();

        return registrationCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", mobileNo=");
        sb.append(getMobileNo());
        sb.append(", photoFileEntryId=");
        sb.append(getPhotoFileEntryId());
        sb.append(", resumeFileEntryId=");
        sb.append(getResumeFileEntryId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.candidate.model.Registration");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mobileNo</column-name><column-value><![CDATA[");
        sb.append(getMobileNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>photoFileEntryId</column-name><column-value><![CDATA[");
        sb.append(getPhotoFileEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>resumeFileEntryId</column-name><column-value><![CDATA[");
        sb.append(getResumeFileEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
