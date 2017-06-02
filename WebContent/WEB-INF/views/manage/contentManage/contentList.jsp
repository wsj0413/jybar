<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>交友吧管理平台</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/base.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/formui.css"/>
   <script type="text/javascript" src="${ctx}/static/js/jquery-1.7.1.js"></script>
	<script type="text/javascript" src="${ctx}/static/js/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="${ctx}/static/js/manage/tb.js"></script>
     <script type="text/javascript" src="${ctx}/static/js/manage/ChurAlert.min.js?skin=blue"></script>
    <script type="text/javascript" src="${ctx}/static/js/manage/chur-alert.1.0.js"></script>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/chur.css" />
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>内容管理<b class="tip"></b>文章管理</div>
    <form id="fm" action="${ctx}/manage/content/list.do?currPage=1" method="post">
	    <table class="tbform">
	        <thead>
	            <tr>
	                <td colspan="6" class="auto-style2">&nbsp;请填写查询条件 </td>
	            </tr>
	        </thead>
	        <tbody>
	
	            <tr>
	                <td class="tdl">标题</td>
	                <td class="detail">
	                    <input name="atitle" type="text" value="${art.atitle}" class="ipt" />
	                </td>
	                <td class="tdl">来源</td>
	                <td class="td_detail">
	                    <input name="asource" type="text"  class="ipt" value="${art.asource}"/></td>
	                <td class="tdl">编辑者 </td>
	            	  <td class="td_detail">
	                    <input name="aauthorname" type="text"  class="ipt" value="${art.aauthorname}"/></td>
	               
	            </tr>
	            <tr>
	                <td class="tdl">文章结构</td>
	                <td>
	                    <select name="astructure" id="astructure"  class="ipt">
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
	                 <td class="tdl">文章类型</td>
	                <td>
	                     <select name="atype" id="atype" class="ipt">
	                   		<option value="-1">请选择</option>
	                    </select>
	                </td>
	                 <td class="tdl">标签</td>
	               <td class="td_detail">
	                    <input name="atag" type="text"  class="ipt" value="${art.atag}"/></td>
	            </tr>
	            <tr>
	            	<td class="tdl">是否显示首页</td>
	                <td>
	                     <select name="isindex" id="isindex" class="ipt">
	                   		<option value="-1">请选择</option>
	                        <option value="0">否</option>
	                        <option value="1">是</option>
	                    </select>
	                </td>
	            	<td class="tdl">创建时间起 </td>
	                <td>
	                    <div class="input-append">
	                        <input name="startDate" class="ipt datepicker" size="16" type="text" value="${startDate}" /> 
	                        <span class="add-on"><i class="icon-calendar"></i></span>至  
	                        <input name="endDate" class="ipt  datepicker" size="16" type="text" value="${endDate}" /><span class="add-on"><i class="icon-calendar"></i></span>
	                    </div>
	                </td>
	            </tr>
	            <tr>
	                <td colspan="6" align="right">
	                    <input class="btn" id="find" type="submit" value="查询" />
	                    <input class="btn" id="add" type="button" value="添加" />
	                    <input class="btn" id="update" type="button" value="修改" />
	                    <input class="btn" id="delete" type="button" value="删除" /></td>
	            </tr>
	        </tbody>
	    </table>
    </form>
    <table class="tb" id="list">
         <tbody>
             <tr>
                <th><input type="checkbox" id="checkAll"  /></th>
                <th>标题</th>
                <th id="tblArtType">文章类型</th>
                <th>文章结构 </th>
                <th>来源</th>
                <th>浏览量</th>
                <th>真实浏览量</th>
                <th>状态</th>
                <th>编辑者昵称</th>
                <th>编辑者账号</th>
                <th>是否显示首页</th>
                <th>顺序</th>
                <th>创建时间 </th>
                <th>修改时间 </th>
            </tr>
            <c:forEach var="art" items="${artList}" varStatus="status">
            	 <tr>
	                <td><input type="checkbox" name="checkbo" value="${art.tid}" /></td>
	                <td>
	                	<c:set var="titleStr" value="${art.atitle}"  />
						<c:choose>  	
						<c:when test="${fn:length(titleStr) > 8}">  
						       <c:out value="${fn:substring(titleStr, 0, 8)}......" />  
						    </c:when>  
						   <c:otherwise>  
						      <c:out value="${titleStr}" />  
						    </c:otherwise>  
						</c:choose>
					</td>
	                <td>${art.atype}</td>
					<td>
						<c:if test="${art.astructure==1}">图文</c:if>
						<c:if test="${art.astructure==2}">纯图</c:if>
					</td>
					<td>${art.asource}</td>
					<td>${art.ashowcount}</td>
	                <td>${art.atrueshowcount}</td>
					<td>
						<c:if test="${art.astatus==1}">显示</c:if>
						<c:if test="${art.astatus==2}">审核</c:if>
						<c:if test="${art.astatus==3}">已删除</c:if>
					</td>
					<td>${art.aauthorname}</td>
					<td>${art.aauthor}</td>
					<td>
						<c:if test="${art.isindex==0}">不是</c:if>
						<c:if test="${art.isindex==1}">是</c:if>
					</td>
	                <td>${art.aorder}</td>
					<td><fmt:formatDate value="${art.createdate}" type="both"/></td>
					<td><fmt:formatDate value="${art.updatedate}" type="both"/></td>
            	</tr>
            </c:forEach>
        </tbody>
       <tr class="pager">
              ${pageInfo.pageHtml}
       </tr>
    </table>
</body>
<script type="text/javascript">
$(function () {
	   findArticleType();
       $(".datepicker").datepicker();
       $("#checkAll").change(function() {
           if (!$("#checkAll").attr("checked")) {
           	 $("#list :checkbox").attr("checked", false);  
           }else if($("#checkAll").attr("checked")){
           	 $("#list :checkbox").attr("checked", true);  
           }
       });
       
       $('#update').click(function (){
    	   dataIdItem=[];
           $('input[name="checkbo"]:checked').each(function(){    
    			 dataIdItem.push($(this).val());    
    	   });
           if(dataIdItem.length!=1){
        	   showMess("操作出错","请选择一条记录!");
  			 return;
  		   }else{
  			 window.location.href="${ctx}/manage/content/update.do?tid="+dataIdItem[0];
  		   }
           
	   });
       
       $('#delete').click(function (){
    	   dataIdItem=[];
           $('input[name="checkbo"]:checked').each(function(){    
    			 dataIdItem.push($(this).val());    
    	   });
           if(dataIdItem.length==0){
  			showMess("请选择需要操作的数据!");
  			 return;
	  		}else{
	  			$('body').alert({
                    type: 'info',
                    buttons: [{
                        id: 'yes',
                        name: '确定',
                        callback: function () {
                        	$.ajax({
         		 			   type: "post",
         		 			   url: "${ctx}/manage/content/delete.do?tid="+dataIdItem,
         		 			   success: function(data){
         		 				   if(data.resultCode==0){
         		 					 jump(1);
         		 				   }else{
         		 					  showMess(data.errMsg);
         		 				   }
         		 			   }
         		 		}); 
                        }
                    }, {
                        id: 'no',
                        name: '取消'

                    }]
                });
			}
	   });
       
      
       $('#add').click(function () {
           window.location.href="${ctx}/manage/content/add.do";
        });
       
       if(null!="${errMsg}" && "${errMsg}"!=""){
			  showMess("${errMsg}");
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
function showMess(title,mess){
	  $('body').alert({
	 		title: title,
	 		content:mess
	     });
}

function jump(curr){
	var fm=$("#fm");
	fm.attr("action", "${ctx}/manage/content/list.do?currPage="+curr);
	$("#fm").submit();
}
</script>	
</html>