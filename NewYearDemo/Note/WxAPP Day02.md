# WxAPP Day02



## Demo开发

视频较老，没有自动项目构建，所以先自己先建了一个Demo文件夹来学习



### 全局配置

#### app.js

注册小程序的应用

```js
App({})
```

先留空，里面的参数是一个Object类型，先留空



#### app.json

微信小程序应用的全局配置

```json
{
    "pages":[
        
    ]
}
```

上面展示了一个路径



### 单页面配置

一个页面需要四个文件   `*.js`   `*.josn`    `*.wxml`    `*.wxss`



#### helloworld.wxml

```html
<view>HelloWorld</view>
```



#### helloworld.js

```js
Page({})
```



#### helloworld.json

```json
{}
```



#### helloworld.wxss

```css
view{
  width: 100%;
  height: 40rpx;
  text-align: center;
}
```



为了让上面页面显示，需要在app.json内去定义路径

```json
{
    "pages":[
        "pages/Demo/helloworld"
    ]
}
```



## 小程序框架详解



### 1.  wxml

#### 定义

​		WXML(WeiXin Markup Langue) 是框架设计的一套标签语言，结合组件、WXS和事件系统，可以构建出页面的结构。



#### 语法

```html
<标签名 属性名="属性名1" ...>
    ...  
</标签名> 
```



#### 样例

```html
<view class="className" data-name="A">
	Hello World
    <view>
    	Hello China
    </view>
</view>
```



#### 数据绑定

```html
{{}}//Mustache语法  双括号绑定
```

样例

```html
<!--index.wxml-->
<view>
	<text>{{message}}</text>
</view>
//  index.js
Page(
	data:{
		message:"Hello World"
	}
)
```

除了文本内容，还可以绑定属性值。并且支持运算，比如三目

```heml
{{flag ? true : false}}
```



#### 标签组件

id，class，style ，hidden， data-  （自定义），额外有一个bind* /catch *  组件事件



#### 列表渲染

样例

```html
<!--index.wxml-->
<view>
    <block wx:for="{{items}}" wx:for-item="item" wx:key="index">
		<view>{{index}}:{{item.name}}</view>
    </block>
</view>
```



```js
// index.js
Page(
	data:{
    	item:[
    		{name:"商品A"}
    		{name:"商品B"}
    		{name:"商品C"}
    		{name:"商品D"}
    		{name:"商品E"}
    	]
    }
)
```



上边两个的这种语法，都是适合需要长期更新的，动态绑定。、

第二个列表渲染，可以看出，他是不定长的，是我们显示数据更加灵活方便



这里出现了一个新属性  wx:    

适用于列表



#### 条件渲染

样例

```html
<!--index.html-->
<view>今天吃什么</view>
<view wx:if="{{conndition === 1}}">
	饺子
</view>
<view wx:elif="{{conndition === 2}}">
	米饭
</view>
<view wx:else>
	面食
</view>
```



```js
// index,js
Page({
    data:{
        condition:Math.floor(Math.random()*3+1)
    }
})
```



#### 模板引用

样例

```html
<!--index.wxml-->
<template name="tempItem">
    <view>
        <view>收件人：{{name}}</view>
        <view>联系方式：{{phone}}</view>
        <view>地址：{{adress}}</view>
    </view>
</template>
<template is="tempItem" data="{{...item}}"></template>
```



```js
//index.js
Page({
    data:{
        item:[
            name:"张三",
            phone:"1888888888888",
            adress:"中国"
        ]
    }
})
```



##### import

```html
<import src = "a.wxml"></import>
<template is="a"></template>

<!--a.wxml-->
<view>Hello world</view>
<template name="a">
	Hello World!
</template>

<!--会显示带感叹号的 -->
```

不会造成循环依赖



##### include

```html
<include src = "a.wxml"></include>
<template is="a"></template>

<!--a.wxml-->
<view>Hello world</view>
<template name="a">
	Hello World!
</template>
<!--显示带不感叹号的 -->
```



### 2.  wxss

WXSS（WeiXin Style SHeets）是一套样式语言，用于描述WXML的组件样式



#### 针对CSS的补充

##### 尺寸单位：rpx



- ​	设备像素（device pixels）
- ​	CSS像素（CSS pixels）
- ​	PPI/DPI(pixel per inch)  动态计算
- ​	DPR(devicepixelRatio)



#####样式导入

@import

样例

```html
<!--index.wxml-->
<view class="container">
	Hello World!
</view>
```



```css
/** index.wxss **/
@import './assets.wxss';
.container{
    color:red;
}
```



~~~css
/** asstes.wxss **/
.container{
    border:1px solid #000;
}
~~~



#####内联样式

新增Mustache语法，style可以引用{{}}



### 3.JavaScript（js）



在小程序中，主要是用ECMAScript+小程序框架+小程序API

没有DOM和BOM对象



在各个客户端，运行的环境不一致

IOS：JavaScriptCore   IOS8，9不支持ES6

Android：X5内核

IDE：nwjs



### 4.  wxs

微信自己的脚本语言，一般用来过滤，或计算。

属性私有，对外不可见



基于ES5，并做了部分优化



