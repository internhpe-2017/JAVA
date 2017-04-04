<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script type="text/javascript">
function fun()
{

	document.reg_form.method = "post";
	document.reg_form.action = "ControllerServlet?command=checkcancel";
	document.reg_form.submit();
}



</script>



</head>
<body>
<form name="reg_form">
<pre>
<h1> Register Here </h1>
<hr>
<b>Name</b> 				:	<input type ="text" name="j_name" /> 
<br>		
<b>Email</b>				:	<input type ="text" name="j_email" /> 
<br>
<b>Password</b> 			:	<input type ="password" name="j_pwd" /> 
<br>
<b>Family Name</b>			:	<input type ="text" name="j_gid" /> 
<br>
<b>DOB</b> 				:	<input type ="text" name="j_dob" /> 
<br>
<b>Gender </b>				:	<input type = "text" name="j_sex" />
<br>
</pre>
<input type = "submit" id = "reg" Value = "Register"/>
<input type = "button" id = "Cancel" Value = "Cancel" onClick="fun()" />
</form>
</body>
</html>