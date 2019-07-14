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
<<<<<<< HEAD
                    <td><input type="number" name="crimeid"/></td>
=======
<<<<<<< HEAD
                    <td><input type="number" name="crimeid"/></td>
=======
<<<<<<< HEAD
                    <td><input type="number" name="crimeid"/></td>
=======
                    <td><input type="number" name="crimeid"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                </tr>
                
                <tr>
                    <td><label>Crime Type</label></td>
<<<<<<< HEAD
                    <td><input type="text" name="crimetype"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimetype"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimetype"/></td>
=======
                    <td><input type="text" name="crimetype"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                </tr>
                
                <tr>
                    <td><label>Crime Occurred Date</label></td>
<<<<<<< HEAD
                    <td><input type="text" name="crimeoccuredDate"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimeoccuredDate"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimeoccuredDate"/></td>
=======
                    <td><input type="text" name="crimeoccuredDate"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                </tr>
                
                <tr>
                    <td><label>Crime Registered Date</label></td>
<<<<<<< HEAD
                    <td><input type="text" name="crimeregistereddate"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimeregistereddate"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimeregistereddate"/></td>
=======
                    <td><input type="text" name="crimeregistereddate"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                </tr>
                
                <tr>
                    <td><label>Defendant Name</label></td>
<<<<<<< HEAD
                    <td><input type="text" name="defendantname"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="defendantname"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="defendantname"/></td>
=======
                    <td><input type="text" name="defendantname"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                </tr>
                
                <tr>
                    <td><label>Plaintiff Name</label></td>
<<<<<<< HEAD
                    <td><input type="text" name="plaintiffname"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="plaintiffname"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="plaintiffname"/></td>
=======
                    <td><input type="text" name="plaintiffname"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
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
<<<<<<< HEAD
                    <td><input type="text" name="crimedescription"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimedescription"/></td>
=======
<<<<<<< HEAD
                    <td><input type="text" name="crimedescription"/></td>
=======
                    <td><input type="text" name="crimedescription"</td>
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                </tr>
                
                <tr>
                    <td><input type="submit" value="Next"/></td>
                </tr>
            </table>
<<<<<<< HEAD
            </form>  
        ${crime_log_err}
=======
<<<<<<< HEAD
            </form>  
        ${crime_log_err}
=======
<<<<<<< HEAD
            </form>  
        ${crime_log_err}
=======
            </form>     
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    </body>
</html>
