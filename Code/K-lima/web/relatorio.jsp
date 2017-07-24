<%@page import="java.util.List"%>
<%@page import="unioeste.geral.bo.Aluno"%>
<%@page import="unioeste.geral.manager.AlunoManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html class="no-js" lang="en" dir="ltr">
<%
	String caminho = request.getContextPath();
%>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SAG - Sistema de Apoio ao Gestor</title>
    <link rel="stylesheet" href="<%=caminho%>/css/foundation.css">
    <link rel="stylesheet" href="<%=caminho%>/css/app.css">
  </head>

  <body>
		<div class="off-canvas-wrapper">
			<div class="off-canvas-wrapper-inner" data-off-canvas-wrapper> <!-- Essa div e a de cima servem para fazer a parte do menu lateral -->
				<jsp:include page="#{caminho}/includes/menu.jsp"/>

				<!-- MAIN SECTION -->
				<div class="row">
				<!--TODO: adicionar dropbox pra selecionar o curso-->
				<!--TODO: fazer o esquema de caminho absoluto pro logo da Unioeste no relatório-->
					<br />
					<h1>Relatório de Evasão</h1>
					<br />
					<form action="RelatorioServlet" method="get">
						<div class="row">
							<input type="submit" value="Gerar relatório de evasão" class="button" />
						</div>
					</form>
				</div>

			</div>
		</div>
	</body>

</html>