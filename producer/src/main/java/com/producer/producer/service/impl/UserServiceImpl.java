package com.producer.producer.service.impl;

import com.producer.producer.dto.User;
import com.producer.producer.mapper.UserMapper;
import com.producer.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;

import java.util.List;

@Service
@EnableScheduling
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Autowired
    private TransactionDefinition transactionDefinition;

    @Value("${server.port}")
    private int port;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
