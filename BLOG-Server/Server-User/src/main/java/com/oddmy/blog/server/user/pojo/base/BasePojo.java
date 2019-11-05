package com.oddmy.blog.server.user.pojo.base;

import java.util.Date;

/**
 * 实体类基础类
 *
 * @author fish
 * @date 2019/10/31 10:57
 */
public class BasePojo {

    /** 唯一标识 */
    private Long id;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
