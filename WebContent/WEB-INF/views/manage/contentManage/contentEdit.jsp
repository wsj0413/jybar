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
    <script type="text/javascript" src="${ctx}/static/js/manage/kindeditor-min.js"></script>
	<script type="text/javascript" src="${ctx}/static/js/manage/zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="${ctx}/static/js/manage/themes/default/default.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/chur.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/ui-lightness/jquery-ui-1.8.22.custom.css" />
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>内容管理<b class="tip"></b>文章管理</div>
	<form id="fm" action="${ctx}/manage/content/editArt.do" method="post" onsubmit="return checkForm();">
	    <table class="table table-striped table-bordered table-condensed list">
	        <thead>
	            <tr>
	                <td colspan="4"><b>文章信息</b></td>
	            </tr>
	        </thead>
	        <tbody>
	            <tr>
	                <td width="15%">标题<font color="FF0000">*</font></td>
	                <td width="15%">
                		<input name="atitle" id="atitle" value="${art.atitle}" type="text" />
	                    <input name="tid" id="tid" value="${art.tid}" type="hidden" />
	                    <input name="focusType" id="focusType" value="" type="hidden" />
	                    <input name="addType" id="addType" value="" type="hidden" />
	                    
	                </td>
	                <td width="15%">文章类型<font color="FF0000">*</font></td>
	                <td width="15%">
	                     <select name="atype" id="atype">
	                   		<option value="-1">请选择</option>
	                    </select>
	                </td>
	                <td width="15%">文章结构<font color="FF0000">*</font></td>
	                <td width="15%">
	                     <select name="astructure" id="astructure">
	                     	 <c:choose>
									<c:when test="${art.astructure==1 }">
										 <option selected="selected" value="1" >图文 </option>
										 <option value="2">纯图</option>
									</c:when>
									<c:when test="${art.astructure==2 }">
										<option value="2" selected="selected">纯图</option>
										 <option value="1" >图文</option>
									</c:when>
									<c:otherwise>
									    <option value="-1">请选择</option>
				                        <option value="1">图文</option>
				                        <option value="2">纯图</option>
									</c:otherwise>
								</c:choose>
	                    </select>
	                </td>
	            </tr>
	            <tr>
	                <td>来源</td>
	                <td>
	                    <input name="asource" id="asource" type="text" value="${art.asource}"  /></td>
	                <td>浏览量</td>
	                <td>
	                    <input name="ashowcount" id="ashowcount" type="text" value="${art.ashowcount}" /></td>
                    <td>真实浏览量</td>
	                <td>
	                    <input name="atrueshowcount" id="atrueshowcount" readonly="readonly"  type="text" value="${art.atrueshowcount}" /></td>
	            </tr>
	            <tr>
	                <td>文章图片</td>
	                <td>
	                   <input id="addPicButton" type="button" value="点击添加" onclick="showPicManage('content','one');"/>
	                   <input id="aimage" name="aimage" type="hidden" value="${art.aimage}" />
	                   <div id="picSiteone" >
								
						</div>	
					</td>
	                <td>是否显示首页</td>
	                <td>
	                     <select name="isindex" id="isindex">
	                     	<c:choose>
									<c:when test="${art.isindex==0 }">
										 <option selected="selected" value="0" >否</option>
										 <option value="1">是</option>
									</c:when>
									<c:when test="${art.isindex==1 }">
										<option value="1" selected="selected">是</option>
										 <option value="0" >否</option>
									</c:when>
									<c:otherwise>
	                       				<option value="0" selected="selected">否</option>
	                       				<option value="1">是</option>
									</c:otherwise>
								</c:choose>
	                    </select>
	                 </td>
                    <td>排序</td>
	                <td>
	                    <input name="aorder" id="aorder"  type="text" value="${art.aorder}" /></td>
	            </tr>
	            <tr>
	            	<td >内容</td>
	            	<td  colspan="5">
	            		<textarea rows="10" cols="40" name="acontent" id="acontent" style="overflow-x:hidden"></textarea>
	            	</td>
	            </tr>
	            <tr>
	            	<td >标签</td>
	            	<td  colspan="5">
	            		 <input name="atag" id="atag"  type="text" style="width:600px;" value="${art.atag}" />请以英文","隔开
	            	</td>
	            </tr>
	        </tbody>
	        <tfoot>
	            <tr>
	                <td colspan="5">
	                    <input class="btn btn-inverse" id="save" type="button" value="保存" />
	                    <input class="btn btn-inverse" type="button" id="cancle" value="取消" /></td>
	            </tr>
	        </tfoot>
	        
	    </table>
	</form>
</body>
 <script type="text/javascript">
 var editor;
$(function () {
		  findArticleType();
		  
		 
		 
		  $('#save').click(function () {
	         $("#fm").submit();
	      });
		  
		  $('#cancle').click(function () {
	          window.location.href="${ctx}/manage/content/list.do?currPage=1";
	      });
		  
		  
		  if(null!="${errMsg}" && "${errMsg}"!=""){
			  showMess("${errMsg}");
		  }
		  
		  //初始化富文本框
			editor = KindEditor.create('textarea[name="acontent"]', {
				newlineTag : "br",
				resizeType : 2,
				width : "100%", //编辑器的宽度为70%
				height : "300px", //编辑器的高度为100px
				allowImageUpload : true
			});
			
		  
			 var tid="${art.tid}";
			  if(tid!=null && ""!=tid){
				  var atype="${art.atype}";
				  $('#atype').val(atype);
				  
				  editor.insertHtml("${art.acontent}");
				  var aimag="${art.aimage}";
				   if(aimag==null || aimag==""){
					   $("#picSiteone").append("<img height='125px' src='${ctx}/static/images/nopic.jpg' />");
				   }else{
					   $("#picSiteone").append("<img height='125px' src='${ctx}/writeImage?imageTid=${art.aimage}' />");
				   }
				  
			  }
			
});

function findArticleType(){
	  $.ajax({
		   type: "post",
		   url: "${ctx}/manage/contentConfig/findConfig.do?paraName=ARTICLE_TYPE",
		   success: function(data){
			   if(data.resultCode==0){
				   var configLis=data.configLis;
				  if(configLis.length>0){
					  for(var i=0;i<configLis.length;i++){
						  if("${art.atype}"!=configLis[i].parakey){
							  jQuery("#atype").append("<option value='"+configLis[i].parakey+"'>"+configLis[i].paravalue+"</option>"); 
						  }else{
							  jQuery("#atype").append("<option value='"+configLis[i].parakey+"' selected>"+configLis[i].paravalue+"</option>"); 
						  }
						 
					  }
				  }
			   }else{
				  showMess(data.errMsg);
			   }
		   }
	  });
}


function showPicManage(addType,focusType){
	$("#addType").val(addType);
	$("#focusType").val(focusType);
	editor.loadPlugin('multiimage', function() {
		editor.plugin.multiImageDialog({
			clickFn : function(urlList) {
				var div = KindEditor('#picSite'+focusType);
				div.html('');
				KindEditor.each(urlList, function(i, data) {
					if(data.resultCode==0){
						$("#aimage").val(data.tid);
						div.append("<img height='125px' src='${ctx}/writeImage?imageTid="+data.tid+"' />");
					}else{
						showMess(data.errMsg);
					}
				});
				editor.hideDialog();
			}
		});
	});

}

function showMess(mess){
	  $('body').alert({
	 		title: "操作错误",
	 		content:mess
	     });
}
function checkForm(){
	  if($("#atitle").val()=="" || $("#atype").val()=="-1" || $("#astructure").val()=="-1"){
		  showMess("带*号的信息必须填写!");
		  return false;
	  }
	  $("#acontent").val(editor.html());
}


</script>
</html>