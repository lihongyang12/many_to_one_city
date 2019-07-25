<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/resources/inc/inc.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加</title>
</head>
<body>
	<form action="add" method="post">
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<td>
					城市名称：<input type = "text" name="sname">
				</td>
			</tr>
			
			<tr>
				<td>
					省份名称：<select name = "sheng.id">
								<option>请选择</option>
								<c:forEach items="${slist}" var="s">
									<option value="${s.id}">${s.name }</option>
								</c:forEach>
							</select>
				</td>
			</tr>
			
			<tr>
				<td>
					<input type = "submit" value="提交">
					<input type = "reset" value="重置">
					
				</td>
			</tr>
		</table>
	</form>
</body>
</html>