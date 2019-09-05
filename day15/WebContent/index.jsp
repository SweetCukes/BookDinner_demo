<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
	<a href=" <c:url  value='cn.itcast.OneServlet' />">go</a>
	<a href="${pageContext.request.contextPath}/Ocn.itcast.OneServletneServlet">go</a>
</body>
</html>