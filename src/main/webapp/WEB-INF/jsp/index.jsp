<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Welcome</h1>
<div>

    <form method="get" action="getNoSessionClient">
        <input type="submit" value="No Session Client Count"/>
    </form>
    <h1></h1>
    <form method="get" action="getUniqUserIdActive">
        <input type="submit" value="Uniq UserId Active List No Channel Type (1)"/>
    </form>
    <h1></h1>
    <form method="get" action="getMaxActiveUserIdStatusNot1">
        <input type="submit" value="Max UserId Active No Status (1)"/>
    </form>


</div>

</body>

</html>