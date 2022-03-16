<%@page import="com.cybersoft.java14.crm.util.UrlConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>Role page</title>
</head>
<body>
	<div class="row bg-title">
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<h4 class="page-title">Danh sách quyền</h4>
		</div>
		<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12 text-right">
			<a href="role-add.html" class="btn btn-sm btn-success">Thêm mới</a>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /row -->
	<div class="row">
		<div class="col-sm-12">
			<div class="white-box">
				<div class="table-responsive">
					<table class="table" id="example">
						<thead>
							<tr>
								<th>STT</th>
								<th>Tên Quyền</th>
								<th>Mô Tả</th>
								<th>#</th>
							</tr>
						</thead>
						<tbody>
							<%!int i = 0;%>
							<c:forEach var="role" items='${ roles }'>
								<tr>
									<td><%=++i%></td>
									<td>${ role.name }</td>
									<td>${ role.description }</td>
									<td><a href="#" class="btn btn-sm btn-primary">Sửa</a> <a
										href="#" class="btn btn-sm btn-danger">Xóa</a></td>
								</tr>
							</c:forEach>
							<%
							i = 0;
							%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->
</body>