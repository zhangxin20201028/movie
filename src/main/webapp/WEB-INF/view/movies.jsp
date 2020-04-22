<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" href="/css/index3.css">
</head>
<body>
<form action="selects" method="post">
	影片名称<input type="text" name="name"><br>
	 导演<input type="text" name="actor"><br>
	电影年代<input type="text" name="years"><br>
	上映时间<input type="text" name="t1">至<input type="text" name="t2"><br>
	价格<input type="text" name="p1">至<input type="text" name="p2"><br>
	电影时长<input type="text" name="l1">至<input type="text" name="l2"> 
	<input type="submit" value="查询">
	<table>
		<tr>
			<td>电影名称</td>
			<td>导演</td>
			<td>
				<input type="button" class="btn btn-link" onclick="myOrder('price')" value="票价">
			</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
		</tr>
		<c:forEach items="${info.list}" var="s">
			<tr>
				<td>${s.name}</td>
				<td>${s.actor}</td>
				<td>${s.price}
				</td>
				<td>${s.uptime}</td>
				<td>${s.longtime}</td>
				<td>${s.type}</td>
				<td>${s.years}</td>
				<td>${s.area}</td>
				<td>${s.status}</td>
			</tr>
		</c:forEach>
		<tr> 
        <td colspan="10"> 
        	<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include> 
        </td>
       </tr>
	</table>
	</form>
</body>
<script type="text/javascript">

function goPage(pageNum) {
	location.href="/selects?pageNum="+pageNum;
}


function myOrder(orderName) {
	var orderMethod='${vo.orderMethod}';
	orderMethod=orderMethod=='desc'?'asc':'desc';
	location.href="/selects?orderName="+orderName+"&orderMethod="+orderMethod;
}
</script>
</html>