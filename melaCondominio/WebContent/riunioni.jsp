<jsp:include page="templates/header.jsp"></jsp:include>


	<c:if test="${amministratoreCondominio!=null}">
		<a href="newRiunione.jsp">crea una nuova riunione</a>
		<br><br>
	</c:if>
	<a href="#">elenco riunioni</a>
	<br><br>
 
<jsp:include page="templates/footer.jsp"></jsp:include>