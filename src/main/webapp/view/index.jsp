<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./commons/import.jsp"%>
<title>Zuhot store</title>
</head>
<body>
	<jsp:include page="./navbar.jsp"></jsp:include>
		<jsp:include page="./page${page}.jsp"></jsp:include>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>