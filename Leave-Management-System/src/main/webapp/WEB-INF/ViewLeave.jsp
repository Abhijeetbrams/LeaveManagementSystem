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
		<h1>Add and Remove LeaveType</h1>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		<table>
				<tr>
				
					<th>LeaveType</th>
					<th>Action</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempLeave" items="${leaves}">
				
					<tr>
						<td> ${tempLeave.leavetype} </td>
						<c:url var="Edit" value="/leave/edit">
						     <c:param name="id" value="${tempLeave.id}" />
						     
						 </c:url> 
						 <c:url var="Delete" value="/leave/delete">
						     <c:param name="id" value="${tempLeave.id}" />
						 </c:url> 
						
						  <td><button type="button" ><a href="${Edit}">Edit</a></button>
                         <button type="button" > <a href="${Delete}"
                          onClick="if(!(confirm('Are you sure you want to Delete this'))) return false">Delete</a></button>
                          </td>
                         
					</tr>
				
				</c:forEach>
						
			</table>
			<button type="button" ><a href="/leave/add">Add LeaveType</a></button>
		</div>

</body>
</html>