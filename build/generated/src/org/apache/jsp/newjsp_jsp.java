package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dede.HelloBean;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <title>Java Code Geeks Snippets - Use a Bean in JSP Page</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      dede.HelloBean sampleBean = null;
      synchronized (session) {
        sampleBean = (dede.HelloBean) _jspx_page_context.getAttribute("sampleBean", PageContext.SESSION_SCOPE);
        if (sampleBean == null){
          sampleBean = new dede.HelloBean();
          _jspx_page_context.setAttribute("sampleBean", sampleBean, PageContext.SESSION_SCOPE);
          out.write("\n");
          out.write("\n");
          out.write("        ");
          out.write("\n");
          out.write("\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("sampleBean"), "param1", "value1", null, null, false);
          out.write("\n");
          out.write("\n");
          out.write("    ");
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("    Sample Bean: ");
      out.print( sampleBean );
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((dede.HelloBean)_jspx_page_context.findAttribute("sampleBean")).getParam1())));
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((dede.HelloBean)_jspx_page_context.findAttribute("sampleBean")).getParam2())));
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
