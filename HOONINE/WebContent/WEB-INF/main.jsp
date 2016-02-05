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
	<%
		User user = (User) session.getAttribute("user");
	%>
	<center>
		<table border="0" cellpadding="0" cellspacing="0" width="1197px"
			align="center">
			<tr>
				<td colspan="3" height="20px"></td>
			</tr>
			<tr>
				<td colspan="3" height="20px" align="right">					

<%					if (user == null) {										 							%> 				

					<!-- 회원가입 -->
 					<a href="userJoinForm.do"><font color="#565656" size="1">회원가입</font></a>&nbsp;&nbsp; 

					<!-- 로그인 -->
					<a href="userLoginForm.do"><font color="#565656" size="1">로그인</font></a>&nbsp;&nbsp;					 																								

<%					} else {																					%>						 
 
 					<!-- 회원정보 : 회원정보 수정이 가능해야함 -->
 					<a href="userDetail.do?userId=${user.userId }"><font color="#565656" size="1">회원정보</font></a>&nbsp;&nbsp;
  					
  					<!-- 장바구니 : 장바구니에 현재 담겨있는 물품목록을 DB에서 받아옴 -->
  					<!-- 장바구니 : 장바구니에 현재 담겨있는 목록의 수정, 삭제, 결제 -->
  					<a href="cartList.do?userId=${user.userId }"><font color="#565656" size="1">장바구니</font></a>&nbsp;&nbsp;
 					
 					<!-- session invalidate -->
 					<a href="userLogout.do"><font color="#565656" size="1">로그아웃</font></a>&nbsp;&nbsp;						
<%					}																							%>
 					
</td>
			</tr>
			<tr height="100px">
				<td width="25%" align="center"><a href="main.do"><img
						src="img/logo.png" width="180px" height="100px"></a></td>
				<td width="50%" align="center"><input type="text" name="search"
					size="50"></td>
				<td width="25%" align="center">이벤트가 들어갈 자리입니다.</td>
			</tr>
			<tr>
				<td colspan="3" height="20px"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><jsp:include page="category.jsp" /></td>
			</tr>
			
			<!-- session에 바인딩 되어있는 secondMenuName을 받아옴. secondMenu를 결정함 -->
			<tr>
				<td colspan="3" align="center"><jsp:include page="${secondMenuName}" /></td>
			</tr>



			<%
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