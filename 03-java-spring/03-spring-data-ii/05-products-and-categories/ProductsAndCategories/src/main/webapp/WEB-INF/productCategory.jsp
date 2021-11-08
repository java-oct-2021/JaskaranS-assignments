<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Categories</title>
</head>
<body>
<h1><c:out value="${product.name}"/></h1> 
<h2> <c:out value="${product.description}"/></h2>
<h2> <c:out value="${product.price}"/></h2>
<h2>Categories: </h2>
		<ul>
			<c:forEach items="${product.categories}" var="category">
				<li>${category.name}</li>
			</c:forEach>
		</ul>
	
	<form method="post" action="/addCatToPro/${product.id}">
		<select name = "categories">
			<c:forEach items="${allCategories}" var="category">
				<option value="${category.id}">${category.name}</option>
			</c:forEach>
		</select>
		<button>Add Category </button>
	</form>
</body>
</html>