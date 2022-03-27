 <%@page import="com.cybersoft.java14.crm.util.UrlConst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="UTF-8">
<title>Update user</title>
</head>
<body>
	<div class="row bg-title">
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<h4 class="page-title">Sửa thông tin thành viên</h4>
		</div>
	</div>
	<!-- /.row -->
	<!-- .row -->
	<div class="row">
		<div class="col-md-2 col-12"></div>
		<div class="col-md-8 col-xs-12">
			<div class="white-box">
				<form aciton='<c:url value="<%=UrlConst.USER_UPDATE%>" />'
					class="form-horizontal form-material" method="post">
					<div class="form-group">
						<label class="col-md-12">Full Name</label>
						<div class="col-md-12">
							<input type="text" placeholder="Johnathan Doe"
								class="form-control form-control-line" name="fullname"
								id="fullname" value="${ user.name }">
						</div>
					</div>
					<div class="form-group">
						<label for="example-email" class="col-md-12">Email</label>
						<div class="col-md-12">
							<input type="email" placeholder="johnathan@admin.com"
								class="form-control form-control-line" name="email" id="email"
								value="${ user.email }">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-12">Password</label>
						<div class="col-md-12">
							<input type="password" class="form-control form-control-line"
								name="password" id="password" value="${ user.password }">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-12">Phone No</label>
						<div class="col-md-12">
							<input type="text" placeholder="123 456 7890"
								class="form-control form-control-line" name="phone" id="phone"
								value="${ user.phone }">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-12">Address</label>
						<div class="col-md-12">
							<input type="text" placeholder="TP HCM"
								class="form-control form-control-line" name="address"
								id="address" value="${ user.address }">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-12">Role</label>
						<div class="col-sm-12">
							<select class="form-control form-control-line" name="role"
								id="role">

								<c:forEach var="role" items="${roles }">
									<c:choose>
										<c:when test="${user.role.id == role.id}">
											<option value="${role.id }" selected="">${role.name }</option>
										</c:when>

										<c:otherwise>
											<option value="${role.id }">${role.name }</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>

							</select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-12">
							<button type="submit" class="btn btn-success">Hoàn tất</button>
							<a href='<c:url value="<%=UrlConst.USER%>" />'
								class="btn btn-primary">Quay lại</a>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="col-md-2 col-12"></div>
	</div>
	<!-- /.row -->
	<content tag="scripts"> <script
		src="assets/js/web-js/user.js"></script> </content>
</body>