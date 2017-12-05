<%@ include file="/html/init.jsp"%>
<%@ include file="/html/dataLists.jsp"%>

<%
	Long primaryKey = Long.parseLong(ParamUtil.getString(request, "editKey"));
	Employee employee = EmployeeLocalServiceUtil.getEmployee(primaryKey);
	String imageUrl = StringPool.BLANK;
	if (employee.getFileEntryId() > 0) {
		FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(employee.getFileEntryId());
		FileVersion fileVersion = (FileVersion) fileEntry.getLatestFileVersion();
		imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true);
	}
%>
<portlet:renderURL var="home">
	<portlet:param name="mvcPath" value="/html/employee/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="editEmployeeAction" var="editEmployee">
	<portlet:param name="employeeId" value="<%=primaryKey.toString()%>" />
</portlet:actionURL>
<aui:form method="post" action="<%=editEmployee%>"
	name="employeeRegister" enctype="multipart/form-data">
	<aui:layout>
		<aui:column columnWidth="50">
			<aui:input label="Employee Name" name="employeeName" type="text"
				value="<%=employee.getEmployeeName()%>">
				<aui:validator name="required" errorMessage="Enter employee name" />
			</aui:input>
			<aui:input name="houseName" label="House Name" type="text"
				value="<%=employee.getHouseName()%>">
				<aui:validator name="required" errorMessage="Enter house name" />
			</aui:input>
			<aui:input name="street" label="Street" type="text"
				value="<%=employee.getStreet()%>">
				<aui:validator name="required" errorMessage="Enter street" />
			</aui:input>
			<aui:input name="city" label="City" type="text"
				value="<%=employee.getCity()%>">
				<aui:validator name="required" errorMessage="Enter city" />
			</aui:input>
			<aui:select name="district" label="District">
				<%
					for (String district : districtList) {
				%><aui:option label="<%=district%>" value="<%=district%>"
					selected="<%=(employee.getDistrict().equalsIgnoreCase(district)) ? true : false%>" />
				<%
					}
				%>
			</aui:select>
			<aui:input name="pincode" type="text" label="Pincode"
				value="<%=employee.getPincode()%>">
				<aui:validator name="required" errorMessage="Enter pincode" />
				<aui:validator name="maxLength">6</aui:validator>
				<aui:validator name="minLength">6</aui:validator>
				<aui:validator name="digits" errorMessage="Enter only digits" />
			</aui:input>
			<aui:input name="email" label="Email" type="text"
				value="<%=employee.getEmail()%>">
				<aui:validator name="required" errorMessage="Enter Email" />
				<aui:validator name="email" errorMessage="Format error" />
			</aui:input>
		</aui:column>
		<aui:column columnWidth="50">
			<img src="<%=imageUrl%>" alt="Employee Photo" height="150"
				width="150">
			<aui:input name="fileUpload" type="file" label="DisplayPic" />

			<aui:input name="fileEntryId" type="hidden"
				value="<%=employee.getFileEntryId()%>" />
			<aui:input name="phone" label="Phone" type="text"
				value="<%=employee.getPhone()%>">
				<aui:validator name="required" errorMessage="Enter phone" />
				<aui:validator name="maxLength">10</aui:validator>
				<aui:validator name="minLength">10</aui:validator>
				<aui:validator name="digits" errorMessage="Enter only digits" />
			</aui:input>
			<aui:select name="department" label="Department">
				<%
					for (String department : departmentList) {
				%><aui:option label="<%=department%>" value="<%=department%>"
					selected="<%=(employee.getDepartment().equalsIgnoreCase(department)) ? true : false%>" />
				<%
					}
				%>
			</aui:select>
			<aui:select name="designation" label="Designation">
				<%
					for (String designation : designationList) {
				%><aui:option label="<%=designation%>" value="<%=designation%>"
					selected="<%=(employee.getDesignation().equalsIgnoreCase(designation)) ? true : false%>" />
				<%
					}
				%>
			</aui:select>
			<aui:input name="aadharNumber" label="Aadhar Number" type="text"
				value="<%=employee.getAdharno()%>">
				<aui:validator name="required" errorMessage="Enter aadhar Id" />
				<aui:validator name="maxLength">12</aui:validator>
				<aui:validator name="minLength">12</aui:validator>
				<aui:validator name="digits" errorMessage="Enter only digits" />
			</aui:input>
			<aui:input name="salary" label="Salary" type="text"
				value="<%=employee.getSalary()%>">
				<aui:validator name="required" errorMessage="Enter salary" />
				<aui:validator name="digits" errorMessage="Enter only digits" />
			</aui:input>
		</aui:column>
	</aui:layout>

	<aui:input name="" type="submit" value="Update"></aui:input>
	<aui:button onClick="<%=home%>" value="cancel" />
</aui:form>
