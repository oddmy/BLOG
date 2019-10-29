package com.oddmy.blog.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO description
 *
 * @author fish
 * @date 2019/10/29 10:58
 */
@EnableEurekaServer
@SpringBootApplication
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }
}
