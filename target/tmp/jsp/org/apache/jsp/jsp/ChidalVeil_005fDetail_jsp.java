/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-07-13 02:23:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ChidalVeil_005fDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head lang=\"zh-cn\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>国际辛德瑞拉婚纱礼服定制有限公司</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/public.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/ChidalVeil_Detail.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/normalize.css\"/>\r\n");
      out.write("    <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/zzsc-demo.css\"/>-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/zoomio.css\"/>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .sampleimage{\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            height: 600px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../js/bootlint.js\"></script>\r\n");
      out.write("<script src=\"../js/html5shiv.min.js\"></script>\r\n");
      out.write("<script src=\"../js/respond.min.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery-1.11.3.js\"></script>\r\n");
      out.write("<script src=\"../js/ChidalVeil_Detail.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wel_and_login\">\r\n");
      out.write("        <span id=\"welcome\">您好，欢迎光临</span>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"log_reg\">\r\n");
      out.write("            <a href=\"Login.jsp\">登录</a>\r\n");
      out.write("            <span>/</span>\r\n");
      out.write("            <a href=\"Register.jsp\">注册</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"public_logo\">\r\n");
      out.write("        <img class=\"img-responsive\" src=\"../img/ChidalVeil/xq_public_log.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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
      out.write("                    <li><a href=\"ChidalVeil.\">中式婚纱</a></li>\r\n");
      out.write("                    <li><a href=\"CocktailDress.jsp\">晚礼服</a></li>\r\n");
      out.write("                    <li><a href=\"Hanfu.jsp\">汉服</a></li>\r\n");
      out.write("                    <li><a href=\"Reservation.jsp\">私人订制</a></li>\r\n");
      out.write("                    <li><a href=\"Company.jsp\">关于我们</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <!--左侧图片-->\r\n");
      out.write("            <div class=\"col-xs-12   col-sm-5  top-picture\" id=\"pics\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"p1 hidden-sm hidden-xs\">\r\n");
      out.write("                        <img src=\"../img/ChidalVeil/xq_4.png\" class=\"sampleimage img-responsive\" id=\"i1\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"p1 visible-sm visible-xs\">\r\n");
      out.write("                    <img src=\"../img/ChidalVeil/four_1.png\" class=\"img-responsive\" id=\"i2\" alt=\"\"/>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"visible-xs\"><span id=\"we\">&nbsp;&nbsp;&nbsp;关键字：传统、中式嫁衣<br>\r\n");
      out.write("    <br><br>面料：聚酯纤维<br>\r\n");
      out.write("    <br><br>  风格：传统复古<br>\r\n");
      out.write("    <br><br>  款型：长旗袍、七分袖、无开衩<br>\r\n");
      out.write("    <br><br>   设计师：蔡美月<br>\r\n");
      out.write("    </span></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <!--<div class=\"visible-xs\"><span id=\"we\">&nbsp;&nbsp;&nbsp;关键字：传统、中式嫁衣<br>-->\r\n");
      out.write("    <!--<br><br>面料：聚酯纤维<br>-->\r\n");
      out.write("    <!--<br><br>  风格：传统复古<br>-->\r\n");
      out.write("    <!--<br><br>  款型：长旗袍、七分袖、无开衩<br>-->\r\n");
      out.write("    <!--<br><br>   设计师：蔡美月<br>-->\r\n");
      out.write("    <!--</span></div>-->\r\n");
      out.write("                <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("            　　　　　　\r\n");
      out.write("            <!--大界面下的文字-->\r\n");
      out.write("            <div class=\"col-sm-4 hidden-xs top-dec\">\r\n");
      out.write("                <p id=\"title\">秀禾服中式嫁衣</p>\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_2.png\" alt=\"\" class=\"img2\"/>\r\n");
      out.write("\r\n");
      out.write("                <p>关键字：传统、中式嫁衣</p>\r\n");
      out.write("\r\n");
      out.write("                <p>面料：聚酯纤维</p>\r\n");
      out.write("\r\n");
      out.write("                <p>风格：传统复古</p>\r\n");
      out.write("\r\n");
      out.write("                <p>款型：长旗袍、七分袖、无开衩</p>\r\n");
      out.write("\r\n");
      out.write("                <p>设计师：蔡美月</p>\r\n");
      out.write("\r\n");
      out.write("                <p id=\"information\">说明: 图片仅供参考，具体面料、花色请咨询门店</p>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"yuyue\"><p>预约试衣</p></div>\r\n");
      out.write("                <div class=\"zixun consult\"><p>点击咨询</p></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"visible-xs row\">\r\n");
      out.write("                <div id=\"yuyue1\" class=\"col-xs-3 yuyue\"><p>预约试衣</p></div>\r\n");
      out.write("                <div id=\"zixun1\" class=\"col-xs-3 zixun consult\"><p>点击咨询</p></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--四张小图-->\r\n");
      out.write("        <div class=\"hidden-xs hidden-sm row \" id=\"li_img1\">\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img1()\"><img class=\"\" src=\"../img/ChidalVeil/li_1.png\"></div>\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img2()\"><img class=\"\" src=\"../img/ChidalVeil/li_2.png\"></div>\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img3()\"><img class=\"\" src=\"../img/ChidalVeil/li_3.png\"></div>\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img4()\"><img class=\"\" src=\"../img/ChidalVeil/li_1.png\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\" visible-sm row\" id=\"li_img2\">\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img5()\"><img class=\"\" src=\"../img/ChidalVeil/li_1.png\"></div>\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img6()\"><img class=\"\" src=\"../img/ChidalVeil/li_2.png\"></div>\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img7()\"><img class=\"\" src=\"../img/ChidalVeil/li_3.png\"></div>\r\n");
      out.write("            <div class=\"col-sm-1 four_img\"\r\n");
      out.write("                 onclick=\"change_img8()\"><img class=\"\" src=\"../img/ChidalVeil/li_1.png\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--商品展示-->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("                <div class=\"text1\">商品展示</div>\r\n");
      out.write("                <!--<div><img src=\"../img/ChidalVeil/3.png\" alt=\"\" class=\"img-responsive\"/></div>-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-sx-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/3.png\" alt=\"\" class=\"img-responsive fengexian\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_4.png\" alt=\"\" class=\"img-responsive img3\"/>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-12 col-sm-12 col-xs-12 text2\">\r\n");
      out.write("                    正面\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_5.png\" alt=\"\" class=\"img-responsive img3\"/>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-12 col-sm-12 col-xs-12 text2\">\r\n");
      out.write("                    360°修饰体型\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_6.png\" alt=\"\" class=\"img-responsive img3\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--细节-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-2 col-sm-12 col-xs-12 text1\">\r\n");
      out.write("                细节\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-sx-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/3.png\" alt=\"\" class=\"img-responsive fengexian\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-5 col-sm-12 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_7.png\" alt=\"\" class=\"img-responsive img1\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-7 col-sm-12 col-xs-12\">\r\n");
      out.write("                <div class=\"text3\"><b>复古元宝口，精美刺绣立领</b></div>\r\n");
      out.write("                <div class=\"text4\">传统刺绣手法吉祥图案，金丝银线，古韵气息。</div>\r\n");
      out.write("                <div class=\"text5\">立领设计，很好地浮凸脖颈曲线，清新舒适。</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-5 col-sm-12 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_8.png\" alt=\"\" class=\"img-responsive img1\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-7 col-sm-12 col-xs-12\">\r\n");
      out.write("                <div class=\"text3\"><b>舒适锻布，奢华裙摆</b></div>\r\n");
      out.write("                <div class=\"text4\">面料质感、透气、舒适亲肤。</div>\r\n");
      out.write("                <div class=\"text5\">时尚复古的百褶裙摆，有浓浓的的书香气息，<br>花形新颖，光泽亮丽。</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-5 col-sm-12 col-xs-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_8.png\" alt=\"\" class=\"img-responsive img1\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-7 col-sm-12 col-xs-12\">\r\n");
      out.write("                <div class=\"text3\"><b>背后隐形拉链，将你的曲线完美呈现</b></div>\r\n");
      out.write("                <div class=\"text4\">勾勒完美身形，优雅且行动自如。</div>\r\n");
      out.write("                <div class=\"text5\">微耸的立体造型显得饱满有型，优雅动人。</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--实拍-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-2 col-sm-12 col-xs-12 text1\">\r\n");
      out.write("                实拍\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-sx-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/3.png\" alt=\"\" class=\"img-responsive fengexian\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-sx-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_10.png\" alt=\"\" class=\"img-responsive\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-sx-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_11.png\" alt=\"\" class=\"img-responsive\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-sx-12\">\r\n");
      out.write("                <img src=\"../img/ChidalVeil/xq_12.png\" alt=\"\" class=\"img-responsive\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"public_footer\">\r\n");
      out.write("        <div class=\"split_line\"></div>\r\n");
      out.write("        <div id=\"pub_er\">\r\n");
      out.write("            <img src=\"../img/ChidalVeil/xq_public_erweima.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul id=\"fot_nav\">\r\n");
      out.write("                <li><a href=\"Home.jsp\">首页</a></li>\r\n");
      out.write("                <li><a href=\"BridalVeil.jsp\">西式婚纱</a></li>\r\n");
      out.write("                <li><a href=\"ChidalVeil.\">中式婚纱</a></li>\r\n");
      out.write("                <li><a href=\"CocktailDress.jsp\">晚礼服</a></li>\r\n");
      out.write("                <li><a href=\"Hanfu.jsp\">汉服</a></li>\r\n");
      out.write("                <li><a href=\"Reservation.jsp\">私人订制</a></li>\r\n");
      out.write("                <li><a href=\"Company.jsp\">关于我们</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"address_copyright\">\r\n");
      out.write("            中国·上海·杨浦区·宝源路F518时尚创意园13栋汇所<br>\r\n");
      out.write("            Copyright©2018 ly<br>\r\n");
      out.write("            <span class=\"phone\">咨询热线：400-101-8123</span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"suspension\">\r\n");
      out.write("        <div class=\"suspension-box\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"javascript:;\" class=\"a a-service-phone \"><i class=\"i\"></i></a>\r\n");
      out.write("            <a href=\"javascript:;\" class=\"a a-qrcode\"><i class=\"i\"></i></a>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"javascript:;\" class=\"a a-top\"><i class=\"i\"></i></a>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"d d-service\">\r\n");
      out.write("                <i class=\"arrow\"></i>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"inner-box\">\r\n");
      out.write("                    <div class=\"d-service-item clearfix\">\r\n");
      out.write("                        <a href=\"#\" class=\"clearfix\"><span class=\"circle\"><i class=\"i-qq\"></i></span>\r\n");
      out.write("\r\n");
      out.write("                            <h3>咨询在线客服</h3></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d d-service-phone\">\r\n");
      out.write("                <i class=\"arrow\"></i>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"inner-box\">\r\n");
      out.write("                    <div class=\"d-service-item clearfix\">\r\n");
      out.write("                        <span class=\"circle\"><i class=\"i-tel\"></i></span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"text\">\r\n");
      out.write("                            <p>服务热线</p>\r\n");
      out.write("\r\n");
      out.write("                            <p class=\"red number\">4001-123-456</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"d-service-intro clearfix\">\r\n");
      out.write("                        <p><i></i>功能和特性</p>\r\n");
      out.write("\r\n");
      out.write("                        <p><i></i>价格和优惠</p>\r\n");
      out.write("\r\n");
      out.write("                        <p><i></i>获取内部资料</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d d-qrcode\">\r\n");
      out.write("                <i class=\"arrow\"></i>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"inner-box\">\r\n");
      out.write("                    <div class=\"qrcode-img\"><img src=\"../img/ChidalVeil/xq_public_erweima.png\" alt=\"\"></div>\r\n");
      out.write("                    <p>微信服务号</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../js/jquery-1.11.3.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"../js/public.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("        /* ----- 侧边悬浮 ---- */\r\n");
      out.write("        $(document).on(\"mouseenter\", \".suspension .a\", function () {\r\n");
      out.write("            var _this = $(this);\r\n");
      out.write("            var s = $(\".suspension\");\r\n");
      out.write("            var isService = _this.hasClass(\"a-service\");\r\n");
      out.write("            var isServicePhone = _this.hasClass(\"a-service-phone\");\r\n");
      out.write("            var isQrcode = _this.hasClass(\"a-qrcode\");\r\n");
      out.write("            if (isService) {\r\n");
      out.write("                s.find(\".d-service\").show().siblings(\".d\").hide();\r\n");
      out.write("            }\r\n");
      out.write("            if (isServicePhone) {\r\n");
      out.write("                s.find(\".d-service-phone\").show().siblings(\".d\").hide();\r\n");
      out.write("            }\r\n");
      out.write("            if (isQrcode) {\r\n");
      out.write("                s.find(\".d-qrcode\").show().siblings(\".d\").hide();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $(document).on(\"mouseleave\", \".suspension, .suspension .a-top\", function () {\r\n");
      out.write("            $(\".suspension\").find(\".d\").hide();\r\n");
      out.write("        });\r\n");
      out.write("        $(document).on(\"mouseenter\", \".suspension .a-top\", function () {\r\n");
      out.write("            $(\".suspension\").find(\".d\").hide();\r\n");
      out.write("        });\r\n");
      out.write("        $(document).on(\"click\", \".suspension .a-top\", function () {\r\n");
      out.write("            $(\"html,body\").animate({scrollTop: 0});\r\n");
      out.write("        });\r\n");
      out.write("        $(window).scroll(function () {\r\n");
      out.write("            var st = $(document).scrollTop();\r\n");
      out.write("            var $top = $(\".suspension .a-top\");\r\n");
      out.write("            if (st > 400) {\r\n");
      out.write("                $top.css({display: 'block'});\r\n");
      out.write("            } else {\r\n");
      out.write("                if ($top.is(\":visible\")) {\r\n");
      out.write("                    $top.hide();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script src=\"../js/zoomio.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function change_img1() {\r\n");
      out.write("        $(\"#i1\").attr(\"src\", \"../img/ChidalVeil/xq_4.png\");\r\n");
      out.write("    }\r\n");
      out.write("    function change_img2() {\r\n");
      out.write("        $(\"#i1\").attr(\"src\", \"../img/ChidalVeil/xq_6.png\");\r\n");
      out.write("    }\r\n");
      out.write("    function change_img3() {\r\n");
      out.write("        $(\"#i1\").attr(\"src\", \"../img/ChidalVeil/xq_10.png\");\r\n");
      out.write("    }\r\n");
      out.write("    function change_img4() {\r\n");
      out.write("        $(\"#i1\").attr(\"src\", \"../img/ChidalVeil/xq_11.png\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function change_img5() {\r\n");
      out.write("        $(\"#i2\").attr(\"src\", \"../img/ChidalVeil/four_1.png\");\r\n");
      out.write("    }\r\n");
      out.write("    function change_img6() {\r\n");
      out.write("        $(\"#i2\").attr(\"src\", \"../img/ChidalVeil/four_2.png\");\r\n");
      out.write("    }\r\n");
      out.write("    function change_img7() {\r\n");
      out.write("        $(\"#i2\").attr(\"src\", \"../img/ChidalVeil/four_3.png\");\r\n");
      out.write("    }\r\n");
      out.write("    function change_img8() {\r\n");
      out.write("        $(\"#i2\").attr(\"src\", \"../img/ChidalVeil/four_4.png\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $(\".sampleimage\").zoomio();\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
