package net.opentrends.studentdata.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.studentdata.service.ClpSerializer;
import net.opentrends.studentdata.service.StudentDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class StudentDetailsClp extends BaseModelImpl<StudentDetails>
    implements StudentDetails {
    private long _studentId;
    private String _studentName;
    private String _department;
    private long _semester;
    private long _groupId;
    private BaseModel<?> _studentDetailsRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.studentdata.service.ClpSerializer.class;

    public StudentDetailsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return StudentDetails.class;
    }

    @Override
    public String getModelClassName() {
        return StudentDetails.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _studentId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStudentId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _studentId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentId", getStudentId());
        attributes.put("studentName", getStudentName());
        attributes.put("department", getDepartment());
        attributes.put("semester", getSemester());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        String studentName = (String) attributes.get("studentName");

        if (studentName != null) {
            setStudentName(studentName);
        }

        String department = (String) attributes.get("department");

        if (department != null) {
            setDepartment(department);
        }

        Long semester = (Long) attributes.get("semester");

        if (semester != null) {
            setSemester(semester);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @Override
    public long getStudentId() {
        return _studentId;
    }

    @Override
    public void setStudentId(long studentId) {
        _studentId = studentId;

        if (_studentDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _studentDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentId", long.class);

                method.invoke(_studentDetailsRemoteModel, studentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStudentName() {
        return _studentName;
    }

    @Override
    public void setStudentName(String studentName) {
        _studentName = studentName;

        if (_studentDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _studentDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentName", String.class);

                method.invoke(_studentDetailsRemoteModel, studentName);
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

        if (_studentDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _studentDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartment", String.class);

                method.invoke(_studentDetailsRemoteModel, department);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSemester() {
        return _semester;
    }

    @Override
    public void setSemester(long semester) {
        _semester = semester;

        if (_studentDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _studentDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setSemester", long.class);

                method.invoke(_studentDetailsRemoteModel, semester);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_studentDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _studentDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_studentDetailsRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStudentDetailsRemoteModel() {
        return _studentDetailsRemoteModel;
    }

    public void setStudentDetailsRemoteModel(
        BaseModel<?> studentDetailsRemoteModel) {
        _studentDetailsRemoteModel = studentDetailsRemoteModel;
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

        Class<?> remoteModelClass = _studentDetailsRemoteModel.getClass();

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

        Object returnValue = method.invoke(_studentDetailsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StudentDetailsLocalServiceUtil.addStudentDetails(this);
        } else {
            StudentDetailsLocalServiceUtil.updateStudentDetails(this);
        }
    }

    @Override
    public StudentDetails toEscapedModel() {
        return (StudentDetails) ProxyUtil.newProxyInstance(StudentDetails.class.getClassLoader(),
            new Class[] { StudentDetails.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StudentDetailsClp clone = new StudentDetailsClp();

        clone.setStudentId(getStudentId());
        clone.setStudentName(getStudentName());
        clone.setDepartment(getDepartment());
        clone.setSemester(getSemester());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(StudentDetails studentDetails) {
        long primaryKey = studentDetails.getPrimaryKey();

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

        if (!(obj instanceof StudentDetailsClp)) {
            return false;
        }

        StudentDetailsClp studentDetails = (StudentDetailsClp) obj;

        long primaryKey = studentDetails.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{studentId=");
        sb.append(getStudentId());
        sb.append(", studentName=");
        sb.append(getStudentName());
        sb.append(", department=");
        sb.append(getDepartment());
        sb.append(", semester=");
        sb.append(getSemester());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.studentdata.model.StudentDetails");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>studentId</column-name><column-value><![CDATA[");
        sb.append(getStudentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentName</column-name><column-value><![CDATA[");
        sb.append(getStudentName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>department</column-name><column-value><![CDATA[");
        sb.append(getDepartment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>semester</column-name><column-value><![CDATA[");
        sb.append(getSemester());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
