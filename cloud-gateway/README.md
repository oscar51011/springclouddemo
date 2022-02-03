# Spring Cloud Gateway

##### 專案配置
1. 引入 spring-cloud-starter-gateway , 因為有搭配 eureka, 也要納入 eureka server的管轄 <br>
   ※ Spring Cloud Gatway 沒有涉及 web, 不要引入 spring-cloud-starter-web , 否則會報錯 <br>
2. 配置的方式有兩種: <br>
   a. application.yml 檔案 , 配置 gateway routing 的路徑即可藉由 gateway 導流 <br>
   b. java configuration 配置 <br>