/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-05 06:34:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.DateFormat;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class borrowed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Library</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"resources/js/renew.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://www.datejs.com/build/date.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("table.firstTable {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td.firstTable {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th.firstTable {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">TECHCHEFS</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li><a href=\"/Library/\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/Library/checkmember\">Member</a></li>\r\n");
      out.write("<!-- \t\t\t<li><a href=\"/Library/checkBooks\">Books Availability</a></li> -->\r\n");
      out.write("<!-- \t\t\t<li><a href=\"#\">TakeIn</a></li> -->\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"/Library/borrowed\">Borrowed</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/Library/members\">Add Member</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/Library/book\">Add Books</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h3>Borrowed Page</h3>\r\n");
      out.write("\t\t<form action=\"/Library/borrowedList\" method=\"post\">\r\n");
      out.write("\t\t\t<table id =\"table1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>Member Id</td>\r\n");
      out.write("\t\t\t\t\t<td><input id=\"empid\" type=\"text\" name=\"employeeId\"><br /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" id=\"button\" value=\"submit\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<br /> <br />\r\n");
      out.write("\t\t<!-- \t\t<table id=\"devicecentral\" class=\"table\"> -->\r\n");
      out.write("\t\t<!-- \t\t\t\t\t\t\t</table> -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/borrowed.jsp(78,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listofbarrow}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<table style=\"border: 1px solid black\" id = \"tid\">\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t<th style=\"border: 1px solid black\">ID</th> -->\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Member\r\n");
        out.write("\t\t\t\t\t\t\tId</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Member\r\n");
        out.write("\t\t\t\t\t\t\tName</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Book\r\n");
        out.write("\t\t\t\t\t\t\tId</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Book\r\n");
        out.write("\t\t\t\t\t\t\tName</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Issued\r\n");
        out.write("\t\t\t\t\t\t\tDate</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Due\r\n");
        out.write("\t\t\t\t\t\t\tDate</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Return</th>\r\n");
        out.write("\t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Renewed</th>\r\n");
        out.write("<!-- \t\t\t\t\t\t<th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">LateFees</th> -->\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<!-- <script>\r\n");
        out.write("\t\t\t\t    $(function(){\r\n");
        out.write("\t\t\t\t        $(\"#tid tr\").click(function(){\r\n");
        out.write("\t\t\t\t        alert (this.rowIndex);\r\n");
        out.write("\t\t\t\t        });\r\n");
        out.write("\t\t\t\t    });\r\n");
        out.write("\t\t\t\t</script> -->\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<script>\r\n");
        out.write("\t\t\t\tfunction data(x,id) {\r\n");
        out.write("\t\t\t\t\tvar devicecentral = $(\"#tid\");\r\n");
        out.write("\t\t\t\t\tvar index = x;\r\n");
        out.write("\t\t\t\t\tvar id = id;\r\n");
        out.write("\t\t\t\t\tvar mid = document.getElementById(\"tid\").rows[index].cells.item(0).innerHTML;\r\n");
        out.write("\t\t\t\t\tvar bid = document.getElementById(\"tid\").rows[index].cells.item(2).innerHTML;\r\n");
        out.write("\t\t\t\t    var value = document.getElementById(\"tid\").rows[index].cells.item(5).innerHTML;\r\n");
        out.write("\t\t\t\t\tvar date = new Date(value);\r\n");
        out.write("\t\t\t\t\tvar rdate = new Date(date.setDate(date.getDate()+10));\r\n");
        out.write("\t\t\t\t\tvar cyear = rdate.getFullYear();\r\n");
        out.write("\t\t\t\t\tvar cmonth = rdate.getMonth()+1;\r\n");
        out.write("\t\t\t\t\tvar cday = rdate.getDate();\r\n");
        out.write("\t\t\t\t\tvar merge = cyear+\"-\"+cmonth+\"-\"+cday\r\n");
        out.write("\t\t\t\t\talert(merge);\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t$.ajax({\r\n");
        out.write("\t\t  \t\t\t\t contentType: 'application/json; charset=UTF-8',\r\n");
        out.write("\t\t  \t\t\t\t dataType: 'json',\r\n");
        out.write("\t\t  \t\t\t\t type: 'POST',\r\n");
        out.write("\t\t  \t\t\t\t //async: false,\r\n");
        out.write("\t\t  \t\t\t\t //processData: false,\r\n");
        out.write(" \t\t  \t\t\t\t url: '/Library/renewed/'+id+'?memId='+mid+'&duedate='+merge,\r\n");
        out.write("\t\t  \t\t\t\t success: function(responseBO){\r\n");
        out.write("\t\t  \t\t\t\t\tconsole.log(responseBO);\r\n");
        out.write("\t\t  \t\t\t\t\t var devicecentral = $(\"#tid\");\r\n");
        out.write("\t\t  \t\t\t\t\t var theaddevice='<thead><tr><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Member Id</th><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Member Name</th><th>Book Id</th><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Book Name</th><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Issued Date</th><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Due Date</th><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Return</th><th style=\"border: 1px solid black\" align=\"center\" width=\"300px\">Renewed</th></tr></thead>';\r\n");
        out.write("\t\t  \t\t\t\t\t var tsbody='<tbody id=\"id tbody\">';\r\n");
        out.write("\t\t  \t\t\t\t\t var tebody='</tbody>';\r\n");
        out.write("\t\t  \t\t\t\t\t var resultHtml = '';\r\n");
        out.write("\t\t  \t\t\t\t\t var m=1;\r\n");
        out.write("\t\t  \t\t\t\t\t if(responseBO.length==0){\r\n");
        out.write("\t\t  \t\t\t\t\t\t \r\n");
        out.write("\t\t  \t\t\t\t\t\talert('No employee found');\r\n");
        out.write("\t\t  \t\t\t\t\t\t return; \r\n");
        out.write("\t\t  \t\t\t\t\t }\r\n");
        out.write("\t\t  \t\t\t\t\t for (var i = 0; i < responseBO.length; i++) {\r\n");
        out.write("\t\t  \t\t\t\t\t\t var employee=responseBO[i];\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\tresultHtml += [\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<tr>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">'+employee.mbrId+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">'+employee.mbrName+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">'+employee.bookId+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">'+employee.bookName+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">'+employee.issuedDate+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">'+employee.dueDate+'</td>',\r\n");
        out.write(" \t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\"><a href=/Library/return/'+employee.id+'/'+employee.mbrId+'/'+employee.bookId+' onclick=\"calculate('+m+')\" id=\"re\">Return</a></td>',\r\n");
        out.write(" \t\t  \t\t\t\t\t\t\t\t\t\t'<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\"><input type=\"submit\" value=\"renewed\" onclick=\"data('+m+','+employee.id+')\"/></td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'</tr>' ].join(\"\\n\"); \r\n");
        out.write("\t\t  \t\t\t\t\t\tm++;\r\n");
        out.write("\t\t  \t\t\t\t\t}\r\n");
        out.write("\t\t  \t\t\t\t\tdevicecentral.html(theaddevice+tsbody+resultHtml+tebody); \r\n");
        out.write("\t\t  \t\t\t\t},\r\n");
        out.write("\t\t  \t\t\t\t  error: function(){\r\n");
        out.write("\t\t  \t\t\t\t\talert(\"Error while request..Contact Admin\");\r\n");
        out.write("\t\t  \t\t\t\t\t\r\n");
        out.write("\t\t  \t\t\t\t} \r\n");
        out.write("\t\t  \t\t\t\t\r\n");
        out.write("\t\t  \t\t\t\t });\r\n");
        out.write("\t\t\t\t};\r\n");
        out.write("\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<script>\r\n");
        out.write("\t\t\t\tfunction calculate(x) {\r\n");
        out.write("\t\t\t\t\tvar index = x;\r\n");
        out.write("\t\t\t\t\tvar oneDayFine = 5;\r\n");
        out.write("\t\t\t\t\t/* var datefield = \"\";\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\tdocument.getElementById('duedateid').onclick = function (e) {\r\n");
        out.write("\t\t\t\t\t    if (this.value != datefield) {\r\n");
        out.write("\t\t\t\t\t    \r\n");
        out.write("\t\t\t\t\t    \tdatefield = this.value;\r\n");
        out.write("\t\t\t\t\t    }\r\n");
        out.write("\t\t\t\t\t    alert(\"changed date \"+datefield);\r\n");
        out.write("\t\t\t\t\t}; */\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t/* $(\"#re\").on('click', function() {\r\n");
        out.write("\t\t\t\t\t\t  var val = $('#duedateid').val();\r\n");
        out.write("\t\t\t\t\t\talert(\"changed date \"+val);\r\n");
        out.write("\t\t\t\t\t}); */\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t/* var table = document.getElementById(\"tid\");\r\n");
        out.write("\t\t\t\t\tvar row = document.getElementById(\"tid\").rows.length;\r\n");
        out.write("\t\t\t\t\talert(\"row count \"+row);\r\n");
        out.write("\t\t\t\t\tvar count = parseInt(row-1);\r\n");
        out.write("\t\t\t\t\talert(count);\r\n");
        out.write("\t\t\t\t\tvar value = document.getElementById(\"tid\").rows[count].cells.item(5).innerHTML;\r\n");
        out.write("\t\t\t\t\talert(value); \r\n");
        out.write("\t\t\t\t\tvar d = new Date(value);\r\n");
        out.write("\t\t\t\t\tvar cyear = d.getFullYear();\r\n");
        out.write("\t\t\t\t\tvar cmonth = d.getMonth()+1;\r\n");
        out.write("\t\t\t\t\tvar cday = d.getDate()\r\n");
        out.write("\t\t\t\t\tvar chdate = cyear+\"-\"+cmonth+\"-\"+cday;\r\n");
        out.write("\t\t\t\t\talert(chdate);  */\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t\t\tvar value = document.getElementById(\"tid\").rows[index].cells.item(5).innerHTML;\r\n");
        out.write("\t\t\t\t\t//alert(value);\r\n");
        out.write("\t\t\t\t\tvar d = new Date(value);\r\n");
        out.write("\t\t\t\t\tvar cyear = d.getFullYear();\r\n");
        out.write("\t\t\t\t\tvar cmonth = d.getMonth()+1;\r\n");
        out.write("\t\t\t\t\tvar cday = d.getDate()\r\n");
        out.write("\t\t\t\t\tvar chdate = cyear+\"-\"+cmonth+\"-\"+cday;\r\n");
        out.write("\t\t\t\t\talert(chdate);\r\n");
        out.write("\t\t\t\t\t//var duedate = $(\"#duedateid\").val();\r\n");
        out.write("\t\t\t\t\t//alert(\"direct date \"+duedate);\r\n");
        out.write("\t\t\t\t\tvar date = new Date();\r\n");
        out.write("\t\t\t\t\tvar day = date.getDay();\r\n");
        out.write("\t\t\t\t\tvar month = date.getMonth()+1;\r\n");
        out.write("\t\t\t\t\tvar year = date.getFullYear();\r\n");
        out.write("\t\t\t\t\tvar change = year+\"-\"+month+\"-\"+day;\r\n");
        out.write("\t\t\t\t\t//alert(change);\r\n");
        out.write("\t\t\t\t\tvar date1 = new Date(chdate);\r\n");
        out.write("\t\t\t\t\tvar date2 = new Date(change);\r\n");
        out.write("\t\t\t\t\tvar diff = parseInt((date2 - date1) / (1000 * 60 * 60 * 24));\r\n");
        out.write("\t\t\t\t\t//alert(\"difference is \"+diff);\r\n");
        out.write("\t\t\t\t\tif (diff > 0) {\r\n");
        out.write("\t\t\t\t\t\tvar totalFine = oneDayFine * diff;\r\n");
        out.write("\t\t\t\t\t\talert(\"total fine = \"+totalFine);\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\telse {\r\n");
        out.write("\t\t\t\t\t\talert(\"No fine\");\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<script>\r\n");
        out.write("\t\t\t\tfunction CallMe(id) {\r\n");
        out.write("\t\t\t\t//$('#table1').remove();\r\n");
        out.write("\t\t\t\tvar id = id;\r\n");
        out.write("\t\t\t\talert(id);\r\n");
        out.write("\t\t\t\tvar memberId = $(\"#mid\").val();\r\n");
        out.write("\t\t\t\talert(memberId);\r\n");
        out.write("\t\t\t\tvar duedate = $(\"#duedateid\").val();\r\n");
        out.write("\t\t\t\talert(duedate);\r\n");
        out.write("\t\t\t\tvar date = new Date();\r\n");
        out.write("\t\t\t\tvar day = date.getDay();\r\n");
        out.write("\t\t\t\t//alert(\"day \"+date);\r\n");
        out.write("\t\t\t\tvar month = date.getMonth()+1;\r\n");
        out.write("\t\t\t\t//alert(\"month \"+month);\r\n");
        out.write("\t\t\t\tvar year = date.getFullYear();\r\n");
        out.write("\t\t\t\t//alert(\"year \"+year);\r\n");
        out.write("\t\t\t\tvar change = year+\"-\"+month+\"-\"+day;\r\n");
        out.write("\t\t\t\t//alert(\"cahge date \"+change);\r\n");
        out.write("\t\t\t\tvar date1 = new Date(duedate);\r\n");
        out.write("\t\t\t\tvar date2 = new Date(change);\r\n");
        out.write("\t\t\t\t//var oneDay = 24 * 60 * 60 * 1000;\r\n");
        out.write("\t\t\t\tvar diff = parseInt((date2 - date1) / (1000 * 60 * 60 * 24));\r\n");
        out.write("\t\t\t\t//var diff = Math.abs((date2.getTime() - date1.getTime()) / (oneDay));\r\n");
        out.write("\t\t\t\talert(\"difference is \"+diff);\r\n");
        out.write("\t\t\t\tvar oneDayFine = 5;\r\n");
        out.write("\t\t\t\tif (diff > 0) {\r\n");
        out.write("\t\t\t\t\talert(\"entering...\");\r\n");
        out.write("\t\t\t\t\tvar totalFine = oneDayFine * diff;\r\n");
        out.write("\t\t\t\t\tvar devicecentral = $(\"#tid\");\r\n");
        out.write(" \t\t\t\t\tvar table = '<table>'; \t\t\t\t\t\r\n");
        out.write(" \t\t\t\t\tvar tsbody='<tbody>'; \t\t\t\t\t\r\n");
        out.write(" \t\t\t\t\tvar data = '';\r\n");
        out.write(" \t\t\t\t\tvar tebody='</tbody>';\r\n");
        out.write(" \t\t\t\t\tvar tend='</table>';\r\n");
        out.write("\t\t\t\t\tvar ediv ='</div>';\r\n");
        out.write(" \t\t\t\t\tdata +=['<tr>',\r\n");
        out.write(" \t\t\t\t\t\t\t'<td>Total Fine</td><td><input id=\"fineid\" name=\"fine\" readonly=\"readonly\" value='+totalFine+' rs></td></tr>',\r\n");
        out.write("\t\t\t\t\t\t\t'<tr><td></td><td><input id=\"click\" type=\"submit\" name=\"submit\" value=\"submit\" onclick=\"\"></td>',\r\n");
        out.write("\t\t\t\t\t\t\t'</tr>'].join(\"\\n\");\r\n");
        out.write("\t\t\t\t\tdevicecentral.html(tsbody+data+tebody);\r\n");
        out.write("\t\t\t\t\t//$(\"#devicecentral\").html(\"<div><table><body><tr><td>Total Fine</td><td><input id=\"fineid\" type=\"text\" name=\"fine\" value='+totalFine+'></td><td></td><td><input id=\"click\" type=\"button\" name=\"submit\" value=\"submit\"></td></tr></body></table></div>\");\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t\telse {\r\n");
        out.write("\t\t\t\t\talert(\"No fine\");\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t\t};\r\n");
        out.write("\t\t\t\t</script>\r\n");
        out.write("\t\t\t\t<script>\r\n");
        out.write("\t\t\t\tfunction call(){\r\n");
        out.write("\t\t\t\t\t$('#tid').remove();\r\n");
        out.write("\t\t\t\t\tvar mid = id;\r\n");
        out.write("\t\t\t\t\talert(\"mid\"+id);\r\n");
        out.write("\t\t\t\t\t$.ajax({\r\n");
        out.write("\t\t  \t\t\t\t contentType: 'application/json; charset=utf-8',\r\n");
        out.write("\t\t  \t\t\t\t dataType: 'json',\r\n");
        out.write("\t\t  \t\t\t\t type: 'POST',\r\n");
        out.write("\t\t  \t\t\t\t url: '/Library/borrowedList?employeeId='+mid,\r\n");
        out.write("\t\t  \t\t\t\t success: function(responseBO){\r\n");
        out.write("\t\t  \t\t\t\t\t var devicecentral = $(\"#tid\");\r\n");
        out.write("\t\t  \t\t\t\t\t var theaddevice='<thead><tr><th>Member Id</th><th>Member Name</th><th>Book Id</th><th>Book Name</th><th>Issued Date</th><th>Due Date</th><th>Return</th><th>Renewed</th></tr></thead>';\r\n");
        out.write("\t\t  \t\t\t\t\t var tsbody='<tbody id=\"id tbody\">';\r\n");
        out.write("\t\t  \t\t\t\t\t var tebody='</tbody>';\r\n");
        out.write("\t\t  \t\t\t\t\t var resultHtml = '';\r\n");
        out.write("\t\t  \t\t\t\t\t var m=1;\r\n");
        out.write("\t\t  \t\t\t\t\t if(responseBO.length==0){\r\n");
        out.write("\t\t  \t\t\t\t\t\t \r\n");
        out.write("\t\t  \t\t\t\t\t\talert('No employee found ');\r\n");
        out.write("\t\t  \t\t\t\t\t\t return; \r\n");
        out.write("\t\t  \t\t\t\t\t }\r\n");
        out.write("\t\t  \t\t\t\t\t for (var i = 0; i < responseBO.length; i++) {\r\n");
        out.write("\t\t  \t\t\t\t\t\t var employee=responseBO[i];\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\tresultHtml += [\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<tr>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td>'+employee.mbrId+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td>'+employee.mbrName+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td>'+employee.bookId+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td>'+employee.bookName+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td>'+employee.issuedDate+'</td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td ><input id=\"duedateid\" type=\"date\" name=\"duedate\" value='+employee.dueDate+'></td>',\r\n");
        out.write("// \t\t  \t\t\t\t\t\t\t\t\t\t'<td><input type=\"button\" id=\"click1\" value=\"return\" onclick=\"action('+employee.id+','+m+')\"></td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'<td><button type=\"button\" value=\"return\" /></td>',\r\n");
        out.write("// \t\t  \t\t\t\t\t\t\t\t\t\t'<td><input id=\"click2\" type=\"button\" name=\"renewedBtn\" value=\"renewed\" ></td>',\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t\t\t\t'</tr>' ].join(\"\\n\"); \r\n");
        out.write("\t\t  \t\t\t\t\t\tm++;\r\n");
        out.write("\t\t  \t\t\t\t\t}\r\n");
        out.write("\t\t  \t\t\t\t\tdevicecentral.html(theaddevice+tsbody+resultHtml+tebody); \r\n");
        out.write("\t\t  \t\t\t\t},\r\n");
        out.write("\t\t  \t\t\t\t  error: function(){\r\n");
        out.write("\t\t  \t\t\t\t\talert(\"Error while request..Contact Admin\");\r\n");
        out.write("\t\t  \t\t\t\t\t\r\n");
        out.write("\t\t  \t\t\t\t\r\n");
        out.write("\t\t  \t\t\t\t} \r\n");
        out.write("\t\t  \t\t\t\t\r\n");
        out.write("\t\t  \t\t\t\t });\r\n");
        out.write("\t\t\t\t};\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t</script>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/views/borrowed.jsp(101,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/borrowed.jsp(101,5) '${listofbarrow}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listofbarrow}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/borrowed.jsp(101,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("employee");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write("\r\n");
          out.write("<!-- \t\t\t\t\t\t\tmethod=\"post\"> -->\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\" id=\"mid\" name=\"memId\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.mbrId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.mbrName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.bookName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.issuedDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\" id=\"duedateid\" name=\"duedate\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.dueDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\" class=\"click\"><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\thref=\"/Library/return/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.mbrId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"calculate(this.parentNode.parentNode.rowIndex)\" id=\"re\" name=\"return\">Return</a></td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td style=\"border: 1px solid black\" align=\"center\" width=\"300px\"><input\r\n");
          out.write("\t\t\t\t\t\t\t\t\ttype=\"submit\" value=\"renewed\" onclick=\"data(this.parentNode.parentNode.rowIndex,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\"/></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("<!-- \t\t\t\t\t\t</form> -->\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}