package com.ykmimi.eurekaserver;

import com.ykmimi.eurekaserver.utils.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		int port = PortUtil.setPort(0,"",8761);
		new SpringApplicationBuilder(EurekaserverApplication.class).properties("server.port="+port).run(args);
	}

}
