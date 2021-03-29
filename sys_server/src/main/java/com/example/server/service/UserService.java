package com.example.server.service;

import com.example.server.bean.Role;
import com.example.server.bean.User;
import com.example.server.mapper.UserMapper;
import com.example.server.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//  /*
//  登录
//  更改密码
//     输入两次密码
//    未定功能（需要短信服务）
//      通过手机号注册
//      更改手机号
//  */

@Service
//@Transactional//声明式事务管理 编程中使用的注解
public class UserService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if (user == null) {
            //避免返回null，这里返回一个不含有任何值的User对象，在后期的密码比对过程中一样会验证失败
            return new User();
        }
        //查询用户的角色信息，并返回存入user中
        List<Role> roles = roleMapper.getRolesByUid(user.getUserId());
        user.setRoleList(roles);
        return user;
    }
}
