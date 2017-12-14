package net.opentrends.candidate.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Registration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @generated
 */
public class RegistrationWrapper implements Registration,
    ModelWrapper<Registration> {
    private Registration _registration;

    public RegistrationWrapper(Registration registration) {
        _registration = registration;
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

    /**
    * Returns the primary key of this registration.
    *
    * @return the primary key of this registration
    */
    @Override
    public long getPrimaryKey() {
        return _registration.getPrimaryKey();
    }

    /**
    * Sets the primary key of this registration.
    *
    * @param primaryKey the primary key of this registration
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _registration.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this registration.
    *
    * @return the ID of this registration
    */
    @Override
    public long getId() {
        return _registration.getId();
    }

    /**
    * Sets the ID of this registration.
    *
    * @param id the ID of this registration
    */
    @Override
    public void setId(long id) {
        _registration.setId(id);
    }

    /**
    * Returns the name of this registration.
    *
    * @return the name of this registration
    */
    @Override
    public java.lang.String getName() {
        return _registration.getName();
    }

    /**
    * Sets the name of this registration.
    *
    * @param name the name of this registration
    */
    @Override
    public void setName(java.lang.String name) {
        _registration.setName(name);
    }

    /**
    * Returns the email of this registration.
    *
    * @return the email of this registration
    */
    @Override
    public java.lang.String getEmail() {
        return _registration.getEmail();
    }

    /**
    * Sets the email of this registration.
    *
    * @param email the email of this registration
    */
    @Override
    public void setEmail(java.lang.String email) {
        _registration.setEmail(email);
    }

    /**
    * Returns the city of this registration.
    *
    * @return the city of this registration
    */
    @Override
    public java.lang.String getCity() {
        return _registration.getCity();
    }

    /**
    * Sets the city of this registration.
    *
    * @param city the city of this registration
    */
    @Override
    public void setCity(java.lang.String city) {
        _registration.setCity(city);
    }

    /**
    * Returns the mobile no of this registration.
    *
    * @return the mobile no of this registration
    */
    @Override
    public java.lang.String getMobileNo() {
        return _registration.getMobileNo();
    }

    /**
    * Sets the mobile no of this registration.
    *
    * @param mobileNo the mobile no of this registration
    */
    @Override
    public void setMobileNo(java.lang.String mobileNo) {
        _registration.setMobileNo(mobileNo);
    }

    /**
    * Returns the photo file entry ID of this registration.
    *
    * @return the photo file entry ID of this registration
    */
    @Override
    public long getPhotoFileEntryId() {
        return _registration.getPhotoFileEntryId();
    }

    /**
    * Sets the photo file entry ID of this registration.
    *
    * @param photoFileEntryId the photo file entry ID of this registration
    */
    @Override
    public void setPhotoFileEntryId(long photoFileEntryId) {
        _registration.setPhotoFileEntryId(photoFileEntryId);
    }

    /**
    * Returns the resume file entry ID of this registration.
    *
    * @return the resume file entry ID of this registration
    */
    @Override
    public long getResumeFileEntryId() {
        return _registration.getResumeFileEntryId();
    }

    /**
    * Sets the resume file entry ID of this registration.
    *
    * @param resumeFileEntryId the resume file entry ID of this registration
    */
    @Override
    public void setResumeFileEntryId(long resumeFileEntryId) {
        _registration.setResumeFileEntryId(resumeFileEntryId);
    }

    /**
    * Returns the user ID of this registration.
    *
    * @return the user ID of this registration
    */
    @Override
    public long getUserId() {
        return _registration.getUserId();
    }

    /**
    * Sets the user ID of this registration.
    *
    * @param userId the user ID of this registration
    */
    @Override
    public void setUserId(long userId) {
        _registration.setUserId(userId);
    }

    /**
    * Returns the user uuid of this registration.
    *
    * @return the user uuid of this registration
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registration.getUserUuid();
    }

    /**
    * Sets the user uuid of this registration.
    *
    * @param userUuid the user uuid of this registration
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _registration.setUserUuid(userUuid);
    }

    /**
    * Returns the group ID of this registration.
    *
    * @return the group ID of this registration
    */
    @Override
    public long getGroupId() {
        return _registration.getGroupId();
    }

    /**
    * Sets the group ID of this registration.
    *
    * @param groupId the group ID of this registration
    */
    @Override
    public void setGroupId(long groupId) {
        _registration.setGroupId(groupId);
    }

    @Override
    public boolean isNew() {
        return _registration.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _registration.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _registration.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _registration.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _registration.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _registration.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _registration.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _registration.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _registration.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _registration.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _registration.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RegistrationWrapper((Registration) _registration.clone());
    }

    @Override
    public int compareTo(
        net.opentrends.candidate.model.Registration registration) {
        return _registration.compareTo(registration);
    }

    @Override
    public int hashCode() {
        return _registration.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.candidate.model.Registration> toCacheModel() {
        return _registration.toCacheModel();
    }

    @Override
    public net.opentrends.candidate.model.Registration toEscapedModel() {
        return new RegistrationWrapper(_registration.toEscapedModel());
    }

    @Override
    public net.opentrends.candidate.model.Registration toUnescapedModel() {
        return new RegistrationWrapper(_registration.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _registration.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _registration.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _registration.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RegistrationWrapper)) {
            return false;
        }

        RegistrationWrapper registrationWrapper = (RegistrationWrapper) obj;

        if (Validator.equals(_registration, registrationWrapper._registration)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Registration getWrappedRegistration() {
        return _registration;
    }

    @Override
    public Registration getWrappedModel() {
        return _registration;
    }

    @Override
    public void resetOriginalValues() {
        _registration.resetOriginalValues();
    }
}
