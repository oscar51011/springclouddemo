package com.demo.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 使用 OpenFeign 配置 Payment-hystrix 微服務的介面
 * value: 指定 服務的 application 
 * fallback: 指定實作 降級服務的class, 可以實現邏輯 & 降級服務的解偶
 * 
 * @author oscar51011
 * @date 2022年2月1日
 */
@Component
@FeignClient(value = "PAYMENT-HYSTRIX-SERVICE", fallback = PaymentFallbackService.class)
public interface PaymentFeignHystrixService {

	@GetMapping("/hystrixPaymentService/successDemo/{id}")
	public String demoPaymentServiceSuccess(@PathVariable Long id);
	
	@GetMapping("/hystrixPaymentService/timeOutDemo/{id}")
	public String demoPaymentServiceTimeOut(@PathVariable Long id);
}
