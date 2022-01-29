package com.demo.order.config;

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
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
