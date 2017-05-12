<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    %{--<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />--}%
</head>
<body>
<form action="/getEvents" method="get">
    Search Event type/name/category etc...:
    <input type="text" name="Event">
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
