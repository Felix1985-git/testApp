<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>No Session Client Count</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h2>No Session Client Count</h2>
<div>
    <table border="1">
        <tr>
            <th>count</th>
        </tr>
            <tr>
                <td align="center">${noSessionClient}</td>
            </tr>
    </table>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>