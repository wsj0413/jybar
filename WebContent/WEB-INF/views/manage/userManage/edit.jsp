<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>交友吧管理平台</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/admin-all.css" />
    <script type="text/javascript" src="${ctx}/static/js/jquery-1.7.1.js"></script>
    <script type="text/javascript" src="${ctx}/static/js/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="${ctx}/static/js/manage/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="${ctx}/static/js/manage/chur-alert.1.0.js"></script>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/chur.css" />
     <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/ui-lightness/jquery-ui-1.8.22.custom.css" />
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>后台管理<b class="tip"></b>用户管理</div>
	<form id="fm" action="${ctx}/manage/user/updateUser.do" method="post" onsubmit="return checkForm();">
	    <table class="table table-striped table-bordered table-condensed list">
	        <thead>
	            <tr>
	                <td colspan="4"><b>用户基本信息</b></td>
	            </tr>
	        </thead>
	        <tbody>
	            <tr>
	                <td width="15%">用户名<font color="FF0000">*</font></td>
	                <td width="500">
	                	<c:if test="${empty userId}">
	                		 <input name="userAccount" id="userAccount"  type="text" />
	                	</c:if>
	                	<c:if test="${!empty userId}">
	                		<input name="userAccount" id="userAccount" readonly="readonly"  value="${updateUser.userAccount}" type="text" />
	                	</c:if>
	                    
	                    <input name="userId" id="userId" value="<c:if test="${empty userId}">0</c:if><c:if test="${!empty userId}">{userId}</c:if>" type="hidden" />
	                </td>
	                <td width="500">用户昵称<font color="FF0000">*</font></td>
	                <td width="500">
	                    <input name="userNickname" id="userNickname" value="${updateUser.userNickname}" type="text" /></td>
	            </tr>
	            <tr>
	                <td>密码<font color="FF0000">*</font></td>
	                <td>
	                    <input name="userPassword" id="userPassword" value="" type="password" /></td>
	                <td>确认密码<font color="FF0000">*</font></td>
	                <td>
	                    <input name="reuserPassword" id="reuserPassword" value="" type="password" /></td>
	            </tr>
	            <tr>
	                <td>手机</td>
	                <td>
	                    <input name="userPhone" id="userPhone" value="${updateUser.userPhone}" type="text" /></td>
	                <td>邮箱</td>
	                <td>
	                    <input name="userEmail" id="userEmail" value="${updateUser.userEmail}" type="text" /></td>
	            </tr>
	              <tr>
	                <td>类型<font color="FF0000">*</font></td>
	                <td>
	                    <select name="userType" id="userType">
	                 		   <c:choose>
									<c:when test="${updateUser.userType==0 }">
										 <option selected="selected" value="0" >后台用户 </option>
									</c:when>
									<c:otherwise>
										<option value="1">前台用户</option>
									</c:otherwise>
								</c:choose>
								<c:choose>
									<c:when test="${updateUser.userType==1 }">
										<option value="1" selected="selected">前台用户</option>
									</c:when>
									<c:otherwise>
										 <option value="0" >后台用户 </option>
									</c:otherwise>
								</c:choose>
	                    </select></td>
	                
	            </tr>
	        </tbody>
	        <tfoot>
	            <tr>
	                <td colspan="4">
	                    <input class="btn btn-inverse" id="save" type="button" value="保存" />
	                    <input class="btn btn-inverse" type="button" id="cancle" value="取消" /></td>
	            </tr>
	        </tfoot>
	        
	    </table>
	</form>
</body>
 <script type="text/javascript">
$(function () {

		 
  //  $('.modal').show();
		  $('#save').click(function () {
	         $("#fm").submit();
	      });
		  
		  $('#cancle').click(function () {
	          window.location.href="${ctx}/manage/user/list.do?currPage=1";
	      });
		  
		  
		  if(null!="${errMsg}" && "${errMsg}"!=""){
			  showMess("${errMsg}");
		  }
});
function showMess(mess){
	  $('body').alert({
	 		title: "操作错误",
	 		content:mess
	     });
}
function checkForm(){
	  if($("#userAccount").val()=="" || $("#userNickname").val()=="" ||$("#userPassword").val()=="" ||$("#reuserPassword").val()==""){
		  showMess("带*号的信息必须填写!");
		  return false;
	  }else if($("#userPassword").val()!=$("#reuserPassword").val()){
		  showMess("两次密码输入不一致!");
		  return false;
	  }
}
</script>
</html>