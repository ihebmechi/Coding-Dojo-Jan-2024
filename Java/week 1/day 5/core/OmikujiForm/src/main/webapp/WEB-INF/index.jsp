<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>Login</h3>
		<form action="/login" method="POST">
			<label>Pick any number form 5 to 25 :</label> 
			<br>
			<input type="number" name="number" id="number"> 
			<br>
			<label>Enter the name of any city :</label> 
			<br>
			<input type="text" name="city" id="city">>
			<br>
			<label>Enter the name of any real person :</label> 
			<br>
			<input type="text" name="person" id="person">
			<br>
			<label>Enter professional endeavor or hobby :</label> 
			<br>
			<input type="text" name="hobby" id="hobby">
			<br>
			<label>Enter any type of living things</label> 
			<br>
			<input type="text" name="live" id="live">
			<br>
			<label>Say something nice to someone</label> 
			<br>
			<input type="text" name="good" id="good">
			<br>
			<input type="submit" value="Send">
		</form>
	</div>
</body>
</html>