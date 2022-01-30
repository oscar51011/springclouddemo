package com.demo.order.bean;

import lombok.Data;

/**
 * 取得付款服務的 Response
 * @author oscar51011
 * @date 2022年1月29日
 */
@Data
public class PaymentBean {

	private Long id;
		
	/**
	 * 支付類型
	 */
	private String type;
	
	/**
	 * 支付價格
	 */
	private Integer price;
	
	/**
	 * 服務埠號
	 */
	private String serverPort;
}
