<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Pessoas</title>
</head>
<body>
	<h1>Todas Pessoas</h1>
	<c:forEach var="u" items="${usuarios}">
    Id: ${u.id} Name: ${u.nome} Senha: ${u.senha} Login ${u.login}<br />
	</c:forEach>

	<h1>Adicionar Novo</h1>
	<form method="post" action="addUsuario">
		Name: <input type="text" name="nome" /> 
		Login: <input type="text" name="login" /> 
		Senha: <input type="text" name="senha" />
		<button>Adicionar</button>
	</form>
</body>
</html>
