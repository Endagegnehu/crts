<%-- 
    Document   : index
    Created on : Jul 1, 2019, 2:39:43 AM
    Author     : FALCON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRTS</title>
    </head>
    <body>
        <h1>CRTS</h1>
        <form action="login" method="post">
            <table>
           <tr>
            <th><lable>UserName: </lable></th>
            <th><input type="text" name="username"/></th>
           </tr>
           <tr>
               <th><lable>Password: </lable></th>
               <td><input type="password" name="password"/></td>
           </tr>
           <td>
           <td><input type="submit" value="Log In"/></td>
           </td>
            </table>
        </form>
        <br/>
        ${msg}
    </body>
</html>
