package com.demo.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 註冊需要使用的Bean
 * @author oscar51011
 * @date 2022年1月29日
 */
@Configuration
public class ApplicationContextConfig {

	/**
	 * 註冊 RestTemplate 實體 , 等同於 xml 撰寫 <bean id="" class=""> 的效果
	 * @author oscar51011
	 * @return
	 */
	@Bean
	// 2021-01-31 加入spring cloud 負載均衡機制 
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
