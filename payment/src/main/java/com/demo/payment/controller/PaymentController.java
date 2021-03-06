package com.demo.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.payment.bean.entity.Payment;
import com.demo.payment.bean.viewBean.PaymentViewBean;
import com.demo.payment.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * 實現付款API接口
 * @author oscar51011
 * @date 2022年1月29日
 */
@RequestMapping("payment")
@RestController
@Slf4j
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/{id}")
	public PaymentViewBean getPaymentById(@PathVariable Long id) {
		
		log.info("server port: " + serverPort + " , getPaymentById start");
		
		Payment payment = paymentService.getPaymentById(id);
		
		PaymentViewBean viewBean = new PaymentViewBean();
		viewBean.setId(payment.getId());
		viewBean.setType(payment.getType());
		viewBean.setPrice(payment.getPrice());
		viewBean.setServerPort(serverPort);
		
		return viewBean;
	}
	
}
