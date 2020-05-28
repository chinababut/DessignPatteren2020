<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Project Creation</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/home.css">
<link rel="stylesheet" href="/resources/css/projectcreation.css">
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-light">

	<div class="menu-bar">
		<ul>
			<li class="active"><a href="#"><i class="fa fa-home"
					aria-hidden="true"></i>Home</a></li>
			<li><a href="#"><i class="fa fa-product-hunt"
					aria-hidden="true"></i>Projects</a>
				<div class="sub-menu-1">
					<ul>
						<li><a href="/projectcreation">New Projects</a></li>
						<li class="hover-me"><a href="#">Existing Projects</a><i
							class="fa fa-angle-right" aria-hidden="true"></i>
							<div class="sub-menu-2">
								<ul>
									<li><a href="/modulecreation">Create Module</a></li>
									<li><a href="#">Modules List</a></li>
								</ul>
							</div></li>
					</ul>

				</div></li>
			<li><a href="#"><i class="fa fa-bars" aria-hidden="true"></i>Reports</a></li>
			<li><a href="/dashboard"><i class="fa fa-th-large"
					aria-hidden="true"></i>DashBoard</a></li>
			<li><a href="/contact"><i class="fa fa-address-book"
					aria-hidden="true"></i>Contact Us</a></li>
			<li><a href="login.html"><i class="fa fa-sign-out"
					aria-hidden="true"></i>LogOut</a></li>
		</ul>
	</div>

	<br>
	<br>
	<div class="container">
		<h2 align="center">Project Creation</h2>
		
		
		
			<form action="/" method="post">

				<div class="form-group col-lg-7" align="left">
					<label for="proj">Project Name:</label> 
					<input type="text"
						class="form-control " id="proj" name="projname"
						placeholder="enter project name" required autofocus>
				</div>

				<div class="form-group col-lg-7" align="left">
					<label for="dev">Developed By:</label> <input type="text"
						class="form-control" id="dev" name="developed"
						placeholder="ex:CMRO">
				</div>
				
				<div class="form-group col-lg-7" align="left">
					<label for="intg">Integrations:</label> <input type="text"
						class="form-control" id="intg" name="Integrations"
						placeholder="enter integrated with any other resource details">
				</div>
				<div class="form-group col-lg-7" align="left">
					<label for="dis">Description:</label>
					<textarea class="form-control" rows="10" id="dis" required></textarea>
				</div>
					<div class="form-group col-lg-7" align="left">
					<label for="dis">Upload:</label>
					
				</div>
				<br>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
			</div>
		
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
