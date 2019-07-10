依次运行
1. zipkin-server文件夹中的jar文件(java -jar)
2. eurekaserver主类
3. students-data-service两次或多次
4. students-view-service-feign一次
5. 查看 http://127.0.0.1:8012/students 刷新几次 查看每次调用的不同服务(端口)
6. http://localhost:9411/zipkin/ 访问Find Traces,再查看依赖分析http://localhost:9411/zipkin/dependency/
7. 使用config-server,就启动config-server的启动类

访问配置信息的URL与配置文件的映射关系如下所示:
	
/{application}/{profile}[/{label}]
	
/{application}-{profile}.yml
	
/{label}/{application}-{profile}.yml
	
/{application}-{profile}.properties
	
/{label}/{application}-{profile}.properties

上面的url会映射{application}-{profile}.properties对应的配置文件, 
其中{label}对应Git上不同的分支,默认为master. 
我们可以尝试构造不同的url来访问不同的配置内容,
比如, 要访问config-label-test分支,helloukyo的prod环境,
就访问  http://localhost:8030/helloukyo/prod/config-label-test


![img](zipkin1.png) <br>
看到使用者是 Used by (所使用) , Uses (使用) <br>
![img](zipkin2.png) <br>
也就是说 students-data-service 服务使用了 students-view-service-feign 来作为客户端负载均衡. <br>