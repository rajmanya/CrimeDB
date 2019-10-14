<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<a href="${contextPath}/admin/ApproveUser.htm">Approve New User</a><br>
<a href="${contextPath}/admin/addRecord/CreateRecord.htm"> Create New Record</a><br> 
<a href="${contectPath}/admin/DeleteUser.htm"> Delete User</a>
</body>
</html>