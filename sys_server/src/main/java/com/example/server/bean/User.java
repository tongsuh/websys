package com.example.server.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;


@Data
public class User implements UserDetails {
    @TableId(type = IdType.AUTO)//设置主键自增
    private int userId;
    private String userName;
    private String password;
    private String phoneNumber;
    private List<Role> roleList;

    private boolean enabled;

    //这个方法覆盖了lombok的getUserName()
    public String getUsername() {
        return userName;
    }

    @Override
    @JsonIgnore
    public List<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roleList) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return authorities;
    }
    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



}
