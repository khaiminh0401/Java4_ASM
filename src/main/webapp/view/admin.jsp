<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./commons/import.jsp"%>
<link rel="shortcut icon"
	href="https://media.istockphoto.com/id/1280464957/vector/cpo-letter-for-your-best-business-symbol.jpg?s=612x612&w=0&k=20&c=3UJtNY4MrHwZK4ekSD6jrbrXzGhjNommKpHwAK0MSh4="
	type="image/x-icon">
<title>Zuhot store</title>
</head>
<body>
	<div class="row w-100">
		<c:choose>
			<c:when test="${page!='login'}">
				<jsp:include page="./navbar1.jsp"></jsp:include>
			</c:when>
		</c:choose>
		<jsp:include page="./admin/${page}.jsp"></jsp:include>
	</div>

</body>
</html>