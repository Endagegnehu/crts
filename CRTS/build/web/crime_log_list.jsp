<%-- 
    Document   : crime_log_list
    Created on : Jul 10, 2019, 1:59:06 AM
    Author     : FALCON
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Log</title>
    </head>
    <body>
        <h1>Crime Logs</h1>
        <table>
            <tr>
                <th>Crime Type</th>
                <th>Crime Occurred Date</th>
                <th>Crime Registered Date</th>
                <th>Defendant Name</th>
                <th>Plaintiff Name</th>
                <th>Crime Description</th>
                <th>Case File</th>
            </tr>
            <c:forEach var="log" items="${crime_log}">
                <tr>
                    <td>${log.crime_type}</td>
                    <td>${log.crime_occurred_date}</td>
                    <td>${log.crime_registered_date}</td>
                    <td>${log.defendant_name}</td>
                    <td>${log.plaintiff_name}</td>
                    <td>${log.crime_description}</td>
                    <td><a href="<c:url value="/casefile/createcasefile?crimelogid=${log.idcrime_log}"/>">Create</a>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
