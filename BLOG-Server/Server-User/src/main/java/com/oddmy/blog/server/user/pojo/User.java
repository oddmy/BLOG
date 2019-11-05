package com.oddmy.blog.server.user.pojo;

import com.oddmy.blog.server.user.pojo.base.BasePojo;

import java.sql.Date;

/**
 * 用户实体类
 *
 * @author fish
 * @date 2019/10/29 9:30
 */
public class User extends BasePojo {

    /** 所属组织id */
    private Long organizationId;
    /** 用户名-登录名称 */
    private String userName;
    /** 用户密码 */
    private String password;
    /** 用户手机 */
    private String mobile;
    /** 用户邮箱(校验使用) */
    private String email;
    /** 标识（激活字段，临时授权等） */
    private String token;
    /** 用户是否被禁用 */
    private boolean enabled;
    /** 最后一次登录时间 */
    private Date loginTime;

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
