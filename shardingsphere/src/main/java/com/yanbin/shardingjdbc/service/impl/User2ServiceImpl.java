package com.yanbin.shardingjdbc.service.impl;

import com.yanbin.shardingjdbc.dao.User2Mapper;
import com.yanbin.shardingjdbc.entity.User;
import com.yanbin.shardingjdbc.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User2ServiceImpl implements User2Service {


    @Autowired
    private User2Mapper user2Mapper;

    @Override
    public User getById(int id) {
        return user2Mapper.getById(id);
    }
}
