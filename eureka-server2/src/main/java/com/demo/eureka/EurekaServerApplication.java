package com.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 新增 Eureka Server 啟動類 
 * @EnableEurekaServer 用途為 接收其他微服務的註冊
 * 
 * @author oscar51011
 * @date 2022年1月30日
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
