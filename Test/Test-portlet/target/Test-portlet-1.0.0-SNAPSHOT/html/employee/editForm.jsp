<%@ include file="/html/headers.jsp"%>
<%@ include file="/html/dataLists.jsp"%>
<%
Long primaryKey=Long.parseLong(ParamUtil.getString(request, "editKey"));
Employee employee=EmployeeLocalServiceUtil.getEmployee(primaryKey);
%>
<portlet:renderURL var="home">
<portlet:param name="mvcPath" value="/html/employee/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editEmployeeAction" var="editEmployee">
<portlet:param name="employeeId" value="<%=primaryKey %>"/>
</portlet:actionURL>

<aui:form method="post" action="<%=editEmployee%>"
				name="employeeRegister">
				<aui:layout>
					<aui:column columnWidth="50">
						<aui:input name="Employee Name" type="text" value="<%=employee.getEmployeeName()%>" />
						<aui:input name="House Name" type="text" value="<%=employee.getHouseName()%>" />
						<aui:input name="Street" type="text" value="<%=employee.getStreet() %>" />
						<aui:input name="City" type="text" value="<%=employee.getCity() %>" />
						<aui:select name="District">
						<%
						for(String district:districtList){
							%><aui:option label="<%=district%>" value="<%=district%>" />
							<%
						}
						%>
						</aui:select>
					</aui:column>
					<aui:column columnWidth="50">
						<aui:input name="Pincode" type="text" value="<%=employee.getPhone() %>" />
						<aui:input name="Phone" type="text" value="<%=employee.getPincode() %>" />
						<aui:select name="Department">
							<%
						for(String department:departmentList){
							%><aui:option label="<%=department%>" value="<%=department%>" />
							
							<%
						}
						%>
						</aui:select>
						<aui:select name="Designation">
								<%
						for(String designation:designationList){
							%><aui:option label="<%=designation%>" value="<%=designation%>" />
							<%
						}
						%>

						</aui:select>
						<aui:input name="Salary" type="text" value="<%=employee.getSalary() %>" />
						
					</aui:column>
				</aui:layout>
				<aui:input name="" type="submit" value="Add"></aui:input>
				
				<aui:button onClick="<%=home%>" value="cancel"/>
				
				
				
			</aui:form>
