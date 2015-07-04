<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>News Links</title>
<style>
.rightShift {
    padding-left:2%;
}
</style>
</head>
<body>
<div class="jumbotron" style="padding-top:1%">
    <img src="BBC-Logo.png" class="rightShift"/>
    <p class="rightShift">
This is an RSS feed from the BBC News - Home website. RSS feeds allow you to stay up to date with the latest news and features you want from BBC News - Home.
To subscribe to it, you will need a News Reader or other similar device. If you would like to use this feed to display BBC News - Home content on your site, please go here.</p> 
</div>

<div class="row rightShift"><div class="col-sm-7">
	<c:forEach items="${urls}" var="url">
	<div class="form-group">
	 <a href="${url.getGuid()}" style="font-size: 20px;">${url.getTitle()}</a>
    <div>
    ${url.getDescription()}
    </div></div>
	</c:forEach>
</div></div>
</body>
</html>