### 1 OpenFeign是什么?

官网:https://spring.io/projects/spring-cloud-openfeign

OenFeign 是一个声明式的WebService客户端,使用openfeign 能让编写Web Service更简单

它的使用方式是定义一个服务接口然后在上面加注解. Feign也支持拔插式的编码器和解码器.Spring Cloud对Feign进行了封装,使其支持Spring MVC标准注解和HttpMessageConverters. Feigh可以与Eureka和RIbbon组合使用以支持负载均衡.

### 2 OpenFeign 使用步骤

* 微服务调用接口+@FeignClient

### 3 OpenFeign超时控制

### 4 OpenFeign 日志打印