<%-- 
    Document   : viewnote
    Created on : Sep 19, 2019, 12:17:17 PM
    Author     : 652343
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2> View Note</h2>
        <p><b>Title:</b> ${note.title} </p>
        <p><b>Contents:</b><br>
            ${note.content} </p>
        
    <a href="/note?edit"> Edit </a>
  
    </body>
</html>
