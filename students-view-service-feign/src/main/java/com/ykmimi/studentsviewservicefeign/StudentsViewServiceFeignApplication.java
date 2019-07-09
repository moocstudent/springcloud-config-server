package com.ykmimi.studentsviewservicefeign;

import com.ykmimi.eurekaserver.utils.PortUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class StudentsViewServiceFeignApplication {

    public static void main(String[] args) {
        int port = PortUtil.setPort(0,"请输入StudentsViewServiceFeignApplication的端口号,推荐8012.",8012);
        new SpringApplicationBuilder(StudentsViewServiceFeignApplication.class).properties("server.port="+port).run(args);
    }

}
