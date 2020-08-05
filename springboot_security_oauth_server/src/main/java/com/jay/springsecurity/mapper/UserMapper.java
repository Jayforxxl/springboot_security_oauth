package com.jay.springsecurity.mapper;import com.jay.springsecurity.domain.SysUser;import org.apache.ibatis.annotations.Many;import org.apache.ibatis.annotations.Result;import org.apache.ibatis.annotations.Results;import org.apache.ibatis.annotations.Select;import java.util.List;public interface UserMapper{    @Select("select * from sys_user where username = #{username}")    @Results({            @Result(id = true,property = "id",column = "id"),            @Result(property = "roles",column = "id",javaType = List.class,many = @Many(select = "com.jay.springsecurity.mapper.RoleMapper.findByUid"))    })    public SysUser findByName(String username);}