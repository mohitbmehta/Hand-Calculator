<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size: x-large;">
	<%
		if (request.getAttribute("update") == null) {
			request.setAttribute("update", 0);
		}
	%>

<center>

	<form action="HelloServlet" method="get" name="paperTrail">
		<font face="Courier New" color="green"  ><h4>Homework 5 JSP and Servlet</h4></font><br>
		<table border="1" style="border:thin;border-style: dotted;">
			<tr>
				<td colspan="4"><input type="text" name="inputText" onchange="validate()" style="font-family: Courier New; font-size: x-large;"
					value="<%=Double.parseDouble(request.getAttribute("update").toString())%>"></td>
			</tr>
			<tr>
				<td><input type="submit" name="btn" value="Add" style="  height:35px;    width:80px;"></td>
				<td><input type="submit" name="btn" value="Sub" style="  height:35px;    width:80px;"></td>
				<td><input type="submit" name="btn" value="Div" style="  height:35px;    width:80px;"></td>
				<td><input type="submit" name="btn" value="Mul" style="  height:35px;    width:80px;"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="btn" value="Clear" style="  height:35px;    width:80px;"></td>
				<td colspan="2"><input type="submit" name="btn" value="Clear All" style="  height:35px;    width:80px;"></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" name="btn" value="Equal" style="  height:35px;    width:80px;"></td>
			</tr>
		</table>

	</form>

</center>

<script>

function validate()
{
  var x=document.forms["paperTrail"]["inputText"].value;
  if(isNaN(x)) 
  {
    alert("Enter Numberic Value Only !!!!");
    return false;
  }
}
</script>

</body>
</html>