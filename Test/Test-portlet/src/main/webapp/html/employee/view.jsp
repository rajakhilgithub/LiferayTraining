
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/dataLists.jsp"%>
<portlet:defineObjects />

<portlet:actionURL var="addEmployee" name="addEmployeeAction" />
<style>
.table1 {
	border: solid;
	border-width: 1px;
	width: 100%;
	text-align: center;
}

.button {
	border: none;
	color: white;
	padding: 10px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
}

.buttonRed {
	background-color: #f44336;
}

.buttonBlue {
	background-color: #008CBA;
}
}
</style>
<div align="center">
	<h3>Enter Employee Details</h3>
</div>

<table>
	<tr>
		<td><aui:form method="post" action="<%=addEmployee%>"
				name="employeeRegister" enctype="multipart/form-data">
				<aui:layout>
					<aui:column columnWidth="50">
						<aui:input name="employeeName" type="text" label="Employee Name"
							value="">
							<aui:validator name="required" errorMessage="Enter employee name" />
						</aui:input>
						<aui:input name="houseName" type="text" label="House Name"
							value="">
							<aui:validator name="required" errorMessage="Enter house name" />
						</aui:input>
						<aui:input name="street" type="text" label="Street" value="">
							<aui:validator name="required" errorMessage="Enter street" />
						</aui:input>
						<aui:input name="city" type="text" label="City" value="">
							<aui:validator name="required" errorMessage="Enter city" />
						</aui:input>
						<aui:select name="district" label="District">
							<%
								for (String district : districtList) {
							%><aui:option label="<%=district%>" value="<%=district%>" />
							<%
								}
							%>
						</aui:select>
						<aui:input name="pincode" label="Pincode" type="text" value="">
							<aui:validator name="required" errorMessage="Enter pincode" />
							<aui:validator name="maxLength">6</aui:validator>
							<aui:validator name="minLength">6</aui:validator>
							<aui:validator name="digits" errorMessage="Enter only digits" />
						</aui:input>
						<aui:input name="fileUpload" type="file" label="DisplayPic" />
					</aui:column>
					<aui:column columnWidth="50">
						<aui:input name="email" label="Email" type="text" value="">
							<aui:validator name="required" errorMessage="Enter Email" />
							<aui:validator name="email" errorMessage="Format error" />
						</aui:input>
						<aui:input name="phone" label="Phone" type="text" value="">
							<aui:validator name="required" errorMessage="Enter phone" />
							<aui:validator name="maxLength">10</aui:validator>
							<aui:validator name="minLength">10</aui:validator>
							<aui:validator name="digits" errorMessage="Enter only digits" />
						</aui:input>
						<aui:select name="department" label="Department">
							<%
								for (String department : departmentList) {
							%><aui:option label="<%=department%>" value="<%=department%>" />
							<%
								}
							%>
						</aui:select>
						<aui:select name="designation" label="Designation">
							<%
								for (String designation : designationList) {
							%><aui:option label="<%=designation%>" value="<%=designation%>" />
							<%
								}
							%>
						</aui:select>
						<aui:input name="aadharNumber" label="Aadhar Number" type="text"
							value="">
							<aui:validator name="required" errorMessage="Enter aadhar Id" />
							<aui:validator name="maxLength">12</aui:validator>
							<aui:validator name="minLength">12</aui:validator>
							<aui:validator name="digits" errorMessage="Enter only digits" />
						</aui:input>
						<aui:input name="salary" label="Salary" type="text" value="">
							<aui:validator name="required" errorMessage="Enter salary" />
							<aui:validator name="digits" errorMessage="Enter only digits" />
						</aui:input>
					</aui:column>
				</aui:layout>
				<aui:input name="" type="submit" value="Add"></aui:input>
			</aui:form></td>
	</tr>
</table>
<div align="center">
	<h4>Employee Details</h4>
</div>
<liferay-ui:search-container delta="5"
	emptyResultsMessage="no records found">
	<liferay-ui:search-container-results>
		<%
			List<Employee> employeeList = EmployeeLocalServiceUtil.getEmployees(-1, -1);

					results = ListUtil.subList(employeeList, searchContainer.getStart(), searchContainer.getEnd());
					total = employeeList.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row
		className="net.opentrends.training.service.model.Employee"
		modelVar="employee" keyProperty="employeeId">
		<portlet:renderURL var="employeeDetails">
			<portlet:param name="employeeId"
				value="<%=String.valueOf(employee.getEmployeeId())%>" />
			<portlet:param name="mvcPath" value="/html/employee/display.jsp" />
		</portlet:renderURL>
		<liferay-ui:search-container-column-text name="Employee Name"
			value="<%=employee.getEmployeeName()%>" href="<%=employeeDetails%>" />
		<liferay-ui:search-container-column-text name="Department"
			value="<%=employee.getDepartment()%>" />
		<liferay-ui:search-container-column-text name="Designation"
			value="<%=employee.getDesignation()%>" />

		<liferay-ui:search-container-column-text name="Display Pic">
			<%
				try {
								String imageUrl = StringPool.BLANK;
								if (employee.getFileEntryId() > 0) {
									imageUrl = EmployeeLocalServiceUtil.getPreviewtImageUrl(employee.getFileEntryId(),
											themeDisplay);
									System.out.println("imageurl==>" + imageUrl);
			%>
			<div align="center">
				<img src="<%=imageUrl%>" alt="Employee Photo" height="30" width="30">
			</div>
			<%
				}
							} catch (Exception e) {
								System.out.println("exception in jsp:===>" + e.getMessage());
								e.printStackTrace();
							}
			%>

		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-jsp
			path="/html/employee/action.jsp" align="right" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
