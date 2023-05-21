<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Teste de Métodos</h1>

	<h2>Criar Usuário</h2>
	<form action="/users" method="POST">
		<label for="nome">Nome:</label> <input type="text" id="nome"
			name="nome" required> <br> <label for="email">Email:</label>
		<input type="email" id="email" name="email" required> <br>
		<input type="submit" value="Criar">
	</form>

	<h2>Obter Usuário</h2>
	<form action="/usuarios/obter" method="GET">
		<label for="id">ID:</label> <input type="number" id="id" name="id"
			required> <br> <input type="submit" value="Obter">
	</form>
</body>
</html>