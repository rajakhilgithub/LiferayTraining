package net.opentrends.studentdata.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.opentrends.studentdata.service.ClpSerializer;
import net.opentrends.studentdata.service.StudentDetailsLocalServiceUtil;
import net.opentrends.studentdata.service.StudentMarksLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            StudentDetailsLocalServiceUtil.clearService();

            StudentMarksLocalServiceUtil.clearService();
        }
    }
}
