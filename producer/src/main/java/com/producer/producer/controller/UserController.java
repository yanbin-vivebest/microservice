package com.producer.producer.controller;

import com.producer.producer.dto.User;
import com.producer.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public Object getUserList() {
        List<User> user = userService.getUserList();
        return user;
    }

    @GetMapping(value = "/insert")
    public Object insetUser(String id, String name) {
        int effectRow =0;
        User user = new User();
        user.setId(id);
        user.setName(name);
        try {
            effectRow = userService.insertUser(user);
        } catch (Exception e) {
            System.out.println("插入用户报错，报错异常:" + e.getMessage());
        }
        if(effectRow == 0){
            return "已有其他节点执行清空任务.";
        }
        return "成功插入!";
    }
}
