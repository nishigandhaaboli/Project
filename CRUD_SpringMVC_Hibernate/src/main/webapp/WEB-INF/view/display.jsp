<%@page import="com.soft.entity.User"%>
<%@page import="java.util.List"%>
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

	<h1>User List</h1>

		<div>
			<button ><a href="userForm">Add Product</a></button>
		</div>
	<div>
		<table>
			<tr>
				<th>UserId</th>
				<th>UserName</th>
				<th>UserAddress</th>
				<th>UserPhNo</th>
				<th>Options</th>
			</tr>
			<% List<User> list = (List<User>) request.getAttribute("UserList");%>
			<%for(User user: list) { %>
			<tr>
				<td><%=user.getId() %></td>
				<td><%=user.getName() %></td>
				<td><%=user.getAddress() %></td>
				<td><%=user.getPhNumber() %></td>
				<td><a href="deleteById?Id=<%=user.getId() %>"><button>DELETE</button></a></td>
				<td><a href="updateById?Id=<%=user.getId() %>"><button>UPDATE</button></a></td>
				
			</tr><%} %>
		</table>
	</div>

</div>
</body>
</html>