package com.producer.producer.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 定义事件监听器
 *
 * @author Administrator
 */
@Component
public class MyListener implements ApplicationListener<ApplicationReadyEvent> {
    public static CountDownLatch HSM_COUNTDOWN_LATCH = new CountDownLatch(1);
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        try {
            System.out.println("等待5分钟");
            long begin = System.currentTimeMillis();
            HSM_COUNTDOWN_LATCH.await(1, TimeUnit.MINUTES);
            long end = System.currentTimeMillis();
            if(end-begin >= 1*60*1000){
                System.out.println("等待超过5分钟了。。。");
                System.out.println("发送心跳包");
            }else{
                System.out.println("重新等待...");
            }
            HSM_COUNTDOWN_LATCH = new CountDownLatch(1);
            this.onApplicationEvent(applicationReadyEvent);
        } catch (InterruptedException e) {
            System.out.println("其他异常！");
        }

    }


}
