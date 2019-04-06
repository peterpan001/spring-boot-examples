package com.lianjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBoot启动类
 * @author panli
 * @date 2019.01.23
 */
@SpringBootApplication
@EnableScheduling
public class SpringbootSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSchedulerApplication.class, args);
    }

}

