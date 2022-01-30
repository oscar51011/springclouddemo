package com.demo.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.payment.bean.entity.Payment;
import com.demo.payment.dao.PaymentDao;

/**
 * 實作付款服務
 * @author oscar51011
 * @date 2022年1月29日
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDao paymentDao;

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.findById(id).get();
	}
	
}
