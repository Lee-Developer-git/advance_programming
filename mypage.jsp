<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<!--
	Editorial by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>투명한 기부</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Main -->
					<div id="main">
						<div class="inner">

							<!-- Header -->
								<header id="header">
									<a href="index.html" class="logo"><strong>기부</strong> &nbsp'나만의 투명한 기부 참여'</a>
									<ul class="icons">
										<li><a href="login.html"><span class="label">Login</span></a></li>
										<li><a href="login.html"><span class="label">Logout</span></a></li>
									</ul>
									
								</header>


							<!-- Banner -->
								<section id="banner">
									<div class="row">
										<div class="col-12 col-2-medium">
											<h4>회원 정보</h4>
											<ul class="alt">
												<li>이름: </li>
												<li>e-mail: </li>
												<li>password: </li>
											</ul>
										</div>
										
										<div class="col-12 col-2-medium">
											<h4>포인트 조회/충전</h4>
											<FORM method="post" action="처리 페이지.jsp" align="left">
											<ul class="alt">
												<li>잔여 포인트:  point</li>
												<li>충전 포인트 
													<input type="text" name="carnumber"  size=10 placeholder="충전 금액(원)">
												</li>
												<li> 
													<th>
														<select name="garageid" >
															<option ></option>
															<option value="card">카드 결제</option>
															<option value="mutong">무통장 입금</option>
															<option value="gae">계좌 이체</option>
														</select> 
													</th>
												</li>
												<li><a href="#" class="button small">payment</a></li>
											</ul>
											</FORM>
										</div>

										<div class="col-12 col-2-medium">
											<h4>재능 기부 조회/등록</h4>
											<FORM method="post" action="처리 페이지.jsp"  align="left">
											<ul class="alt">
												<li>색종이 접기</li>
												<li>재능 등록
													<input type="text" name="carnumber"  size=10 placeholder="재능 입력">
												</li>
												<li>재능 기부 가능한 시간
													<th>
														<select name="garageid" >
															<option ></option>
															<option value="card">주중</option>
															<option value="mutong">주말</option>
															<option value="gae">주중/주말</option>
														</select> 
													</th>
												</li>
												<li><a href="#" class="button small">registration</a></li>
											</ul>
											</FORM>
										</div>

										<div class="col-12 col-2-medium">
											<h4>포인트 공유 서류 조회</h4>
											<ul class="alt">
												<li>사랑의 동산</li>
											</ul>
										</div>

									</div>
								</section>
						</div>
					</div>

				<!-- Sidebar -->
					<div id="sidebar">
						<div class="inner">
							<!-- Menu -->
								<nav id="menu">
									<header class="major">
										<h2><a href="index.html">~~~~ donation</a></h2>
									</header>
									<ul>
										<li><span class="opener">MY PAGE</span>
											<ul>
												<li><a href="#">회원정보 조회</a></li>
												<li><a href="#">포인트 적립</a></li>
												<li><a href="#">재능 등록</a></li>
												<li><a href="#">공유 서류 조회</a></li>
											</ul></li>
										<li><a href="generic.html">기부 하기</a></li>
										<li><a href="elements.html">재능 기부</a></li>
									</ul>
								</nav>

								<section>
									<header class="major">
										<h2>Get in touch</h2>
									</header>
									<ul class="contact">
										<li class="icon solid fa-envelope"><a href="#">tangerinelove@naver.com</a></li>
										<li class="icon solid fa-phone">(+82) 10-3116-7130</li>
										<li class="icon solid fa-home">30, Pildong-ro 1-gil, Jung-gu<br />
										Seoul, Republic of Korea</li>
									</ul>
								</section>
							<!-- Footer -->
						</div>
					</div>

			</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>