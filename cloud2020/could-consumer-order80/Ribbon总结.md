## 1. Ribbon是什么？

Spring Cloud Ribbon 是基于Netflix Ribbon实现的一套客户端负载均衡工具，主要功能是提供客户端的软件负载均衡算法和服务调用。 

官网：https://github.com/Netflix/ribbon/wiki/Getting-Started

就覆盖均衡功能而言，与Nginx，LVS有何区别？

​		Nginx是服务器服务均衡，客户端所有请求都会交给Nginx,然后由Nginx实现转发请求。始于集中式LB。

​		Ribbon是本地负载均衡，在调用微服务接口时，会在注册中心获取注册信息服务列表之后缓存到JVM本地，从而在本地实现RPC远程服务调用技术。属于进程内LB。

## 2. Ribbon负载均衡

流程

![1592016213763](H:\gitd\clouddemo\cloud2020\image\ribbon\1592016213763.png)

分两步:

1. 先选择eurekaService,它优先选择在同一个区域(集群环境)内负载较少的service.

2. 根据用户指定的策略(ribbon提供7中默认策略,后面讲),在service中取到服务注册列表中选择一个地址.

   默认轮询算法使用   即负载均衡+RestTemplate调用

   1. 引入maven gav     netflix-eureka-client已经集成,无需额外引入

   2. RestTemplate配置

      ![1592023260504](H:\gitd\clouddemo\cloud2020\image\ribbon\1592023260504.png)

   3. RestTemplate 注入使用类,提供getForObject(),getForEntity(),postForGetObject,postForEntity()等方法.

## 3. Ribbon 核心组件 IRule

轮询(默认),随机,重试,权重等

 ![点击查看源网页](H:\gitd\clouddemo\cloud2020\image\ribbon\vaIjem.png)

![1592024094374](H:\gitd\clouddemo\cloud2020\image\1592024094374.png) 

1. 如何替换默认算法

   * 在非@ComponentScan扫描包及其子包下新建一个自定义配置类

     ![1592024438821](H:\gitd\clouddemo\cloud2020\image\ribbon\1592024438821.png)

   * 主启动类增加注解  

     ![1592024674064](H:\gitd\clouddemo\cloud2020\image\ribbon\1592024674064.png)

2. 如何做一个算法拓展

   什么是负载均衡算法:

   ​		rest接口第几次请求数量%服务集群总数 = 实际调用服务位置的下标,每次重启服务接口技术从1开始.

   * 注释原@LoadBalanced 注解

   * 新建一个负载算法接口,入参为服务实例表,出参为调用服务实例

     ![1592025483108](H:\gitd\clouddemo\cloud2020\image\ribbon\1592025483108.png)

   * 实现算法接口,原理是乐观自旋锁  得到请求次数

     ![1592025654796](H:\gitd\clouddemo\cloud2020\image\ribbon\1592025654796.png)

     



