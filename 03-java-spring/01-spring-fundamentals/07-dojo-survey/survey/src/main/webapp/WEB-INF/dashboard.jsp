<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<body>
	<h1>User Info:</h1>
	<p><c:out value="${name}"/><p>
	<p><c:out value="${location}"/><p>
	<p><c:out value="${language}"/><p>
	<p><c:out value="${comment}"/><p>
</body>
</html>