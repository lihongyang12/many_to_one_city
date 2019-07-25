<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/resources/inc/inc.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表</title>
<script type="text/javascript">
	function toadd(){
		
		location="toadd";
	}
	
	function del(sid){
		location="del?sid="+sid;
	}
	
	function toupdate(sid){
		location="toupdate?sid="+sid;
	}
</script>
</head>
<body>
	<table class="table table-bordered table-hover table-stripe table-condensed">
		<tr>
			<td>城市编号</td>
			<td>城市名称</td>
			<td>省份编号</td>
			<td>省份名称</td>
			<td>
				<button class="btn btn-primary btn-link" onclick="toadd()">添加</button>
			</td>
		</tr>
	
		<c:forEach items="${clist}" var="c">
			<tr>
				<td>${c.sid }</td>
				<td>${c.sname }</td>
				<td>${c.sheng.id }</td>
				<td>${c.sheng.name }</td>
				<td>
					<button type="button" class="btn btn-danger btn-lg" onclick="del('${c.sid}')">删除</button>
					<button type="button" class="btn btn-danger btn-lg" onclick="toupdate('${c.sid}')">修改</button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>