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
    <div class="alert alert-info">当前位置<b class="tip"></b>导航资源管理<b class="tip"></b>推荐平台管理</div>
	<form id="fm" action="${ctx}/manage/platRec/editUrl.do" method="post" onsubmit="return checkForm();">
	    <table class="table table-striped table-bordered table-condensed list">
	        <thead>
	            <tr>
	                <td colspan="4"><b>导航资源基本信息</b></td>
	            </tr>
	        </thead>
	        <tbody>
	            <tr>
	                <td width="15%">资源名称<font color="FF0000">*</font></td>
	                <td width="500">
	                	<c:if test="${empty tid}">
	                		 <input name="urlname" id="urlname"  type="text" />
	                	</c:if>
	                	<c:if test="${!empty tid}">
	                		 <input name="urlname" id="urlname" readonly="readonly"  value="${url.urlname}" type="text" />
	                	</c:if>
	                    <input name="tid" id="tid" value="${tid}" type="hidden" />
	                </td>
	                <td width="500">资源url<font color="FF0000">*</font></td>
	                <td width="500">
	                    <input name="url" id="url" value="${url.url}" type="text" /></td>
	            </tr>
	            <tr>
	                <td>顺序</td>
	                <td>
	                    <input name="urlorder" id="urlorder" value="${url.urlorder}" type="text"  /></td>
	                <td>状态</td>
	                <td>
	                    <select name="urlstatus" id="urlstatus">
	                 		   <c:choose>
									<c:when test="${url.urlstatus==0 }">
										 <option selected="selected" value="0" >显示 </option>
										 <option value="1">不显示</option>
									</c:when>
									<c:when test="${url.urlstatus==1 }">
										<option value="1" selected="selected">不显示</option>
										 <option value="0" >显示</option>
									</c:when>
									<c:otherwise>
									    <option value="0" selected="selected">显示</option>
										<option value="1">不显示</option>
									</c:otherwise>
								</c:choose>
	                    </select></td>
	            </tr>
	              <tr>
	                    <td>资源权重</td>
	                	<td>
	                    <input name="sortweight" id="sortweight" value="${url.sortweight}" type="text"  /></td>
	                   
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
	          window.location.href="${ctx}/manage/platRec/list.do?currPage=1&&startDate=&&endDate=";
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
	  if($("#urlname").val()=="" || $("#url").val()=="" ||$("#urltype").val()==-1 ){
		  showMess("带*号的信息必须填写!");
		  return false;
	  }
}
</script>
</html>