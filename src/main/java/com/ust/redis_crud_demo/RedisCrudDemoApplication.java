package com.ust.redis_crud_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
//@EnableRedisRepositories
public class RedisCrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCrudDemoApplication.class, args);
    }

}
