package net.opentrends.candidate.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.opentrends.candidate.model.Registration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Registration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @generated
 */
public class RegistrationCacheModel implements CacheModel<Registration>,
    Externalizable {
    public long id;
    public String name;
    public String email;
    public String city;
    public String mobileNo;
    public long photoFileEntryId;
    public long resumeFileEntryId;
    public long userId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", email=");
        sb.append(email);
        sb.append(", city=");
        sb.append(city);
        sb.append(", mobileNo=");
        sb.append(mobileNo);
        sb.append(", photoFileEntryId=");
        sb.append(photoFileEntryId);
        sb.append(", resumeFileEntryId=");
        sb.append(resumeFileEntryId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Registration toEntityModel() {
        RegistrationImpl registrationImpl = new RegistrationImpl();

        registrationImpl.setId(id);

        if (name == null) {
            registrationImpl.setName(StringPool.BLANK);
        } else {
            registrationImpl.setName(name);
        }

        if (email == null) {
            registrationImpl.setEmail(StringPool.BLANK);
        } else {
            registrationImpl.setEmail(email);
        }

        if (city == null) {
            registrationImpl.setCity(StringPool.BLANK);
        } else {
            registrationImpl.setCity(city);
        }

        if (mobileNo == null) {
            registrationImpl.setMobileNo(StringPool.BLANK);
        } else {
            registrationImpl.setMobileNo(mobileNo);
        }

        registrationImpl.setPhotoFileEntryId(photoFileEntryId);
        registrationImpl.setResumeFileEntryId(resumeFileEntryId);
        registrationImpl.setUserId(userId);
        registrationImpl.setGroupId(groupId);

        registrationImpl.resetOriginalValues();

        return registrationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        name = objectInput.readUTF();
        email = objectInput.readUTF();
        city = objectInput.readUTF();
        mobileNo = objectInput.readUTF();
        photoFileEntryId = objectInput.readLong();
        resumeFileEntryId = objectInput.readLong();
        userId = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        if (mobileNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mobileNo);
        }

        objectOutput.writeLong(photoFileEntryId);
        objectOutput.writeLong(resumeFileEntryId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(groupId);
    }
}
