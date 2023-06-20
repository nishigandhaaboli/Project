<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>User Form</h1>
<form action="saveUser" method="post">
<label>Name</label><br><br>
<input type="text" name="name"/><br><br>
<label>Address</label><br><br>
<input type="text" name="address"/><br><br>
<label>Contact Information</label><br><br>
<input type="text" name="phNumber"/><br><br>
<input type="submit" value="ADD USER"/>
</form>
</div>
</body>
</html>