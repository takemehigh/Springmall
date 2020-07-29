/*
	@Author: 驊驊龔頾
	@Time: 2017-10
	@Tittle: bodyTab
	@Description: 点击对应按钮添加新窗口
*/
var tabFilter,menu=[],liIndex,curNav,delMenu;
    //changeRefreshStr = window.sessionStorage.getItem("changeRefresh");
layui.define(["element","jquery"],function(exports){
	var element = layui.element,
		$ = layui.$,
		layId,
		Top = function(){
			this.TopConfig = {
				 //最大可打开窗口数量
				  //添加窗口的filter
				url : undefined  //获取菜单json地址
			}
		};


	Top.prototype.set=function(option){
		var _this=this;
		$.extend(true, _this.TopConfig, option);
		return _this;
	}

	Top.prototype.render=function(data){
		var _this = this;
		$(".menudl").html(createTop(data));
		element.init();  //初始化页面元素
		// $(window).resize(function(){
		// 	$(".navBar").height($(window).height()-210);
		// })
	}
	Top.prototype.createTop=function(data){
		var _this = this;
		var data;
		if(typeof(strData) == "string"){
			var data = JSON.parse(strData); //部分用户解析出来的是字符串，转换一下
		}else{
			data = strData;
		}
		var ulHtml = '';
		for(var i=0;i<data.length;i++){
			var isThis='';
			if(i==0){
				isThis='class="layui-this"';
			}
			ulhtml+='<dd '+isThis+' data-menu="'+data[i].code+'"><a href="javascript:;"><i class="layui-icon" data-icon="'+data[i].icon+'">'+data[i].icon+'</i><cite>'+data[i].title+'</cite></a></dd>' ;
		}
		return ulHtml;
	}
	var topMenu = new Top();

	exports("topMenu",function(option){
		return topMenu.set(option);
	});
})
