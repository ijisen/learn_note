gulp���Զ��������ߡ�������Ҫ�����ظ�����������ѹ����minification�������롢��Ԫ���ԡ�linting�ȣ�
	   �� gulpfile �ļ���ȷ���ú����������������ͻ��Զ���������С����ɴ󲿷����ĵĹ�����
	   gulp�� gulp�����ͨ�� npm ��װ������ģ�npm�� Node.js �İ��������� gulp ���� Node.js 
	
ʹ�ò��裺 
1����װ 
	npm i -g gulp
2����װ Grunt  ������Ŀ�а�װgulp  ����node ��װexpress�Ȳ����
	npm i gulp -save-dev
3����װ����Ҫ��grunt���
	�ϲ��ļ���gulp-concat
	ѹ��Js�ļ���gulp-uglify
	���Js���룺 gulp-jshint��gulp-jslint��
	ѹ��CSS�ļ���gulp-minify-css  (�Ѿ��� gulp-clean-css ����)
	�������ļ���gulp-rename
	htmlѹ�� : gulp-htmlmin
	ɾ���ļ���del
	ͼƬѹ�� �� gulp-imagemin
	ͼƬѹ�� ��gulp-cache  //ѹ��ͼƬ���ܻ�ռ�ýϳ�ʱ�䣬ʹ�� gulp-cache ������Լ����ظ�ѹ����
	������Զ�ˢ�� �� browser-sync  //�ļ��Ķ���������Զ�ˢ��
	�ļ���md5 :gulp-md5-plus //���汾��ʱ��Ϊ�˱����������ȡ�˾ɵĻ����ļ�����ҪΪ�����md5����
	npm i --save-dev  gulp-minify-css gulp-uglify gulp-concat gulp-rename gulp-jshint del 
4������gulpfile.js���﷨
	Node�е�ͨ���
		*.scss �� * ��ƥ�䵱ǰĿ¼�����ļ����������� *.scss ƥ�䵱ǰĿ¼������scss�ļ�
		**/*.scss ��ƥ�䵱ǰĿ¼������Ŀ¼�µ�����scss�ļ���
		!not-me.scss �������Ƴ�ƥ����ļ������ｫ�Ƴ�not-me.scss
		*.+(scss|sass) ��+�ź�������Բ���ţ������Ԫ����|�ָƥ����ѡ����ｫƥ��scss��sass�ļ���
	gulp �йص���Ҫ��������룺�������á�������ء����������
	
	
	Ŀ¼�ṹ˵����
	config �� ���������ļ�
	src �� ����Ŀ¼
		/css
			/components  ���  header.css ��footer.css....
			common.css  //@import "components/header"; @import "components/footer";
		/js
			/components ��� common.js  index.js
			index.js
		/images ���ǰ��������������
	dist��public�� //�����Ͽ��Էַ���������ļ�
		/js
		/css
		/images 
	libs(static) : ���ǰ�������������⣬����Ҫ����� ��jquery �� bootstrap.css��

	ʹ���ĵã�
		��ÿ��ҳ�涼��ʹ�õ��Ĳ�����ϲ�Ϊһ���ļ�
				eg �� bootstrap.js�� jquery.js�� vue.js  == frame.js
				eg :  bootstrap.css flut.css   == frame.css
		��ĳһҳ��Ż�ʹ�õĴ���ֱ�Ӻϲ�����Ӧҳ����ļ�
		   eg�� jquery.form.js(����֤) common.js  post.js  ==  post.js
		   �����ϲ����ܼ�������������־����ܵı�֤���ټ��ز���Ҫ���ļ�
	
		
	
	
	