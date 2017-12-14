package net.opentrends.candidate.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegistrationSoap implements Serializable {
    private long _id;
    private String _name;
    private String _email;
    private String _city;
    private String _mobileNo;
    private long _photoFileEntryId;
    private long _resumeFileEntryId;
    private long _userId;
    private long _groupId;

    public RegistrationSoap() {
    }

    public static RegistrationSoap toSoapModel(Registration model) {
        RegistrationSoap soapModel = new RegistrationSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());
        soapModel.setEmail(model.getEmail());
        soapModel.setCity(model.getCity());
        soapModel.setMobileNo(model.getMobileNo());
        soapModel.setPhotoFileEntryId(model.getPhotoFileEntryId());
        soapModel.setResumeFileEntryId(model.getResumeFileEntryId());
        soapModel.setUserId(model.getUserId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static RegistrationSoap[] toSoapModels(Registration[] models) {
        RegistrationSoap[] soapModels = new RegistrationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RegistrationSoap[][] toSoapModels(Registration[][] models) {
        RegistrationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RegistrationSoap[models.length][models[0].length];
        } else {
            soapModels = new RegistrationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RegistrationSoap[] toSoapModels(List<Registration> models) {
        List<RegistrationSoap> soapModels = new ArrayList<RegistrationSoap>(models.size());

        for (Registration model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RegistrationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public String getMobileNo() {
        return _mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        _mobileNo = mobileNo;
    }

    public long getPhotoFileEntryId() {
        return _photoFileEntryId;
    }

    public void setPhotoFileEntryId(long photoFileEntryId) {
        _photoFileEntryId = photoFileEntryId;
    }

    public long getResumeFileEntryId() {
        return _resumeFileEntryId;
    }

    public void setResumeFileEntryId(long resumeFileEntryId) {
        _resumeFileEntryId = resumeFileEntryId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
