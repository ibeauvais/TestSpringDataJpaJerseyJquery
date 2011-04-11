<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<METAÂ http-equiv="Content-Type"Â content="text/html;charset=UTF-8">
	<title>book list</title>
	
	
		
</head>	
<body>
<div class="container">
	<h1>
		Etablissements
	</h1>
	<div class="span-12 last">	
	<table>
  <thead>
    <th>Nom</th>
    <th>Description</th>

  </thead>
		 <!--  <c:forEach var="book" items="${bookList}">
		  <tr>
      <td>
          <spring:url value="book/{id}" var="bookUrl">
              <spring:param name="id" value="${book.id}"/>
          </spring:url>
          <a href="${fn:escapeXml(bookUrl)}">${book.title}</a>
      </td>
      <td>${book.description}</td>
     
    </tr>
		  </c:forEach> -->
		  <c:out value="${message}"></c:out>
		  </table>
	</div>
	
</div>
</body>
</html>