<%-- 
    Document   : create_case_file
    Created on : Jul 10, 2019, 7:14:36 PM
    Author     : FALCON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Case File</title>
    </head>
    <body>
        <h1>Create Case File</h1>
        <form action="savecasefile" method="post">
            <table>
                <tr>
                    <th>Type Of Crime</th>
                    <td><input type="text" name="typeof_crime" value="<c:forEach var="item" items="${log}">${item.crime_type}</c:forEach>"/></td>
                </tr>
                <tr>
                    <th>Crime Occurred Date</th>
                    <td><input type="text" name="dateof_crime" value="<c:forEach var="item" items="${log}">${item.crime_occurred_date}</c:forEach>"/></td>
                </tr>
                <tr>
                    <th>Crime Tip Date</th>
                    <td><input type="text" name="crime_tip_date" value="<c:forEach var="item" items="${log}">${item.crime_registered_date}</c:forEach>"/></td>
                </tr>
                <tr>
                    <th>Crime Log ID</th>
                    <td><input type="text" name="log_file_id" value="<c:forEach var="item" items="${log}">${item.idcrime_log}</c:forEach>"/></td>
                </tr>
                <tr>
                    <th>Investigation End Date	</th>
                    <td><input type="text" name="investigation_end_date"/></td>
                </tr>
                <tr>
                    <th>Investigator ID</th>
                    <td><input type="text" name="investigator_id" value="${id}"/></td>
                </tr>
                <tr>
                    <th>Prosecutor</th>
                    <td><select id="prosecutor" name="prosecutor">
                        <c:forEach var="item" items="${prosecutor}">
                            <option value=${item}>${item}</option>
                        </c:forEach></select></td>
                </tr>
                <tr>
                    <th>Suspect Name</th>
                    <td><input type="text" name="suspect_name" value="<c:forEach var="item" items="${log}">${item.defendant_name}</c:forEach>"/></td>
                </tr>
                <tr>
                    <th>Lawyer</th>
                    <td><select id="lawyer" name="lawyer">
                        <c:forEach var="item" items="${lawyer}">
                            <option value=${item}>${item}</option>
                        </c:forEach></select></td>
                </tr>
                <tr>
                    <th>Prosecutor Approved</th>
                    <td><input type="text" name="prosecutor_approved" value="not approved"/></td>
                </tr>
                <tr>
                    <th>Registrar Approved</th>
                    <td><input type="text" name="registrar_approved" value="not approved"/></td>
                </tr>
                <tr>
                    <th>Short Summery</th>
                    <td><textarea name="short_sumary"></textarea></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
