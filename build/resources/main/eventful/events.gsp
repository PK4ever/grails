<%--
  Created by IntelliJ IDEA.
  User: paulk4ever
  Date: 5/4/17
  Time: 3:09 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<ol>
    <g:each in="${data}" var="it">
        <form action="/liked" method="post">
        <input type="hidden" name="title" value= ${it.getTitle().replace(" ","%20")}/>
        <input type="hidden" name="venue" value= ${it.getVenueAddress().replace(" ","%20")}/>
            <input type="hidden" name="SeID" value=  ${it.getSeid().replace("/"," ")}/>
        <li><b>Event: </b>${it.getTitle()} <br> <b>Address</b>: ${it.getVenueAddress()}</li>
        <input type="submit" value="like"/>
        <br><br>
        </form>
    </g:each>
</ol>

<form action="/" method="GET">
    <input type="submit" value="Back to home page"/>
    <br><br>
</form>
</body>
</html>