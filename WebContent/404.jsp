<%@page contentType="text/html; charset=UTF-8" isErrorPage="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path;
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小米</title>
<link href="<%=basePath %>/static/css/register/index.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath %>/static/css/register/manfind.css" rel="stylesheet" type="text/css"/>


  <script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?c64922fe907004774c797344b7063851";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>

</head>
<body>
<div class="top">
	<div class="logo">
    
        <a href="<%=basePath %>/login.do"><img src="<%=basePath %>/static/images/mclogo.png" alt="小米logo" /></a>        
      
	</div>
</div>

<div class="suc_content suc_limit">
  <div class="suc_kuang">
    <div class="hei_444">
	  <p class="retrieve_pwd">404</p>
      <div class="email_tip">找不到资源界面</div>
	  <div class="goback"><a href="<%=basePath %>/index.do">返回首页</a></div>
    </div>
	<div class="suc_botm"></div>
  </div>
</div>
<div class="footer" style="width:auto;">
  
    <div class="faq_link"><a href="http://static.account.xiaomi.com/html/faq/faqList.html" target="_blank"><em></em>常见问题</a></div>
  
  <ul class="links">
    <li><a href="http://www.xiaomi.com/" target="_blank">小米手机</a></li>
    <li><a href="http://www.miui.com/" target="_blank">MIUI</a></li>
    <li><a href="http://www.miliao.com/" target="_blank">米聊</a></li>
    <li><a href="http://bbs.xiaomi.com/" target="_blank" class="hide-with-en">小米论坛</a></li>
    <li class="copyright"><span>小米公司版权所有-京ICP备10046444-京公网安备1101080212535</span></li>
  </ul>
</div>

</body>
</html>