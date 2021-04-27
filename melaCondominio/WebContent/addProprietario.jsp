<jsp:include page="templates/header.jsp"></jsp:include>
<%@page import="it.condominio.model.*" %>
<%@page import="java.util.*" %>

<%
String err= (String) session.getAttribute("err");
if(err!=null)
	out.println(err);

Palazzina palazzina = new Palazzina();
List<Palazzina> listaPalazzine = (ArrayList<Palazzina>) request.getAttribute("listaPalazzine");

if(listaPalazzine==null && err==null){
	
	%>
	<jsp:forward page=".action?action=addProprietario"></jsp:forward>
	<% 
}
%>

<form action=".action" method="post">

	<input type="hidden" name="action" value="newProprietario" />
	 
	<label for="nome">nome </label>
	<input type="text" name="nome" id="nome" required/>
	<br><br>
	
	<label for="cognome">cognome </label>
	<input type="text" name="cognome" id="cognome"  required/>
	<br><br>
	
	<label for="interno">interno </label>
	<input type="text" name="interno" id="interno" required/>
	
	<label for="palazzina">palazzina </label>
	
	<select name="palazzina" id="palazzina">
	<%
		for(Palazzina p : listaPalazzine)
			
		{
			%>
			<option value="<%=p.getNome() %>"><%=p.getNome() %></option>
			<% 
			
		}
	
	%>
	</select>
	<br><br>
	
	<label for="email">email </label>
	<input type="text" name="email" id="email"  required/>
	<br><br>
	
	<input type="submit" value="invia" />


</form>



<jsp:include page="templates/footer.jsp"></jsp:include>