<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.13.0/themes/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="/scProject/src/main/webapp/script/script.js">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://code.jquery.com/ui/1.13.0/jquery-ui.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">
<body>

	<h2>Create user</h2>
	<form action="crewmates/create" method="POST">
		<label for="name">name:</label> <input type="text" id="name"
			name="name" required> <br> <label for="email">Email:</label>
		<input type="email" id="email" name="email" required> <br>
		<label for="password">password:</label> <input type="password"
			id="password" name="password" required> <br> <label
			for="birthdayDate">birthday Date:</label> <input type="date"
			id="birthdayDate" name="birthdayDate" required> <br> <input
			type="submit" value="Create">

	</form>

	<h2>Obter Usuário</h2>
	<form action="/users/{id}" method="get">
		<label for="id">ID:</label> <input type="number" id="id" name="id"
			required> <br> <input type="submit" value="Login">
	</form>


</body>
</html>
