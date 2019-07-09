package com.ykmimi.studentsdataservice;

import com.ykmimi.studentsdataservice.utils.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentsDataServiceApplication {

    public static void main(String[] args) {
        int port = PortUtil.setPort(3,"请输入StudentsDataServiceApplication的端口号,推荐8001,8002,8003.",8001);
        new SpringApplicationBuilder(StudentsDataServiceApplication.class).properties("server.port="+port).run(args);
    }

}
