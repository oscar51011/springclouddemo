package com.demo.order.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

/**
 * 注入服務設定檔的資源
 * @author oscar51011
 * @date 2022年1月29日
 */
@Configuration
@PropertySource("classpath:rest-service-info.properties")
@Data
public class RestServiceInfoConfig {

	@Value( "${payment.url}" )
	private String paymentUrl;
}
