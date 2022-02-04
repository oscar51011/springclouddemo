package com.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 演示 cloud config client 的啟動類
 * @author oscar51011
 * @date 2022年2月4日
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ClientApplication.class, args);
	}
}
