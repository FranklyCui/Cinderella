/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-07-13 02:11:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Company_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>国际辛德瑞拉婚纱礼服定制有限公司</title>\r\n");
      out.write("    <link href=\"../css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"../js/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/respond.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/public.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/AboutUs.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div id=\"wel_and_login\">\r\n");
      out.write("        <span id=\"welcome\">您好，欢迎光临</span>\r\n");
      out.write("        <div id=\"log_reg\">\r\n");
      out.write("            <a href=\"Login.jsp\">登录</a>\r\n");
      out.write("            <span>/</span>\r\n");
      out.write("            <a href=\"Register.jsp\">注册</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"public_logo\">\r\n");
      out.write("        <img class=\"img-responsive\" src=\"../img/public_log.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"nav_sty\">\r\n");
      out.write("        <div class=\"navbar navbar-default\" id=\"header_nav\">\r\n");
      out.write("            <div class=\"navbar-header\" id=\"nav_hea\">\r\n");
      out.write("                <a class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#nav_list\" id=\"hea_a\">\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navbar-collapse collapse\" id=\"nav_list\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\" id=\"nav_ul\">\r\n");
      out.write("                    <li><a href=\"Home.jsp\">首页</a></li>\r\n");
      out.write("                    <li><a href=\"BridalVeil.jsp\">西式婚纱</a></li>\r\n");
      out.write("                    <li><a href=\"ChidalVeil.jsp\">中式婚纱</a></li>\r\n");
      out.write("                    <li><a href=\"CocktailDress.jsp\">晚礼服</a></li>\r\n");
      out.write("                    <li><a href=\"Hanfu.jsp\">汉服</a></li>\r\n");
      out.write("                    <li><a href=\"Reservation.jsp\">私人订制</a></li>\r\n");
      out.write("                    <li><a href=\"Company.jsp\">关于我们</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <hr style=\"height: 2px;background: #333\"/>\r\n");
      out.write("        <nav class=\"navbar navbar-default\" style=\"background: transparent;border: 0\">\r\n");
      out.write("            <!--<div class=\"navbar-header\" >-->\r\n");
      out.write("                <!--<a class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#leader\" >-->\r\n");
      out.write("                    <!--<span class=\"icon-bar\"></span>-->\r\n");
      out.write("                    <!--<span class=\"icon-bar\"></span>-->\r\n");
      out.write("                    <!--<span class=\"icon-bar\"></span>-->\r\n");
      out.write("                <!--</a>-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("            <div style=\"text-align: center\" id=\"leader\">\r\n");
      out.write("                <ul class=\"nav nav-pills\" style=\"display: inline-block;float: none;\">\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"Company.jsp\" class=\"now\">公司简介</a></li>\r\n");
      out.write("                    <li class=\"noa\"><span>一</span></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"Store.jsp\">线下实体店</a></li>\r\n");
      out.write("                    <li class=\"noa\"><span>一</span></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"Designer.jsp\">设计师介绍</a></li>\r\n");
      out.write("                    <li class=\"noa\"><span>一</span></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"Resume.jsp\">加入我们</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 col-xs-12\" id=\"message\">\r\n");
      out.write("                    <img src=\"../img/Company_logo.png\" alt=\"logo\" class=\"img-responsive\"/>\r\n");
      out.write("                    <p id=\"company\">国际辛德瑞拉婚纱礼服定制有限公司</p><br/><br/><br/><br/><br/><br/>\r\n");
      out.write("                    <p id=\"det\">坐落于上海繁华的街道，却有着一方恬静的天地，无论是浮红流苏的裙褂，还是素婉淡雅的汉服，抑或是白缎雕琢的西式婚纱，都可以带给你梦幻般的体验，在这里，你就是宫殿里的公主、女皇。</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/Company_intro.png\" alt=\"\" class=\"img-responsive\" id=\"queen\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 尾部-->\r\n");
      out.write("        <div class=\"public_footer\">\r\n");
      out.write("            <div class=\"split_line\"></div>\r\n");
      out.write("            <div id=\"pub_er\">\r\n");
      out.write("                <img src=\"../img/public_erweima.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul id=\"fot_nav\">\r\n");
      out.write("                    <li><a href=\"Home.jsp\">首页</a></li>\r\n");
      out.write("                    <li><a href=\"BridalVeil.jsp\">西式婚纱</a></li>\r\n");
      out.write("                    <li><a href=\"ChidalVeil.jsp\">中式婚纱</a></li>\r\n");
      out.write("                    <li><a href=\"CocktailDress.jsp\">晚礼服</a></li>\r\n");
      out.write("                    <li><a href=\"Hanfu.jsp\">汉服</a></li>\r\n");
      out.write("                    <li><a href=\"Reservation.jsp\">私人订制</a></li>\r\n");
      out.write("                    <li><a href=\"Company.jsp\">关于我们</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"address_copyright\">\r\n");
      out.write("                中国·上海·杨浦区·宝源路F518时尚创意园13栋汇所<br>\r\n");
      out.write("                Copyright©2018 ly<br>\r\n");
      out.write("                <span class=\"phone\">咨询热线：400-101-8123</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"suspension\">\r\n");
      out.write("    <div class=\"suspension-box\">\r\n");
      out.write("\r\n");
      out.write("        <a href=\"javascript:;\" class=\"a a-service-phone \"><i class=\"i\"></i></a>\r\n");
      out.write("        <a href=\"javascript:;\" class=\"a a-qrcode\"><i class=\"i\"></i></a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"javascript:;\" class=\"a a-top\"><i class=\"i\"></i></a>\r\n");
      out.write("        <div class=\"d d-service\">\r\n");
      out.write("            <i class=\"arrow\"></i>\r\n");
      out.write("            <div class=\"inner-box\">\r\n");
      out.write("                <div class=\"d-service-item clearfix\">\r\n");
      out.write("                    <a href=\"#\" class=\"clearfix\"><span class=\"circle\"><i class=\"i-qq\"></i></span><h3>咨询在线客服</h3></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"d d-service-phone\">\r\n");
      out.write("            <i class=\"arrow\"></i>\r\n");
      out.write("            <div class=\"inner-box\">\r\n");
      out.write("                <div class=\"d-service-item clearfix\">\r\n");
      out.write("                    <span class=\"circle\"><i class=\"i-tel\"></i></span>\r\n");
      out.write("                    <div class=\"text\">\r\n");
      out.write("                        <p>服务热线</p>\r\n");
      out.write("                        <p class=\"red number\">4001-123-456</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-service-intro clearfix\">\r\n");
      out.write("                    <p><i></i>功能和特性</p>\r\n");
      out.write("                    <p><i></i>价格和优惠</p>\r\n");
      out.write("                    <p><i></i>获取内部资料</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"d d-qrcode\">\r\n");
      out.write("            <i class=\"arrow\"></i>\r\n");
      out.write("            <div class=\"inner-box\">\r\n");
      out.write("                <div class=\"qrcode-img\"><img src=\"../img/public_erweima.png\" alt=\"\"></div>\r\n");
      out.write("                <p>微信服务号</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"../js/jquery-1.11.3.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    window.onload=function() {\r\n");
      out.write("        function fixRem() {\r\n");
      out.write("            var windowWidth = document.getElementById(\"company\").clientWidth;\r\n");
      out.write("            var rootSize = windowWidth / 18;\r\n");
      out.write("            var com_size = document.getElementById(\"company\");\r\n");
      out.write("            var det_size = document.getElementById(\"det\");\r\n");
      out.write("            com_size.style.fontSize = rootSize + 'px';\r\n");
      out.write("            det_size.style.fontSize = rootSize - 4 + 'px';\r\n");
      out.write("        }\r\n");
      out.write("        fixRem();\r\n");
      out.write("        window.addEventListener('resize', fixRem, false);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("        /* ----- 侧边悬浮 ---- */\r\n");
      out.write("        $(document).on(\"mouseenter\", \".suspension .a\", function(){\r\n");
      out.write("            var _this = $(this);\r\n");
      out.write("            var s = $(\".suspension\");\r\n");
      out.write("            var isService = _this.hasClass(\"a-service\");\r\n");
      out.write("            var isServicePhone = _this.hasClass(\"a-service-phone\");\r\n");
      out.write("            var isQrcode = _this.hasClass(\"a-qrcode\");\r\n");
      out.write("            if(isService){ s.find(\".d-service\").show().siblings(\".d\").hide();}\r\n");
      out.write("            if(isServicePhone){ s.find(\".d-service-phone\").show().siblings(\".d\").hide();}\r\n");
      out.write("            if(isQrcode){ s.find(\".d-qrcode\").show().siblings(\".d\").hide();}\r\n");
      out.write("        });\r\n");
      out.write("        $(document).on(\"mouseleave\", \".suspension, .suspension .a-top\", function(){\r\n");
      out.write("            $(\".suspension\").find(\".d\").hide();\r\n");
      out.write("        });\r\n");
      out.write("        $(document).on(\"mouseenter\", \".suspension .a-top\", function(){\r\n");
      out.write("            $(\".suspension\").find(\".d\").hide();\r\n");
      out.write("        });\r\n");
      out.write("        $(document).on(\"click\", \".suspension .a-top\", function(){\r\n");
      out.write("            $(\"html,body\").animate({scrollTop: 0});\r\n");
      out.write("        });\r\n");
      out.write("        $(window).scroll(function(){\r\n");
      out.write("            var st = $(document).scrollTop();\r\n");
      out.write("            var $top = $(\".suspension .a-top\");\r\n");
      out.write("            if(st > 400){\r\n");
      out.write("                $top.css({display: 'block'});\r\n");
      out.write("            }else{\r\n");
      out.write("                if ($top.is(\":visible\")) {\r\n");
      out.write("                    $top.hide();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
