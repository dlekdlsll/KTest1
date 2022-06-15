<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	안녕 세계!
</h1>

<P>  서버의 시간은 ${serverTime}. </P>
<a href="/board/list">게시판 바로가기</a>
</body>
</html>
