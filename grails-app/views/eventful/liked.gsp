<%--
  Created by IntelliJ IDEA.
  User: paulk4ever
  Date: 5/4/17
  Time: 11:31 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<g:each in="${events}" var="it" status="i">
    <form action="/delete" method="get">
        <input type="hidden" name="title" value= ${it.title.replace(" ","%20")}/>
        <input type="hidden" name="venue" value= ${it.venue.replace(" ","%20")}/>
        <input type="hidden" name="SeID" value=  ${it.seID.replace("/"," ")}/>
        <STRONG>${i+1}: EVENT:</STRONG> ${it.title}<br><STRONG>VENUE:</STRONG> ${it.venue}
        <br>
        <input type="submit" value="delete"/>
        <br><br>
    </form>
</g:each>
<form action="/" method="GET">
    <input type="submit" value="Back to home page"/>
    <br><br>
</form>
%{--<h1>${params.title}</h1>--}%
</body>
</html>