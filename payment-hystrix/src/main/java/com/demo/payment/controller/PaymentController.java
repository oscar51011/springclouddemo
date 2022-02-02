package com.demo.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.payment.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * 定義 Hystrix Payment 接口
 * @author oscar51011
 * @date 2022年2月1日
 */
@RestController
@RequestMapping("/hystrixPaymentService")
@Slf4j
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	@GetMapping("/successDemo/{id}")
	public String demoPaymentServiceSuccess(@PathVariable Long id) {
		String response = paymentService.demoPaymentServiceSuccess(id);
		log.info("process is done!");
		return response;
	}
	
	@GetMapping("/timeOutDemo/{id}")
	public String demoPaymentServiceTimeOut(@PathVariable Long id) {
		String response = paymentService.demoPaymentServiceTimeOut(id);
		log.info("process is done!");
		return response;
	}
	
	@GetMapping("/circuitBreakerDemo/{id}")
	public String demoPaymentServiceCircuitBreaker(@PathVariable Long id) {
		String response = paymentService.demoPaymentServiceCircuitBreaker(id);
		log.info("process is done!");
		return response;
	}
}
