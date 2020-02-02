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
  <li><h4><a  href="#">Department</a></h4></li>
  <li><h4><a href="#news">Leave Type</a></h4></li>
  <li><h4><a href="#contact">Employees</a></h4></li>
  <li><h4><a href="#about">About</a></h4></li>
  <li><h4><a href="${pageContext.request.contextPath}/logout">Logout</a></h4></li>
  
  </sec:authorize>
   <sec:authorize access="hasRole('EMPLOYEE')">
  <li><h4><a  href="#">Dashboard</a></h4></li>
  <li><h4><a  href="#">Leave Tracking</a></h4></li>
  <li><h4><a href="/applyleave">Apply Leave</a></h4></li>
  <li><h4><a href="#contact">Leaves</a></h4></li>
  <li><h4><a href="#about">About</a></h4></li>
  <li><h4><a href="${pageContext.request.contextPath}/logout">Logout</a></h4></li>
  
  </sec:authorize>
  
</ul>


</body>
</html>

