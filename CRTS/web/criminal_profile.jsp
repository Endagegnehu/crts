<%-- 
    Document   : Criminal_profile
    Created on : Jul 4, 2019, 8:41:05 PM
    Author     : FALCON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Criminal Profile</title>
    </head>
    <body>
        <h1>Criminal Profile</h1>
        <form action="criminalprofile" method="post">
            <table>
            <tr>
                <td><label>Suspect ID</label></td>
                <td><input type="number" name="idsuspect"/></td>
            </tr>
            <tr>
                <td><label>First Name</label></td>
                <td><input type="text" name="first_name"/></td>
            </tr>
            <tr>
                <td><label>Middle Name</label></td>
                <td><input type="text" name="middle_name"/></td>
            </tr>
            <tr>
                <td><label>Last Name</label></td>
                <td><input type="text" name="last_name"/></td>
            </tr>
            <tr>
                <td><label>Age</label></td>
                <td><input type="number" name="age" min="18" max="100"/></td>
            </tr>
            <tr>
                <td><label>Religion</label></td>
                <td><select name="religion">
                            <option value="orthodox">Orthodox</option>
                            <option value="protestant">Protestant</option>
                            <option value="muslim">Muslim</option>
                            <option value="other">Other</option>
                    </select></td>
            </tr>
            <tr>
                <td><label>Occupation</label></td>
                <td><input type="text" name="occupation"/></td>
            </tr>
            <tr>
                <td><label>Marital Status</label></td>
                <td><select name="marital_status">
                        <option value="married">Married</option>
                        <option value="single">Single</option>
                    </select></td>
            </tr>
            <tr>
                <td><label>Addiction</label></td>
                <td><select name="addiction">
                        <option value="alcoholism">Alcoholism</option>
                        <option value="drug_addict">Drug Addict</option>
                        <option value="none">None</option>
                    </select></td>
            </tr>
             <tr>
                <td><label>Academic Level</label></td>
                <td><select name="academic_level">
                        <option value="zero">Zero</option>
                        <option value="basic_education">Basic Education</option>
                        <option value="elementary">Elementary</option>
                        <option value="high_school">High School</option>
                        <option value="preparatory">Preparatory</option>
                        <option value="higher_education">Higher Education</option>
                    </select></td>
            </tr>
            <tr></tr>
            <tr>
                <td></td>
                <th>Address</th>
            </tr>
            <tr>
                <td><lable>Region</lable></td>
            <td><input type="text" name="region"/></td>
            </tr>
            <tr>
                <td><label>Woreda</label></td>
                <td><input type="text" name="woreda"/></td>
            </tr>
            <tr>
                <td><label>Kebele</label></td>
                <td><input type="text" name="kebele"/></td>
            </tr>
            <tr>
                <td><label>Home Number</label></td>
                <td><input type="text" name="home_number"/></td>
            </tr>
            <tr>
                <td><label>Phone Number</label></td>
                <td><input type="number" name="phone_number"/></td>
            </tr>
            <tr></tr>
            <tr>
                <td><input type="submit" value="Register"/></td>
            </tr>
            </table>
        </form>
        ${criminal_profile_err}
    </body>
</html>
