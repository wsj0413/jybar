<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${ctx}/static/images/manage/favicon.ico" rel="shortcut icon"/>
<link href="${ctx}/static/css/manage/login.css" rel="stylesheet" type="text/css"  />
<link href="${ctx}/static/css/manage/share.css" rel="stylesheet" type="text/css"  />

<title>交友吧管理平台</title>
</head>
<body id="loginBody">

	<div id="pointerOpen" onclick="hideLoginBezel()">开启登录</div>
	<div id="loginBezel">
		<!-- <div id="loginChildTop" onclick="hideLoginBezel()" title="点击将隐藏登录小窗口">　CMS管理平台</div> -->
		<div id="loginChildTop">
			<img src="${ctx}/static/images/manage/logo-right.png" width="57" height="50"
				align="absbottom" /> 交友吧管理平台
		</div>
		<div id="loginChildBottom">
		<form action="${ctx}/manage/login/checkLogin.do" method="post" onsubmit="return checkLogin();">
				<table cellpadding="0" cellspacing="0" width="100%" height="95%"
					border="0">
					<tr>
						<td align="right" width="35%">账 号：</td>
						<td align="left" width="65%"><input type="text" name="account" id="account"
							class="inputUP" value="${account}" /></td>
					</tr>
					<tr>
						<td align="right">密 码：</td>
						<td align="left"><input type="password" id="pwd"
							name="pwd" class="inputUP" /></td>
					</tr>
					<tr>
						<td align="right">验证码：</td>
						<td align="left"><input type="text" id="checkNum" name="checkNum" />&nbsp;<span
							id="checkNumResult"><img onclick="changeCheckNum();" src="${ctx}/GetCheckNumServlet?temp=<%=new Date().getTime()%>"
								id="checkImage" align="absbottom" alt="验证码" title="点击更换验证码" /><font id="errMsg" style="font-size: 12px;" color="red">${errMsg}</font></span></td>
					</tr>
					<tr>
						<td align="center" colspan="2"><input type="submit"
							id="toLogin" value="登　录" /></td>
					</tr>
				</table>
			</form> 
		</div>
	</div>
	
</body>
	<script src="${ctx}/static/js/jquery-1.7.1.js"></script>
	<script src="${ctx}/static/js/manage/login.js"></script>
	
	<script type="text/javascript">
		function changeCheckNum(){
			$("#checkImage").attr("src","${ctx}/GetCheckNumServlet?temp=<%=new Date().getTime()%>");
		}
	</script>
</html>