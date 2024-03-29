package com.ys.springbootcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcacheApplication.class, args);
    }

}
