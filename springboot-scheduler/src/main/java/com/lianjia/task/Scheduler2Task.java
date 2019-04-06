package com.lianjia.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务
 * @author panli
 * @date 2019.01.23
 *
 *fixedRate说明
 * @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
 * @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
 * @Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
 *
 * @Scheduled参数可以接受两种定时的设置
 * 一种是我们常用的corn
 * 一种是fixedRate
 */
@Component
public class Scheduler2Task {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime(){
        System.out.println("现在的时间:" +  dateFormat.format(new Date()));
    }

}
