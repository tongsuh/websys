package com.example.server;

import com.example.server.bean.Role;
import com.example.server.bean.User;
import com.example.server.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.runner.RunWith;

import java.util.List;

//
@RunWith(SpringRunner.class)
@SpringBootTest
class ServerApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void getAllUser() {
        System.out.println(("----- getAllUser method test ------"));
        User user;
        List<User> userList;
        //user = userMapper.getRolesByUserId(1);
        userList= userMapper.getAllUser();
//        user.setName("xiaobai");
//        user.setPassword("qaz123");

//        user =  userMapper.selectList(null);
         //System.out.println((user));
      userList.forEach(System.out :: println);
    }
    @Test
    void getRolesByUserId(){
        System.out.println(("----- getRolesByUserId method test ------"));
        User user;
        List<User> userList;
        user = userMapper.getRolesByUserId(1);
//        userList.forEach(System.out :: println);
       System.out.println((user));

    }
    @Test
    void getRolesByUserId_1(){
        System.out.println(("----- getRolesByUserId method test ------"));
        User user;
        List<User> userList;
        user = userMapper.getRolesByUserId_1(1);
//        userList.forEach(System.out :: println);
        System.out.println((user));

    }

    @Test
    void findRoleListBy(){
        System.out.println(("----- getRolesByUserId method test ------"));
        User user;
        List<User> userList;
        List<Role> roleList;
//        roleList = userMapper.findRoleListBy(1);
//        roleList.forEach(System.out :: println);
//        System.out.println((user));

    }

}
