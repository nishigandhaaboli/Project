<%@page import="com.soft.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE USER</title>
</head>
<body>
<div>
<H1>Update User Here..</H1>
<div>
<%User existingUser = (User) request.getAttribute("ExistingUser"); %>
<div id="formDiv">
<form action="updateExistingUser" method="post">
<label>Id</label><br>
<input type="text" name="id" value="<%=existingUser.getId() %>" readonly="readonly"><br><br>
<label>Name</label><br>
<input type="text" name="name" value="<%=existingUser.getName() %>"><br><br>
<label>Address</label><br>
<input type="text" name="address" value="<%=existingUser.getAddress()%>"><br><br>
<label>Phone No</label><br>
<input type="text" name="phNumber" value="<%=existingUser.getPhNumber() %>"><br><br>
<div id="lDiv">
<input type="submit" value="Submit">
</div>
</form>
</div>
</div>

</div>
</body>
</html>