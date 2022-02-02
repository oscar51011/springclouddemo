# Hystrix
Spring Cloud Nexflix Hystrix 已經進入維護階段, 不再更新 <br>
Spring Cloud starter 2020.0.0 以後已經將其移除 <br>
- [Nexflix Hystrix - Github](https://github.com/Netflix/Hystrix) 
- [Nexflix Hystrix - How To Use](https://github.com/Netflix/Hystrix/wiki/How-To-Use)
- [Nexfiix Hystrix - CommandProperties 參數](https://github.com/Netflix/Hystrix/wiki/Configuration)

##### Hystrix 實作 降級機制 ( project: payment-hystrix )
可以實作在 呼叫方 or 被呼叫方, 步驟如下:
1. 在啟動類 啟動 Hystrix 服務: @EnableHystrix <br>
2. 在method 加上 @HystrixCommand 配置降級服務, project 內使用 timeout 的參數 <br>
   	a. 有客製化錯誤回復, 可以使用 fallbackMethod 參數定義 需要實作的 method name 。<br>
   	※ fallbackMethod 的參數需要與原服務一致, 不然會報錯 <br>
   	b. 可宣告預設錯誤訊息, 在 class levle 加上 @DefaultProperties 定義 global 錯誤訊息<br>
       如果沒有特別定義 fallbackMethod, 就會去呼叫 預設的處理模式。<br>

##### Hystrix 搭配 openFeign ( project: order-openFeign-hystrix )

1. 在啟動類 啟動 Hystrix 服務: @EnableHystrix <br>
2. 在 @FeignClient 指定 fallback 實作的 class <br>
3. 創建實作 fallback 服務的 class 並 implement @FeignClient 介面 <br>
※ 這樣即可將 fallback 的內容額外實作不會混在業務邏輯裡面 <br>
4. application.yml 需要開啟 feign.circuitbreaker.enabled: true <br>
※ 因 spring cloud 2020.0.1 已移除了 hystrix , 因此此專案的 spring cloud 版本太新 <br>
  導致 無法使用 feign.hystrix.enabled: true, 置換成 circuitbreaker 即可運作 <br>
  
##### Hystrix 實作 熔斷機制 ( project: payment-hystrix )
如同 降級機制的寫法 , 只是 commandProperties 要新增不同的參數類型來定義熔斷條件 <br>
Hystrix 預設是打開 熔斷機制的, 預設一段時間內有20請求以上, 如果有50%的請求失敗, 則會發生熔斷 <br>
接著預設5秒後, 把熔斷機制打開成半開的情況, 嘗試通過一個請求, 如果成功則 關閉熔斷機制<br>
失敗一段時間後才會再變成半開形式, 直到通訊恢復 <br>



