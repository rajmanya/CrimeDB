<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<form action="${contectPath}/user/signIn.htm  " method="Post">
Username: <input type="text" name="username"/>
Password: <input type="password" name="password"/>
<input type="submit" value='login' />
</form>
</body>
</html>