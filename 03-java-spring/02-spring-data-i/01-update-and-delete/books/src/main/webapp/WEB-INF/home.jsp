<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Book</h1>
	<form:form action="/createbook" method="post" modelAttribute="newBook">
	    <p>
	        <form:label path="title">Title</form:label>
	        <form:errors path="title"/>
	        <form:input path="title"/>
	    </p>
	    <p>
	        <form:label path="author">Author</form:label>
	        <form:errors path="author"/>
	        <form:input path="author"/>
	    </p>
	    <p>
	        <form:label path="language">Language</form:label>
	        <form:errors path="language"/>
	        <form:input path="language"/>
	    </p>
	    <p>
	        <form:label path="pages">Pages</form:label>
	        <form:errors path="pages"/>     
	        <form:input type="number" path="pages"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	    <a href="/books">Check All Books Added</a>
	</form:form>    
</body>
</html>