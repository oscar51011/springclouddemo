package com.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.order.bean.PaymentBean;
import com.demo.order.service.OrderService;

/**
 * 實現 訂單 API 接口
 * @author oscar51011
 * @date 2022年1月29日
 */
@RestController
@RequestMapping("/orderService")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/payment/{id}")
	public PaymentBean getPaymentInfo(@PathVariable Long id) {
		return orderService.getPaymentInfo(id);
	}
}
