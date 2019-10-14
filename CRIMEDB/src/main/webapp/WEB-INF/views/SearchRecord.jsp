<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Records</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script>
function showDiv(select){
	document.getElementById('crime').style.display = "none";
	document.getElementById('location').style.display = "none";
	document.getElementById('cal').style.display = "none";
	document.getElementById('accusedName').style.display = "none";
	 if(select.value=='1'){
		    document.getElementById('crime').style.display = "block";
		   } else if(select.value=='2'){
		    document.getElementById('location').style.display = "block";
		   }else if(select.value=='3'){
			    document.getElementById('cal').style.display = "block";
		   }else
			   document.getElementById('accusedName').style.display = "block";
}
</script>
<h1><b><i>Search Records</i></b></h1>
Search based on:-<select onchange='showDiv(this)'>
<option></option>
<option value="1"> Crime </option>
<option value="2"> location </option>
<option value="3"> Crime and Location</option>
<option value="4"> Accused Name</option>
</select>
<div id='crime' style="display: none;">
<form action="${contextPath}/user/SearchController/SearchByCrime.htm" method="get">
Crime:- <select>
<option></option>
<option value="murder">Murder</option>
<option value="Assault">Assault</option>
<option value="Robbery">Robbery</option>
<option value="Rape">Rape</option>
</select>
<input type="submit" value='Search'>
</form>
</div>
<div id='location' style="display: none;">
<form action="${contextPath}/user/SearchController/SearchByLocation.htm" method="get">
Location:-<select name="Location">
<option></option>
<option value="Fenway">Fenway</option>
<option value="Brookline">Brookline</option>
<option value="Downtown">Downtown</option>
</select>
</form>
<input type="submit" value='Search'>
</div>
<div id='cal' style="display: none;">
<form action="${contextPath}/user/SearchController/SearchByCrime&Location.htm" method="get">
Crime:- <select>
<option></option>
<option value="murder">Murder</option>
<option value="Assault">Assault</option>
<option value="Robbery">Robbery</option>
<option value="Rape">Rape</option>
</select>
Location:-<select>
<option></option>
<option value="Fenway">Fenway</option>
<option value="Brookline">Brookline</option>
<option value="Downtown">Downtown</option>
</select>
<input type="submit" value='Search'>
</form>
</div>
<div id="accusedName" style="display: none;">
<form action="${contextPath}/user/SearchController/SearchByAccused.htm" method="get">
Accused Name :-<input type='text' id='accused_name'>
<input type="submit" value='Search'>
</form>
</div>
</body>
</html>