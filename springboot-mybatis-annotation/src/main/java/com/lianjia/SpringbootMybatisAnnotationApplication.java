package com.lianjia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author panli
 * SpringBoot启动类
 * @date 2019.01.23
 */
@SpringBootApplication
public class SpringbootMybatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisAnnotationApplication.class, args);
    }

}

