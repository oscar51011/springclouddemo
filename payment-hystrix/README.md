# Hystrix
Spring Cloud Nexflix Hystrix 已經進入維護階段, 不再更新 <br>
Spring Cloud starter 2020.0.0 以後已經將其移除 <br>
- [Nexflix Hystrix - Github](https://github.com/Netflix/Hystrix) 
- [Nexflix Hystrix - How To Use](https://github.com/Netflix/Hystrix/wiki/How-To-Use)

##### Hystrix 實作
可以實作在 呼叫方 or 被呼叫方, 步驟如下:
1. 在啟動類 啟動 Hystrix 服務: @EnableHystrix <br>
2. 在method 加上 @HystrixCommand 配置降級服務, project 內使用 timeout 的參數 <br>
   	a. 有客製化錯誤回復, 可以使用 fallbackMethod 參數定義 需要實作的 method name 。<br>
   	b. 可宣告預設錯誤訊息, 在 class levle 加上 @DefaultProperties 定義 global 錯誤訊息<br>
       如果沒有特別定義 fallbackMethod, 就會去呼叫 預設的處理模式。<br>




