<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>AppFrota</title>
</head>
<body>
<div class="container">
		<form action="/usuario" method="get">
			<h3>Listagem de Usuários</h3>
		
		<button type="submit">Novo</button>
		</form>
		
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>Senha</th>
		        <th>E-mail</th>
		        <th>Características</th>
		        <th>Tipo</th>
		        <th>Setor</th>
		        <th>Idade</th>
		        <th>Salário</th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <td>Edvaldo</td>
		        <td>123</td>
		        <td>ed@valdo.com</td>
		        <td>Estudante, Analista, Contador</td>
		        <td>Administrador</td>
		        <td>TI</td>
		        <td>49</td>
		        <td>999</td>
		      </tr>
		      <tr>
		        <td>Edvaldo</td>
		        <td>123</td>
		        <td>ed@valdo.com</td>
		        <td>Estudante, Analista, Contador</td>
		        <td>Administrador</td>
		        <td>TI</td>
		        <td>49</td>
		        <td>999</td>
		      </tr>
		      <tr>
		        <td>Edvaldo</td>
		        <td>123</td>
		        <td>ed@valdo.com</td>
		        <td>Estudante, Analista, Contador</td>
		        <td>Administrador</td>
		        <td>TI</td>
		        <td>49</td>
		        <td>999</td>
		      </tr>		     
		    </tbody>
	  </table>
	</div>
</body>
</html>