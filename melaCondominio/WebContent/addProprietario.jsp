<jsp:include page="templates/header.jsp"></jsp:include>


<form action="" method="post">

	<input type="hidden" name="action" vaue="signIn" />
	<input type="hidden" name="proprietario" vaue="true" />
	<input type="hidden" name="rappresentante" vaue="true" />
	 
	<label for="nome">nome </label>
	<input type="text" name="nome" id="nome" value="${user.nome }" required/>
	<br><br>
	
	<label for="cognome">cognome </label>
	<input type="text" name="cognome" id="cognome" value="${user.cognome }"  required/>
	<br><br>
	
	<label for="interno">interno </label>
	<input type="text" name="interno" id="interno" value="${user.interno }"  required/>
	<br><br>
	
	<label for="email">email </label>
	<input type="text" name="email" id="emial" value="${user.email }"  required/>
	<br><br>
	
	<input type="submit" value="invia" />


</form>



<jsp:include page="templates/footer.jsp"></jsp:include>