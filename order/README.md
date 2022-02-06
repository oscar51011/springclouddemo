# Spring Cloud Sleuth

Spring Cloud Sleuth 提供 Spring Boot 分散式追蹤的 解決方案
- 提供 trace Id & span Id 到 SLF4J , 可以利用 Id 來追蹤資料流 
- 整合 Zipkin (分散式鏈路追蹤系統)

```
專案需求:
1. 利用 docker 在 VM 運行 zipkin server 
	a. 取得 image
	   docker pull openzipkin/zipkin
	b. 啟動 server ( 預設 port: 9411 )
	   docker run -d -p 9411:9411 openzipkin/zipkin name zipkin
	c. 連接 zipkin 預設的 UI
	   http://{VM ip}:9411/zipkin/

2. 啟動 Eeueka Server( project: eureka-server)
3. 啟動 服務 order ( project: order )
4. 啟動 服務 payment ( project: payment ) 
( 兩個服務都需要去 application.yml 調整對應的 zipkin server url
```
參考連結:<bR>
1. [Docker - zipkin](https://hub.docker.com/r/openzipkin/zipkin/) 
2. [Spring Cloud Sleuth](https://docs.spring.io/spring-cloud-sleuth/docs/3.1.1-SNAPSHOT/reference/html/)

##### 專案配置 ( project: order , payment )
1. 引入 spring-cloud-starter-sleuth ( 提供 trace Id, span Id 注入 SLF4J ， 在印出 log 時 加上追蹤資訊 ) <br>
2. 引入 spring-cloud-sleuth-zipkin ( 整合 zipkin server ) <br>
3. 調整 application.yml ( 指定 架設的 zipkin server url ) <br>
4. 打開 zipkin server 介面，可以根據 eureka 的 APPLICATION NAME or  traceId 來追蹤完整的 log 資訊 <br>


