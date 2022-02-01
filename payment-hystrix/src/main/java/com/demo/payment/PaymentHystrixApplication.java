package com.demo.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 新增 hystrix demo 啟動類
 * @author oscar51011
 * @date 2022年2月1日
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PaymentHystrixApplication.class, args);
	}

}
