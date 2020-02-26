package com.outdd.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages= {"com.outdd.oauth.feign","com.outdd.api"})
@SpringBootApplication
@ComponentScan(basePackages= {"com.outdd"})
public class AwmOauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwmOauthServerApplication.class, args);
    }

}
