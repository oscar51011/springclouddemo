package com.demo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 實現 Hystrix 監控的 啟動類
 * @author oscar51011
 * @date 2022年2月2日
 */
@SpringBootApplication
// 啟動 Hystrix Dashboard
@EnableHystrixDashboard
public class HystrixDashboardApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}
