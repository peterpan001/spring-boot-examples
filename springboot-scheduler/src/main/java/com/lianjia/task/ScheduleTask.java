package com.lianjia.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * SpringBoot定时任务
 * @author panli
 * @date 2019.01.23
 */
@Component
public class ScheduleTask {

    private int count = 0;

    @Scheduled(cron="*/6 * * * * ?")
    public void process(){
        System.out.println("this is scheduler task running " + (count++));
    }
}
