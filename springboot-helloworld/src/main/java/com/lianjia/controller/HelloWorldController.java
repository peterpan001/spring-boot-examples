package com.lianjia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panli
 * SpringBoot入门
 *  RestController为返回json风格
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot!";
    }
}
