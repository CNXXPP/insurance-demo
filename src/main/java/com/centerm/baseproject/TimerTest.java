package com.centerm.baseproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimerTest {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0 0/20 * * * ?")
    public void printTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info(localDateTime.toString());
    }
}
