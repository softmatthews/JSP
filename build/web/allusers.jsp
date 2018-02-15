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
            <div class="col-lg-2  sidebar-offcanvas" id="sidebar" role="navigation">     
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
                    <a href="http://localhost:8080/Bookingweb/" class="list-group-item active">Home</a>
                    <a href="http://localhost:8080/Bookingweb/" class="list-group-item ">All Equipments</a>
                    <a href="users" class="list-group-item">View Users</a>
                    <a href="http://localhost:8080/Bookingweb/jsps/alltechnicians.jsp" class="list-group-item">View Technicians</a>

                    ____________________
                    <a href="" class="list-group-item">View Audits</a>
                    <a href="" class="list-group-item">Clear a User</a>

                </div>


            </div>
            <div class="col-lg-10" >

                <h1>All the users of the System.</h1>
                <table cellpadding="0" cellspacing="0" border="0" class="table  table-bordered" id="example" >

                    <p style="margin-top:50px"><input type="text" name="search"/><i class="icon-plus"></i></a>
                        <a href="chemicals.jsp" class="btn btn-success"><i class="icon-plus"></i>&nbsp;Search for...</a></p>
                    <thead>
                        <tr>
                            <th> Name</th>
                            <th>Faculty</th>
                            <th>Department</th>
                            <th>Contacts</th>
                            <th>Role</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${allusers}" >
                            <tr>
                                <td>${user.name }  </td>
                                <td>${user.faculty}</td>
                                <td>${user.department }
                                </td>
                                <td> ${user.tel_no }
                                </td>
                                <td>  ${ user.role }
                                </td>
                                <td width="200">

                                    <a  rel="tooltip"  title="View" id="v"  href="users?action=view&identity=${user.name }&viewid=${user.staff_id}" class="btn btn-info"><i class="icon-list icon-large"></i> View/Edit</a>
                                    <a  rel="tooltip"  title="View" id="v" href="users?identity=${user.name }&deleteid=${user.staff_id}" class="btn btn-danger"><i class="icon-list icon-large"></i> DELETE</a>
                                </td>
                            </tr> 
                        </c:forEach>

                    </tbody>
                </table>

            </div>

        </div>
    </body>
</html>
