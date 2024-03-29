<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- 	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"> -->
	<meta charset="ISO-8859-1">
	<title>AppFrota</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<h2>Autentica��o</h2>
	
	<c:if test="${not empty mensagem}">
		<div class="alert alert-danger">
	  		<strong>Aten��o!</strong> ${mensagem}
		</div>
	</c:if>
	  
	<form action="/login" method="post">
	    
		<div class="form-group">
	      <label>Email:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email" value="ed@valdo.com.br">
	    </div>
	   
	    <div class="form-group">
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha" value="ed@valdo.com.br">
	    </div>
	    
	    <button type="submit" class="btn btn-default">Acessar</button>
	  </form>
	</div>
</body>
</html>