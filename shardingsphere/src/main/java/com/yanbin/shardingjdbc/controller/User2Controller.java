package com.yanbin.shardingjdbc.controller;

import com.yanbin.shardingjdbc.entity.User;
import com.yanbin.shardingjdbc.service.User2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user2")
@Slf4j
public class User2Controller {
    @Autowired
    private User2Service user2Service;

    @GetMapping("/selectById")
    public User select(User user){
        log.info("user2------------------");
        return user2Service.getById(user.getId());
    }

}
