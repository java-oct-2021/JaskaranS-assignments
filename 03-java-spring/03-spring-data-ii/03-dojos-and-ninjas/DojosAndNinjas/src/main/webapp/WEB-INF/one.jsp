<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Specific Location</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
	<table class="table table-info">
    	<thead>
        	<tr>
            	<th>First name</th>
            	<th>Last name</th>
            	<th>age</th>
            </tr>
    	</thead>
   		 <tbody>
     		<c:forEach items="${dojos.ninjas}" var="ninja">
     			<tr>
            		<td>
            		<c:out value="${ninja.firstName}"/>
            		</td>
              		<td>
            		<c:out value="${ninja.lastName}"/>
            		</td>
            		<td>
             		<c:out value="${ninja.age}"/>
            		</td>
            	</tr>
       	</c:forEach>
    	</tbody>
	</table>
</body>
</html>