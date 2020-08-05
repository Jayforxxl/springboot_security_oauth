package com.jay.springsecurity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

/**
 * OAuth2会自动帮助我们做用户是否已经在资源服务器登录的判断
 * 用户必须先在资源服务器登录因为需要用户同意服务资源服务器
 * 只需要我们导入认证时自定义的pojo
 */
public class SysRole implements GrantedAuthority {

	private Integer id;
	private String roleName;
	private String roleDesc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@JsonIgnore //在Bean和Json相互转换的时候忽略此属性
	@Override
	public String getAuthority() {
		return this.roleName;
	}
}



