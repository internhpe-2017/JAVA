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

	document.login_form.method = "post";
	document.login_form.action = "ControllerServlet?command=checkcancel";
	document.login_form.submit();
}



</script>



</head>
<body>
<form name="login_form">
<pre>
<h1> Login</h1>
<hr>
<b>Username</b>	:	<input type ="text" name="j_username" /> 
<br>
<b>Password</b>	:	<input type = "password" name="j_password" />
<br>
</pre>
<input type = "submit" id = "login" Value = "Login"/>
<input type = "button" id = "Cancel" Value = "Cancel" onClick="fun()" />
</form>
</body>
</html>