package com.demo.payment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author oscar51011
 * @date 2022年1月29日
 */
@Entity
@Table(name = "PAYMENT")
@Data
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	/**
	 * 支付類型
	 */
	@Column(name = "TYPE")
	private String type;
	
	/**
	 * 支付價格
	 */
	@Column(name = "PRICE")
	private Integer price;
}
