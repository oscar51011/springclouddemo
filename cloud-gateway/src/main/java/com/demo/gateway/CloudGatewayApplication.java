package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Cloud Gateway 啟動類
 * @author oscar51011
 * @date 2022年2月3日
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
