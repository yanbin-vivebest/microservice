package com.yanbin.shardingjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yanbin.shardingjdbc.dao.UserMapper;
import com.yanbin.shardingjdbc.entity.User;
import com.yanbin.shardingjdbc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
