<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>All Books</h1>
	<a href="/">Create New Book</a>
	<table class="table-primary">
    <thead>
        <tr>
          	<th scope="row">S.No</th>
            <th scope="row">Title</th>
            <th scope="row">Description</th>
            <th scope="row">Language</th>
            <th scope="row">Number of Pages</th>
            <th>Action</th>
        </tr>
    </thead>
      <tbody>
        <c:forEach items="${books}" var="book">
        <tr>
        	<td>
        	<a href="/show/${book.id}">
            <c:out value="${book.title}"/>
            </a>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.language}"/></td>
            <td><c:out value="${book.pages}"/></td>
             <td>
            	<form action="/books/${book.id}" method="post">
			    	<input type="hidden" name="_method" value="delete">
			    	<input type="submit" value="Delete">
				</form>
			</td>
          <%--Does not work need to ask
          <td>
            	<form action="/books/${book.id}" method="post">
			    	<input type="hidden" name="_method" value="get">
			    	<input type="submit" value="View">
				</form>
			</td>--%>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>