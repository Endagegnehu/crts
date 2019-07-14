<%-- 
    Document   : Profile
    Created on : Jul 6, 2019, 3:27:30 PM
    Author     : FALCON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Profile</title>
    </head>
    <body>
        <h1>User Profile</h1>
        <form action="updateprofile" method="post">
            <table>
                <tr>
                    <th><label>User Name</label></th>
                    <th><input type="text" name="user_name" value="<c:forEach var="item" items="${user}">${item.user_name}</c:forEach>" /></th>
                </tr>
                <tr>
                    <th><label>First Name</label></th>
                    <th><input type="text" name="first_name" value="<c:forEach var="item" items="${user}">${item.first_name}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>Last Name</label></th>
                    <th><input type="text" name="last_name" value="<c:forEach var="item" items="${user}">${item.last_name}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>E-mail</label></th>
                    <th><input type="text" name="email" value="<c:forEach var="item" items="${user}">${item.email}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>Password</label></th>
                    <th><input type="text" name="password" value="<c:forEach var="item" items="${user}">${item.password}</c:forEach>"/></th>
                </tr>
                
                <tr></tr>
                <tr>
                    <th></th>
                    <th>Address</th>
                </tr>
                <tr>
                    <th><label>Region</label></th>
                    <th><input type="text" name="region" value="<c:forEach var="item" items="${address}">${item.region}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>Woreda</label></th>
                    <th><input type="text" name="woreda" value="<c:forEach var="item" items="${address}">${item.woreda}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>Keble</label></th>
                    <th><input type="text" name="keble" value="<c:forEach var="item" items="${address}">${item.kebele}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>Home Number</label></th>
                    <th><input type="text" name="home_number" value="<c:forEach var="item" items="${address}">${item.home_number}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th><label>Phone Number</label></th>
                    <th><input type="text" name="phon" value="<c:forEach var="item" items="${address}">${item.phon}</c:forEach>"/></th>
                </tr>
                <tr>
                    <th></th>
                    <th>Job</th>
                </tr>
                <tr>
                    <th><label>Job Name</label></th>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                    <td><select name="job">
                            <option value="<c:forEach var="item" items="${job}">${item.name}</c:forEach>"><c:forEach var="item" items="${job}">${item.name}</c:forEach></option>
                            <option value="officer">officer</option>
                            <option value="investigator">investigator</option>
                            <option value="prosecutor">prosecutor</option>
                            <option value="registrar">registrar</option>
                            <option value="judge">judge</option>
                            <option value="lawyer">lawyer</option>
<<<<<<< HEAD
=======
=======
                    <td><select name="job" value="<c:forEach var="item" items="${job}">${item.name}</c:forEach>">
                            <option value="officer">Police Officer</option>
                            <option value="investigator">Investigator</option>
                            <option value="prosecutor">Prosecutor</option>
                            <option value="registrar">Court Registrar Office</option>
                            <option value="judge">Judge</option>
                            <option value="lawyer">Lawyer</option>
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
                    </select></td>
                </tr>
                <tr>
                    <th><input type="submit" value="Update"/></th>
                </tr>
            </table>
        </form>
 ${profilemsg}
    </body>
</html>
