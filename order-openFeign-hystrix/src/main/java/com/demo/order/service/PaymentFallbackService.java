package com.demo.order.service;

import org.springframework.stereotype.Component;

/**
 * 實作 PaymentFeignHystrixService 的 fallback 邏輯
 * 根據 介面的 @FeignClient 指定其實作 class
 * 
 * @author oscar51011
 * @date 2022年2月2日
 */
@Component
public class PaymentFallbackService implements PaymentFeignHystrixService {

	@Override
	public String demoPaymentServiceSuccess(Long id) {
		return "demoPaymentServiceSuccess custom fallback error message";
	}

	@Override
	public String demoPaymentServiceTimeOut(Long id) {
		return "demoPaymentServiceTimeOut custom fallback error message";
	}
	
}
