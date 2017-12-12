package net.opentrends.studnetdataentry;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.studentdata.model.StudentDetails;
import net.opentrends.studentdata.model.StudentMarks;
import net.opentrends.studentdata.service.StudentDetailsLocalServiceUtil;
import net.opentrends.studentdata.service.StudentMarksLocalServiceUtil;

/**
 * Portlet implementation class studentdataentry
 */
public class studentdataentry extends MVCPortlet {
 public void addStudentDetails(ActionRequest request,ActionResponse response)throws SystemException,PortletException,PortalException{
	 long studentId=CounterLocalServiceUtil.increment(StudentDetails.class.getName());
	 ThemeDisplay themeDisplay=(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	 StudentDetails student=null;
	 student=StudentDetailsLocalServiceUtil.createStudentDetails(studentId);
	 student.setStudentName(request.getParameter("studentName"));
	 student.setDepartment(request.getParameter("department"));
	 student.setSemester(Long.parseLong(request.getParameter("semester")));
	 student.setGroupId(themeDisplay.getScopeGroupId());
	 StudentDetailsLocalServiceUtil.addStudentDetails(student);
	 request.setAttribute("studentId", studentId);
	 response.setRenderParameter("tabs", "marks");
 }
public void studentMarksEntry(ActionRequest request,ActionResponse response)throws PortalException,SystemException{
	long markId=CounterLocalServiceUtil.increment(StudentMarks.class.getName());
	ThemeDisplay themeDisplay=(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	StudentMarks marks=null;
	marks=StudentMarksLocalServiceUtil.createStudentMarks(markId);
	marks.setMark1(Long.parseLong(request.getParameter("Subject1")));
	marks.setMark2(Long.parseLong(request.getParameter("Subject2")));
	marks.setMark3(Long.parseLong(request.getParameter("Subject3")));
	marks.setMark4(Long.parseLong(request.getParameter("Subject4")));
	marks.setMark5(Long.parseLong(request.getParameter("Subject5")));
	marks.setGroupId(themeDisplay.getScopeGroupId());
	long total=Long.parseLong(request.getParameter("Subject1"))+Long.parseLong(request.getParameter("Subject2"))+Long.parseLong(request.getParameter("Subject3"))+Long.parseLong(request.getParameter("Subject4"))+Long.parseLong(request.getParameter("Subject5"));
	marks.setTotal(total);
	marks.setStudentId(Long.parseLong(ParamUtil.getString(request, "studentId")));
	StudentMarksLocalServiceUtil.addStudentMarks(marks);
	response.setRenderParameter("tabs", "details");
}


}
