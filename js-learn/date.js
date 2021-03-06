var now = new Date();
	now; // Wed Jun 24 2015 19:49:22 GMT+0800 (CST)
	now.getFullYear(); // 2015, 年份
	now.getMonth(); // 5, 月份，注意月份范围是0~11，5表示六月
	now.getDate(); // 24, 表示24号
	now.getDay(); // 3, 表示星期三
	now.getHours(); // 19, 24小时制
	now.getMinutes(); // 49, 分钟
	now.getSeconds(); // 22, 秒
	now.getMilliseconds(); // 875, 毫秒数
	now.getTime(); // 1435146562875, 以number形式表示的时间戳
	//当前时间是浏览器从本机操作系统获取的时间，所以不一定准确，因为用户可以把当前时间设定为任何值。
	
	var d = new Date(2015, 5, 19, 20, 15, 30, 123);
	d; // Fri Jun 19 2015 20:15:30 GMT+0800 (CST)
	//JavaScript的月份范围用整数表示是0~11
	var d = Date.parse('2015-06-24T19:49:22.875+08:00');
	d; // 1435146562875
	
	var d = new Date(1435146562875);
	d; // Wed Jun 24 2015 19:49:22 GMT+0800 (CST)
	d.toLocaleString(); // '2015/6/24 下午7:49:22'，本地时间（北京时区+8:00），显示的字符串与操作系统设定的格式有关
	d.toUTCString(); // 'Wed, 24 Jun 2015 11:49:22 GMT'，UTC时间，与本地时间相差8小时
	
	
	//获取当前时间戳，可以用：

	if (Date.now) {
		alert(Date.now()); // 老版本IE没有now()方法
	} else {
		alert(new Date().getTime());
	}