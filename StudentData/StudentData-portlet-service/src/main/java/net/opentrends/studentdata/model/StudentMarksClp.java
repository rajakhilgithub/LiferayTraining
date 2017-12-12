package net.opentrends.studentdata.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.studentdata.service.ClpSerializer;
import net.opentrends.studentdata.service.StudentMarksLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class StudentMarksClp extends BaseModelImpl<StudentMarks>
    implements StudentMarks {
    private long _markId;
    private long _studentId;
    private long _mark1;
    private long _mark2;
    private long _mark3;
    private long _mark4;
    private long _mark5;
    private long _total;
    private long _groupId;
    private BaseModel<?> _studentMarksRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.studentdata.service.ClpSerializer.class;

    public StudentMarksClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return StudentMarks.class;
    }

    @Override
    public String getModelClassName() {
        return StudentMarks.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _markId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMarkId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _markId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("markId", getMarkId());
        attributes.put("studentId", getStudentId());
        attributes.put("mark1", getMark1());
        attributes.put("mark2", getMark2());
        attributes.put("mark3", getMark3());
        attributes.put("mark4", getMark4());
        attributes.put("mark5", getMark5());
        attributes.put("total", getTotal());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long markId = (Long) attributes.get("markId");

        if (markId != null) {
            setMarkId(markId);
        }

        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        Long mark1 = (Long) attributes.get("mark1");

        if (mark1 != null) {
            setMark1(mark1);
        }

        Long mark2 = (Long) attributes.get("mark2");

        if (mark2 != null) {
            setMark2(mark2);
        }

        Long mark3 = (Long) attributes.get("mark3");

        if (mark3 != null) {
            setMark3(mark3);
        }

        Long mark4 = (Long) attributes.get("mark4");

        if (mark4 != null) {
            setMark4(mark4);
        }

        Long mark5 = (Long) attributes.get("mark5");

        if (mark5 != null) {
            setMark5(mark5);
        }

        Long total = (Long) attributes.get("total");

        if (total != null) {
            setTotal(total);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    @Override
    public long getMarkId() {
        return _markId;
    }

    @Override
    public void setMarkId(long markId) {
        _markId = markId;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setMarkId", long.class);

                method.invoke(_studentMarksRemoteModel, markId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStudentId() {
        return _studentId;
    }

    @Override
    public void setStudentId(long studentId) {
        _studentId = studentId;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentId", long.class);

                method.invoke(_studentMarksRemoteModel, studentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMark1() {
        return _mark1;
    }

    @Override
    public void setMark1(long mark1) {
        _mark1 = mark1;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setMark1", long.class);

                method.invoke(_studentMarksRemoteModel, mark1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMark2() {
        return _mark2;
    }

    @Override
    public void setMark2(long mark2) {
        _mark2 = mark2;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setMark2", long.class);

                method.invoke(_studentMarksRemoteModel, mark2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMark3() {
        return _mark3;
    }

    @Override
    public void setMark3(long mark3) {
        _mark3 = mark3;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setMark3", long.class);

                method.invoke(_studentMarksRemoteModel, mark3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMark4() {
        return _mark4;
    }

    @Override
    public void setMark4(long mark4) {
        _mark4 = mark4;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setMark4", long.class);

                method.invoke(_studentMarksRemoteModel, mark4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMark5() {
        return _mark5;
    }

    @Override
    public void setMark5(long mark5) {
        _mark5 = mark5;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setMark5", long.class);

                method.invoke(_studentMarksRemoteModel, mark5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTotal() {
        return _total;
    }

    @Override
    public void setTotal(long total) {
        _total = total;

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setTotal", long.class);

                method.invoke(_studentMarksRemoteModel, total);
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

        if (_studentMarksRemoteModel != null) {
            try {
                Class<?> clazz = _studentMarksRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_studentMarksRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStudentMarksRemoteModel() {
        return _studentMarksRemoteModel;
    }

    public void setStudentMarksRemoteModel(BaseModel<?> studentMarksRemoteModel) {
        _studentMarksRemoteModel = studentMarksRemoteModel;
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

        Class<?> remoteModelClass = _studentMarksRemoteModel.getClass();

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

        Object returnValue = method.invoke(_studentMarksRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StudentMarksLocalServiceUtil.addStudentMarks(this);
        } else {
            StudentMarksLocalServiceUtil.updateStudentMarks(this);
        }
    }

    @Override
    public StudentMarks toEscapedModel() {
        return (StudentMarks) ProxyUtil.newProxyInstance(StudentMarks.class.getClassLoader(),
            new Class[] { StudentMarks.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StudentMarksClp clone = new StudentMarksClp();

        clone.setMarkId(getMarkId());
        clone.setStudentId(getStudentId());
        clone.setMark1(getMark1());
        clone.setMark2(getMark2());
        clone.setMark3(getMark3());
        clone.setMark4(getMark4());
        clone.setMark5(getMark5());
        clone.setTotal(getTotal());
        clone.setGroupId(getGroupId());

        return clone;
    }

    @Override
    public int compareTo(StudentMarks studentMarks) {
        long primaryKey = studentMarks.getPrimaryKey();

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

        if (!(obj instanceof StudentMarksClp)) {
            return false;
        }

        StudentMarksClp studentMarks = (StudentMarksClp) obj;

        long primaryKey = studentMarks.getPrimaryKey();

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

        sb.append("{markId=");
        sb.append(getMarkId());
        sb.append(", studentId=");
        sb.append(getStudentId());
        sb.append(", mark1=");
        sb.append(getMark1());
        sb.append(", mark2=");
        sb.append(getMark2());
        sb.append(", mark3=");
        sb.append(getMark3());
        sb.append(", mark4=");
        sb.append(getMark4());
        sb.append(", mark5=");
        sb.append(getMark5());
        sb.append(", total=");
        sb.append(getTotal());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.studentdata.model.StudentMarks");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>markId</column-name><column-value><![CDATA[");
        sb.append(getMarkId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentId</column-name><column-value><![CDATA[");
        sb.append(getStudentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mark1</column-name><column-value><![CDATA[");
        sb.append(getMark1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mark2</column-name><column-value><![CDATA[");
        sb.append(getMark2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mark3</column-name><column-value><![CDATA[");
        sb.append(getMark3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mark4</column-name><column-value><![CDATA[");
        sb.append(getMark4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mark5</column-name><column-value><![CDATA[");
        sb.append(getMark5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>total</column-name><column-value><![CDATA[");
        sb.append(getTotal());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
