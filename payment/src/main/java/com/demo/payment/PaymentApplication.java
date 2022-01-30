package com.demo.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 新增 payment 啟動類
 * @author oscar51011
 * @date 2022年1月28日
 *
 */

@SpringBootApplication
// 註冊為 eureka Client
@EnableEurekaClient
public class PaymentApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PaymentApplication.class, args);
	}

}
