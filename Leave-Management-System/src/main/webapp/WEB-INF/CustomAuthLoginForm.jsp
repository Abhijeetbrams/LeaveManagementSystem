<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/CustomLoginAuth.css">
</head>
<body>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post" >
  <div class="imgcontainer">
    <img src="/images/login.png" alt="Abhi" class="avatar">
  </div>

<!-- Check for the Login error  -->
   <c:if test="${param.error!=null}">
      <i>Sorry you have have entered an incorrect password</i>
      </c:if>
     
     <!-- Check for the Logout   -->
   <c:if test="${param.logout!=null}">
      <i> You have been Successfully logged out</i>
      </c:if>
       
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username"  />
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" />
    
    <button type="submit" value="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form:form>

</body>
</html>