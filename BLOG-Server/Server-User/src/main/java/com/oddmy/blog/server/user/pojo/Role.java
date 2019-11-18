package com.oddmy.blog.server.user.pojo;

import com.oddmy.blog.server.user.pojo.base.BasePojo;

/**
 * 角色实体类
 *
 * @author fish
 * @date 2019/10/30 9:29
 */
public class Role extends BasePojo {

    /** 父类id */
    private Long parentId;
    /** 角色名称 */
    private String name;
    /** 角色简介 */
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
