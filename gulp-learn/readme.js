gulp：自动化管理工具。对于需要反复重复的任务，例如压缩（minification）、编译、单元测试、linting等，
	   在 gulpfile 文件正确配置好任务，任务运行器就会自动帮你或你的小组完成大部分无聊的工作。
	   gulp和 gulp插件是通过 npm 安装并管理的，npm是 Node.js 的包管理器。 gulp 依赖 Node.js 
	
使用步骤： 
1、安装 
	npm i -g gulp
2、安装 Grunt  （在项目中安装gulp  类似node 安装express等插件）
	npm i gulp -save-dev
3、安装所需要的grunt插件
	合并文件：gulp-concat
	压缩Js文件：gulp-uglify
	检测Js代码： gulp-jshint（gulp-jslint）
	压缩CSS文件：gulp-minify-css  (已经被 gulp-clean-css 代替)
	重命名文件：gulp-rename
	html压缩 : gulp-htmlmin
	删除文件：del
	图片压缩 ： gulp-imagemin
	图片压缩 ：gulp-cache  //压缩图片可能会占用较长时间，使用 gulp-cache 插件可以减少重复压缩。
	浏览器自动刷新 ： browser-sync  //文件改动，浏览器自动刷新
	文件加md5 :gulp-md5-plus //发版本的时候为了避免浏览器读取了旧的缓存文件，需要为其添加md5戳。
	npm i --save-dev  gulp-minify-css gulp-uglify gulp-concat gulp-rename gulp-jshint del 
4、配置gulpfile.js的语法
	Node中的通配符
		*.scss ： * 号匹配当前目录任意文件，所以这里 *.scss 匹配当前目录下所有scss文件
		**/*.scss ：匹配当前目录及其子目录下的所有scss文件。
		!not-me.scss ：！号移除匹配的文件，这里将移除not-me.scss
		*.+(scss|sass) ：+号后面会跟着圆括号，里面的元素用|分割，匹配多个选项。这里将匹配scss和sass文件。
	gulp 有关的主要有三块代码：任务配置、插件加载、任务输出。
	
	
	目录结构说明：
	config ： 工程配置文件
	src ： 开发目录
		/css
			/components  组件  header.css 、footer.css....
			common.css  //@import "components/header"; @import "components/footer";
		/js
			/components 组件 common.js  index.js
			index.js
		/images 存放前端所需第三方类库
	dist（public） //打包完毕可以分发／部署的文件
		/js
		/css
		/images 
	libs(static) : 存放前端所需第三方类库，不需要打包的 如jquery 、 bootstrap.css；

	使用心得：
		将每个页面都会使用到的插件都合并为一个文件
				eg ： bootstrap.js、 jquery.js、 vue.js  == frame.js
				eg :  bootstrap.css flut.css   == frame.css
		将某一页面才会使用的大插件直接合并到对应页面的文件
		   eg： jquery.form.js(表单验证) common.js  post.js  ==  post.js
		   这样合并技能减少请求次数，又尽可能的保证了少加载不必要的文件
	
		
	
	
	