package com.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用 OpenFeign + Hystrix 設計 client service 啟動類
 * @author oscar51011
 * @date 2022年2月1日
 */
@SpringBootApplication
//啟用 Feign Client 服務
@EnableFeignClients
public class OrderOpenFeignHystrixApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderOpenFeignHystrixApplication.class, args);
	}

}
