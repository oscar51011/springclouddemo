# Sping Cloud Config

- [Spring Cloud Config Server](https://docs.spring.io/spring-cloud-config/docs/3.1.1-SNAPSHOT/reference/html/#_spring_cloud_config_server)

##### 專案配置 spring Cloud Config Server ( project: cloud-config)
1. 引入 dependency: spring-cloud-config-server <br>
   <br>
2. 配置 application.yml 取得自訂定義 repository branch 的資源 <br>
   讀取方式可以兩種 <br>
   a. HTTPS: 需要搭配帳號密碼才可以登入 <br>
   b. SSH: 待研究 <br>
   <br>
3. 文件命名&讀取規則: label(分支), application(配置文件), profile(環境) <br>
   a. /{label}/{application}-{profile}.yml (讀取格式為 設定檔內的樣式 ) <br>
   	  -> ex: http://localhost:6001/master/appliction-prod.yml <br>
   b. /{application}-{profile}.yml (讀取格式為 設定檔內的樣式 ) <br>
      ( 預設會讀取 project 中 application.yml 中的 label去決定預設的分支 ) <br>
   c. /{application}/{profile}/{label} ( 讀取格式為 json ) <br>
      -> ex: http://localhost:6001/appliction/test/master <br>
      
##### 專案配置 spring Cloud Config Client ( project: cloud-config-client)
1. 引入 dependency: spring-cloud-config-client <br>
2. 配置的方法分成兩種, 本專案使用 舊版的方法 <br>
   	a. <br> 
   新增 bootstrap.yml 檔案 <br>
   新增 maven dependency: spring-cloud-starter-bootstrap <br>
   ※ Springboot 2.4版本以後已經刪除了 bootstrap 用法, 為了維持現行操作, 因此要引入對應的 dependency <br>
   	b. <br>
   Use Spring Boot 2.4.0 Config Data API<br>
   新增 application.yml 檔案, 關於細節相關配置方法可以參考 stackoverflow : [點我前往](https://stackoverflow.com/questions/64994034/bootstrap-yml-configuration-not-processed-anymore-with-spring-cloud-2020-0)<br>
  <br>
  ※ 專案使用 @Value取得之資訊為git上自定義的值, 需要對應好 key , 否則會找不到
      
##### client 手動 動態更新配置(非以重啟微服務的方式)
1.新增 @RefreshScope 以利更新設定檔資訊 <br>
2.調整 bootstrap.yml 暴露 actuator port **(該方案是否有 安全性議題 待研究)**<br>
3.手動模式 - 打POST 更新專案配置資訊<br>
  ※ curl -X POST "http://localhost:6003/actuator/refresh
 