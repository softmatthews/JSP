<%-- 
    Document   : allusers
    Created on : Feb 10, 2018, 11:21:34 PM
    Author     : Matthews
--%>
<%@page import="beansIo.usersmanager"%>
<%@page import="beans.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Sample</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">

    </head>
    <body>
        <%@include file="jsps/header.jsp" %>
        <div class="container ">
            <div class="col-lg-2 sidebar-offcanvas " id="sidebar" role="navigation">     
                </br>
                </br>
                </br>
                </br>
                </br>
                <p> </br></p>
                </br>
                <h1> </h1>
                <div class="list-group">
                    <a href="" class="list-group-item active"></a>
                    <a href="" class="list-group-item active">Home</a>
                    <a href="" class="list-group-item ">All Equipments</a>
                    <a href="users?action=view" class="list-group-item">View Users</a>
                    <a href="" class="list-group-item">View Technicians</a>
                    ____________________
                    <a href="#" class="list-group-item">View Audits</a>
                    <a href="" class="list-group-item">Clear a User</a>

                </div>
            </div>
            <div class="col-lg-10" >

                <h1>Here are All the  Bookings.</h1>
                <table cellpadding="0" cellspacing="0" border="0" class="table  table-bordered" id="example" >
                    <form action="" method="POST">
                        <p style="margin-top:50px"><input type="text" name="searchname"/><i class="icon-plus"></i></a>
                            <a href="" class="btn btn-success"><i class="icon-plus"></i>&nbsp;Search by Name</a>
                            <input type="text" name="searchfaculty"/><i class="icon-plus"></i></a>
                            <a href="" class="btn btn-success"><i class="icon-plus"></i>&nbsp;Search by Regno</a>
                        </p>
                    </form>
                    <thead>
                        <tr>
                            <th> User Name</th>
                            <th>Identity</th>
                            <th>Department</th>                                                     
                            <th>Contacts</th>
                            <th>Equipment Booked</th>
                            <th>Quantity</th>
                            <th>Total Cost</th>
                            <th>Date</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="audits" items="${bookings}" >
                             
                            <tr>
                                <td>${audits.name }  </td>
                                <td>${audits.quantity}</td>
                                <td>${audits.category }
                                </td>
                                <td>  ${ audits.current_value }
                                </td>
                                <td>  ${ audits.description }
                                </td>
                                <td> ${audits.equip_id}
                                </td>
                                <td>  ${audits.name }
                                </td>
                                <td>  ${audits.name }
                                </td>
                                <td> ${audits.name }
                                </td>
                                <td width="200">

                                    <a  rel="tooltip"  title="View" id="v"  href="users?action=view&identity=${audits.name }&viewid=${audits.equip_id}" class="btn btn-info"><i class="icon-list icon-large"></i> Clear User</a>
                                  <a  rel="tooltip"  title="View" id="v" href="users?identity=${audits.name }&deleteid=${audits.equip_id}" class="btn btn-danger"><i class="icon-list icon-large"></i> View More</a>
                                   
                                </td>
                            </tr> 
                        </c:forEach>

                    </tbody>
                </table>

            </div>

        </div>
    </body>
</html>

