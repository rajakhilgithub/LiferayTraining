package net.opentrends.candidate.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.candidate.service.ClpSerializer;
import net.opentrends.candidate.service.RegistrationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RegistrationClp extends BaseModelImpl<Registration>
    implements Registration {
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
    private BaseModel<?> _registrationRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.candidate.service.ClpSerializer.class;

    public RegistrationClp() {
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

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_registrationRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_registrationRemoteModel, name);
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

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_registrationRemoteModel, email);
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

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setCity", String.class);

                method.invoke(_registrationRemoteModel, city);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMobileNo() {
        return _mobileNo;
    }

    @Override
    public void setMobileNo(String mobileNo) {
        _mobileNo = mobileNo;

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setMobileNo", String.class);

                method.invoke(_registrationRemoteModel, mobileNo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPhotoFileEntryId() {
        return _photoFileEntryId;
    }

    @Override
    public void setPhotoFileEntryId(long photoFileEntryId) {
        _photoFileEntryId = photoFileEntryId;

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setPhotoFileEntryId",
                        long.class);

                method.invoke(_registrationRemoteModel, photoFileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getResumeFileEntryId() {
        return _resumeFileEntryId;
    }

    @Override
    public void setResumeFileEntryId(long resumeFileEntryId) {
        _resumeFileEntryId = resumeFileEntryId;

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setResumeFileEntryId",
                        long.class);

                method.invoke(_registrationRemoteModel, resumeFileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_registrationRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
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
        _groupId = groupId;

        if (_registrationRemoteModel != null) {
            try {
                Class<?> clazz = _registrationRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_registrationRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRegistrationRemoteModel() {
        return _registrationRemoteModel;
    }

    public void setRegistrationRemoteModel(BaseModel<?> registrationRemoteModel) {
        _registrationRemoteModel = registrationRemoteModel;
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

        Class<?> remoteModelClass = _registrationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_registrationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RegistrationLocalServiceUtil.addRegistration(this);
        } else {
            RegistrationLocalServiceUtil.updateRegistration(this);
        }
    }

    @Override
    public Registration toEscapedModel() {
        return (Registration) ProxyUtil.newProxyInstance(Registration.class.getClassLoader(),
            new Class[] { Registration.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RegistrationClp clone = new RegistrationClp();

        clone.setId(getId());
        clone.setName(getName());
        clone.setEmail(getEmail());
        clone.setCity(getCity());
        clone.setMobileNo(getMobileNo());
        clone.setPhotoFileEntryId(getPhotoFileEntryId());
        clone.setResumeFileEntryId(getResumeFileEntryId());
        clone.setUserId(getUserId());
        clone.setGroupId(getGroupId());

        return clone;
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

        if (!(obj instanceof RegistrationClp)) {
            return false;
        }

        RegistrationClp registration = (RegistrationClp) obj;

        long primaryKey = registration.getPrimaryKey();

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
