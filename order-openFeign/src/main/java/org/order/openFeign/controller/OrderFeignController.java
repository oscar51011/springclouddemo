package org.order.openFeign.controller;

import org.order.openFeign.bean.PaymentBean;
import org.order.openFeign.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 實現 訂單 API 接口
 * @author oscar51011
 * @date 2022年1月29日
 */
@RestController
@RequestMapping("/orderService")
public class OrderFeignController {
	
	@Autowired
	private PaymentFeignService paymentFeignService;
	

	@GetMapping("/payment/{id}")
	public PaymentBean getPaymentInfo(@PathVariable Long id) {
		return paymentFeignService.getPaymentById(id);
	}
	
}
