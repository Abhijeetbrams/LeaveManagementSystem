<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../WEB-INF/SideNavBar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/CustomLoginAuth.css">
</head>
<body>

<div style="margin-left:24%;padding:1px 16px;height:1000px;">
<h1> Apply Leave</h1>
<form:form action="/leaves/adding" method="post" modelAttribute="leaves">
 
  <div class="container">
    
    <h6>${message}</h6>
    <label for="uname"><b>User Name</b></label>
    <form:input type="text" placeholder="Enter User Name" name="user_name" value="${username}" path="username"  />
    
    <label for="uname"><b>User Type</b></label>
    <form:input type="text" placeholder="Enter User Type" name="user_type"  path="usertype" />

    <label for="uname"><b>Leave Type</b></label>
    <form:input type="text" placeholder="Enter Leave Type" name="leave_type" path="leavetype"  />

    <br/>
    <br/>
    <label for="uname"><b>From Date</b></label>
    <form:input type="date" placeholder="Enter From Date" name="from_date" path="from_date"  />
     &nbsp &nbsp &nbsp
    <label for="uname"><b>To Date</b></label>
    <form:input type="date" placeholder="Enter To Date" name="to_date" path="to_date"  />

    <br/>
    <br/>
    <label for="uname"><b>Remarks</b></label>
    <form:input type="text" placeholder="Enter Leave Reason" name="remarks" path="remarks"  />

    <button type="submit" >Submit</button>
    
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    
  </div>
</form:form>
</div>
</body>
</html>