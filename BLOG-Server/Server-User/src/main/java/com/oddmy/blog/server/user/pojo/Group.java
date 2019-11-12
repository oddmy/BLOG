package com.oddmy.blog.server.user.pojo;

import com.oddmy.blog.server.user.pojo.base.BasePojo;

/**
 * 用户组
 *
 * @author fish
 * @date 2019/10/31 11:03
 */
public class Group extends BasePojo {

    /** 父用户组id */
    private Long parentId;
    /** 用户组名称 */
    private String name;
    /** 用户组简介 */
    private String description;
    /** 是否禁用 */
    private Boolean enabled;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
