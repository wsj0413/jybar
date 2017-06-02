
$(function(){
	
	$.each($("input"),function(){
		var obj = $(this);
		obj.mouseover(function(){
			obj.addClass('onFocus');
		}).mouseout(
			function(){
				obj.removeClass('onFocus');
			});
	});	
	var checkObj = $("#checkImage");
	checkObj.mouseover(function(){
		checkObj.addClass('onFocus');
	}).mouseout(function(){checkObj.removeClass('onFocus');});
});

function hideLoginBezel(){
	$("#loginBezel").toggle();
	$("#pointerOpen").toggle();
}

function checkLogin(){
	var account = $("#account").val();
	if(account==""){
		$("#errMsg").text("账号不能为空");
		$("#account").focus();
		return false;
	}
	if(account.length<5 || account.length>20){
		$("#errMsg").text("账号长度必须在5~20之间");
		$("#account").focus();
		return false;
	}
	var pwd = $("#pwd").val();
	if(pwd==""){
		$("#errMsg").text("密码不能为空");
		$("#pwd").focus();
		return false;
	}
	if(pwd.length<5 || pwd.length>20){
		$("#errMsg").text("密码长度必须在5~20之间");
		$("#pwd").focus();
		return false;
	}
	var checkNum = $("#checkNum").val();
	if(checkNum==""){
		$("#errMsg").text("验证码不能为空");
		$("#checkNum").focus();
		return false;
	}
	return true;
	
	
}
	
function toLogin(obj){
	location.href="index.html";
}