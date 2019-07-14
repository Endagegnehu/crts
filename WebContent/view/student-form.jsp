<%-- 
    Document   : student-form
    Created on : Jun 24, 2019, 11:47:25 PM
    Author     : ende
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Form</title>
    </head>
    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName"/>
            <br><br>
            Last name: <form:input path="lastName"/>
            <br><br>
            <input type="submit" value="submit"/>
        </form:form>
    </body>
</html>
