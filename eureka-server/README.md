# Eureka

Spring Cloud Eureka 為 Spring Cloud Nexflix 的模組 <br>
用來處理 微服務的 服務註冊 & 發現 <br>

分成兩個部分( Server & Client ):

###### Eureka Server

1. 引入 maven dependency: spring-cloud-starter-netflix-eureka-server
2. 註冊 @EnableEurekaServer
3. 撰寫 YAML 檔案
	
###### Eureka Server 群集 
採取 eureka server 互相註冊的模式: ( 測試環境使用 window )

1. 調整 C:\Windows\System32\drivers\etc\hosts 的 ip 對應 domain 資訊
( 為了讓 127.0.0.1 可以對應 application.yml 的 hostname )
EX: 
 127.0.0.1 eureka-server.com
 127.0.0.1 eureka-server2.com
	   
2. defaultZone 調整至不同的 eureka server <br>
	   EX: 假設有 A, B, C 三台 <br>
	       A -> B <br>
	       B -> C <br>
	       C -> A <br>
3. 啟動 Server 後即可看到 DS Replicas 看到對應的 server 資訊       

###### Eureka Client
1. 引入 maven dependency: spring-cloud-starter-netflix-eureka-client <br>
2. 註冊 @EnableEurekaClient <br>
3. 撰寫 YAML 檔案 <br>
  如果 eureka 有群集, defaultZone 要註冊所有群集 <br>
  eureka 要實現 **負載均衡** 的話要在 呼叫 RestTemplate 時撰寫 @LoadBalanced <br>
4. 呼叫另一個微服務的 URL 就不是寫死了, 而是選擇 eureka 註冊的 application <br>
   ( 可查看 application.yml 的 spring.application.name 生成時會全部轉成大寫) <br>
   會根據 application 指向對應的服務

