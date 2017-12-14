<%@include file="/html/init.jsp"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:actionURL name="registerAction" var="register">
</portlet:actionURL>
<aui:form method="post" name="registrationform" action="<%=register%>"
	enctype="multipart/form-data">
	<aui:layout>
		<aui:column>
			<aui:input name="name" type="text" label="Name">
				<aui:validator name="required" errorMessage="Enter Name" />
			</aui:input>
			<aui:input name="email" type="text" label="Email Id">
				<aui:validator name="required" errorMessage="Enter email" />
				<aui:validator name="email" errorMessage="Format error" />
			</aui:input>
			<aui:input name="city" type="text" label="City">
				<aui:validator name="required" errorMessage="Enter city" />
			</aui:input>
			<aui:input name="mobileNo" type="text" label="Mobile Number">
				<aui:validator name="required" errorMessage="Enter mobileNo" />
				<aui:validator name="digits" errorMessage="Enter only digits" />
				<aui:validator name="maxLength">10</aui:validator>
				<aui:validator name="minLength">10</aui:validator>
			</aui:input>
			<aui:input name="photoFileEntry" type="file" label="Photo Upload">
				<aui:validator name="acceptFiles">'jpeg,png,jpg'</aui:validator>
				<aui:validator name="required" errorMessage="upload photo"></aui:validator>
			</aui:input>
			<aui:input name="resumeFileEntry" type="file" label="Resume Upload">
				<aui:validator name="acceptFiles">'pdf,doc,docx'</aui:validator>
				<aui:validator name="required" errorMessage="upload resume"></aui:validator>
			</aui:input>
			<aui:input name="" type="Submit" value="Register" />
		</aui:column>
	</aui:layout>
</aui:form>


<%
	List<Registration> registrationList = RegistrationLocalServiceUtil
			.findByGroupId(themeDisplay.getScopeGroupId());
%>
<liferay-ui:search-container delta="5"
	emptyResultsMessage="No Candidates Found">
	<liferay-ui:search-container-results>
		<%
			results = ListUtil.subList(registrationList, searchContainer.getStart(), searchContainer.getEnd());
					total = registrationList.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row
		className="net.opentrends.candidate.model.Registration"
		keyProperty="id" modelVar="registerData">
		<liferay-ui:search-container-column-text name="Id"
			value="<%=String.valueOf(registerData.getId())%>" />
		<liferay-ui:search-container-column-text name="Name"
			value="<%=registerData.getName()%>" />
		<liferay-ui:search-container-column-text name="City"
			value="<%=registerData.getCity()%>" />
		<liferay-ui:search-container-column-text name="Email"
			value="<%=registerData.getEmail()%>" />
		<liferay-ui:search-container-column-text name="PhoneNo"
			value="<%=registerData.getMobileNo()%>" />
		<liferay-ui:search-container-column-jsp
			path="/html/registration/action.jsp" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>