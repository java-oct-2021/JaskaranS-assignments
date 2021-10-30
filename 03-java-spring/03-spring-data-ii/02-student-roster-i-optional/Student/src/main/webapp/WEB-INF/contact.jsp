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
	<h1>Student Address</h1>
	<form:form action="/studentAddress" method="post" modelAttribute="studentContact">
		<p> <form:select class="form-control" path="student">
		        <c:forEach items="${ students }" var="student">
		        	<option value="${ student.id }">${ student.firstName} ${ student.lastName}</option>
		        </c:forEach>
		        </form:select>
		</p>
	    <p>
	        <form:label path="address">Address</form:label>
	        <form:errors path="address"/>
	        <form:input path="address"/>
	    </p>
	      <p>
	        <form:label path="city">City</form:label>
	        <form:errors path="city"/>
	        <form:input path="city"/>
	    </p>
	     <p>
	        <form:label path="state">State</form:label>
	        <form:errors path="state"/>
	        <form:input path="state"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    

</body>
</html>