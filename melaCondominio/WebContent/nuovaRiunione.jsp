<jsp:include page="templates/header.jsp"></jsp:include>

	
	
	<c:choose>
	
		<c:when test="${sezioneCreazioeRiuniolne==null }">
		
			<form action="#" method="post">
				
				<input type="hidden" name="action" value="newRiunioneData" />
		
				<label for="nuovaRiunioneData">data nuova riunione : </label>
				<input type="date" id="nuovaRiunioneData" name="nuovaRiunioneData">
				
				<input type="submit" value="next" />
			         
         	</form>
		
		</c:when>
	
		<c:when test="${sezioneCreazioeRiunione==1 }">

			<p>problematiche ancora attive </p>
			
			<c:forEach var="i" items = "${listaProblematiche }">
					
		         <c:out value = "${i.getOggetto_problematica}"/>
		         <c:out value = "${i.getDescrizione_problematica}"/>
		         
		         <c:if test="${!newRiunione.listaProblematiche.contains(i) }">
			         
					<form action="#" method="post">
						<input type="hidden" name="action" value="newRiunioneAddProblematica" />
						<input type="hidden" name="idProblematica" value="${i.id }" />
				         
				        <input type="submit" value="aggiungi alla riunione" />
			        </form>
		         </c:if>
		         
		         <c:if test="${newRiunione.listaProblematiche.contains(i) }">
			         
					<form action="#" method="post">
						<input type="hidden" name="action" value="newRiunioneRemoveProblematica" />
						<input type="hidden" name="idProblematica" value="${i.id }" />
				         
				         <input type="submit" value="togli dalla riunione" />
			         </form>
		         </c:if>
	        </c:forEach> 
	        
	        <form action ="#" method="post">
	        
	        <input type="submit" value="next" />
	        
	        </form>
			         
        </c:when> 
        
        <c:when test="${sezioneCreazioeRiunione==2 }">
			
			<p>data riunione : ${newRiunione.data }</p>
			<p>problematiche : </p>
        
        
		    <c:forEach var="i" items = "${newRiunione.listaProblematiche }">
		    	<br>
		    	<c:out value="${newRiunione.oggetto }" /> &nbsp
		    	<c:out value="${newRiunione.descrizione }" />
		    </c:forEach>
		
			<form action="#" method="post">
			
				<input type="submit" value="crea la riunione" />
			
			</form>
		
		</c:when>
	</c:choose>
	
	
<jsp:include page="templates/footer.jsp"></jsp:include>