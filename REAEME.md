### Demo 运行过程
> 前提：
> * IDEA
> * JDK 1.6以上
> * Maven 3.0以上

1. 首先Run `service_registry` 【服务注册平台】
2. 然后Run `service_car_0` / `service_player_0`
3. [可选] Run `service_api_gateway` 【API网关】
4. 打开`http://localhost:8787/` ， 能看到几个service的启动情况。
5. 相关的API请求在POSTMan中。