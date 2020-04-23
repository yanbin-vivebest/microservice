package com.producer.producer.mapper;

import com.producer.producer.dto.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from public.producer_test")
    List<User> getUserList();

    @Insert("insert into user values(#{id},#{name})")
    int insertUser(User user);
}
