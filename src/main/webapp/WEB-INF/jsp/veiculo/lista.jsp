<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Ve�culos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		
		<h3>Listagem de Ve�culos</h3>
	
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Aten��o!</strong> ${mensagem}
			</div>
		</c:if>
		
		<c:if test="${empty veiculos}">
			<h5>N�o existem ve�culso cadastrados!!!</h5>
		</c:if>						
		
		<c:if test="${not empty veiculos}">
			<h5>Quantidade de ve�culos cadastrados: ${veiculos.size()}!!!</h5>			
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Tipo</th>
						<th></th>
					</tr>
				</thead>
				<tbody>				   
					<c:forEach var="v" items="${veiculos}">
						<tr>
							<td>${v.id}</td>
							<td>${v.tipo}</td>
							<td><a href="/veiculo/${v.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>		
	
	</div>
</body>
</html>