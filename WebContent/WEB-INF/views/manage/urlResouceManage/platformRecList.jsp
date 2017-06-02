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
    <div class="alert alert-info">当前位置<b class="tip"></b>导航资源管理<b class="tip"></b>推荐平台管理</div>
    <form id="fm" action="${ctx}/manage/platRec/list.do?currPage=1" method="post">
	    <table class="tbform">
	        <thead>
	            <tr>
	                <td colspan="6" class="auto-style2">&nbsp;请填写查询条件 </td>
	            </tr>
	        </thead>
	        <tbody>
	
	            <tr>
	                <td class="tdl">资源名称</td>
	                <td class="detail">
	                    <input name="urlname" type="text" value="${url.urlname}" class="ipt" />
	                </td>
	                <td class="tdl">资源url</td>
	                <td class="td_detail">
	                    <input name="url" type="text"  class="ipt" value="${url.url}"/></td>
	            </tr>
	            <tr>
	                <td class="tdl">创建时间起 </td>
	                <td>
	                    <div class="input-append">
	                        <input name="startDate" class="ipt datepicker" size="16" type="text" value="${startDate}" /> 
	                        <span class="add-on"><i class="icon-calendar"></i></span>至  
	                        <input name="endDate" class="ipt  datepicker" size="16" type="text" value="${endDate}" /><span class="add-on"><i class="icon-calendar"></i></span>
	                    </div>
	                </td>
	                <td class="tdl">状态 </td>
	                <td>
	                     <select name="urlstatus" id="urlstatus" class="ipt">
	                   		<option value="-1">请选择</option>
	                        <option value="0">显示</option>
	                        <option value="1">不显示</option>
	                    </select>
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
                <th>资源名</th>
                <th>资源url</th>
                <th>状态 </th>
                <th>顺序</th>
                <th>资源权重</th>
                <th>创建时间 </th>
                <th>修改时间 </th>
            </tr>
            <c:forEach var="url" items="${urlList}" varStatus="status">
            	 <tr>
	                <td><input type="checkbox" name="checkbo" value="${url.tid}" /></td>
	                <td>${url.urlname}</td>
	                <td>${url.url} </td>
	                <td>
						<c:if test="${url.urlstatus==0}">显示</c:if>
						<c:if test="${url.urlstatus==1}">不显示</c:if>
					</td>
					<td>${url.urlorder} </td>
					<td>${url.sortweight} </td>
	                <td><fmt:formatDate value="${url.createdate}" type="both"/> </td>
	                <td><fmt:formatDate value="${url.updatedate}" type="both"/> </td>
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
	  var urlstatus="${url.urlstatus}";
	  if(urlstatus!=null && ""!=urlstatus){
		  $('#urlstatus').val(urlstatus);
	  }
	  
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
  			 window.location.href="${ctx}/manage/platRec/update.do?tid="+dataIdItem[0];
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
         		 			   url: "${ctx}/manage/platRec/delete.do?tid="+dataIdItem,
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
           window.location.href="${ctx}/manage/platRec/add.do";
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
	fm.attr("action", "${ctx}/manage/platRec/list.do?currPage="+curr);
	$("#fm").submit();
}
</script>	
</html>