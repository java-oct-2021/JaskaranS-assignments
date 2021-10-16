<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class= "form-control" method="POST" action="/survey">
	<label class="form-label">Your Name:</label>
	<input type="text" name="name"><br>
	<label class= "form-label" for="location">Dojo location:</label>
	<select name="location" id="location">
  	<option value="Seattle">Seattle</option>
  	<option value="Chicago">Chicago</option>
  	<option value="Burbank">Burbank</option>
  	<option value="Online">Online</option>
  	</select><br>
  	<label class= "form-label" for="language">Favorite Language:</label>
	<select name="language" id="language">
  	<option value="Python">Python</option>
  	<option value="Java">Java</option>
  	<option value="Javascript">Javascript</option>
  	<option value="Html">Html</option>
  	</select><br>
  	<label  class= "form-label" for="comment">Comment(Optional):</label><br>
	<textarea id="comment" name="comment" rows="4" cols="50">
	</textarea><br>
	<input type="submit" value="submit">
	</form>
</body>
</html>