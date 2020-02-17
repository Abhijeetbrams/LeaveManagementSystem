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

  <div id="wrapper">
		<div id="header">
		<h1>Add and Remove Employee</h1>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		<table>
				<tr>
				
					<th>Employee Name</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Designation</th>
					<th>Reporting</th>
					<th>Phone Number</th>
					<th>Action</th>
					
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempEmployee" items="${employee}">
				
					<tr>
					    <td> ${tempEmployee.username} </td>
						<td> ${tempEmployee.full_name} </td>
						<td> ${tempEmployee.email} </td>
						<td> ${tempEmployee.designation} </td>
						<td> ${tempEmployee.reporting} </td>
						<td> ${tempEmployee.phone_number} </td>
						
						<c:url var="Edit" value="/employee/edit">
						     <c:param name="id" value="${tempEmployee.id}" />
						     
						 </c:url> 
						 <c:url var="Delete" value="/employee/delete">
						     <c:param name="id" value="${tempEmployee.id}" />
						 </c:url> 
						
						  <td><button type="button" ><a href="${Edit}">Edit</a></button>
                         <button type="button" > <a href="${Delete}"
                          onClick="if(!(confirm('Are you sure you want to Delete this'))) return false">Delete</a></button>
                          </td>
                         
					</tr>
				
				</c:forEach>
						
			</table>
			<!--<c:url var="Add" value="/employee/add">
						     <c:param name="username" value="New" />
						 </c:url> -->
			<button type="button" ><a href="/employee/add">Add Employee</a></button>
		</div>

</body>
</html>