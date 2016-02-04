<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
body {font-family: '맑은 고딕'}
</style>
<body>
	<center>
	<h2>상품 등록하기</h2>
	
	<form action="goodsInsert.do" method="post" enctype="multipart/form-data">
	
	<table>
		<tr>
			<td width="70">상품　번호</td>
			<td width="300"> <input type = "text" name = "gId"></td>
		</tr>
		<tr>
			<td>상　품　명</td>
			<td> <input type = "text" name = "gName"></td>
		</tr>
		<tr>
			<td>가　　　격</td>
			<td> <input type = "text" name = "gPrice"></td>
		</tr>
		<tr>
			<td>상품　개수</td>
			<td> <input type = "text" name = "gCount"></td>
		</tr>
		<tr>
			<td valign ="top">사진　첨부</td>
			<td> <input type = "file" name = "imgFile"></td>
		</tr>
		<tr>
			<td valign="top">제품　설명</td>
			<td></td>
		</tr>
		<tr>
			<td colspan="2"><textarea cols="70" rows = "20" name = gContent></textarea></td>
		</tr>
		<tr >
			<td colspan = "2" align="right"><input type = "reset" value = "초기화"> <input type = "submit" value = "Item 등록"></td>
		</tr>
	</table>
	

	</form>

</center>

</body>
</html>