<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@include file="../WEB-INF/SideNavBar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/LeaveTable.css">
</head>
<body>
<div style="margin-left:35%;padding:1px 16px;height:1000px;">
<% String username= request.getUserPrincipal().getName();
   request.setAttribute("username",username);
   System.out.println(username);%>
  <div id="wrapper">
		<div id="header">
		<h1>Leave Summary</h1>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		<table>
				
				<tr>
					<th>Username</th>
					<td> <b>${employeeLeaveDetail.username}</b> </td>
				</tr>
				<tr>
					<th>Casual Leave</th>
					<td> ${employeeLeaveDetail.casual_leave} </td>
				</tr>	
			    <tr>
					<th>Earned Leave</th>
					<td> ${employeeLeaveDetail.earned_leave} </td>
				</tr>	
				<tr>
		             <th>Sick Leave</th>
		            <td> ${employeeLeaveDetail.sick_leave} </td>
		        </tr>     
		        <tr>     
					<th>Marriage Leave</th>
					<td> ${employeeLeaveDetail.marriage_leave} </td>
				</tr>	
				<tr>
					<th>Paternity Leave</th>
					<td> ${employeeLeaveDetail.paternity_leave} </td>
				</tr>	
				<tr>	
					<th>Bereavement Leave</th>
					<td> ${employeeLeaveDetail.bereavement_Leave} </td>
				</tr>
			
				
						
			</table>
			
		</div>

</body>
</html>