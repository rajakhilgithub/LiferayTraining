<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@include file="/html/dataList.jsp" %>
<portlet:defineObjects />
<%
String studentId=request.getAttribute("studentId").toString();
%>
<portlet:actionURL name="studentMarksEntry" var="studentMarks">
<portlet:param name="studentId" value="<%=studentId%>"/>
</portlet:actionURL>
<div align="left"><h2>Enter Marks</h2></div>
<aui:form method="post" action="<%=studentMarks%>">
<aui:layout>
<aui:column>
<aui:input name="Subject1" label="Subject 1" type="text">
<aui:validator name="required" errorMessage="Enter Mark"/>
</aui:input>
<aui:input name="Subject2" label="Subject 2" type="text">
<aui:validator name="required" errorMessage="Enter Mark"/>
</aui:input>
<aui:input name="Subject3" label="Subject 3" type="text">
<aui:validator name="required" errorMessage="Enter Mark"/>
</aui:input>
<aui:input name="Subject4" label="Subject 4" type="text">
<aui:validator name="required" errorMessage="Enter Mark"/>
</aui:input>
<aui:input name="Subject5" label="Subject 5" type="text">
<aui:validator name="required" errorMessage="Enter Mark"/>
</aui:input>
<aui:input name="" type="submit" value="Save"/>
</aui:column>
</aui:layout>

</aui:form>