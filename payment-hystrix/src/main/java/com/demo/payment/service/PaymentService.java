package com.demo.payment.service;

/**
 * 定義付款服務介面
 * @author oscar51011
 * @date 2022年2月1日
 */
public interface PaymentService {
	String demoPaymentServiceSuccess(Long id);
	String demoPaymentServiceTimeOut(Long id);
	String demoPaymentServiceCircuitBreaker(Long id);
}
