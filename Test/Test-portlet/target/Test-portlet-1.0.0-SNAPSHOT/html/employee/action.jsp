<%@ include file="/html/init.jsp"%>
<%
	ResultRow result=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Employee employee=(Employee)result.getObject();
	String primaryKey=String.valueOf(employee.getEmployeeId());
%>
<portlet:renderURL var="viewEmployee">
	<portlet:param name="employeeId" value="<%=primaryKey%>" />
	<portlet:param name="mvcPath" value="/html/employee/display.jsp" />
</portlet:renderURL>

<portlet:renderURL var="editEmployee">
	<portlet:param name="editKey" value="<%=primaryKey%>" />
	<portlet:param name="mvcPath" value="/html/employee/edit.jsp" />
</portlet:renderURL>
<portlet:actionURL name="deleteEmployeeAction" var="deleteEmployee">
	<portlet:param name="deleteKey" value="<%=primaryKey%>" />
</portlet:actionURL>
<liferay-ui:icon-menu>
	<liferay-ui:icon image="view" url="<%=viewEmployee%>" />
	<liferay-ui:icon image="edit" message="Edit" url="<%=editEmployee%>" />
	<liferay-ui:icon-delete url="<%=deleteEmployee%>" />
</liferay-ui:icon-menu>
