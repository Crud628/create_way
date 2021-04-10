# SAAS IRHM 系统

## 目录说明

> ├── assets             | 资源 
>
> ├── build              | webpack编译配置 
>
> ├── config             | 全局变量 
>
> ├── src               | 源码
>
> │  ├── api             | 数据请求 
>
> │  ├── assets           | 资源 
>
> │  ├── components         | 组件 
>
> │  ├── mixins           | mixins 
>
> │  ├── filters           | vue filter 
>
> │  ├── icons            | 图标
>
> │  ├── lang            | 多语言 
>
> │  ├── router           | 路由
>
> │  ├── store            | 数据 
>
> │  ├── styles           | 样式 
>
> │  ├── utils            | 工具函数库 
>
> │  ├── module-dashboard      | 框架程序 
>
> │  │  ├── assets 
>
> │  │  ├── components 
>
> │  │  ├── pages 
>
> │  │  ├── router
>
> │  │  └── store 
>
> │  ├── module-example       | 示例程序 
>
> │  │  ├── assets
>
> │  │  ├── components 
>
> │  │  ├── pages 
>
> │  │  ├── router 
>
> │  │  └── store 
>
> │  ├── App.vue           | app
>
> │  ├── main.js           | 主引导 
>
> │  └── errorLog.js        | vue全局错误捕捉 ├── dist              | 编译发布目录 
>
> ├── README.md 
>
> ├── index.html           | 页面模板 
>
> ├── package.json          | npn包配置 
>
> ├── static 
>
> └── test              | 测试  
>
> ├── e2e  
>
> └── unit



> │  ├── module-saas-clients   | saas-clients模块主目录 
>
> │  │  ├── assets       | 资源 
>
> │  │  ├── components     | 组件 
>
> │  │  ├── pages        | 页面 
>
> │  │  │  └── index.vue    | 示例 
>
> │  │  ├── router       | 路由 
>
> │  │  │  └── index.js    | 示例 
>
> │  │  └── store        | 数据
>
> │  │    └── app.js     | 示例



## 运行

### 1. 安装 nodejs

https://nodejs.org/en/

### 2. 安装包依赖

```sh
yarn
```

### 3. 配置 API 地址

编辑文件 config/index.js

修改 `api` `upfile` 转发配置

```js
module.exports = {
  dev: {
    // Paths
    assetsSubDirectory: 'static',
    assetsPublicPath: '',
    proxyTable: {
      '/api': {
        target: 'https://mock.boxuegu.com/mock/29',
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      },
      '/upfile': {
        target: 'http://172.17.0.65/system/upfile',
        changeOrigin: true,
        pathRewrite: {
          '^/upfile': ''
        }
      }
    },
```

### 4. 运行

```sh
npm start
```
