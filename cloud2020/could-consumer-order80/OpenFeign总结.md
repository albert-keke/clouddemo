### 1 OpenFeign是什么?

官网:https://spring.io/projects/spring-cloud-openfeign

OenFeign 是一个声明式的WebService客户端,使用openfeign 能让编写Web Service更简单

它的使用方式是定义一个服务接口然后在上面加注解. Feign也支持拔插式的编码器和解码器.Spring Cloud对Feign进行了封装,使其支持Spring MVC标准注解和HttpMessageConverters. Feigh可以与Eureka和RIbbon组合使用以支持负载均衡.

### 2 OpenFeign 使用步骤

* 引入jar包

  ```xml
  		<!--引入feigh-->
          <dependency>
              <groupId>org.springframework.cloud</groupId>
              <artifactId>spring-cloud-starter-openfeign</artifactId>
          </dependency>
  ```

* 修改yml

* 主启动加激活注解 ` @EnableFeignClients

* 业务逻辑接口+@FeignClient配置调用provider服务

  ![1592033438129](H:\gitd\clouddemo\cloud2020\image\ribbon\1592033438129.png)

### 3 OpenFeign超时控制

openfeign默认等待时长1s

设置超时

* 修改yml配置

  ![1592034795805](H:\gitd\clouddemo\cloud2020\image\ribbon\1592034795805.png)

### 4 OpenFeign 日志打印

日志级别:

​	NONE: 默认,不显示任何日志

​	BASIC：仅记录请求方法，URL，相应状态码以及执行时间

​	HEADERS: 在basic的基础上增加请求和响应的头信息

​	FULL: 在headers的基础上增加请求和相应的正文及元数据

怎么实现?

* 新建配置类FeignConfig

![1592035275399](H:\gitd\clouddemo\cloud2020\image\ribbon\1592035275399.png)

* 在yml开启日志配置

  ![1592035642051](H:\gitd\clouddemo\cloud2020\image\ribbon\1592035642051.png)