<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@include file="/html/dataList.jsp" %>
<portlet:defineObjects />
<portlet:actionURL name="addStudentDetails" var="studentDetails"/>
<aui:form name="studentDetails" method="post" action="<%=studentDetails%>">
<aui:layout>
<aui:column>
<aui:input name="studentName" label="Student Name" type="text">
<aui:validator name="required" errorMessage="enter student name"/>
</aui:input>
<aui:select name="department">
<aui:option value="">Enter Department</aui:option>
<%
for(String department:departmentList){
%>
<aui:option value="<%=department %>"><%=department %></aui:option>
<%	
}
%>
</aui:select>
<aui:select name="semester">
<aui:option value="">Enter Semester</aui:option>
<%
for(String semester:semesters){
%>
<aui:option value="<%=semester %>"><%=semester %></aui:option>
<%	
}
%>
</aui:select>
<aui:input name="" type="submit" value="save"/>
</aui:column>
</aui:layout>
</aui:form>
