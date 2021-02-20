package com.yanbin.shardingjdbc.controller;

import com.yanbin.shardingjdbc.entity.User;
import com.yanbin.shardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    // http://localhost:8088/user/select
    @GetMapping("/select")
    public List<User> select(){
        return userService.list();
    }

    // http://localhost:8088/user/selectById?id=2   自动回去ds0库进行查询
    @GetMapping("/selectById")
    public User select(User user){
        return userService.getById(user.getId());
    }

    //http://localhost:8088/user/insert?id=1&name=1hd&age=12
    @GetMapping("/insert")
    public Boolean insert(User user){
        return userService.save(user);
    }
}
