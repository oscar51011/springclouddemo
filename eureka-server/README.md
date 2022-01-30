# Eureka

Spring Cloud Eureka 為 Spring Cloud Nexflix 的模組 <br>
用來處理 微服務的 服務註冊 & 發現 <br>

分成兩個部分:
1. Eureka Server <br>

	- 引入 maven dependency: spring-cloud-starter-netflix-eureka-server
	- 註冊 @EnableEurekaServer
	- 撰寫 YAML 檔案
2. Eureka Client <br>

	- 引入 maven dependency: spring-cloud-starter-netflix-eureka-client
	- 註冊 @EnableEurekaClient
	- 撰寫 YAML 檔案
	
