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
		<sec:authorize access="hasRole('ADMIN')">
			<h2>Dashboard</h2>
			</sec:authorize>
			<sec:authorize access="hasRole('EMPLOYEE')">
			<h2>Leave Track Record</h2>
			</sec:authorize>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table>
				<tr>
				<sec:authorize access="hasRole('ADMIN')">
					<th>User Name</th>
					<th>User Type</th>
				</sec:authorize>
					<th>Leave Type</th>
					<th>From Date</th>
					<th>To Date</th>
					<th>Remarks</th>
					<th>Status</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempLeaves" items="${leaves}">
				
					<tr>
					<sec:authorize access="hasRole('ADMIN')">
						<td> ${tempLeaves.username} </td>
						<td> ${tempLeaves.usertype} </td>
				    </sec:authorize>
						<td> ${tempLeaves.leavetype} </td>
						<td> ${tempLeaves.from_date} </td>
						<td> ${tempLeaves.to_date} </td>
						<td> ${tempLeaves.remarks} </td>
						<c:url var="Approve" value="/leaves/status">
						     <c:param name="id" value="${tempLeaves.id}" />
						     <c:param name="status" value="Approved" />
						 </c:url> 
						 <c:url var="DisApprove" value="/leaves/status">
						     <c:param name="id" value="${tempLeaves.id}" />
						     <c:param name="status" value="DisApproved" />
						 </c:url> 
						<c:choose>
						  <c:when test="${tempLeaves.status==null}">
						   <i> 
						   <sec:authorize access="hasRole('ADMIN')">
						  <td><button type="button" ><a href="${Approve}"
						  onClick="if(!(confirm('Are you sure you want to Approve this'))) return false">Approve</a></button>
                          <button type="button" ><a href="${DisApprove}"
                          onClick="if(!(confirm('Are you sure you want to DisApprove this'))) return false">DisApprove</a></button>
                          </td></sec:authorize>
                          <sec:authorize access="hasRole('EMPLOYEE')">
                          <td><h6>Waiting For Approval</h6></td>
                          </sec:authorize>
                          </i>
                          
						  </c:when>
						  <c:otherwise>
						    <td> ${tempLeaves.status} </td>
						  </c:otherwise>
						</c:choose>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









