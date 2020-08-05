package com.jay.springsecurity.mapper;import com.jay.springsecurity.domain.SysRole;import org.apache.ibatis.annotations.Select;import java.util.List;public interface RoleMapper{    @Select("select r.ID id,r.ROLE_NAME roleName,r.ROLE_DESC roleDesc from sys_role r,sys_user_role ur where r.id = ur.rid and ur.uid =#{uid}")    public List<SysRole> findByUid(Integer uid);}