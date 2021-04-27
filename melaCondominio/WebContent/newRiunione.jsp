<jsp:include page="templates/header.jsp"></jsp:include>
	
	<c:if test="${wizardNewRiunione==null || wizardNewRiunione==0}">
	
		<form action=".action" method="post">
		
			<input type="hidden" name="action" value="newRiunione" />
			
			<label for="dataRiunione">data riunione </label>
			<input type="date" id="dataRiunione" name="dataRiunione" />
		
		</form>
	</c:if>
	<c:if test="${wizardNewRiunione==1 }">
	
		<c:if test="${problematiche!=null }" >
				<div>
					<tr>
					    <th>oggetto problematica</th>
					    <th>descrizione problematica</th>
					    <th>stato problematica</th>
					</tr>
		
					<c:forEach items="${problematiche}" var="problematica">
						<tr>
							<td>${problematica.oggetto }</td>
							<td>${problematica.descrizione }</td>
							<td>${problematica.stato }</td>
							
							<c:if test="${problematica.stato.equals('attiva')}">
								<form action=".action" method="post">
								
									<input type="hidden" name="action" value="aggiungiProblematicaRiunione" />
									<input type="hidden" name="problematicaId" value="${problematica.id }" />
									
									<inut type="submit" value="aggiungi" />
								
								</form>
							</c:if>
						</tr>
					</c:forEach>
				</div>
		
		</c:if>
	</c:if>
	
	
	<c:if test="${wizardNewRiunione==2 }">
	
		<div>
		
			<p>riepilogo : </p>
			<br>
			<p>data riunione : </p>
			 <c:out value="${newRiunione.data }" />
			 <br>
			 <p>problematiche da discutere : </p>
			 <c:if test="${newRiunione.problematicheRiunione!=null }">
			 	<tr>
				    <th>oggetto problematica</th>
				    <th>descrizione problematica</th>
				    <th>stato problematica</th>
				</tr>
				
				<c:forEach items="${newRiunione.problematicheRiunione}" var="problematica">
				 	<tr>
						<td>${problematica.oggetto }</td>
						<td>${problematica.descrizione }</td>
						<td>${problematica.stato }</td>
					</tr>
				 
				 </c:forEach>
			</c:if>
			<form action=".action" method="post" >
				<input type="hidden" name="action" value="inserisciRiunione" />
				<input type="submit" value="conferma">
			
			</form>
		</div>
	
	</c:if>

 
<jsp:include page="templates/footer.jsp"></jsp:include>