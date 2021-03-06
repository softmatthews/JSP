<%-- 
    Document   : addnewequipment
    Created on : Jan 18, 2018, 12:03:34 AM
    Author     : Matthews
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Booking Sample</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
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
                        <li><a href="Leadership.php">List</a></li>
                    </ol>

                    <div class="well">
                        <form class="form-horizontal" action="equipments?action=newitem" method="POST">
                            <!-- *********************************************************************************************
                            ********************************************************************************************************-->
                            <div class="form-group">
                                <h4><font color="#CC0000" style="font:'MS Serif', 'New York', serif">Add new Equipment</font></h4>
                                <label for="inputEmail3" class="col-sm-2 control-label">Equipment Name</label>
                                <div class="col-sm-10">
                                    <input type="text" name="eqpname" class="form-control" id="inputEmail3" required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Descriptions</label>
                                <div class="col-sm-10">
                                    <textarea class="form-control" name="eqpdetails" rows="3" required/></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Equipmentcost</label>
                                <div class="col-sm-10">
                                    <input type="text" name="eqpcost" class="form-control" id="inputEmail3" required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Quantity Available</label>
                                <div class="col-sm-10">
                                    <input type="text" name="eqpquantity" class="form-control" id="inputEmail3" required/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-2 control-label">Equipment Category</label>
                                <div class="col-sm-10">
                                    <select type="text" name="eqpcategory" class="form-control" id="inputEmail3" required>
                                        <option value="Chemical">Chemical</option>
                                        <option value="Merchadise">Merchadise</option>

                                    </select>
                                </div>
                            </div>
                            

                            <div class="form-group">
                                <div class="col-sm-offset-1 col-sm-10">
                                    &nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="/labclassworks" ><input type="button" value="BACK" class="btn btn-success"/></a>
                                    <button type="submit" name="submit" class="btn btn-success">Save</button>	   	
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                    <div class="list-group">
                        <a href="" class="list-group-item active"></a>
                        <a href="http://localhost:8080/Bookingweb/" class="list-group-item ">Home</a>
                        <a href="http://localhost:8080/Bookingweb/" class="list-group-item ">All Equipments</a>
                        <a href="http://localhost:8080/Bookingweb/jsps/allusers.jsp" class="list-group-item">View Users</a>
                        <a href="http://localhost:8080/Bookingweb/jsps/alltechnicians.jsp" class="list-group-item">View Technicians</a>

                        __________________________________
                        <a href="" class="list-group-item">View Audits</a>
                        <a href="" class="list-group-item">Clear a User</a>
                    </div>
                </div>
 
