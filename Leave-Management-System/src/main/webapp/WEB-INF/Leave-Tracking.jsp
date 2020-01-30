<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@include file="../WEB-INF/SideNavBar.jsp" %>
<!DOCTYPE html>




<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="/css/LeaveTable.css" />

</head>

<body>
<div style="margin-left:35%;padding:1px 16px;height:1000px;">
	<div id="wrapper">
		<div id="header">
			<h2>Dashboard</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>User Name</th>
					<th>User Type</th>
					<th>Leave Type</th>
					<th>From Date</th>
					<th>To Date</th>
					<th>Remarks</th>
					<th>Status</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempLeaves" items="${leaves}">
				
					<tr>
						<td> ${tempLeaves.user_name} </td>
						<td> ${tempLeaves.user_type} </td>
						<td> ${tempLeaves.leave_type} </td>
						<td> ${tempLeaves.from_date} </td>
						<td> ${tempLeaves.to_date} </td>
						<td> ${tempLeaves.remarks} </td>
						<td> ${tempLeaves.leavetype} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









