package com.order.openFeign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
 * 撰寫 openFeign 設定檔
 * @author oscar51011
 * @date 2022年1月31日
 */
@Configuration
public class OrderFeignConfig {
	
	
	/**
	 * Feign 的 logging 配置 ( Log the headers, body, and metadata for both requests and responses. )
	 * @return
	 */
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}
