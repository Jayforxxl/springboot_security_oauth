package com.jay.springsecurity.domain;import com.fasterxml.jackson.annotation.JsonIgnore;import org.springframework.security.core.GrantedAuthority;import org.springframework.security.core.userdetails.UserDetails;import java.util.Collection;import java.util.List;/** * OAuth2会自动帮助我们做用户是否已经在资源服务器登录的判断 * 用户必须先在资源服务器登录因为需要用户同意服务资源服务器 * 只需要我们导入认证时自定义的pojo */public class SysUser implements UserDetails {    private Integer id;    private String username;    private String password;    private Integer status;    private List<SysRole> roles;    public Integer getId() {        return id;    }    public void setId(Integer id) {        this.id = id;    }    public void setUsername(String username) {        this.username = username;    }    public void setPassword(String password) {        this.password = password;    }    public Integer getStatus() {        return status;    }    public void setStatus(Integer status) {        this.status = status;    }    public List<SysRole> getRoles() {        return roles;    }    public void setRoles(List<SysRole> roles) {        this.roles = roles;    }    @JsonIgnore    @Override    public Collection<? extends GrantedAuthority> getAuthorities() {        return roles;    }    @Override    public String getPassword() {        return this.password;    }    @Override    public String getUsername() {        return this.username;    }    @JsonIgnore    @Override    public boolean isAccountNonExpired() {        return this.status == 1;    }    @JsonIgnore    @Override    public boolean isAccountNonLocked() {        return this.status == 1;    }    @JsonIgnore    @Override    public boolean isCredentialsNonExpired() {        return this.status == 1;    }    @JsonIgnore    @Override    public boolean isEnabled() {        return this.status == 1;    }}