package com.demo.payment.service;

import com.demo.payment.bean.entity.Payment;

/**
 * 定義付款的介面
 * @author oscar51011
 * @date 2022年1月29日
 */
public interface PaymentService {
	Payment getPaymentById(Long id);
}
