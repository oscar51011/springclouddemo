package com.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 新增 訂單 啟動類
 * @author oscar51011
 * @date 2022年1月29日
 *
 */
@SpringBootApplication
//註冊為 eureka Client
@EnableEurekaClient
public class OrderApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderApplication.class, args);
	}

}
