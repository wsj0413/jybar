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
    <div class="alert alert-info">当前位置<b class="tip"></b>配置管理<b class="tip"></b>内容配置管理</div>
	<form id="fm" action="${ctx}/manage/contentConfig/editConfig.do" method="post" onsubmit="return checkForm();">
	    <table class="table table-striped table-bordered table-condensed list">
	        <thead>
	            <tr>
	                <td colspan="4"><b>配置基本信息</b></td>
	            </tr>
	        </thead>
	        <tbody>
	            <tr>
	                <td width="15%">配置名称<font color="FF0000">*</font></td>
	                <td width="500">
	                	<c:if test="${empty config.tid}">
	                		 <input name="paraname" id="paraname" type="text" />
	                	</c:if>
	                	<c:if test="${!empty config.tid}">
	                		 <input name="paraname" id="paraname"  readonly="readonly" value="${config.paraname}"  type="text"  />
	                	</c:if>
	                    <input name="tid" id="tid" value="${config.tid}" type="hidden" />
	                </td>
	                <td width="500">配置Key</td>
	                <td width="500">
	                    <input name="parakey" id="parakey" value="${config.parakey}"  type="text" /></td>
	            </tr>
	            <tr>
	                <td>配置Value</td>
	                <td>
	                    <input name="paravalue" id="paravalue" type="text" value="${config.paravalue}"  /></td>
	                <td>配置内容</td>
	                 <td>
	                    <input name="content" id="content" type="text" value="${config.content}" /></td>
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
	          window.location.href="${ctx}/manage/contentConfig/list.do?currPage=1";
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
	  if($("#paraname").val()==""){
		  showMess("带*号的信息必须填写!");
		  return false;
	  }
}
</script>
</html>