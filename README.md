# micro_service
Eureka：注册中心
Zuul：服务网关
Ribbon：负载均衡
Feign：服务调用
Hystrix：熔断器

order服务：http://localhost:8762/show
customer服务：http://localhost:8763/show
order调用customer服务：http://localhost:8762/c/get/222
