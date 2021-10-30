<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
	<table class="table table-dark">
    	<thead>
        	<tr>
            	<th>Name</th>
            	<th>Age</th>
            	<th>Address</th>
            	<th>City</th>
            	<th>State</th>
        	</tr>
    	</thead>
   		 <tbody>
     		<c:forEach items="${students}" var="student">
        		<tr>
            		<td>
            		<c:out value="${student.firstName} ${student.lastName}"/>
            		</td>
              		<td>
            		<c:out value="${student.age}"/>
            		</td>
            		<td>
             		<c:out value="${student.contact.address}"/>
            		</td>
            		<td>
            		<c:out value="${student.contact.city}"/>
            		</td>
            		<td>
            		<c:out value="${student.contact.state}"/>
            		</td>
        		</tr>
        	</c:forEach>
    	</tbody>
	</table>
</body>
</html>