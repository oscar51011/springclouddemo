package com.order.openFeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.order.openFeign.bean.PaymentBean;

/**
 * 新增 payment 介面, 
 * 1. 註冊成 spring bean 
 * 2. 宣告 @FeignClient ( value 選定 eureka 上的 Application )
 * 
 * @author oscar51011
 * @date 2022年1月31日
 */
@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentFeignService {

	@GetMapping("/payment/{id}")
	public PaymentBean getPaymentById(@PathVariable Long id);
}
