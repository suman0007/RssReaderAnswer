<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>News Links</title>
</head>
<body>

<c:forEach items="${urls}" var="url">
    <tr>
    	<a href="${url.getGuid()}">${url.getTitle()}</a>
    	<% out.print("\n"); %>
    </tr>
</c:forEach>
</body>
</html>