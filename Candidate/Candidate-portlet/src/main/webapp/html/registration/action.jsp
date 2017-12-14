<%@page
	import="net.opentrends.candidate.permissions.RegistrationPermissions"%>
<%@include file="/html/init.jsp"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%
	ResultRow result = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Registration register = (Registration) result.getObject();
	String primaryKey = String.valueOf(register.getId());
%>
<portlet:renderURL var="edit">
	<portlet:param name="Key" value="<%=primaryKey%>" />
	<portlet:param name="mvcPath" value="/html/registration/edit.jsp" />
</portlet:renderURL>
<portlet:renderURL var="view">
	<portlet:param name="Key" value="<%=primaryKey%>" />
	<portlet:param name="mvcPath" value="/html/registration/display.jsp" />
</portlet:renderURL>
<portlet:actionURL name="deleteRegistration" var="delete">
	<portlet:param name="Key" value="<%=primaryKey%>" />
</portlet:actionURL>
<liferay-ui:icon-menu>
	<liferay-ui:icon image="view" url="<%=view%>" />
	<%
		if (RegistrationPermissions.contains(permissionChecker, "EDIT", Long.parseLong(primaryKey))) {
	%>
	<liferay-ui:icon image="edit" url="<%=edit%>" />
	<%
		}
			if (RegistrationPermissions.contains(permissionChecker, "DELETE", Long.parseLong(primaryKey))) {
	%>
	<liferay-ui:icon-delete url="<%=delete%>" />
	<%
		}
	%>
</liferay-ui:icon-menu>