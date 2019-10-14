<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<form action="${contextPath}/user/LoginUser.htm" method="post" >
Username: <input type="text" name="username"/>
Password: <input type="password" name="password"/>
<input type="submit" value='login' />
</form>
New User? <a href="${contextPath}/user/CreateUser.htm">Create Account</a>
</body>
</html>