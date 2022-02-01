package com.demo.payment.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

/**
 * 實作 付款服務
 * @author oscar51011
 * @date 2022年2月1日
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public String demoPaymentServiceSuccess(Long id) {
		return "thread: " + Thread.currentThread() + " , id:" + id + " success service done!";
	}

	@Override
	public String demoPaymentServiceTimeOut(Long id) {

		int timeNumber = 3;
		try {
			TimeUnit.SECONDS.sleep(timeNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "thread: " + Thread.currentThread() + " , id:" + id + " timeOut service done!";
	}
	
}
