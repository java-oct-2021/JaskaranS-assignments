<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>You have Visited <a href="/your_server">http://your_server</a></h2>
	<h2><c:out value="${countToShow}"/>times</h2>
	<h2><a href="/your_server">Test another visit? </a></h2>
	<h2><a href ="/counterby2">Check Counter by 2 Page</a></h2>
</body>
</html>