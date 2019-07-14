<%-- 
    Document   : list_case_file
    Created on : Jul 13, 2019, 3:35:17 AM
    Author     : FALCON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Case File</title>
    </head>
    <body>
        <h1>Case Files</h1>
        <table>
            <tr>
                <th>Case File ID</th>
                <th>Type of Crime</th>
                <th>Crime Occurred Date</th>
                <th>Crime Registration Date</th>
                <th>Crime Log File ID</th>
                <th>Investigation End Date</th>
                <th>Investigator ID</th>
                <th>Prosecutor ID</th>
                <th>Suspect Name</th>
                <th>Lawyer ID</th>
                <th>Short Summary</th>
            </tr>
            <c:forEach var="logs" items="${casefile}">
                <tr>
                    <td>${logs.idcase_file}</td>
                    <td>${logs.typeof_crime}</td>
                    <td>${logs.dateof_crime}</td>
                    <td>${logs.crime_tip_date}</td>
                    <td>${logs.log_file_id}</td>
                    <td>${logs.investigation_end_date}</td>
                    <td>${logs.investigator_id}</td>
                    <td>${logs.prosecutor_id}</td>
                    <td>${logs.suspect_name}</td>
                    <td>${logs.lawyer_id}</td>
                    <td>${logs.short_sumary}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
