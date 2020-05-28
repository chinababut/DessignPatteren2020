<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"> 
    <link rel="stylesheet" type="text/css" href="/resources/css/dash.css">
    <link  rel="stylesheet" href="/resources/css/home.css">
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
   
   
</head>
<body>

    <div class="menu-bar">
    <ul>
        <li class="active"><a href="#"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
        <li><a href="#"><i class="fa fa-product-hunt" aria-hidden="true"></i>Projects</a>
            <div class="sub-menu-1">
                <ul>
                    <li><a href="/projectcreation">New Projects</a></li>
                    <li class="hover-me"><a href="#">Existing Projects</a><i class="fa fa-angle-right" aria-hidden="true"></i>
                        <div class="sub-menu-2">
                            <ul>
                            <li><a href="/modulecreation">Create Module</a></li>
                            <li><a href="#">Modules List</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
                
            </div>
        </li>
        <li><a href="#"><i class="fa fa-bars" aria-hidden="true"></i>Reports</a></li>
        <li><a href="/dashboard"><i class="fa fa-th-large" aria-hidden="true"></i>DashBoard</a></li>
        <li><a href="/contact"><i class="fa fa-address-book" aria-hidden="true"></i>Contact Us</a></li>
        <li><a href="/login"><i class="fa fa-sign-out" aria-hidden="true"></i>LogOut</a></li>


</div>

<div class="container"> 
    <div class="box"> 
        <div class="icon"><i class="fa fa-list-ul" aria-hidden="true"></i></div> 
        <div class="content"> 
            <h3>TO-Do List Count</h3> 
            <p>Assigned To &nbsp;&nbsp;&nbsp;<b>:&nbsp;&nbsp;&nbsp;${0}</b></p> 
            <p>Assigned By &nbsp;&nbsp;&nbsp;<b>:&nbsp;&nbsp;&nbsp;${0}</b></p> 
        </div> 
    </div> 
    <div class="box"> 
        <div class="icon"><i class="fa fa-tasks" aria-hidden="true"></i></div> 
        <div class="content"> 
            <h3>In Progress Count</h3> 
            <p>Assigned To &nbsp;&nbsp;&nbsp;<b>:&nbsp;&nbsp;&nbsp;${0}</b></p> 
            <p>Assigned By &nbsp;&nbsp;&nbsp;<b>:&nbsp;&nbsp;&nbsp;${0}</b></p> 
        </div> 
    </div> 
    <div class="box"> 
        <div class="icon"><i class="fa fa-th-list" aria-hidden="true"></i></div> 
        <div class="content"> 
            <h3>Completed Count</h3> 
            <p>Verified Count &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:&nbsp;&nbsp;&nbsp;${0}</b></p>
            <p>Approved Count &nbsp;&nbsp;<b>:&nbsp;&nbsp;&nbsp;${0}</b></p>
            
        </div> 
    </div> 
    <div class="box"> 
        <div class="icon"><i class="fa fa-thumbs-o-up" aria-hidden="true"></i></div> 
        <div class="content"> 
            <h3>Launched Count</h3> 
            <p>Total Projects Launched <b>:&nbsp;&nbsp;&nbsp;${0}</b></p> 
        </div> 
    </div>  
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>