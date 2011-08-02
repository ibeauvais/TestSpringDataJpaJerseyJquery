<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>


<html>
<head>
	<title>Etablissements list</title>
</head>	
<body>
<div class="container">
	<h1>
		Etablissements
	</h1>
	<div class="span-12 last">	
	<table>
  <thead>
  <tr>
    <th>Nom</th>
    <th>Description</th>
</tr>
  </thead>
<c:forEach var="etablissement" items="${etablissements}">
<tr>
	<td>&nbsp;<a href="${etablissement.id}">${etablissement.name}</a>&nbsp;</td>
	<td>&nbsp;<spring:eval expression="etablissement.dateCreation"/>&nbsp;</td>
	
</tr>
	

</c:forEach>

		  </table>
	</div>
	
</div>
</body>
</html>