<%-- 
    Document   : prosecutor_case_file
    Created on : Jul 13, 2019, 5:31:22 AM
    Author     : FALCON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Case Files</title>
    </head>
    <body>
        <h1>Case Files</h1>
        <table>
            <tr>
                <th>Type of crime</th>
                <th>Investigation End Date</th>
                <th>Suspect Name</th>
                <th>Short Summary</th>
                <th>Approve Case File</th>
            </tr>
            <c:forEach var="log" items="${casefile}">
                <tr>
                    <td>${log.typeof_crime}</td>
                    <td>${log.investigation_end_date}</td>
                    <td>${log.suspect_name}</td>
                    <td>${log.short_sumary}</td>
                    <td><a href="approvecasefile?casefileid=${log.idcase_file}">Approve</a>
                </tr>
            </c:forEach>
        </table>
        <h3>${casefilemsg}</h3>
    </body>
</html>
