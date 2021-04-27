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
 <c:set var = "user" scope = "session" value = "${'mario'}"/>
 <c:set var = "amministratoreCondominio" scope = "session" value = "${'1'}"/>
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
				  		<a href="riunioni.jsp">riunioni</a> 
				   	</li>
				   	
					<c:if test="${amministratoreCondominio!=null}">
						<li>
					  		<a href=".action?action=addProprietario">nuovo proprietario</a> 
					   	</li>
		   			</c:if>
				   	
					<c:if test="${rappresentante!=null}">
						<li>
					  		<a href="#">deleghe</a> 
					   	</li>
		   			</c:if>
		   			
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