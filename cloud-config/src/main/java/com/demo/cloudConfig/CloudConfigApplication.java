package com.demo.cloudConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Cloud Config 啟動類
 * @author oscar51011
 * @date 2022年2月4日
 */
@SpringBootApplication
// 啟用 spring cloud config
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
