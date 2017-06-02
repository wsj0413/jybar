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
    <div class="alert alert-info">当前位置<b class="tip"></b>后台管理<b class="tip"></b>用户管理</div>
    <table class="tbform">
        <thead>
            <tr>
                <td colspan="6" class="auto-style2">&nbsp;请填写查询条件 </td>
            </tr>
        </thead>
        <tbody>

            <tr>
                <td class="tdl">用户名</td>
                <td class="detail">
                    <input name="user_account" type="text" class="ipt" />
                </td>
                <td class="tdl">用户昵称</td>
                <td class="td_detail">
                    <input name="user_nickname" type="text"  class="ipt"/></td>
                <td class="tdl">用户类型 </td>
                <td>
                    <select name="user_type" class="ipt">
                   		<option value="-1">请选择</option>
                        <option value="0">后台用户</option>
                        <option value="1">前台用户</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="tdl">注册时间起 </td>
                <td>
                    <div class="input-append">
                        <input name="user_startDate" class="ipt datepicker" size="16" type="text" /> 
                        <span class="add-on"><i class="icon-calendar"></i></span>至  
                        <input name="user_endDate" class="ipt  datepicker" size="16" type="text" /><span class="add-on"><i class="icon-calendar"></i></span>
                    </div>
                </td>
                <td class="tdl">手机号 </td>
                <td class="detail">
                    <input name="user_phone" type="text" class="ipt" />
                </td>
                <td class="tdl">email</td>
                <td class="td_detail">
                    <input name="user_email" type="text"  class="ipt"/></td>
            </tr>
            <tr>
                <td colspan="6" align="right">
                    <input class="btn" id="find" type="button" value="查询" />
                    <input class="btn" type="button" value="清空" />
                    <input class="btn" id="add" type="button" value="添加" />
                    <input class="btn" id="update" type="button" value="修改" />
                    <input class="btn" id="delete" type="button" value="删除" /></td>
            </tr>
        </tbody>
    </table>
    <table class="tb" id="list">
         <tbody>
             <tr>
                <th><input type="checkbox" id="checkAll"  /></th>
                <th>用户名</th>
                <th>用户昵称</th>
                <th>手机 </th>
                <th>邮箱 </th>
                <th>用户类型 </th>
                <th>用户状态 </th>
                <th>最后登录时间 </th>
                <th>创建时间 </th>
                <th>修改时间 </th>
            </tr>
            <c:forEach var="user" items="${userList}" varStatus="status">
            	 <tr>
	                <td><input type="checkbox" name="checkbo" value="${user.userTid}" /></td>
	                <td>${user.userAccount}</td>
	                <td>${user.userNickname} </td>
	                <td>${user.userPhone} </td>
	                <td>${user.userEmail}</td>
	                <td>
						<c:if test="${user.userType==0}">后台</c:if>
						<c:if test="${user.userType==1}">前台</c:if>
					</td>
	                <td>
						<c:if test="${user.userStatus==0}">正常</c:if>
						<c:if test="${user.userStatus==1}">未激活</c:if>
						<c:if test="${user.userStatus==2}">冻结</c:if>
					</td>
	                <td><fmt:formatDate value="${user.userLastlogindate}" type="both"/></td>
	                <td><fmt:formatDate value="${user.userCreatedate}" type="both"/> </td>
	                <td><fmt:formatDate value="${user.userUpdatedate}" type="both"/> </td>
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
  			 window.location.href="${ctx}/manage/user/update.do?userId="+dataIdItem[0];
  		   }
           
	   });
       
       $('#delete').click(function (){
    	   dataIdItem=[];
           $('input[name="checkbo"]:checked').each(function(){    
    			 dataIdItem.push($(this).val());    
    	   });
           if(dataIdItem.length==0){
  			 alert("请选择需要操作的数据");
  			 return;
  		 }else{
  			 window.location.href="${ctx}/manage/user/delete.do?userId="+dataIdItem;
		   }
	   });
       
       $('#find').click(function () {
          // $('#list').show();
       });
       $('#add').click(function () {
           window.location.href="${ctx}/manage/user/add.do";
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
</script>	
</html>