<%-- 
    Document   : home
    Created on : 12-Feb-2023, 9:15:00 PM
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello ${username}!</h1>
         <a href="home?action=logout">Logout</a>
    </body>
</html>
