package com.demo.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 新增 hystrix demo 啟動類
 * @author oscar51011
 * @date 2022年2月1日
 */
@SpringBootApplication
@EnableEurekaClient
// 啟用 Hystrix
@EnableHystrix
public class PaymentHystrixApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PaymentHystrixApplication.class, args);
	}

}
