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
    <div class="alert alert-info">当前位置<b class="tip"></b>配置管理<b class="tip"></b>内容配置管理</div>
    <form id="fm" action="${ctx}/manage/contentConfig/list.do?currPage=1" method="post">
	    <table class="tbform">
	        <thead>
	            <tr>
	                <td colspan="6" class="auto-style2">&nbsp;请填写查询条件 </td>
	            </tr>
	        </thead>
	        <tbody>
	
	            <tr>
	                <td class="tdl">配置名称</td>
	                <td class="detail">
	                    <input name="paraname" type="text" value="${config.paraname}" class="ipt" />
	                </td>
	                <td class="tdl">key</td>
	                <td class="td_detail">
	                    <input name="parakey" type="text"  class="ipt" value="${config.parakey}"/></td>
	            </tr>
	            <tr>
	                <td class="tdl">value </td>
	            	  <td class="td_detail">
	                    <input name="paravalue" type="text"  class="ipt" value="${config.paravalue}"/></td>
	                <td class="tdl">内容</td>
	            	  <td class="td_detail">
	                    <input name="content" type="text"  class="ipt" value="${config.content}"/></td>
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
                <th>配置名称</th>
                <th>配置key</th>
                <th>配置Value </th>
                <th>配置内容 </th>
            </tr>
            <c:forEach var="config" items="${configList}" varStatus="status">
            	 <tr>
	                <td><input type="checkbox" name="checkbo" value="${config.tid}" /></td>
	                <td>${config.paraname}</td>
	                <td>${config.parakey} </td>
					<td>${config.paravalue} </td>
					<td>${config.content} </td>
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
  			 window.location.href="${ctx}/manage/contentConfig/update.do?tid="+dataIdItem[0];
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
         		 			   url: "${ctx}/manage/contentConfig/delete.do?tid="+dataIdItem,
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
           window.location.href="${ctx}/manage/contentConfig/add.do";
        });
       
       if(null!="${errMsg}" && "${errMsg}"!=""){
			  showMess("${errMsg}");
	  }
       
});

function showMess(title,mess){
	  $('body').alert({
	 		title: title,
	 		content:mess
	     });
}

function jump(curr){
	var fm=$("#fm");
	fm.attr("action", "${ctx}/manage/contentConfig/list.do?currPage="+curr);
	$("#fm").submit();
}
</script>	
</html>