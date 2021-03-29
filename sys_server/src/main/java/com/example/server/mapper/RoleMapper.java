package com.example.server.mapper;

import com.example.server.bean.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    List<Role> getRolesByUid(int uid);
}
