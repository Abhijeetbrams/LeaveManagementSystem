<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/SideNavBar.css">
</head>
<body>
<ul>
  
  <li><a class="active" href="#"><div class="imgcontainer"><img src="/images/login.png" alt="Abhi" class="avatar"></div></a>
  <br/>
  <h1><sec:authentication property="principal.username"/></h1>
 
  
  <h2>${fn:substring(role,6,11)}</h2>
  </li>
  <sec:authorize access="hasRole('ADMIN')">
   

  <li><h4><a  href="/leaves/leaveTracking">Dashboard</a></h4></li>
  <li><h4><a  href="/department/viewDepartment">Department</a></h4></li>
  <li><h4><a href="/leave/viewLeave">Leave Type</a></h4></li>
  <li><h4><a href="/employee/viewEmployee">Employees</a></h4></li>
  <li><h4><a href="#about">About</a></h4></li>
  <li><h4><a href="showMyLoginPage?logout">Logout</a></h4></li>
  
  </sec:authorize>
   <sec:authorize access="hasRole('EMPLOYEE')">
  <li><h4><a  href="/leaves/leaveTracking">Leave Tracking</a></h4></li>
  <li><h4><a href="/applyleave">Apply Leave</a></h4></li>
  <li><h4><a href="/employeeLeaveDetail/viewDetails">Leaves</a></h4></li>
  <li><h4><a href="/employee/editEmp">Edit Profile</a></h4></li>
  <li><h4><a href="showMyLoginPage?logout">Logout</a></h4></li>
  
  </sec:authorize>
  
</ul>


</body>
</html>

