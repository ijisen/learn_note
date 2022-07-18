`
{
  // 
  "packages": [],
  
    // 执行命令的client，默认为npm，我们设置为 yarn
  "npmClient": "yarn",  
   // 开启工作区模式 用 yarn workspaces 进行依赖管理
  "useWorkspaces": true,     
  "useNx": false,    
  //  【独立模式】每个包都有自己独立的版本号
  //   Lerna 的两种模式
          Fixed（固定模式）： 默认。所有package 共用一个版本号，比如：babel 任何 package 的 major change 均会>导致所有包都会进行 major version的更新
          Independent（独立模式）： 每个包都有自己独立的版本号。lerna会配合git，检查文件变动，只发布有改动的>package
          
  "version": "independent"      
}
`
