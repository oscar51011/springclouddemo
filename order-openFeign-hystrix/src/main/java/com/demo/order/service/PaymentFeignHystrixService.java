package com.demo.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 使用 OpenFeign 配置 Payment-hystrix 微服務的介面
 * @author oscar51011
 * @date 2022年2月1日
 */
@Component
@FeignClient(value = "PAYMENT-HYSTRIX-SERVICE")
public interface PaymentFeignHystrixService {

	@GetMapping("/hystrixPaymentService/successDemo/{id}")
	public String demoPaymentServiceSuccess(@PathVariable Long id);
	
	@GetMapping("/hystrixPaymentService/timeOutDemo/{id}")
	public String demoPaymentServiceTimeOut(@PathVariable Long id);
}
