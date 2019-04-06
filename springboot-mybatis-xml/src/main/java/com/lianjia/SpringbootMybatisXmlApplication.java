package com.lianjia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的启动类
 * @author panli
 * @date 2019.01.23
 */
@SpringBootApplication
@MapperScan("com.lianjia.mapper")
public class SpringbootMybatisXmlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisXmlApplication.class, args);
    }
}

