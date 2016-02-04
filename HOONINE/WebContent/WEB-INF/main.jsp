<%@page import="hooni.user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="0" cellpadding="0" cellspacing="0" width="1197px"
			align="center">
			<tr>
				<td colspan="3" height="20px"></td>
			</tr>
			<tr height="100px">
				<td width="25%"  align="center"><a href="main.do"><img src="img/logo.png"
						width="180px" height="100px"></a></td>
				<td width="50%" align="center"><input type = "text" name = "search" size="50"></td>
				<td width="25%" align="center">이벤트가 들어갈 자리입니다.</td>
			</tr>
			<tr>
				<td colspan="3" height="20px"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><jsp:include page="category.jsp" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><jsp:include page="${pageName }" /></td>
			</tr>

			<%
				User user = (User) session.getAttribute("user");
				if (user != null) {
					if (user.getUserId().equals("ADMIN")) {
			%>


			<tr>
				<td colspan="3"><button onclick="location.insertItem.do">상품등록</button></td>
			</tr>

			<%
				}
				}
			%>

		</table>
	</center>
</body>
</html>