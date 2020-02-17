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


<script type="text/javascript">
function DateCheck()
{
  var StartDate= document.getElementById('from_date').value;
  var EndDate= document.getElementById('to_date').value;
  var eDate = new Date(EndDate);
  var sDate = new Date(StartDate);
  if(StartDate!= '' && StartDate!= '' && sDate> eDate)
    {
    alert("Please ensure that the To Date is greater than or equal to the From Date.");
    return false;
    }
  if(StartDate=='' ||  EndDate=='' )
	  {
	      alert("Please enter To Date and From Date");
	      return false;
	  }
}

function DataCheck()
{
    var Usertype=document.getElementById('usertype').value.trim();
    var Leavetype=document.getElementById('leavetype').value.trim();
    var Remarks=document.getElementById('remarks').value.trim();
    alert(Usertype+""+Leavetype+""+Remarks);
    if(Usertype=='' || Usertype==null || Leavetype=='' || Remarks=='')
    	{
    	    alert("Please fill all the Fields");
    	    return false;
    	}
}
</script>


<div style="margin-left:24%;padding:1px 16px;height:1000px;">
<h1> Apply Leave</h1>
<form:form action="/leaves/adding" method="post" modelAttribute="leaves" onSubmit="return DateCheck() && DataCheck()" >
 
  <div class="container">
    
    <h6>${message}</h6>
    <label for="uname"><b>User Name</b></label>
    <form:input type="text" placeholder="Enter User Name" name="user_name" value="${username}" path="username"  />
    
    <label for="uname"><b>User Type</b></label>
    <form:input type="text" placeholder="Enter User Type" name="user_type"  path="usertype" id="usertype"/>
   <label for="uname"><b>Leave Type</b></label>
      <form:select  name="leave_type" path="leavetype" id="leavetype" >
      <form:option value="Casual Leave">Casual Leave</form:option>
      
      <c:forEach items="${theLeaves}" var="leave">
                   <form:option value="${leave.leavetype}">${leave.leavetype}</form:option>
        </c:forEach>
     
  <!--   <form:option value="${theLeaves}">Casual Leave</form:option>
    <form:option value="${theLeaves}">Casual Leave</form:option>
 -->
    </form:select>
    <br/>
    <br/>
    <label for="uname"><b>From Date</b></label>
    <form:input type="date" placeholder="Enter From Date" name="from_date" path="from_date" id="from_date" onChange="DateCheck()"/>
     &nbsp &nbsp &nbsp
    <label for="uname"><b>To Date</b></label>
    <form:input type="date" placeholder="Enter To Date" name="to_date" path="to_date"  id="to_date" onChange="DateCheck()"/>

    <br/>
    <br/>	
    <label for="uname"><b>Remarks</b></label>
    <form:input type="text" placeholder="Enter Leave Reason" name="remarks" path="remarks"  id="remarks" onChange="DataCheck()" />

    <button type="submit" >Submit</button>
    
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    
  </div>
</form:form>
</div>
</body>
</html>