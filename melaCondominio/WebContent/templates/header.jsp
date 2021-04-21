<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/mystyle.css">
<title>Insert title here</title>
</head>
<body>

<c:if test="${user==null }">
	<jsp:forward page="logIn.jsp"></jsp:forward>
</c:if>

<div class="navbar">	
   	
	<nav>
		<ul>
			<c:if test="${user!=null}">
					<li>
				  		<a href="home.jsp">home</a> 
				   	</li>
						<li>
					  		<a href="#">riunioni</a> 
					   	</li>
						<li>
					  		<a href="addProprietario.jsp">nuovo proprietario</a> 
					   	</li>
					   	
						<li>
					  		<a href="#">deleghe</a> 
					   	</li>
						<li>
					  		<a href="#">profilo</a> 
					   	</li>
						<li>
					  		<a href="logOut.jsp">log out</a> 
					   	</li>
		   	</c:if>
	  	</ul>
	</nav>

</div>	