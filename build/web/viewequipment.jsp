<%-- 
    Document   : viewequipment
    Created on : Feb 9, 2018, 10:31:17 AM
    Author     : Matthews
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="beans.Equipment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab Equipments Booking System </title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
    </head>
   <body>
        <%@include   file="jsps/header.jsp"%>    

        <div class="container">

            
           
           <div class="row row-offcanvas row-offcanvas-right">

                <div class="col-xs-12 col-sm-9">
                    <p class="pull-right visible-xs">
                        <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                    </p>

                    <ol class="breadcrumb">
                        <li><a href="">List</a></li>
                    </ol>

                    <div class="well">

                        <form class="form-horizontal" method="POST" action="equipments?action=update&id=<${viewequipment.equip_id }&updatename=${viewequipment.name}" role="form" enctype="multipart/form-data">
                            <!-- *********************************************************************************************
                            ********************************************************************************************************-->
                            <div class="form-group">
                                <h4><font color="#CC0000" style="font:'MS Serif', 'New York', serif">Edit Equipment</font></h4>
                                <label for="inputEmail3" class="col-sm-2 control-label">Equipment Name</label>
                                <div class="col-sm-10">
                                    <input type="text" name="updatename" value="${viewequipment.name}"  class="form-control" id="inputEmail3" required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Descriptions</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control"  name="updatedetails" rows="3" required/>${viewequipment.description}</textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Equipmentcost</label>
                                <div class="col-sm-10">
                                    <input type="text" value="${viewequipment.current_value}" name="updatecost" class="form-control" id="inputEmail3" required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Quantity Available</label>
                                <div class="col-sm-10">
                                    <input type="text" value="${viewequipment.quantity}" name="updatequantity" class="form-control" id="inputEmail3" required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Equipment Category</label>
                                <div class="col-sm-10">
                                    <select type="text"  name="updatecategory" class="form-control" id="inputEmail3" required>
                                        <option>Chemical</option>
                                        <option>Merchadise</option>

                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-1 col-sm-10">
                                    &nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="dashboard" ><input type="button" value="BACK" class="btn btn-success"/></a>
                                    <button type="submit" name="submit3" class="btn btn-success">Save</button>	   	
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                    <div class="list-group">
                        <a href="" class="list-group-item active"></a>
                        <a href="http://localhost:8080/labclassworks/" class="list-group-item ">Home</a>
                        <a href="http://localhost:8080/labclassworks/" class="list-group-item ">All Equipments</a>
                        <a href="users?action=viewusers" class="list-group-item">View Users</a>
                        <a href="http://localhost:8080/labclassworks/alltechnicians.jsp" class="list-group-item">View Technicians</a>

                        __________________________________
                        <a href="" class="list-group-item">View Audits</a>
                        <a href="" class="list-group-item">Clear a User</a>
                    </div>
                </div>

                </body>
</html>
