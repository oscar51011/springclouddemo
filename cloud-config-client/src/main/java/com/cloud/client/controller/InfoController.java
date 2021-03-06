package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 測試 是否可以讀取 Spring Cloud Config 取得的即時資訊
 * @author oscar51011
 * @date 2022年2月4日
 */
// 可以驅動 config server 自動/手動更新, 而不是一定需要重啟服務
@RefreshScope
@RestController
@RequestMapping("/cloudConfigClient")
public class InfoController {

	@Value("${config.info}")
	private String configInfo;
	
	@GetMapping("configInfo")
	public String getInfo() {
		return configInfo;
	}
}
