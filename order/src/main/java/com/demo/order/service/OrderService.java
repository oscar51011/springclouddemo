package com.demo.order.service;

import com.demo.order.bean.PaymentBean;

/**
 * 訂單服務介面
 * @author oscar51011
 * @date 2022年1月29日
 */
public interface OrderService {
	
	public PaymentBean getPaymentInfo(Long id);
}
