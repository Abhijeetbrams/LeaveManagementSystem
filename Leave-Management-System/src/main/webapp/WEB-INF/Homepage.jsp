<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="../WEB-INF/SideNavBar.jsp" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin-left:25%;padding:1px 16px;height:1000px;">

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
<p>${username}</p>
<p>${role}</p>
<% String username= request.getUserPrincipal().getName();
   request.setAttribute("username",username);
   System.out.println(username);
   request.getSession().setAttribute("username",username);%>
<input type="submit" value="logout"/>

</form:form>
</div>
</body>
</html>