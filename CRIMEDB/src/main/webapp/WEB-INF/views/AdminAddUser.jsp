<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ApproveUser</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<table>
<tr>
<td>Username</td>
</tr>
 <c:forEach items="${ulist}" var="user">
 <tr>
 <td><c:out value="${user.usernaname}"/></td>
<td>
 <form action="${contextPath}/admin/approve/request.htm?id=${user.id}" method="post">
 <input type="submit" value="Approve" class="button"/>
 </form>
 </td>
 </tr>                
</c:forEach>
</table>
</body>
</html>