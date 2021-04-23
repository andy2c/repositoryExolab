<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${err!=null }">
	
		<c:out value="${err }" />
	 
	</c:if>

	<c:if test="${user==null }">
	
	<p>per procedere effettua la log in</p>
	<br><br>


	<form action=".action" method="post">
	
		<input type="hidden" name="action" value="logIn" />
		
		<label for="email">email </label>
		<input type="text" name="email" id="email" required/>
		<br><br>
		
		<label for="password">password </label>
		<input type="password" name="password" id="password" required/>
		
		<input type="submit" value="log in" />
	
	
	</form>
	
	</c:if>

	<c:if test="${user!=null }">
	
		<c:out value="log in effettuata con successo" />
	
	</c:if>



<jsp:include page="templates/footer.jsp"></jsp:include>