<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<portlet:defineObjects />

 
<%
 String tabs = ParamUtil.getString(request, "tabs", "details");

%>
<p><%=tabs %></p>
<portlet:renderURL var="tabURL">
</portlet:renderURL>
<liferay-ui:tabs names="details,marks" url="<%=tabURL.toString()%>" tabsValues="details,marks" value="<%=tabs%>" >
 
<%-- <c:if test='<%=tabs.equalsIgnoreCase("details")%>'>
<jsp:include page="/html/studentdataentry/studentDetails.jsp" flush="true" />
</c:if>
 
<c:if test='<%=tabs.equalsIgnoreCase("marks")%>' >
<jsp:include page="/html/studentdataentry/studentMarks.jsp" flush="true" />
</c:if>  --%> 
<%-- <liferay-ui:section>
<jsp:include page="/html/studentdataentry/studentDetails.jsp" flush="true" />
</liferay-ui:section>
<liferay-ui:section>
<jsp:include page="/html/studentdataentry/studentMarks.jsp" flush="true" />
</liferay-ui:section> --%>
<%if(tabs.equalsIgnoreCase("details")){ %>
<jsp:include page="/html/studentdataentry/studentDetails.jsp" flush="true" />
<%}if(tabs.equalsIgnoreCase("marks")) {%>
<jsp:include page="/html/studentdataentry/studentMarks.jsp" flush="true" />
<%} %>


</liferay-ui:tabs>