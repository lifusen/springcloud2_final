package com.itfusen.api.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lifusen
 * @create 2019-03-20 10:54
 * @descri
 **/
@SpringBootApplication
@EnableEurekaClient
public class AppMemberServer {

    public static void main(String[] args)
    {
        SpringApplication.run(AppMemberServer.class,args);
    }

}
