package com.yanbin.shardingjdbc.dao;

import com.yanbin.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface User2Mapper  {

    @Select("select * from user where id = #{id} and 1 = 1")
    User getById(int id);
}
