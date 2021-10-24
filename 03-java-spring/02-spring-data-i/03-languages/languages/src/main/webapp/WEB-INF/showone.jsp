<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h1>Name :<c:out value="${language.name}"/></h1>
	<h1>Creator :<c:out value="${language.creator}"/></h1>
	<h1>Current Version :<c:out value="${language.currentVersion}"/></h1>
	<a href="/">Dashboard</a>
	<a href="/language/${language.id}/edit">Edit</a>
	<!--<a href="/languages/${language.id}">Delete</a>-->
	<form action="/languages/${language.id}" method="post">
	<input type="hidden" name="_method" value="delete">
	<input type="submit" value="Delete">
	</form>
</body>
</html>