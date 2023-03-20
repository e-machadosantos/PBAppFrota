<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Automóveis</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		
		<h3>Listagem de Automóveis</h3>
	
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>
		
		<form action="/automovel" method="get">
			<button type="submit">Novo</button>
		</form>								
		
		<c:if test="${empty automoveis}">
			<h5>Não existem automóveis cadastrados!!!</h5>
		</c:if>						
		
		<c:if test="${not empty automoveis}">
			<h5>Quantidade de automóveis cadastrados: ${automoveis.size()}!!!</h5>			
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Tipo</th>
						<th>Marca</th>
						<th>Modelo</th>
						<th>Ano fabricação</th>
						<th>Ano modelo</th>
						<th>Placa</th>
						<th></th>
					</tr>
				</thead>
				<tbody>				   
					<c:forEach var="a" items="${automoveis}">
						<tr>
							<td>${a.id}</td>
							<td>${a.tipo}</td>
							<td>${a.marca}</td>
							<td>${a.modelo}</td>
							<td>${a.anoFabricacao}</td>
							<td>${a.anoModelo}</td>
							<td>${a.placa}</td>
							<td><a href="/automovel/${a.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>		
	
	</div>
</body>
</html>