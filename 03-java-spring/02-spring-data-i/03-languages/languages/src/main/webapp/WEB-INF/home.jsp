<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>All Books</h1>
	<table class="table-primary">
    <thead>
        <tr>
          	<th scope="row">Name</th>
            <th scope="row">Creator</th>
            <th scope="row">Version</th>
            <th scope="row">Action</th>
        </tr>
    </thead>
      <tbody>
        <c:forEach items="${languages}" var="language">
        <tr>
        	<td>
        	<a href="/show/${language.id}">
            <c:out value="${language.name}"/>
            </a>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.currentVersion}"/></td>
             <td>
            	<form action="/languages/${language.id}" method="post">
			    	<input type="hidden" name="_method" value="delete">
			    	<input type="submit" value="Delete">
			    	<a href="/language/${language.id}/edit">Edit</a>
				</form>
			</td>
			  </tr>
        </c:forEach>
    </tbody>
</table>
	<h1>New Book</h1>
	<form:form action="/createlanguage" method="post" modelAttribute="newLanguage">
	    <p>
	        <form:label path="name">name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator</form:label>
	        <form:errors path="creator"/>
	        <form:input path="creator"/>
	    </p>
	    <p>
	        <form:label path="currentVersion">Version</form:label>
	        <form:errors path="currentVersion"/>
	        <form:input path="currentVersion"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>