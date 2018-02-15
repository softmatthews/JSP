<%-- 
    Document   : allLogin
    Created on : Feb 9, 2018, 9:28:12 AM
    Author     : Matthews
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Lab Equipments Booking System </title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    </head>
    <body>
        <%@include  file="jsps/header.jsp" %>
        <div class="row">
            <div class="col-lg-2">

            </div>
            <div class="col-lg-8">
                <form class="form-horizontal" action=""  role="form" method="post">  
                    <div class="form-group col-sm-4">
                    <label>UserName :</label>
                    <input type="text" name="username" id="name" placeholder="username"/><br /><br />
                    </div>
                    <div class="form-group col-sm-4">
                    <label>Password :</label>
                    <input type="password" name="password" id="password" placeholder="**********"/><br/><br />
                     </div>
                    <div class="form-group col-sm-4">
                    <label>Email:</label>
                    <input type="text" name="email" id="email" placeholder="your Registration Email"/><br /><br />
                     </div>
                    
                    <input type="submit" value=" Login " name="submit"/><br />
                    <p>Not yet Registerd?<a href=""> SignUp Here.</a></p>
                </form>
            </div>
            <div class="col-lg-2">

            </div>
        </div>

    </body>
</html>
