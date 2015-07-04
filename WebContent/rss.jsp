<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>News Links</title>
</head>
<body>

<c:forEach items="${urls}" var="url">
    <div class="row">
    <div class="col-sm-4">
    	<a href="${url.getGuid()}">${url.getTitle()}</a>
    </div>
    </div>
</c:forEach>
</body>
</html>