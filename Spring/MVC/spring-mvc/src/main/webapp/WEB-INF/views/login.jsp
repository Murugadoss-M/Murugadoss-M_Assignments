<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/doLogin" method="post" modelAttribute="User">
		Username : <form:input type="text" path="username"/><br>
		Email Id : <form:input type="email" path="email"/><br>
		Password : <form:input type="password" path="password"/><br>
		<input type="submit" value="Login"/>
	</form:form>
</body>
</html>