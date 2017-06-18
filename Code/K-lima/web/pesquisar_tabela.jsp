<%-- 
    Document   : index.jsp
    Created on : 14/06/2017, 08:41:19
    Author     : Leandro Ensina
--%>

<%@page import="java.util.List"%>
<%@page import="unioeste.geral.aluno.bo.Aluno"%>
<%@page import="unioeste.geral.aluno.manager.AlunoManager"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html class="no-js" lang="en" dir="ltr">
<%
	String caminho = request.getContextPath();
%>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>K-Lima</title>
    
    <link rel="apple-touch-icon" sizes="57x57" href="<%=caminho%>/favicon/apple-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="<%=caminho%>/favicon/apple-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="<%=caminho%>/favicon/apple-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="<%=caminho%>/favicon/apple-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="<%=caminho%>/favicon/apple-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="<%=caminho%>/favicon/apple-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="<%=caminho%>/favicon/apple-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="<%=caminho%>/favicon/apple-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="<%=caminho%>/favicon/apple-icon-180x180.png">
    <link rel="icon" type="image/png" sizes="192x192"  href="<%=caminho%>/favicon/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="<%=caminho%>/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="<%=caminho%>/favicon/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="<%=caminho%>/favicon/favicon-16x16.png">
    <link rel="manifest" href="<%=caminho%>/favicon/manifest.json">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="<%=caminho%>/favicon/ms-icon-144x144.png">
    <meta name="theme-color" content="#ffffff">
    
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/zf-5.5.2/jqc-1.11.3,dt-1.10.8/datatables.min.css"/> 
    <script type="text/javascript" src="https://cdn.datatables.net/r/zf-5.5.2/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
    <script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
            $('#example').dataTable();
	} );
    </script>
    <link rel="stylesheet" href="<%=caminho%>/css/foundation.css">    
    <link rel="stylesheet" href="<%=caminho%>/css/app.css">
    
  </head>
  <body>
    
    <div class="off-canvas-wrapper">
      <div class="off-canvas-wrapper-inner" data-off-canvas-wrapper> <!-- Essa div e a de cima servem para fazer a parte do menu lateral -->

        <div class="off-canvas position-left" id="mobile-menu" data-off-canvas>
          <div class="menu-mobile-opcao"><a href="index.jsp">Home</a></div>
          <div class="menu-mobile-opcao"><a href="pesquisar_tabela.jsp">Tabela</a></div>
          <div class="menu-mobile-opcao">Gráficos Dinâmicos</div>
          <ul>
            <li><a href="#">Alunos do CECE</a></li>
            <li><a href="#">Aprovados</a></li>
          </ul>
        </div>

        <!-- MOBILE NAVIGATION -->
        
        <div class="off-canvas-content" data-off-canvas-content>
          <div class="title-bar show-for-small-only">
            <div class="title-bar-left">
              <button class="menu-icon" type="button" data-open="mobile-menu"></button>
              <span class="title-bar-title">MENU</span>
            </div>
          </div>
        
          <!-- DESKTOP NAVIGATION -->
          <nav class="top-bar nav-desktop hide-for-small-only">
           <div class="wrap">
              <div class="top-bar-left">
                <ul class="dropdown menu menu-desktop" data-dropdown-menu>
                  <li>
                    <a href="index.jsp">Home</a>
                  </li>                  
                  <li>
                    <a href="pesquisar_tabela.jsp">Tabela</a>
                  </li>
                  <li>
                    <a href="#">Gráficos Dinâmicos</a>
                    <ul class="menu">
                      <li><a href="#">Alunos do CECE</a></li>
                      <li><a href="#">Aprovados</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
          </nav>

          <!-- MAIN SECTION -->
          
          <div class="row centralizado">
            <div class="medium-12 columns" style="text-align: center;">
                <h1>Alunos Unioeste</h1>
            </div>
          
            <hr />
            <table id="example" class="display">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Curso</th>
                        <th>Centro</th>
                        <th>Situação atual</th>
                        <th>Ano Entrada</th>
                    </tr>
                </thead>
                <tbody>                    
                    <%
                    AlunoManager manager = new AlunoManager();
                    
                    //manager.carregarCSV();
                    
                    List<Aluno> alunos = new AlunoManager().recuperarTodosAlunos();
                    
                    //out.write(alunos.get(1).getNome());
                   
                    %>
                    <%for(int i=0; i < alunos.size(); i++){
                        
                        out.write("<tr>");                            
                            out.write("<td>" + alunos.get(i).getNome() + "</td>");
                            out.write("<td>" + alunos.get(i).getCurso() + "</td>");
                            out.write("<td>" + alunos.get(i).getCentro()+ "</td>");
                            out.write("<td>" + alunos.get(i).getSituacaoAtual() + "</td>");
                            out.write("<td>" + alunos.get(i).getAnoEntrada()+ "</td>");
                        out.write("</tr>");
                         
                    }%>
                </tbody>
            </table>
          </div>



        </div>
      </div>
    </div>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>

    <!--
    <script src="<%=caminho%>/js/vendor/jquery.js"></script>
    -->
    <script src="<%=caminho%>/js/vendor/what-input.js"></script>
    <script src="<%=caminho%>/js/vendor/foundation.js"></script>
    <script src="<%=caminho%>/js/app.js"></script>
    <script type="text/javascript">
	// For demo to fit into DataTables site builder...
	$('#example')
		.removeClass( 'display' )
		.addClass('tdisplay');
    </script>
  </body>
</html>