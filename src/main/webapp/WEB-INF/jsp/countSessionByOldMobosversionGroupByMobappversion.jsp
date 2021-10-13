<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Count Session By Old Mobosversion Group By Mobappversion</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h2>Count Session By Old Mobosversion Group By Mobappversion</h2>
<div>
    <table border="1">
        <tr class="cell-1">
            <th>Session_count</th>
            <th>mobappversion</th>
            <th>mobosversion</th>
        </tr>
        <c:forEach items="${resultSet}" var="resultSet">
        <tr>
            <td align="center">${resultSet.count}</td>
            <td align="center">${resultSet.mobAppVersion}</td>
            <td align="center">${resultSet.mobOsVersion}</td>
            </c:forEach>
    </table>
    </table>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>