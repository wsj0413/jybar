<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>交友吧管理平台</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/base.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/manage/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <script src="${ctx}/static/js/jquery-1.7.1.js"></script>
	<script type="text/javascript" src="${ctx}/static/js/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="${ctx}/static/js/manage/index.js"></script>
</head>
<body>
    <div class="warp">
        <!--头部开始-->
        <div class="top_c">
            <div class="top-menu">
                <ul class="top-menu-nav">
                    <li><a href="#">首页</a></li>
                    <li><a href="#">查询界面<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <li><a target="Conframe" href="Template/find-form.html">表单样式</a></li>
                            <li><a target="Conframe" href="Template/find-alert.html">弹出窗口</a></li>
                            <li><a target="Conframe" href="Template/find-order.html">查询排序</a></li>
                            <li><a target="Conframe" href="Template/find-1.html">查询结果一</a></li>
                            <li><a target="Conframe" href="Template/find-2.html">查询结果二</a></li>
                        </ul>
                    </li>
                    <li><a href="#">维护界面<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <li><b class="tip"></b><a target="Conframe" href="Template/Maintain-add.html">增加</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/Maintain-edit.html">修改</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/Maintain-del.html">删除</a></li>
                        </ul>
                    </li>
                    <li><a href="#">表单风格<i class="tip-up"></i></a>
                        <ul class="kidc">
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-Master-slave.html">主从表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-collapse.html">折叠表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-tabs.html">标签式表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-tree.html">树+表单</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-guide.html">向导</a></li>
                            <li><b class="tip"></b><a target="Conframe" href="Template/form-tabs-list.html">标签页+列表</a></li>
                        </ul>
                    </li>
                    <li><a href="#">提示<i class="tip-up"></i></a>
                        <ul class="kidc">
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">权限提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">出错提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">警告提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">询问提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框一</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框二</a></li>
                    </ul>
                    </li>
                    <li><a href="#">辅助信息<i class="tip-up"></i></a>
                        <ul class="kidc">
                        <li><b class="tip"></b><a target="Conframe" href="Template/order.html">采购订单</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">数据说明</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">操作记录</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">提示</a></li>
                    </ul>
                    </li>
                </ul>
            </div>
            <div class="top-nav">上午好，欢迎您，${manage_user.userAccount} ！&nbsp;&nbsp;<a href="#">修改密码</a> | <a href="#">安全退出</a></div>
        </div>
        <!--头部结束-->
        <!--左边菜单开始-->
        <div class="left_c left">
            <h1>系统操作菜单</h1>
            <div class="acc">
                <div>
                    <a class="one">后台管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/user/list.do?currPage=1">用户管理</a></li>
                    </ul>
                </div>
                 <div>
                    <a class="one">内容管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/content/list.do?currPage=1">文章管理</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">导航资源管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/url/list.do?currPage=1&&startDate=&&endDate=">交友导航管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/platRec/list.do?currPage=1&&startDate=&&endDate=">推荐平台管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/hotUrl/list.do?currPage=1&&startDate=&&endDate=">热门导航管理</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/friendLink/list.do?currPage=1&&startDate=&&endDate=">友情链接管理</a></li>
                    </ul>
                </div>
                
                <div>
                    <a class="one">配置管理</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="${ctx}/manage/contentConfig/list.do?currPage=1">内容配置管理</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">提示</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">权限提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">出错提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">警告提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">询问提示</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框一</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/Alert.html">对话框二</a></li>
                    </ul>
                </div>
                <div>
                    <a class="one">辅助信息</a>
                    <ul class="kid">
                        <li><b class="tip"></b><a target="Conframe" href="Template/order.html">采购订单</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">数据说明</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">操作记录</a></li>
                        <li><b class="tip"></b><a target="Conframe" href="Template/formstyle.html">提示</a></li>
                    </ul>
                </div>
                <div id="datepicker"></div>
            </div>

        </div>
        <!--左边菜单结束-->
        <!--右边框架开始-->
        <div class="right_c">
            <div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>

        </div>
        <div class="Conframe">
            <iframe name="Conframe" id="Conframe"></iframe>
        </div>
        <!--右边框架结束-->

        <!--底部开始-->
        <div class="bottom_c">Copyright &copy;2014-2020 达伦科技有限公司 版权所有</div>
        <!--底部结束-->
    </div>
</body>
	
</html>