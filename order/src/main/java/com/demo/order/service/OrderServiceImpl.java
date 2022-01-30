package com.demo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.order.bean.PaymentBean;
import com.demo.order.config.RestServiceInfoConfig;

/**
 * 取得訂單服務實作
 * @author oscar51011
 * @date 2022年1月29日
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RestServiceInfoConfig restServiceInfoConfig;

	@Override
	public PaymentBean getPaymentInfo(Long id) {
		
		String paymentUrl = restServiceInfoConfig.getPaymentUrl();

		return restTemplate.getForObject(paymentUrl+"/payment/"+id, PaymentBean.class);
	}

}
