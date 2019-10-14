  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a New Record</title>

</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script>
 
function showDiv(select){
	document.getElementById('Loc1').style.display = "none";
	document.getElementById('Loc2').style.display = "none";
	document.getElementById('Loc3').style.display = "none";
	   if(select.value=='Fenway'){
	    document.getElementById('Loc1').style.display = "block";
	   } else if(select.value=='Brookline'){
	    document.getElementById('Loc2').style.display = "block";
	   } else{
		document.getElementById('Loc3').style.display = "block";
	   }
	}
function fillGrievant(f){
	if(f.copy.checked == true){
		f.gname.value = f.vname.value ;
		f.gage.value = f.vage.value ;
		f.gadd.value=f.vadd.value ;
		f.ggender.value=f.vgender.value;
		f.gno.value=f.vno.value;
		}
	
} 
</script>
<form>
<h1><b><i>Create a New Record</i></b></h1>
<div>
Crime:- <select name="Crime">
<option></option>
<option value="murder">Murder</option>
<option value="Assault">Assault</option>
<option value="Robbery">Robbery</option>
<option value="Rape">Rape</option>
</select>
</div>
<div>
Crime Location:<select id="loc" name="Location" onchange="showDiv(this)">
<option></option>
<option value="Fenway">Fenway</option>
<option value="Brookline">Brookline</option>
<option value="Downtown">Downtown</option>
</select>
</div>
<div id="Loc1" style="display: none;">
Select Officer: <select name="Officer">
<option value="Sherlock Holmes">Sherlock Holmes</option>
<option value="Greg Lestrade">Greg Lestreade</option>
<option value="John Watson">John Watson</option>
</select>
</div>
<div id="Loc2" style="display: none;">
Select Officer: <select name="Officer">
<option value="Ross Geller">Ross Geller</option>
<option value="Chandler Bing">Chandler Bing</option>
<option value="Joey Tribbianni">Joey Tribbianni</option>
</select>
</div>
<div id="Loc3" style="display: none;">
Select Officer: <select name="Officer">
<option  value="Mike Ross">Mike Ross</option>
<option  value="Harvey Spector">Harvey Spector</option>
<option value="Louis Litt">Louis Litt</option>
</select>
</div>
Date of Offence: <input type="date" id="date" name="date" /> <br />
Case Status : <select name="status">
<option></option>
<option value="Close">Close</option>
<option value="Open">Open</option>
</select>
<div>
<p><b><i>Victim Details</i></b></p>
Victim Name:- <input type="text" name="vname" /><br />
Age:- <input type="text" name="vage"/><br />
Address:-<input type="text" name="vadd" /> <br />
Gender:- <input type="radio" name="vgender" value="Male">male <input type="radio" name="vgender" value="Female" />female<br/>
Phone number:- <input type="text" name="vno" />
</div><br>
<input type="checkbox" name="copy" onclick="fillGrievant(this.form)"> Grievant is same as the Victim
<div>
<p><b><i>Grievant Details</i></b></p>
Grievant Name:- <input type="text" name="gname" /><br />
Age:- <input type="text" name="gage"/><br />
Address:-<input type="text" name="gadd" /> <br />
Gender:- <input type="radio" name="ggender" value="Male">male <input type="radio" name="ggender" value="Female" />female<br/>
Phone number:- <input type="text" name="gno" />
</div>
<div>
<p><b><i>Accused Details</i></b></p>
Accused Name:- <input type="text" name="aname" /><br />
Age:- <input type="text" name="aage"/><br />
Address:-<input type="text" name="aadd" /> <br />
Gender:- <input type="radio" name="agender" value="Male">male <input type="radio" name="ggender" value="Female" />female<br/>
Phone number:- <input type="text" name="ano" />
</div>
<input type="submit" value="Create">
</form>
</body>
</html>