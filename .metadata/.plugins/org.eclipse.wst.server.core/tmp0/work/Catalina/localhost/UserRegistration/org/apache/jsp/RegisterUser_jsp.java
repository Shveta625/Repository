/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2017-11-09 09:41:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      bean.UserBean obj = null;
      obj = (bean.UserBean) _jspx_page_context.getAttribute("obj", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (obj == null){
        obj = new bean.UserBean();
        _jspx_page_context.setAttribute("obj", obj, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction validate() {\n");
      out.write("\t\t\talert(document.getElementById(\"firstName\").value);\n");
      out.write("\t\t\tvar name = document.getElementById(\"firstName\").value;\n");
      out.write("\t\t\tvar username = document.getElementById(\"username\").value;\n");
      out.write("\t\t\tvar pwd = document.getElementById(\"password\").value;\n");
      out.write("\t\t\tvar confPwd = document.getElementById(\"confPassword\").value;\n");
      out.write("\t\t\tif (firstName == null || firstName == \"\") {\n");
      out.write("\t\t\t\talert(\"FirstName can't be blank\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t} else if (username == null || username == \"\") {\n");
      out.write("\t\t\t\talert(\"Username can't be blank\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t} else if (pwd.length < 6) {\n");
      out.write("\t\t\t\talert(\"Password must be at least 6 characters long.\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t} else if (pwd != confPwd) {\n");
      out.write("\t\t\t\talert(\"Confirm Password should match with the Password\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction showForm(a) {\n");
      out.write("\t\t\tif (a == document.getElementById(\"form2\")) {\n");
      out.write("\t\t\t\talert(\"abc: \" + document.getElementById(\"form2\").style.display == \"none\");\n");
      out.write("\t\t\t\tdocument.getElementById(\"form1\").style.display = \"none\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"form2\").style.display = \"block\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tdocument.getElementById(\"form2\").style.display = \"none\";\n");
      out.write("\t\t\t\tdocument.getElementById(\"form3\").style.display = \"block\";\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\talert(\"after: \" + document.getElementById(\"form2\").style.display == \"none\");\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<form id=\"form\" action=\"RegisterUserServlet\" method=\"post\"\n");
      out.write("\t\tonsubmit=\"return validate()\">\n");
      out.write("\t\tFirst name:<input type=\"text\" id=\"firstName\" name=\"firstName\">\n");
      out.write("\t\t<br> Role:<select>\n");
      out.write("\t\t\t<option value=\"admin\">Admin</option>\n");
      out.write("\t\t\t<option value=\"user\">User</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t\t<br> Username:<input type=\"text\" id=\"username\" name=\"username\">\n");
      out.write("\t\t<br> Password:<input type=\"password\" id=\"password\"\n");
      out.write("\t\t\tname=\"password\"> <br> Confirm Password:<input\n");
      out.write("\t\t\ttype=\"password\" id=\"confPassword\" name=\"confPassword\"> <br>\n");
      out.write("\t\t<input type=\"Submit\" value=\"Submit\">\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
