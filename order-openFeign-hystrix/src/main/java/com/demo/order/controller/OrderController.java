package com.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.order.service.PaymentFeignHystrixService;

import lombok.extern.slf4j.Slf4j;

/**
 * 設計 API 接口
 * @author oscar51011
 * @date 2022年2月1日
 */
@RestController
@RequestMapping("/orderFeignHystrixService")
@Slf4j
public class OrderController {

	@Autowired
	private PaymentFeignHystrixService service;
	
	@GetMapping("/successDemo/{id}")
	public String paymentSuccess(@PathVariable Long id) {
		String response = service.demoPaymentServiceSuccess(id);
		log.info("process is done!");
		return response;
	}
	
	@GetMapping("/timeOutDemo/{id}")
	public String paymentTimeOut(@PathVariable Long id) {
		String response = service.demoPaymentServiceTimeOut(id);
		log.info("process is done!");
		return response;
	}
	
}
