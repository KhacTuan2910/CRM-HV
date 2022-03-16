<%@page import="com.cybersoft.java14.crm.util.UrlConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>Project page</title>
</head>
<body>
	<div class="row bg-title">
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<h4 class="page-title">Danh sách dự án</h4>
		</div>
		<div class="col-lg-9 col-sm-8 col-md-8 col-xs-12 text-right">
			<a href='<c:url value="<%=UrlConst.PROJECT_CREATE%>" />'
				class="btn btn-sm btn-success">Tạo dự án mới</a>
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
								<th>Tên Dự Án</th>
								<th>Ngày Bắt Đầu</th>
								<th>Ngày Kết Thúc</th>
								<th>#</th>
							</tr>
						</thead>
						<tbody>
							<%!int i = 0;%>
							<c:forEach var="pj" items="${projects}">
								<tr>
									<td><%=++i%></td>
									<td>${pj.name }</td>
									<td>${pj.startDate }</td>
									<td>${pj.endDate }</td>
									<td>
										<a href="#" class="btn btn-sm btn-primary">Sửa</a> 
										<a href='<c:url value="<%= UrlConst.PROJECT_REMOVE %>" />?id=${ pj.id }' class="btn btn-sm btn-danger">Xóa</a> 
										<a href="groupwork-details.html" class="btn btn-sm btn-info">Xem</a>
									</td>
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