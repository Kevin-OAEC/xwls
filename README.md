# Typecho博客客户端数据接口

## 博客地址

> [https://www.oaec.xin](https://www.oaec.xin)

## 接口文档

### 获取Post列表

接口地址：http://host:port/applicationName/post/getPosts

请求示例：http://localhost:8080/xwls/post/getPosts?page=1&pageSize=10

|请求参数|参数说明|
|---|---|
|page|页码|
|pageSize|每页数量|

### 根据cid获取Post详情

接口地址：http://host:port/applicationName/post/getPost

请求示例：http://localhost:8080/xwls/post/getPost?cid=3

|请求参数|参数说明|
|---|---|
|cid|Post的ID|

### 根据type获取分类和标签

接口地址：http://host:port/applicationName/metas/getMetas

请求示例：http://localhost:8080/xwls/metas/getMetas?type=category

|请求参数|参数说明|
|---|---|
|type|类型，可选`category`和`tag`|