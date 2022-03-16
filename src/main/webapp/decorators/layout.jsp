<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="">
	    <meta name="author" content="">
	    
	    <link rel="icon" type="image/png" sizes="16x16" href="assets/plugins/images/favicon.png">
		
		<title>
			<dec:title />
		</title>
	    
	    <!-- Bootstrap Core CSS -->
	    <link href="assets/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	    <!-- Menu CSS -->
	    <link href="assets/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
	    <!-- toast CSS -->
	    <link href="assets/plugins/bower_components/toast-master/css/jquery.toast.css" rel="stylesheet">
	    <!-- morris CSS -->
	    <link href="assets/plugins/bower_components/morrisjs/morris.css" rel="stylesheet">
		<!-- toastr CSS -->
	    <link href="assets/plugins/toastr/toastr.min.css" rel="stylesheet">
	    <!-- animation CSS -->
	    <link href="assets/css/animate.css" rel="stylesheet">
	    <!-- Custom CSS -->
	    <link href="assets/css/style.css" rel="stylesheet">
	    <!-- color CSS -->
	    <link href="assets/css/colors/blue-dark.css" id="theme" rel="stylesheet">
	    <link rel="stylesheet" href="assets/css/custom.css">
	    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	    <!--[if lt IE 9]>
	    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>
		<!-- Preloader -->
	    <div class="preloader">
	        <div class="cssload-speeding-wheel"></div>
	    </div>
		
		<!-- #wrapper -->
		<div id="wrapper">
			<!-- Header -->
			<jsp:include page="/WEB-INF/views/layout/header.jsp"/>
			
			<!-- Sidebar -->
			<jsp:include page="/WEB-INF/views/layout/sidebar.jsp"/>
			
			<!-- Page Content -->
        	<div id="page-wrapper">
        		<div class="container-fluid">
        			<dec:body/>
        		</div>
				<!-- /.container-fluid -->
				<!-- Footer -->
				<jsp:include page="/WEB-INF/views/layout/footer.jsp"/>
        	</div>
        	<!-- /#page-wrapper -->
		</div>
		<!-- /#wrapper -->
		
		<!-- jQuery -->
	    <script src="assets/plugins/bower_components/jquery/dist/jquery.min.js"></script>
	    <!-- Bootstrap Core JavaScript -->
	    <script src="assets/bootstrap/dist/js/bootstrap.min.js"></script>
	    <!-- Menu Plugin JavaScript -->
	    <script src="assets/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
	    <!--slimscroll JavaScript -->
	    <script src="assets/js/jquery.slimscroll.js"></script>
	    <!--Wave Effects -->
	    <script src="assets/js/waves.js"></script>
	    <!--Counter js -->
	    <script src="assets/plugins/bower_components/waypoints/lib/jquery.waypoints.js"></script>
	    <script src="assets/plugins/bower_components/counterup/jquery.counterup.min.js"></script>
	    <!--Morris JavaScript -->
	    <script src="assets/plugins/bower_components/raphael/raphael-min.js"></script>
	    <script src="assets/plugins/bower_components/morrisjs/morris.js"></script>
	    <!--Toastr JavaScript -->
	    <script src="assets/plugins/toastr/toastr.min.css"></script>
	    <!-- Custom Theme JavaScript -->
	    <script src="assets/js/custom.min.js"></script>
	    <script src="assets/js/dashboard1.js"></script>
	    <script src="assets/plugins/bower_components/toast-master/js/jquery.toast.js"></script>
	    
	    <dec:getProperty property="page.scripts"></dec:getProperty>
	</body>
</html>