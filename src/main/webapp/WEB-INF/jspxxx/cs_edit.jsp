<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>国际辛德瑞拉婚纱礼服定制有限公司</title>
		<!-- Bootstrap -->
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="css/back_edit.css">
	</head>

	<body>
		<div class="container">
			<div id="wel_and_login">
				<span id="welcome">管理员您好，祝您工作愉快！</span>
				<a id="logout" href="#">退出登录</a>
			</div>
			<div id="public_logo">
				<img class="img-responsive" src="img/public_log.png">
			</div>
			<div class="split_line"></div>

			<h3>
				添加/修改客服信息
				<a href="/list#cs_table">返回</a>
			</h3>
			<form action="/cs_save?id=${cs.csId}" method="post">
				<table>
					<tr>
						<td>
							<label>
								编号：
							</label>
						</td>
						<td>
							<input type="text" name="cs_id" value="${cs.csId}" disabled
								placeholder="添加数据（编号自增长）">
						</td>
					</tr>
					<tr>
						<td>
							<label>
								姓名：
							</label>
						</td>
						<td>
							<input type="text" name="cs_name" value="${cs.csName }">
						</td>
					</tr>
					<tr>
						<td>
							<label>
								性别：
							</label>
						</td>
						<td>
							<select style="width:258px;height:30px"  name="cs_gender" id="sel">
								<option value="男"  selected>男</option>
								<option value="女">女</option>
							</select>
						</td>
					</tr>

					<tr>
						<td>
							<label>
								年龄：
							</label>
						</td>
						<td>
							<input type="number" name="cs_age" value="${cs.csAge }">
						</td>
					</tr>
					<tr>
						<td>
							<label>
								昵称：
							</label>
						</td>
						<td>
							<input type="text" name="nickname" value="${cs.nickname}">
						</td>
					</tr>
					<tr>
						<td>
							<label>
								联系方式：
							</label>
						</td>

						<td>
							<input type="text" name="cs_phone" value="${cs.csPhone}">
						</td>
					</tr>
				</table>
				<input type="submit" value="提交" id="smt">
			</form>
		</div>
		<% 
	String sex = request.getParameter("cs_gender");
	%>
	<script>
		if(sex.equals("男"){
			document.getElementById("sel")[0].selected=true;
		}else{
			document.getElementById("sel")[1].selected=true;
		}
	</script>
	</body>
</html>
