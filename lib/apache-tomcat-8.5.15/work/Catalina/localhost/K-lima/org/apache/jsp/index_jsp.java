/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-06-18 19:42:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import unioeste.geral.aluno.bo.Aluno;
import unioeste.geral.aluno.manager.AlunoManager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("unioeste.geral.aluno.bo.Aluno");
    _jspx_imports_classes.add("unioeste.geral.aluno.manager.AlunoManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"en\" dir=\"ltr\">\n");

	String caminho = request.getContextPath();

      out.write("\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>K-Lima</title>\n");
      out.write("    \n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-57x57.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-60x60.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-72x72.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-76x76.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-114x114.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-120x120.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-144x144.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-152x152.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"");
      out.print(caminho);
      out.write("/favicon/apple-icon-180x180.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"192x192\"  href=\"");
      out.print(caminho);
      out.write("/favicon/android-icon-192x192.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"");
      out.print(caminho);
      out.write("/favicon/favicon-32x32.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"");
      out.print(caminho);
      out.write("/favicon/favicon-96x96.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"");
      out.print(caminho);
      out.write("/favicon/favicon-16x16.png\">\n");
      out.write("    <link rel=\"manifest\" href=\"");
      out.print(caminho);
      out.write("/favicon/manifest.json\">\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"");
      out.print(caminho);
      out.write("/favicon/ms-icon-144x144.png\">\n");
      out.write("    <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/r/zf-5.5.2/jqc-1.11.3,dt-1.10.8/datatables.min.css\"/> \n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.datatables.net/r/zf-5.5.2/jqc-1.11.3,dt-1.10.8/datatables.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("            $('#example').dataTable();\n");
      out.write("\t} );\n");
      out.write("    </script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(caminho);
      out.write("/css/foundation.css\">    \n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(caminho);
      out.write("/css/app.css\">\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <div class=\"off-canvas-wrapper\">\n");
      out.write("      <div class=\"off-canvas-wrapper-inner\" data-off-canvas-wrapper> <!-- Essa div e a de cima servem para fazer a parte do menu lateral -->\n");
      out.write("\n");
      out.write("        <div class=\"off-canvas position-left\" id=\"mobile-menu\" data-off-canvas>\n");
      out.write("          <div class=\"menu-mobile-opcao\"><a href=\"index.jsp\">Home</a></div>\n");
      out.write("          <div class=\"menu-mobile-opcao\"><a href=\"pesquisar_tabela.jsp\">Tabela</a></div>\n");
      out.write("          <div class=\"menu-mobile-opcao\">Gráficos Dinâmicos</div>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\">Alunos do CECE</a></li>\n");
      out.write("            <li><a href=\"#\">Aprovados</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- MOBILE NAVIGATION -->\n");
      out.write("        \n");
      out.write("        <div class=\"off-canvas-content\" data-off-canvas-content>\n");
      out.write("          <div class=\"title-bar show-for-small-only\">\n");
      out.write("            <div class=\"title-bar-left\">\n");
      out.write("              <button class=\"menu-icon\" type=\"button\" data-open=\"mobile-menu\"></button>\n");
      out.write("              <span class=\"title-bar-title\">MENU</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <!-- DESKTOP NAVIGATION -->\n");
      out.write("          <nav class=\"top-bar nav-desktop hide-for-small-only\">\n");
      out.write("           <div class=\"wrap\">\n");
      out.write("              <div class=\"top-bar-left\">\n");
      out.write("                <ul class=\"dropdown menu menu-desktop\" data-dropdown-menu>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"index.jsp\">Home</a>\n");
      out.write("                  </li>                  \n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"pesquisar_tabela.jsp\">Tabela</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"#\">Gráficos Dinâmicos</a>\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                      <li><a href=\"#\">Alunos do CECE</a></li>\n");
      out.write("                      <li><a href=\"#\">Aprovados</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("\n");
      out.write("          <!-- MAIN SECTION -->\n");
      out.write("          <br />\n");
      out.write("          <br />\n");
      out.write("          <br />\n");
      out.write("          <div class=\"row\" style=\"text-align:center;\">\n");
      out.write("\t\t<img src=\"");
      out.print(caminho);
      out.write("/img/unioeste.jpg\" alt=\"Unioeste\" height=\"400\" width=\"900\">\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("\n");
      out.write("    <!--\n");
      out.write("    <script src=\"");
      out.print(caminho);
      out.write("/js/vendor/jquery.js\"></script>\n");
      out.write("    -->\n");
      out.write("    <script src=\"");
      out.print(caminho);
      out.write("/js/vendor/what-input.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(caminho);
      out.write("/js/vendor/foundation.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(caminho);
      out.write("/js/app.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\t// For demo to fit into DataTables site builder...\n");
      out.write("\t$('#example')\n");
      out.write("\t\t.removeClass( 'display' )\n");
      out.write("\t\t.addClass('tdisplay');\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
