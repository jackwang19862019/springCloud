package com.cloud.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServerApplication {

    public static void main(String[] args) {
        int port = 8080;
        new SpringApplicationBuilder(CloudServerApplication.class).properties("server.port=" + port).run(args);
        //SpringApplication.run(CloudServerApplication.class, args);
    }

}
