package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/topMenuItem.jsp");
    _jspx_dependants.add("/test.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Personal Health Record</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <!-- Top Menu Items -->\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"home.jsp\">PHR</a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav navbar-right top-nav\">\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu message-dropdown\">\n");
      out.write("                    <li class=\"message-preview\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <div class=\"media\">\n");
      out.write("                                <span class=\"pull-left\">\n");
      out.write("                                    <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("                                </span>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <h5 class=\"media-heading\"><strong>John Smith</strong>\n");
      out.write("                                    </h5>\n");
      out.write("                                    <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"message-preview\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <div class=\"media\">\n");
      out.write("                                <span class=\"pull-left\">\n");
      out.write("                                    <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("                                </span>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <h5 class=\"media-heading\"><strong>John Smith</strong>\n");
      out.write("                                    </h5>\n");
      out.write("                                    <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"message-preview\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <div class=\"media\">\n");
      out.write("                                <span class=\"pull-left\">\n");
      out.write("                                    <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\n");
      out.write("                                </span>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <h5 class=\"media-heading\"><strong>John Smith</strong>\n");
      out.write("                                    </h5>\n");
      out.write("                                    <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"message-footer\">\n");
      out.write("                        <a href=\"#\">Read All New Messages</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu alert-dropdown\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Alert Name <span class=\"label label-default\">Alert Badge</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Alert Name <span class=\"label label-primary\">Alert Badge</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Alert Name <span class=\"label label-success\">Alert Badge</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Alert Name <span class=\"label label-info\">Alert Badge</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Alert Name <span class=\"label label-warning\">Alert Badge</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Alert Name <span class=\"label label-danger\">Alert Badge</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">View All</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> John Smith <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Inbox</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class='col-sm-6'>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class='input-group date' id='datetimepicker3'>\n");
      out.write("                    <input type='text' class=\"form-control\" />\n");
      out.write("                    <span class=\"input-group-addon\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-time\"></span>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function () {\n");
      out.write("                $('#datetimepicker3').datetimepicker({\n");
      out.write("                    format: 'LT'\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("                <div id=\"page-wrapper\" style=\"background-color: gainsboro\">\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <!-- Indicators -->\n");
      out.write("                                <ol class=\"carousel-indicators\">\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                                    <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("                                </ol>\n");
      out.write("\n");
      out.write("                                <!-- Wrapper for slides -->\n");
      out.write("                                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                                    <div class=\"item active\">\n");
      out.write("                                        <img src=\"resources/img/doctor1.jpg\" alt=\"Doctor\">\n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <h3>Doctor</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img src=\"resources/img/ctscan.jpg\" alt=\"CT-Scan\">\n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <h3>CT-Scan</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img src=\"resources/img/surgeryoperation.jpg\" alt=\"Surgery Operation\">\n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <h3>Surgery Operation</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img src=\"resources/img/pills.jpg\" alt=\"Pills\">\n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <h3>Pills</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <img src=\"resources/img/medrecord.png\" alt=\"Medical Record\">\n");
      out.write("                                        <div class=\"carousel-caption\">\n");
      out.write("                                            <h3>Medical Record</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Left and right controls -->\n");
      out.write("                                <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                                    <span class=\"sr-only\">Next</span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
