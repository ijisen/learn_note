Git is a version control system.
Git is free software.

安装完成后，需要设置，在命令行输入：
git config --global user.name "Your Name"
git config --global user.email "email@example.com"

init
	git init  //进入项目目录，把这个目录变成Git可以管理的仓库
add 【添加文件至缓存区】
	git add <file>   // git add 1.txt 2.txt  添加文件到暂存区
	git add *.txt  // git add 1.txt 2.txt  添加文件到暂存区
	git add -A/--all  // 添加目录下所有文件到暂存区
commit 【将暂存区内容添加到本地仓库中 => 版本库或本地仓库】
	git commit -m "message"   // 提交文件到Git仓库， -m "修改说明"  命令1
	git commit -a/--all -m "message"   // 提交所有文件到Git仓库， -m "修改说明" 命令2
	git commit readme.txt -m "message"   // 提交指定文件到Git仓库" 命令3
	ps： 目录文件已经加入到git仓库时，当修改文件用命令2、命令3时，不需要再用add命令
	ps： 当修改文件用命令1时，需要先用add命令才能从暂存区提交到当前分支
status
	git status //当前仓库的状态，是否有未提交的任务
	git status readme.txt //查看指定文件状态
	
diff
	尚未缓存的改动：git diff
	查看已缓存的改动： git diff --cached
	查看已缓存的与未缓存的所有改动：git diff HEAD
	显示摘要而非整个 diff：git diff --stat
	git diff readme.txt //显示暂存区和工作区的差异:
	// 显示暂存区和上一次提交(commit)的差异:
	git diff --cached [file]
	// 或
	git diff --staged [file]
	// 显示两次提交之间的差异:
	git diff [first-branch]...[second-branch]
log
	git log  //查看所有文件修改日志
	git log readme.txt //查看指定文件修改日志
	git log --pretty=oneline readme.txt //输出内容不换行
	
reset
	git reset --hard HEAD^    //回到上一个版本（window下： HEAD"^"）
	git reset --hard HEAD^^   //回到上上一个版本
	git reset --hard HEAD~100 //回到第一百个版本
	git reset --hard ID       //回到某一指定ID版本
	git reset HEAD 1.txt  //清除暂存区的内容
	
reflog
	git reflog //记录每一次操作命令
	
branch 分支管理
   // 查看远程分支
   git branch -a
   // 删除远程分支
   git branch -r -d origin/branch-name
   // 如果远程新建了一个分支，本地没有该分支。
   // 这时本地会新建一个分支叫 branch_name ，会自动跟踪远程的同名分支 branch_name。
   git checkout --track origin/branch_name
   // 关联本地分支与远程分支
   git branch --set-upstream-to=origin/<远程分支名> 本地分支名
   // eg: git branch --set-upstream-to=origin/dev locale-dev
   // 查看分支关联关系
    git checkout dev  || git status
checkout	
	git checkout -- 1.txt //撤销修改(文本已修改，但还没add/commit到GIT库中)
	
	git reset HEAD 1.txt  //当文本已经提交到暂存区时，需先清除暂存区，再执行git checkout -- 1.txt 撤销修改
	ps：
		场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。
		
		场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD file，
			   就回到了场景1，第二步按场景1操作。
		
		场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节(git reset --hard HEAD^)，不过前提是没有推送到远程库。
rm
	git rm 1.txt //删除文件，同时也会删除工作区的文件，删除暂存区
	git commit 1.txt -m "del 1.txt"  提交到当前分支中
	ps：
		场景1：当误删了工作区某个文件，想还原时，用命令git checkout -- file。
		
		场景2：当误删了工作区某个文件，还添加到了暂存区时，想还原时，分两步，第一步用命令git reset HEAD file，
			   就回到了场景1，第二步按场景1操作。
		
		场景3：已经提交到版本库时，想要撤销本次提交，参考版本回退一节(git reset --hard HEAD^)，需注意：可能丢失最近一次提交后修改的内容。

tag
	git tag  //产看所有标签
	
	git tag v1.0 //给当前commit版本打一个新标签
	
	git tag v0.9 ID //给历史提交的commit id 打标签
	
	git show v0.9 //查看标签信息
	
	git tag -a v0.9 -m "version 0.1 released" ID //-a指定标签名，-m指定说明文字
	
	git tag -d v0.9 //删除指定标签
	
	git push origin :refs/tags/v0.9  //删除远程标签(需要先删除本地的标签)
	
	git push origin v0.9 //推送某个标签到远程
	
	git push origin --tags //推送全部尚未推送到远程的本地标签
remote		
		git remote //查看远程库的信息
		git remote -v  //显示更详细的信息
		//origin  git@github.com:michaelliao/learngit.git (fetch)
		//origin  git@github.com:michaelliao/learngit.git (push)
		//上面显示了可以抓取和推送的origin的地址。如果没有推送权限，就看不到push的地址。
		git remote show <主机名> //查看远程改主机的详细详细
		
		git remote add <主机名> <网址>  //添加远程主机
		
		git remote rm  <主机名>  //删除远程主机
		
		
		git remote rm  <原机名> <新机名>  //修改远程主机名称
		
push
	git push <远程主机名> <本地分支名>:<远程分支名>
	git push origin master
	
pull
    //取回远程分支与本地分支合并
	git pull <远程主机名> <远程分支>:<本地分支>
	    // 将远程主机 origin 的 master 分支拉取过来，与本地的 brantest 分支合并。
		git pull origin master:brantest
		// 如果远程分支是与当前分支合并，则冒号后面的部分可以省略。
		git pull origin master
		git pull -o JQuery next:master
	git branch --set-upstream master origin/next //手动建立本地分支与远程分支追踪关系、
		//如果当前分支与远程分支存在追踪关系，git pull就可以省略远程分支名。
		git pull origin
		//如果当前分支只有一个追踪分支，连远程主机名都可以省略。
		git pull
		
	//refusing to merge unrelated histories
	git pull origin master --allow-unrelated-histories
	
	
clone 
	git clone https://github.com/ijisen/gitsclone.git  //将GitHub下的gitsclone克隆到 当前目录下
	
	克隆版本库的时候，使用的远程主机自动被Git命名为origin。如果想用其他的主机名，需要用git clone命令的-o选项指定。
	git clone -o jQuery https://github.com/jquery/jquery.git
merge
	git merge branchName  将branchName 与 当前工作分支任务合并
	
	git merge branchNameA/branchNameB  在当前分支上，将分支A/B合并（慎用）

	
	
远程仓库（origin）：
	1、 git-bash.exe 打开 ssh-keygen -t rsa -C "youremail@example.com"  //生成ssh公/私密匙
	/c/Users/jisen/.ssh/id_rsa.pub
		//id_rsa和id_rsa.pub两个文件，这两个是SSH Key的秘钥对，id_rsa是私钥，不能泄露，id_rsa.pub是公钥，可以告诉任何人。
		
	2、需要将id_rsa.pub的值在github里面配置SSH
	
	3、 查看当前电脑是否生成ssh
		ls -al ~/.ssh
		
	git remote add origin https://github.com/ijisen/gitslearn.git  //关联远程仓库地址（origin == 远程仓库）
	
	git remote set-url origin https://github.com/ijisen/weChat-Learn/ //修改远程仓库地址（origin == 远程仓库）
	
	git push -u origin master   // 传输文件至远程仓库  ( 参数 -u，Git不但会把本地的master分支内容推送到远程新的master分支，还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时可以简化命令。)
	

主/分支（master/branch）

	git checkout -b branchName  //创建一个新的分支，并切换至该分支
	
	git branch branchName  //创建分支
	
	git branch //查看分支
	
	git checkout branchName   //切换分支
	
	git merge branchName //合并某分支到当前分支， ps：分支任务修改完成后，需要提交任务到Git仓库中再切换到主线任务中进行合并
	
	git merge --no-ff -m "merge with no-ff" branchName 
	//ps: 加上--no-ff参数就可以用普通模式合并，合并后的历史有分支，能看出来曾经做过合并
	
	git branch -d branchName //删除分支
	
	ps：当合并文件产生冲突时，修改好后，提交必须 先add 再 commit  <git add file>  <git commit -m "git is 40 min">
	
	git log --graph --pretty=oneline --abbrev-commit //查看分支合并情况 --graph命令可以看到分支合并图
		
Bug分支（临时任务变更）
	//当接到一个修复一个代号001的bug任务时，但是当前正在dev上进行的工作还没有完成无法提交：
	
	1、  git stash //把当前分支“储藏”起来，等以后恢复现场后继续工作 （dev分支）
	
	2、  git checkout branchName //切换到需要修改BUG的分支上
	
	3、  git checkout -b issue-001 //在需要修改BUG的分支上创建一个分支issue-001并切换到issue-001分支上来修复BUG
	
	4、  git add readme.txt
	
		 git commit -m "fixed bug 101"//提交修复完的BUG
		
	5、  git checkout branchName //回到BUG的分支上
	
	6、  git merge --no-ff -m "merged bug fixed 001" issue-001 //合并BUG分支
	
	7、  git branch -d issue-001 //删除issue-001分支
	
	8、  git stash list 	//查看"储存"的分支任务
	
	9、  git checkout branchName 	//切换至之前工作的分支场景
	
	10、 git stash apply //回溯"储存"的分支任务
	
		 git stash drop	//删除"储存"的分支
		 
		 git stash pop	//回溯并删除"储存"的分支任务多人
	
	10、 git branch -m oldBranchName newBranchName // 修改分支名称
多人任务：

	推送分支
		git push origin master
		git push origin dev
	   	分支分类：
		  master分支是主分支，因此要时刻与远程同步；
		  
		  dev分支是开发分支，团队所有成员都需要在上面工作，所以也需要与远程同步；

		  bug分支只用于在本地修复bug，就没必要推到远程了，除非老板要看看你每周到底修复了几个bug；

		  feature分支是否推到远程，取决于你是否和你的小伙伴合作在上面开发。
	抓取分支
		
	
	多人协作的工作模式通常是这样：

	  1、 首先，可以试图用git push origin branch-name推送自己的修改；

	  2、 如果推送失败，则因为远程分支比你的本地更新，需要先用git pull试图合并；

	  3、 如果合并有冲突，则解决冲突，并在本地提交；

	  4、 没有冲突或者解决掉冲突后，再用git push origin branch-name推送就能成功！

	  5、 如果git pull提示“no tracking information”，则说明本地分支和远程分支的链接关系没有创建，用命令 git branch --set-upstream branch-name origin/<branch-name> 

gitignore
	  git check-ignore  //检查gitignore文件规则是否有误
	  
config
	  git config --global alias.co checkout   //命令简化配置   git co == git checkout
	  git config --global alias.st status  
	  git config --global alias.ci commit  
	  git config --global alias.br branch  
	  git config --global alias.last 'log -1' //git log -1 == git last显示最近一次的提交
	  git config --global alias.lg "log --color --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"
	  git config branch.<分支名>.description "description" 添加分支描述信息
	  git config branch.<分支名>.description 查看分支描述信息
	  
SUMMARY:
	001、 在开发过程中，注意分支场景，切换分支场景前，要用commit/stash保存任务，避免分支任务错乱
	
	002、 在项目增加新功能时，新建分支任务进行增加，再合并；这样可以避免新功能停止使用时，及时回溯到之前的版本
	
错误处理：
	eg1： error setting certificate verify locations
		git config --system http.sslcainfo "C:\Program Files (x86)\git\bin\curl-ca-bundle.crt"
	或
		git config --system http.sslverify false
	eg2： error failed to push some refs to 'https://github.com/ijisen/react_learn'
		git pull --rebase origin master
	eg3： 个人访问令牌
		创建后， 运行cmd 输入 control 点击windows凭据删除你的git凭据即	
删除本地文件后，想从远程仓库中从新Pull最新版文件。：
	git reset --hard
	git pull
强行pull并覆盖本地文件
	git fetch --all  
	git reset --hard origin/master 
	git pull
submodule:
	git submodule init
	git submodule update

	 // 更新到最新的主分支（例如）： 
	git submodule foreach git pull origin master
	// 强制更新到最新代码
	git submodule update --init --recursive --force
	// 提取所有最新提交
	git pull --recurse-submodules
	
配置用户信息
	// 查看用户名
    git config --global user.name
	// 删除用户名
    git config --global --unset user.name
	// 查看配置邮箱
    git config --global user.email
	// 删除配置邮箱 【user.password】
    git config --global --unset user.email
