# springclouddemo

參考 **尚硅谷Spring Cloud教程** 學習 Spring Cloud 微服務的應用 <br>

使用版本:
- Springboot 2.4.2
- SpringCloud 2020.0.1 : [Spring Cloud 2020.0.1 (aka Ilford) Is Available](https://spring.io/blog/2021/01/28/spring-cloud-2020-0-1-aka-ilford-is-available)<br>
※ 兩者有對應版本關係, 詳細資訊如官網 : [Spring Cloud](https://spring.io/projects/spring-cloud)


##### 1. 服務註冊 & 服務發現 <br>
1. [Eureka Server](https://github.com/oscar51011/springclouddemo/tree/master/eureka-server) <br>
2. Zookeeper - 待研究
3. Consul - 待研究

##### 2. 負載均衡 ( Spring Cloud 2020.0.1 後預設已經從 Ribbon 改成 LoadBalancer )
1. Spring Cloud Ribbon - 待研究 ( 已不更新進入維護狀態 ) => ( RestTemplate + Ribbon )
2. Spring Cloud LoadBalancer: [官網連結](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer) - 待研究( RestTemplate + LoadBalancer )
3. [Spring Cloud OpenFeign](https://github.com/oscar51011/springclouddemo/tree/master/order-openFeign)

##### 3. 服務降級/熔斷機制
1. [Hystix](https://github.com/oscar51011/springclouddemo/tree/master/payment-hystrix)


##### 4. 閘道器(路由器)
1. [Spring Cloud Gateway](https://github.com/oscar51011/springclouddemo/tree/master/cloud-gateway)
