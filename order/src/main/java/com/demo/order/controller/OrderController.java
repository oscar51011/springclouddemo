package com.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.order.bean.PaymentBean;
import com.demo.order.service.OrderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 實現 訂單 API 接口
 * @author oscar51011
 * @date 2022年1月29日
 */
@RestController
@RequestMapping("/orderService")
@Slf4j
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/payment/{id}")
	public PaymentBean getPaymentInfo(@PathVariable Long id) {
		return orderService.getPaymentInfo(id);
	}
	
	/**
	 * 利用 服務發現 取得 eureka server 上註冊的 Application 資訊
	 * 
	 * @author oscar51011
	 * @return
	 */
	@GetMapping("/discovery")
	public Object getDisconveryResources() {
		
		log.info("取得服務資訊");
		
				
		// 取得 eureka server 上面所有 服務
		discoveryClient.getServices().forEach((app)->{
			log.info("application name: " + app);
		});
		
		// 取得 eureka server 上的 application instance 的主機資訊
		discoveryClient.getInstances("PAYMENT-SERVICE").forEach((instance)->{
			log.info(instance.getInstanceId() + "\t" + instance.getHost() + "\t" + instance.getPort());
		});
		
		return this.discoveryClient;
	}
}
