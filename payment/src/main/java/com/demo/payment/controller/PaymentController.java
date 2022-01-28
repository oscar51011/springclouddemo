package com.demo.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.payment.entity.Payment;
import com.demo.payment.service.PaymentService;

/**
 * 實現付款API接口
 * @author oscar51011
 * @date 2022年1月29日
 */
@RequestMapping("payment")
@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/{id}")
	public String getPaymentById(@PathVariable Long id) {
		Payment payment = paymentService.getPaymentById(id);
		return payment.getPrice().toString();
	}
	
}
