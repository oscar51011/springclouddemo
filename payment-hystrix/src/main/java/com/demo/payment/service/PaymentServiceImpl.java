package com.demo.payment.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * 實作 付款服務
 * @author oscar51011
 * @date 2022年2月1日
 */
@Service
@DefaultProperties(defaultFallback = "defaultTimeOutMessage")
public class PaymentServiceImpl implements PaymentService {

	/**
	 * 定義降級服務標準, 如果超過3秒即報錯, fallbackMethod 定義客製化錯誤訊息
	 * 藉由調整 method 中 sleep 的毫秒數
	 * - 如果是 1000 , 表示符合標準 , 回傳 success 訊息
	 * - 如果是 5000 , 表示會超時 , 回傳客製化訊息避免等待 , 達成服務降級
	 */
	@HystrixCommand(fallbackMethod = "demoPaymentServiceSuccessTimeOut", commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})
	@Override
	public String demoPaymentServiceSuccess(Long id) {
		
		System.out.println("success");
		
//		try {
//			TimeUnit.SECONDS.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return "thread: " + Thread.currentThread() + " , id:" + id + " success service done!";
	}
	
	/**
	 * 定義 服務 time out or 發生錯誤 的客製化回復訊息 ( 服務降級 )
	 * @return
	 */
	public String demoPaymentServiceSuccessTimeOut(Long id) {
		return "demoPaymentServiceSuccess - id:" + id  + "has custom Time out error message";
	}

	/**
	 * 使用 HystrixCommand 啟用服務降級機制 , 但沒有指定特定的 fallbackMethod
	 * 因此會讀取 class level 的 @DefaultProperties 去跑到 全域的錯誤訊息
	 */
	@HystrixCommand(commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})	
	@Override
	public String demoPaymentServiceTimeOut(Long id) {

		try {
			TimeUnit.SECONDS.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "thread: " + Thread.currentThread() + " , id:" + id + " timeOut service done!";
	}
	
	public String defaultTimeOutMessage() {
		return "global default timeout error message";
	}

	/**
	 * 使用 HystrixCommandProperties demo 熔斷機制
	 */
	@HystrixCommand(commandProperties = {
			// 開啟熔斷機制 ( default 是 true )
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
			// 一端時間內有超過 10個以上的請求 , 才會符合開啟熔斷的條件 (default 是 20 )
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
			// 當發生熔斷時, 需要多久時間才會變成 半開的狀態, 讓其中一個請求可以嘗試通過 (default 是 5000 毫秒 )
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
			// 錯誤率百分比 ( default 是 50%)
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
		})	
	@Override
	public String demoPaymentServiceCircuitBreaker(Long id) {
		if( id < 0) {
			throw new RuntimeException("id should be postive");
		}
		return "thread: " + Thread.currentThread() + " , id:" + id + " circuitBreaker service done!";
	}
	
	
	
}
