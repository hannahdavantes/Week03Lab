<%-- 
    Document   : editnote
    Created on : Sep 19, 2019, 12:17:30 PM
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
        <form action="note" method="POST">
        <h1>Simple Note Keeper</h1>
        <h2> Edit Note</h2>
        <p><b>Title:</b> <input type="text" name ="editTitleBox" value="${note.title}"> </p>
        <p><b>Contents:</b><br>
            <textarea name="editContentBox" placeholder="${note.content}"></textarea></p>
 
        <input type="submit" value="Save">
        </form>
    </body>
</html>
