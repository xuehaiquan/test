<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath();%>
<%=path %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/datagrid.js"></script>
	</head>
	<script type="text/javascript">
		var path="<%=path%>";
	</script>
	<body>
		<h2>Aligning Columns in DataGrid</h2>
		<p>Use align and halign properties to set the alignment of the columns and their header.</p>
		<div style="margin:20px 0;"></div>
		
		<table id="data-grid" title="Aligning Columns in DataGrid" style="width:700px;height:250px">
		</table>
		<div id="data"></div>
	</body>
</html>