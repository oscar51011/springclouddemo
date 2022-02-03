package com.demo.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * 實作客製化 GlobalFilter
 * @author oscar51011
 * @date 2022年2月4日
 */
@Component
@Slf4j
public class CustomFilter implements GlobalFilter,Ordered {

	/**
	 * 決定順序, 數字越小, 排序越大
	 */
	@Override
	public int getOrder() {
		return 0;
	}

	/**
	 * 客製化過濾器
	 */
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("****custom Filter****");
		
		// 如果有客製化邏輯, 使其不要通過, 可以用 return 返回
		/*
		if() {
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}
		*/
		
		// 讓 filter chain 將資料繼續往下一層 filter 帶
		return chain.filter(exchange);
	}

}
