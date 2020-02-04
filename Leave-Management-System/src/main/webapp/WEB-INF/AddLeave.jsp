<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="../WEB-INF/SideNavBar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/CustomLoginAuth.css	">
</head>
<body>
<div style="margin-left:24%;padding:1px 16px;height:1000px;">


	
<div id="wrapper">
		<div id="header">
		<br/>
	<br/>
		<h1>Add Leave</h1>
		</div>
	</div>
	<br/>
	<br/>
<% String id = request.getParameter("id"); %>
     
      <%if(id==null){
    	 id="0";
      }%>
     
     
  
   <c:url var="url" value="${id}">
						     <c:param name="id" value="<%=id %>" />
						 </c:url>

<form:form action="/leave/save${url}" modelAttribute="leaves">

  
     
 <div class="container">
    <label for="uname"><b>Leave</b></label>
    <form:input type="text" placeholder="Enter Leave" name="leavetype"  path="leavetype" />
   
    <button type="submit" value="submit">Submit</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    
</div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form:form>
</div>
</body>
</html>