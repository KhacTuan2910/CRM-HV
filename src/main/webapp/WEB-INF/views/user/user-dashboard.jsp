<%@page import="com.cybersoft.java14.crm.util.UrlConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>User page</title>
</head>
<body>
	<div class="row bg-title">
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<h4 class="page-title">Danh sách thành viên</h4>
		</div>
		<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12 text-right">
			<a href='<c:url value="<%=UrlConst.USER_ADD%>" />'
				class="btn btn-sm btn-success">Thêm mới</a>
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
								<th>Họ Tên</th>
								<th>Email</th>
								<th>Số điện thoại</th>
								<th>Chức vụ</th>
								<th>#</th>
							</tr>
						</thead>
						<tbody>
							<%!int i = 0;%>
							<c:forEach var="user" items="${ users }">
								<tr>
									<td><%=++i%></td>
									<td>${user.name}</td>
									<td>${user.email}</td>
									<td>${user.phone}</td>
									<td>${user.role}</td>
									<td><a
										href='<c:url value="<%= UrlConst.USER_UPDATE %>" />?id=${ user.id }'
										class="btn btn-sm btn-primary" id="btn-user-edit"
										data-id="${ user.id }">Sửa</a> 
										<a href='<c:url value="<%= UrlConst.USER_DELETE %>" />?id=${ user.id }' class="btn btn-sm btn-danger">Xóa</a> 
										<a href="user-details.html" class="btn btn-sm btn-info">Xem</a></td>
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
</html>