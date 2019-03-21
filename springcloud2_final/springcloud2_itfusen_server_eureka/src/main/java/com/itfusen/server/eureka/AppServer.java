package com.itfusen.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lifusen
 * @create 2019-03-20 10:33
 * @descri 注册中心
 **/
@SpringBootApplication
@EnableEurekaServer
public class AppServer {
    public static void main(String[] args) {
        SpringApplication.run(AppServer.class,args);
    }
}
