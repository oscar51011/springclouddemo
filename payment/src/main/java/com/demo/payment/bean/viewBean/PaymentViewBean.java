package com.demo.payment.bean.viewBean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * 取得付款顯示資訊
 * @author oscar51011
 * @date 2022年1月29日
 */
@Data
public class PaymentViewBean {

	/**
	 * 流水碼
	 */
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
