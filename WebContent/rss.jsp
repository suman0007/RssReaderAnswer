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
<div class="jumbotron">
    <h1>BBC News</h1>
    <p>
This is an RSS feed from the BBC News - Home website. RSS feeds allow you to stay up to date with the latest news and features you want from BBC News - Home.
To subscribe to it, you will need a News Reader or other similar device. If you would like to use this feed to display BBC News - Home content on your site, please go here.</p> 
 </div>
<c:forEach items="${urls}" var="url">
    <div class="row">
    <div class="col-sm-12">
    	<a href="${url.getGuid()}">${url.getTitle()}</a>
    </div>
    <div class="col-sm-5" style="bg-color:blue">
    ${url.getDescription()}
    </div>
    </div>
</c:forEach>
</body>
</html>