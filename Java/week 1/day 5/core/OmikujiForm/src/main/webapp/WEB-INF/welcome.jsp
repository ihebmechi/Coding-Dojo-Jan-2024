<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<div class="container mt-3">
<p>In <c:out value="${ number }"/> years you will live in <c:out value="${ city }"/> with <c:out value="${ person }"/> as your roommate, <c:out value="${ hobby }"/> for living The next time you will see a <c:out value="${ live }"/> you will have good luck also <c:out value="${ good }"/></p>
</div>
</body>
</html>