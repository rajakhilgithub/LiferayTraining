<%@page import="java.util.Arrays"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%
	String[] districts={"Trivandram","Kollam","Alappuzha","pathanamthitta","Kottayam","Idukki","Eranakulam","Thrissur","Kozhikode","Malappuram","Palakkad","Kannur","Wayanad","Kasargod"};
List<String> districtList=Arrays.asList(districts);

String[] departments={"HR","Development","Sales","Service","Finance"};
List<String> departmentList=Arrays.asList(departments);

String[] designations={"Lead","Senior Developer","Juniour Developer","Trainee","Assistant Manager","Manager","Assistant","Executive"};
List<String> designationList=Arrays.asList(designations);
%>