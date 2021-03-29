package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.bean.Role;
import com.example.server.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<com.example.server.bean.User> {

//嵌套数据方式
    User getRolesByUserId( int userId);
//嵌套查询方式
    User getRolesByUserId_1( int userId);
    User loadUserByUsername(@Param("userName") String userName);
    List<User> getAllUser();

}
