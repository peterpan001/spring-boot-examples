package com.lianjia.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LianjiaPropertiesTest {

    @Autowired
    private LianjiaProperties lianjiaProperties;

    @Test
    public void getHello()throws Exception{
        System.out.println(lianjiaProperties.getTitle());
        System.out.println(lianjiaProperties.getDescription());
        Assert.assertEquals(lianjiaProperties.getTitle(),"小瓜牛");
        Assert.assertEquals(lianjiaProperties.getDescription(),"学习技术");
    }

}
