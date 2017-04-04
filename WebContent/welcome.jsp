<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<SCRIPT language=JavaScript >
function fun2()
{

	document.welcome.method = "post";
	document.welcome.action = "ControllerServlet?command=checklogon";
	document.welcome.submit();
}

function fun1()
{

	document.welcome.method = "post";
	document.welcome.action = "ControllerServlet?command=checkregister";
	document.welcome.submit();
}
</SCRIPT>
</head>
<body>
<form name="welcome">
<center>
<h3>	Family Expense Management System	</h3>
<br>
<br>
<input type="submit" value="Register here" onclick="fun1()"/>
<input type="submit" value="Login here" onclick="fun2()"/>

</center>
</form>
</body>
</html>