<%@page import="com.cybersoft.java14.crm.util.UrlConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
	<meta charset="UTF-8">
	<title>Add user</title>
</head>
<body>
	<div class="row bg-title">
        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
            <h4 class="page-title">Thêm mới thành viên</h4>
        </div>
    </div>
    <!-- /.row -->
    <!-- .row -->
    <div class="row">
        <div class="col-md-2 col-12"></div>
        <div class="col-md-8 col-xs-12">
            <div class="white-box">
                <form aciton='<c:url value="<%= UrlConst.USER_ADD %>" />' class="form-horizontal form-material" method="post">
                    <div class="form-group">
                        <label class="col-md-12">Full Name</label>
                        <div class="col-md-12">
                            <input type="text" placeholder="Johnathan Doe"
                                class="form-control form-control-line" name="fullname"> </div>
                    </div>
                    <div class="form-group">
                        <label for="example-email" class="col-md-12">Email</label>
                        <div class="col-md-12">
                            <input type="email" placeholder="johnathan@admin.com"
                                class="form-control form-control-line" name="email"
                                id="example-email"> </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Password</label>
                        <div class="col-md-12">
                            <input type="password" value="password" 
                            	class="form-control form-control-line" name="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Phone No</label>
                        <div class="col-md-12">
                            <input type="text" placeholder="123 456 7890"
                                class="form-control form-control-line" name="phone"> </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Address</label>
                        <div class="col-md-12">
                            <input type="text" placeholder="TP HCM"
                                class="form-control form-control-line" name="address"> </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-12">Role</label>
                        <div class="col-sm-12">
                            <select class="form-control form-control-line" name="role">
                                <option>Admin</option>
                                <option>Project Manager</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-12">
                            <button type="submit" class="btn btn-success">Thêm thành viên</button>
                            <a href='<c:url value="<%= UrlConst.USER %>" />' class="btn btn-primary">Quay lại</a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="col-md-2 col-12"></div>
    </div>
    <!-- /.row -->
</body>