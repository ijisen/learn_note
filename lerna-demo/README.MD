#### 使用技巧 monorepo
-- 依赖安装技巧
* 对于 devDependencies 依赖，建议尽量装在根目录下
    `yarn add <some-dev-dependency> -W -D`
* 对于 dependencies ，在各个 package 中自行维护：
   `yarn workspaces <some-package> add <some-dependency>`
   
   
```
#### yarn的workspace的常用命令
 1、安装所有工作区依赖
 // yarn install # 等价于 lerna bootstrap --npm-client yarn --use-workspaces
 yarn install
 
 2、根工作区安装依赖，在monorepo模式中，根工作区一般只有开发依赖，如测试、开发服务等
 yarn add <pkg_name> -W -D（-W 表示将依赖添加到 workspaces 根目录）
 # 安装完成后，在根目录下的package.json中的devDependencies中，可以看到安装的依赖
 # 但是在其他的package.json中的devDependencies中看不到安装的依赖的，但是可以使用
 
 3、所有工作区安装共同的依赖
 yarn workspace add <pkg_name> 没有这个命令，报错yarn workspace v1.22.19  error Unknown workspace "add".
 
 4、给指定工作区安装指定的依赖
 yarn workspace <workspace_name> add <pkg_name>
 // 將 packageA 作為 packageB 的依賴進行安裝
 yarn workspace [packageB的package.json中的name] add [packageA的package.json中的name]@版本号 
 yarn workspace @qwd/broswer add @qwd/core@1.0.0 
 
 
 5、类似的，删除依赖如下
 yarn <add|remove> <pkg_name> -W -D
 // -W: --ignore-workspace-root-check ，允许依赖被安装在workspace的根目录
 // -D：作为devDependencies依赖安装
 // -W -D 必须放在命令尾部，否则报错【yarn remove v1.22.19
 //error Not enough arguments, expected at least 1.】 这一点没有npm 灵活
 
 // 例子：管理根目录的依赖。
 // 安装eslint作为根目录的devDependencies
 yarn add eslint -D -W
 
 yarn workspace remove <pkg_name> 没有这个命令，报错yarn workspace v1.22.19  error Unknown workspace "remove".
 
 yarn workspace <workspace_name> remove <pkg_name> // 删除某一个workspace_name下的依赖
 
 6、运行指定工作区的脚本命令
 yarn workspace <workspace_name> run <script_name>
 
 7、使用 yarn workspaces 的一个好处，就是可以快速调用所有 package 的某个命令，例如：
 yarn workspaces run clean // 调用所有 package 的 clean 命令
 // 这个命令执行的前提是需要在所有的包下的package.json文件中配置上clean命令才行
 // 例如：在根目录的 package.json 中加入一些常用的命名：
 
 {
     "scripts": {
         "build": "lerna run --stream --sort build", // 按照依赖拓扑进行构建
         "clean": "yarn workspaces run clean", //这里配置了clean 命令 彼此独立，可以并行执行
         "test": "yarn workspaces run test"
     }
 }
 ```