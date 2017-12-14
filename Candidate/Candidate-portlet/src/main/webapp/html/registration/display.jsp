<%@page import="javax.imageio.spi.RegisterableService"%>
<%@include file="/html/init.jsp"%>
<%
	long key = Long.parseLong(ParamUtil.getString(request, "Key"));
	Registration register = RegistrationLocalServiceUtil.getRegistration(key);
%>
<portlet:renderURL var="home">
	<portlet:param name="mvcPath" value="/html/registration/view.jsp" />
</portlet:renderURL>
<aui:layout>
	<aui:column>
		<div>
			<h1><%=register.getName()%></h1>
		</div>
		<div>
			<h5><%=register.getCity()%></h5>
			<h5><%=register.getMobileNo()%></h5>
			<h5><%=register.getEmail()%></h5>
		</div>
	</aui:column>
	<aui:column>
		<%
			String imageUrl = StringPool.BLANK;
					if (register.getPhotoFileEntryId() > 0) {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(register.getPhotoFileEntryId());
						imageUrl = RegistrationLocalServiceUtil.getImageUrl(fileEntry, themeDisplay);
		%>
		<img alt="photo" src="<%=imageUrl%>" height="300" width="300" />
		<%
			}
		%>
	</aui:column>
</aui:layout>
<aui:button onClick="<%=home%>" value="Back" />
