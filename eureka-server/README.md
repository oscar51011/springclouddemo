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

1. 調整 C:\Windows\System32\drivers\etc\hosts 的 ip 對應 domain 資訊 <br>
( 為了讓 127.0.0.1 可以對應 application.yml 的 hostname ) <br>
EX: <br>
 127.0.0.1 eureka-server.com <br>
 127.0.0.1 eureka-server2.com <br>
	   
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
   ( 可查看 application.yml 的 spring.application.name 註冊服務時會全部轉成大寫的形式) <br>
   會根據 application 指向對應的服務
5. 服務發現 ( DiscoveryCliey ): 用來取得 eureka 上的 服務 & 服務的 instance 資訊 <br>
   在啟動類 新增 @EnableDiscoveryClient
   在使用時 注入 DiscoveryClient bean 即可使用其功能

##### 服務保護機制
Eureka 是屬於 Client 主動回報自主服務是否存活 , 而非由 Server 頻繁檢查 , Client renew heartbests ( 預設 30 秒 )  <br>
Server 定期查看註冊的服務是否有定時回傳存活訊息 ( 預設 60 秒 ), 如果已經失效的服務在 過一段時候後 ( 預設 90 秒 ) , 會把服務踢除 <br>

但在服務是正常的情況下, 有可能因為網路不穩造成連線問題 ,這種情況不能夠讓服務直接下線, 因此先產生一個保護機制: <br>
Server 定期會去計算 Client 回傳 heartbests 的比例 , 如果低於 85% 則會啟動 保護機制, 在啟動機制的當下, 服務就算失效也不會被 Server 踢除<br>
當故障恢復且 heartbeats 恢復高於 85%, 才會關閉 自我保護機制 <br>






