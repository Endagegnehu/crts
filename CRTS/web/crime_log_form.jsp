<%-- 
    Document   : crime_log_form
    Created on : Jul 1, 2019, 3:04:07 AM
    Author     : FALCON
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Log</title>
    </head>
    <body>
        <h1>Crime Log Form</h1>
        <form action="savecrimelog" method="post">
            <table>
                <tr>
                    <td><label>Crime Id</label></td>
                    <td><input type="number" name="crimeid"/></td>
                </tr>
                
                <tr>
                    <td><label>Crime Type</label></td>
                    <td><input type="text" name="crimetype"/></td>
                </tr>
                
                <tr>
                    <td><label>Crime Occurred Date</label></td>
                    <td><input type="text" name="crimeoccuredDate"/></td>
                </tr>
                
                <tr>
                    <td><label>Crime Registered Date</label></td>
                    <td><input type="text" name="crimeregistereddate"/></td>
                </tr>
                
                <tr>
                    <td><label>Defendant Name</label></td>
                    <td><input type="text" name="defendantname"/></td>
                </tr>
                
                <tr>
                    <td><label>Plaintiff Name</label></td>
                    <td><input type="text" name="plaintiffname"/></td>
                </tr>
                
                <tr>
                    <td><label>Assigned Officer</label></td>
                    <td><select id="assignedofficer" name="assignedofficer">
                        <c:forEach var="item" items="${offlist}">
                            <option value=${item}>${item}</option>
                        </c:forEach></select></td>
                </tr>
                
                <tr>
                    <td><label>Crime Description</label></td>
                    <td><input type="text" name="crimedescription"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Next"/></td>
                </tr>
            </table>
            </form>  
        ${crime_log_err}
    </body>
</html>
