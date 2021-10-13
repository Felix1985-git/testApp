<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Max UserId Active No Status (1)</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h2>Max UserId Active No Status (1)</h2>
<div>
    <table border="1">
        <tr>
            <th>MaxUserId</th>
        </tr>
        <tr>
            <td align="center">${maxActiveUserIdStatusNot1}</td>
        </tr>
    </table>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>