# Spring Cloud OpenFeign

Spring Cloud OpenFeign 支持 負載均衡, 在 Spring Cloud 2020.0.1 中 <br>
負載均衡的 dependency 從 spring-cloud-starter-ribbon 換成 spring-cloud-loadbalancer <br>

使用 Feign 可以讓撰寫 Web 服務的 客戶端變得更簡單 <br>
1. 啟動類開啟 openFeign : @EnableFeignClients
2. 使用 interface 定義操作行為 <br>
3. annotation @FeignClient(value = ""): 用來建立 spring cloud loadBalancer 的 client<br>
4. 介面定義的方法可以使用 springMVC 的 annotation , 支持 Spring Web 的 HttpMessageConveters 轉換 request & response <br>

##### Logging
[官網資料連結](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/#feign-logging) <br>

1. 建立 configuration ( 有4種模式, 預設為 None(No logging) )
2. 配置 application.yml



