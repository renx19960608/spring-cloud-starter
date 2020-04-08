package com.bhw.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerCenterBootStarp {

    public static void main(String[] args){
        SpringApplication.run(ServerCenterBootStarp.class,args);
    }
}
