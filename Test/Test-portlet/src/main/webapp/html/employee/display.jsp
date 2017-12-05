<%@ include file="/html/init.jsp"%>
<%
	Long employeeId = Long.parseLong(ParamUtil.getString(request, "employeeId"));
	Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
	String imageUrl = StringPool.BLANK;
	if (employee.getFileEntryId() > 0) {
		imageUrl = EmployeeLocalServiceUtil.getPreviewtImageUrl(employee.getFileEntryId(), themeDisplay);
	}
%>
<aui:layout>
	<aui:column>
		<div align="left">
			<h1><%=employee.getEmployeeName()%></h1>
			<br>
			<h4><%=employee.getDesignation()%>-<%=employee.getDepartment()%></h4>
			<br>
			<p><%=employee.getHouseName()%></p>
			<p><%=employee.getStreet()%></p>
			<p><%=employee.getCity()%></p>
			<p><%=employee.getDistrict()%></p>
			<p><%=employee.getPincode()%></p>
			<br>
			<p>
				Aadhar no:
				<%=employee.getAdharno()%></p>
			<p>
				Email:
				<%=employee.getEmail()%></p>
			<p>
				Ph:
				<%=employee.getPhone()%></p>
			<br>
			<p>
				Salary:
				<%=employee.getSalary()%></p>
			<br>


			<portlet:renderURL var="back">
				<portlet:param name="mvcPath" value="/html/employee/view.jsp" />
			</portlet:renderURL>
			<aui:button value="Back" onClick="<%=back%>" />
		</div>
	</aui:column>
	<aui:column>
		<div align="right">
			<img align="center" src="<%=imageUrl%>" height="250" width="250"
				alt="displaypic" />
		</div>
	</aui:column>
</aui:layout>