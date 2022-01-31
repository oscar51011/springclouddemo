package org.order.openFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 建立 Demo Open-Feign 服務的 微服務
 * @author oscar51011
 * @date 2022年1月31日
 */
@SpringBootApplication
// 啟用 Feign Client 服務
@EnableFeignClients
public class OrderFeignApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderFeignApplication.class, args);
	}

}
