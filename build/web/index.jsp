<%-- 
    Document   : index
    Created on : Oct 17, 2017, 9:40:35 PM
    Author     : Matthews
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Lab Equipments Booking System </title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
                    <a href="" class="list-group-item active">Home</a>
                    <a href="" class="list-group-item ">All Equipments</a>
                    <a href="users?action=view" class="list-group-item">View Users</a>
                    <a href="" class="list-group-item">View Technicians</a>
                    ____________________
                    <a href="Adminauditss" class="list-group-item">View Audits</a>
                    <a href="" class="list-group-item">Clear a User</a>

                </div>


            </div>
            <div class="col-lg-10" >
                <p>The Page shows all the Available Equipments.</p>
                <h1>The LAB TECH Home page Equipment Management System.</h1>
                <a href="<c:url value='jsps/index.jsp'  />"> Continue here</a>
                <p> Helloo ${name}.</p>
                <!--and you like ${equipments[0].name}-->


                <table cellpadding="0" cellspacing="0" border="0" class="table  table-bordered" id="example" >

                    <p style="margin-top:50px"><a href="addnewequipment.jsp" class="btn btn-success"><i class="icon-plus"></i>&nbsp;Add New Equipment</a>
                        <a href="chemicals.jsp" class="btn btn-success"><i class="icon-plus"></i>&nbsp;Search for...</a></p>
                    <thead>
                        <tr>
                            <th>Equipment Name</th>
                            <th>Descriptions</th>
                            <th>Quantity Available</th>
                            <th>Cost Per Item</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="items" items="${equipments}">

                            <tr>
                                <td> ${items.name}  </td>
                                <td>${items.description}</td>
                                <td> ${items.quantity}</td>
                                <td>  ${items.current_value}
                                </td>
                                <td width="200">                                  
                                    <a  rel="tooltip"  title="View" id="v"  href="equipments?identity=${items.name}&action=view&viewid=${items.equip_id}" class="btn btn-info"><i class="icon-list icon-large"></i> View/Edit</a>
                                    <a  rel="tooltip"  title="View" id="v" href="equipments?identity=${items.name}&action=delete&deleteid=${items.equip_id}" class="btn btn-danger"><i class="icon-list icon-large"></i> DELETE</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>

        </div>
    </body>
</html>
