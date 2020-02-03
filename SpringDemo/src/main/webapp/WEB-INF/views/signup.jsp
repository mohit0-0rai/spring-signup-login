<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Sign Up</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<c:set var="url">${pageContext.request.contextPath}</c:set>
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="${url}/resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="${url}/resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="${url}/resources/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${url}/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="${url}/resources/css/main.css">
<!--===============================================================================================-->

</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form" action="/app/signup" method="post" id="form">
					<span class="login100-form-title p-b-26">
						SIGN UP
					</span>
					<!-- <span class="login100-form-title p-b-48">
						<i class="zmdi zmdi-font"></i>
					</span> -->

					<div class="wrap-input100">
						<input class="input100" type="text" name="username" id="username">
						<span class="focus-input100" data-placeholder="Name"></span>
					</div>
					<div class="wrap-input100">
						<input class="input100" type="text" name="email" id="email">
						<span class="focus-input100" data-placeholder="Email"></span>
					</div>
					<div class="wrap-input100">
						<input class="input100" type="text" name="phone" id="phone">
						<span class="focus-input100" data-placeholder="Phone Number"></span>
					</div>

					<div class="wrap-input100">
						<!--  <span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span> -->
						<input class="input100" type="password" name="password" id="password">
						<span class="focus-input100" data-placeholder="Password"></span>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" id="submit">
								Sign Up
							</button>
						</div>
						<div id="validation_message" style="display:none">
							<br/>
							<p style="color:red"></p>
						</div>
					</div>

					<div class="text-center p-t-115">
						<span class="txt1">
							Already have an account?
						</span>

						<a class="txt2" href="login">
							Login
						</a>
					</div>
					<p id="signup_auth_error" style="color:red;"></p>
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="${url}/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="${url}/resources/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="${url}/resources/vendor/bootstrap/js/popper.js"></script>
	<script src="${url}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="${url}/resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="${url}/resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="${url}/resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="${url}/resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="${url}/resources/js/main.js"></script>
	<script src="${url}/resources/js/signup.js"></script>

</body>
</html>