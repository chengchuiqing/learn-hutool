package com.qing.tree.domain;


import java.io.Serializable;
import java.time.LocalDateTime;


public class SysResource {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long parentId;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
	1-按钮
	2-菜单
     */
    private Integer type;

    /**
     * 权限表示
     */
    private String permission;

    /**
     * 路由地址
     */
    private String routePath;

    /**
     * 图标
     */
    private String icon;

    /**
     * 
     */
    private LocalDateTime createTime;

    /**
     * 
     */
    private LocalDateTime updateTime;

    /**
     * 排序
     */
    private Integer resSort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRoutePath() {
        return routePath;
    }

    public void setRoutePath(String routePath) {
        this.routePath = routePath;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getResSort() {
        return resSort;
    }

    public void setResSort(Integer resSort) {
        this.resSort = resSort;
    }
}