package com.producer.producer.component;

import com.producer.producer.dto.User;
import com.producer.producer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SchedulerTask {

    @Autowired
    private UserMapper userMapper;

    //@Scheduled(cron="1 * * * * ?")
    public void execAmluClear() {

        System.out.println("准备插入用户...,当前时间:" + new Date().toLocaleString());

        int effectRow = 0;

        User user = new User();
        user.setId("myid");
        user.setName("myname");

        try {
            effectRow = userMapper.insertUser(user);
        }catch (Exception e){
            System.out.println("已有节点执行任务，当前节点无需执行.");
            return;
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(effectRow == 0){
            System.out.println("已有节点执行任务，当前节点无需执行.");
            return;
        }

        System.out.println("当前节点正在执行任务...");
        System.out.println("任务执行完成...");
    }
}
