<%@page import="javax.imageio.spi.RegisterableService"%>
<%@include file="/html/init.jsp"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%
	long key = Long.parseLong(ParamUtil.getString(request, "Key"));
	Registration register = RegistrationLocalServiceUtil.getRegistration(key);
	String imageUrl = StringPool.BLANK;
	if (register.getPhotoFileEntryId() > 0) {
		FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(register.getPhotoFileEntryId());
		imageUrl = RegistrationLocalServiceUtil.getImageUrl(fileEntry, themeDisplay);
	}
%>
<portlet:actionURL name="editRegistration" var="edit">
	<portlet:param name="key" value="<%=String.valueOf(key)%>" />
</portlet:actionURL>
<portlet:renderURL var="home">
	<portlet:param name="mvcPath" value="/html/registration/view.jsp" />
</portlet:renderURL>
<aui:form method="post" name="registrationeditform" action="<%=edit%>"
	enctype="multipart/form-data">
	<aui:layout>
		<aui:column>
			<aui:input name="name" type="text" label="Name"
				value="<%=register.getName()%>">
				<aui:validator name="required" errorMessage="Enter Name" />
			</aui:input>
			<aui:input name="email" type="text" label="Email Id"
				value="<%=register.getEmail()%>">
				<aui:validator name="required" errorMessage="Enter email" />
				<aui:validator name="email" errorMessage="Format error" />
			</aui:input>
			<aui:input name="city" type="text" label="City"
				value="<%=register.getCity()%>">
				<aui:validator name="required" errorMessage="Enter city" />
			</aui:input>
			<aui:input name="mobileNo" type="text" label="Mobile Number"
				value="<%=register.getMobileNo()%>">
				<aui:validator name="required" errorMessage="Enter mobileNo" />
				<aui:validator name="digits" errorMessage="Enter only digits" />
				<aui:validator name="maxLength">10</aui:validator>
				<aui:validator name="minLength">10</aui:validator>
			</aui:input>
			<img alt="photo" src="<%=imageUrl%>" height="150" width="150" />
			<aui:input name="photoFileEntry" type="file" label="Photo Upload">
				<aui:validator name="acceptFiles">'jpeg,png,jpg'</aui:validator>
			</aui:input>
			<aui:input name="photoFileEntryId"
				value="<%=String.valueOf(register.getPhotoFileEntryId())%>"
				type="hidden" />
			<aui:input name="resumeFileEntry" type="file" label="Resume Upload">
				<aui:validator name="acceptFiles">'pdf,doc,docx'</aui:validator>
			</aui:input>
			<aui:input name="resumeFileEntryId"
				value="<%=String.valueOf(register.getResumeFileEntryId())%>"
				type="hidden" />
			<aui:input name="" type="Submit" value="Update" />
			<aui:button onClick="<%=home%>" value="Cancel" />
		</aui:column>
	</aui:layout>
</aui:form>

