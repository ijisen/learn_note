{
  "name": "root",
   // 私有的，不会被发布，是管理整个项目，与要发布的npm包解耦，避免 root 被发布出去
  "private": true,
  // private = true时， 指定workspace路径
  "workspaces": [ "packages/*" ],
  "devDependencies": {
    "lerna": "^5.1.8"
  }
}
