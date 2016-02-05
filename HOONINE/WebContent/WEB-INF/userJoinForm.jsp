<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="userJoin.do" method="post">
	ID <input type="text" name="userId">
	Pass <input type="text" name="userPass">
	Name <input type="text" name="userName">
	Add <input type="text" name="userAdd">
	Phone <input type="text" name="userPhone">
	<input type="submit" value="가입">
</form>
	<button onclick="location.href='userIdCheck2.do?userId=${userId}'">아이디 확인</button>
${userIdCheck }
</body>
</html>