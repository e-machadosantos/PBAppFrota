<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>Cadastro de Automóveis</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		
		<form action="/automovel/incluir" method="post">
			<h3>App Frota - Cadastro de Automóveis</h3>
		
			<c:import url="/WEB-INF/jsp/veiculo/cadastro.jsp"/>
		
			<div class="form-group">
				<label>Marca:</label> 	
				<input type="text" name="marca" value="Honda" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Modelo:</label> 	
				<input type="text" name="modelo" value="Civic" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Ano fabricação:</label> 	
				<input type="text" name="anoFabricacao" value="2023" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Ano modelo:</label> 	
				<input type="text" name="anoModelo" value="2024" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Placa:</label> 	
				<input type="text" name="placa" value="KKK-0000" class="form-control">
			</div>
				
			<button type="submit">Cadastrar</button>
		</form>
	</div>

</body>
</html>