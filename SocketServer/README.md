### 简介
快速搭建一个简易的基于socket的后端Server

### 使用说明：
run : 启动Server

port : 查看port

set port : 设置port

### 开发说明：
改写ServerCore/MessageProcess类以满足需求 

该类中process方法接收客户端数据，并回传处理后数据

ifStop方法判断是否断开与客户端的连接，返回值true表示断开

默认port在ServerCore/KeyData类中，可更改

ServerCore/ServerMain类中可更改启动命令

#### 推荐使用json处理方式，本项目已导入fastjson库
