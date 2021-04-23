<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="templates/header.jsp"></jsp:include>

<%
session.invalidate();
//response.sendRedirect("index.jsp");
%>
 
<p>log out eseguita con successo</p>

<jsp:include page="templates/footer.jsp"></jsp:include>