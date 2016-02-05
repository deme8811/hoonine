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
	<h2 style="color:#424242">신규 상품 등록</h2>
	
	<form action="goodsInsert.do" method="post" enctype="multipart/form-data">
	<br>
	<br>
	<table width="1100px" border="0" cellpadding="0" cellspacing="0">
	
		<tr height="30px">
			<td align="center">　</td>
			<td>　</td>
			<td>　</td>
			<td>　</td>
		</tr>
		
		<tr height="30px">
			<td align="center" rowspan="6" width="400px"> 썸네일 자리 </td>
			<td width="100px">　</td>
			<td width="200px">상품명</td>
			<td width="400px"><input type = "text" name = "gName"></td>
		</tr>
	
		<tr height="30px">
			
			<td>　</td>
			<td>판매가</td>
			<td><input type = "text" name = "gPrice"></td>
		</tr>
	
		<tr height="30px">
			
			<td>　</td>
			<td>상품코드</td>
			<td><input type = "text" name = "gId"></td>
		</tr>
		
		<tr height="30px">
			
			<td>　</td>
			<td>상품 개수</td>
			<td><input type = "text" name = "gCount"></td>
		</tr>
	
		<tr height="30px">
			
			<td>　</td>
			<td>색상</td>
			<td><input type = "text" name = "gColor"></td>
		</tr>
		
		<tr height="30px">
			
			<td>　</td>
			<td>사이즈</td>
			<td><input type = "text" name = "gSize"></td>
		</tr>
	
	
		<tr>
			<td width="1100px"><textarea cols="1100px" rows = "50px" name = gContent></textarea></td>
		</tr>
				
		<tr height="30px">
			<td colspan = "4" align="right">
			<input type = "submit" value = "목록으로">
			<input type = "reset" value = "다시쓰기"> 
			<input type = "submit" value = "등록하기"></td>
		</tr>
	</table>
	

	</form>

</center>

</body>
</html>