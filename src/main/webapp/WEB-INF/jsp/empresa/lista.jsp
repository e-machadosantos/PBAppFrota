<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Listagem de Empresas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		
		<h3>Listagem de Empresas</h3>
	
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>
		
		<form action="/empresa" method="get">
			<button type="submit">Novo</button>
		</form>								
		
		<c:if test="${empty empresas}">
			<h5>Não existem empresas cadastradas!!!</h5>
		</c:if>						
		
		<c:if test="${not empty empresas}">
			<h5>Quantidade de empresas cadastrados: ${empresas.size()}!!!</h5>			
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Código</th>
						<th>Razão Social</th>
						<th>Nome Fantasia</th>
						<th>CNPJ</th>
						<th>Inscrição Estadual</th>
						<th>Endereço</th>
						<th>Número</th>
						<th>Bairro</th>
						<th>Ciadade</th>
						<th>CEP</th>
						<th></th>
					</tr>
				</thead>
				<tbody>				   
					<c:forEach var="e" items="${empresas}">
						<tr>
							<td>${e.id}</td>
							<td>${e.codigo}</td>
							<td>${e.razaoSocial}</td>
							<td>${e.nomeFantasia}</td>
							<td>${e.cnpj}</td>
							<td>${e.inscricaoEstadual}</td>
							<td>${e.endereco}</td>
							<td>${e.numero}</td>
							<td>${e.bairro}</td>
							<td>${e.cidade}</td>
							<td>${e.cep}</td>
							<td><a href="/empresa/${e.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>		
	
	</div>
</body>
</html>