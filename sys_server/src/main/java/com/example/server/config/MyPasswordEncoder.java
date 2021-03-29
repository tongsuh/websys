package com.example.server.config;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * 用于在插入新用户是给密码加密
 */
@Component
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes()));
    }
}
