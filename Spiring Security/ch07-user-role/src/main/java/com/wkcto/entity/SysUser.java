package com.wkcto.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class SysUser implements UserDetails {

    private Integer id;
    private String username;
    private String password;
    private String realname;

    private boolean isExpired;
    private boolean isLocked;
    private boolean isCredentials;
    private boolean isEnabled;


    private Date createTime;
    private Date loginTime;

    private List<GrantedAuthority> authorities;

    public SysUser() {
    }

    public SysUser(String username, String password, String realname,
                   boolean isExpired, boolean isLocked,
                   boolean isCredentials, boolean isEnabled,
                   Date createTime, Date loginTime,List<GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.isExpired = isExpired;
        this.isLocked = isLocked;
        this.isCredentials = isCredentials;
        this.isEnabled = isEnabled;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentials;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public Integer getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public String getRealname() {
        return realname;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void setCredentials(boolean credentials) {
        isCredentials = credentials;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", isExpired=" + isExpired +
                ", isLocked=" + isLocked +
                ", isCredentials=" + isCredentials +
                ", isEnabled=" + isEnabled +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                ", authorities=" + authorities +
                '}';
    }
}
