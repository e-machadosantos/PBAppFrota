<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Empresas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		
		<form action="/empresa/incluir" method="post">
			<h3>App Frota - Cadastro de Empresas</h3>
		
			<div class="form-group">
				<label>Código:</label> 	
				<input type="text" name="codigo" value="1" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Razão Social:</label> 	
				<input type="text" name="razaoSocial" value="TRANSLOG LOGÍSTICA LTDA" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Nome Fantasia:</label> 	
				<input type="text" name="nomeFantasia" value="TRANSLOG" class="form-control">
			</div>
			
			<div class="form-group">
				<label>CNPJ:</label> 	
				<input type="text" name="cnpj" value="11222333000199" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Inscrição Estadual:</label> 	
				<input type="text" name="inscricaoEstadual" value="087653252" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Endereço:</label> 	
				<input type="text" name="endereco" value="RUA VAI E VOLTA" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Número:</label> 	
				<input type="text" name="numero" value="7A" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Bairro:</label> 	
				<input type="text" name="bairro" value="JOANA D'ARC" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Cidade:</label> 	
				<input type="text" name="cidade" value="LINHARES" class="form-control">
			</div>
			
			<div class="form-group">
				<label>CEP:</label> 	
				<input type="text" name="cep" value="29900000" class="form-control">
			</div>
			
			<button type="submit">Cadastrar</button>
		</form>
	</div>

</body>
</html>