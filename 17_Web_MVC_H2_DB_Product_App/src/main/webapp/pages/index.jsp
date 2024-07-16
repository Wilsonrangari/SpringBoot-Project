<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product App</title>
</head>
<body>
	<h3>Product Information</h3>
	<form:form action="/save" modelAttribute="p" methos="post">

		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>

				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>