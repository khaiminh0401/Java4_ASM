<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./commons/import.jsp"%>
<link rel="shortcut icon" href="https://media.istockphoto.com/id/1280464957/vector/cpo-letter-for-your-best-business-symbol.jpg?s=612x612&w=0&k=20&c=3UJtNY4MrHwZK4ekSD6jrbrXzGhjNommKpHwAK0MSh4=" type="image/x-icon">
<title>Zuhot store</title>
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
		<jsp:include page="./page/${page}.jsp"></jsp:include>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>