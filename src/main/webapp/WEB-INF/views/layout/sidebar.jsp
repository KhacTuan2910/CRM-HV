<%@page import="com.cybersoft.java14.crm.util.UrlConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Left navbar-header -->
<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse slimscrollsidebar">
        <ul class="nav" id="side-menu">
            <li style="padding: 10px 0 0;">
                <a href='<c:url value="<%= UrlConst.HOME %>" />' class="waves-effect"><i class="fa fa-clock-o fa-fw"
                        aria-hidden="true"></i><span class="hide-menu">Dashboard</span></a>
            </li>
            <li>
                <a href='<c:url value="<%= UrlConst.USER %>" />' class="waves-effect"><i class="fa fa-user fa-fw"
                        aria-hidden="true"></i><span class="hide-menu">Thành viên</span></a>
            </li>
            <li>
                <a href='<c:url value="<%= UrlConst.ROLE %>" />' class="waves-effect"><i class="fa fa-modx fa-fw"
                        aria-hidden="true"></i><span class="hide-menu">Quyền</span></a>
            </li>
            <li>
                <a href='<c:url value="<%= UrlConst.PROJECT %>" />' class="waves-effect"><i class="fa fa-table fa-fw"
                        aria-hidden="true"></i><span class="hide-menu">Dự án</span></a>
            </li>
            <li>
                <a href="blank.html" class="waves-effect"><i class="fa fa-columns fa-fw"
                        aria-hidden="true"></i><span class="hide-menu">Blank Page</span></a>
            </li>
            <li>
                <a href="404.html" class="waves-effect"><i class="fa fa-info-circle fa-fw"
                        aria-hidden="true"></i><span class="hide-menu">Error 404</span></a>
            </li>
        </ul>
    </div>
</div>