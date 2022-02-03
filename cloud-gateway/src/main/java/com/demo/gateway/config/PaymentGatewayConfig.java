package com.demo.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置 gateway 的 服務 導向 實際的 微服務
 * 可以從 java configuration or application.yml 中 選擇一種配置即可
 * @author oscar51011
 * @date 2022年2月3日
 */
// @Configuration
public class PaymentGatewayConfig {

	/**
	 * 配置方式 如同 application.yml 的 spring.cloud.gateway.routes 同效果
	 * @param builder
	 * @return
	 */
	// @Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		
		RouteLocatorBuilder.Builder routes = builder.routes();
		
		routes.route("payment-service", 
				r->r.path("/payment/**")
					.uri("http://localhost:8081/payment/**")).build();
		
		return routes.build();
	}
}
