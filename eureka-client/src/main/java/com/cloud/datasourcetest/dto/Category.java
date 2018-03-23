package com.cloud.datasourcetest.dto;

import javax.persistence.Table;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:48
 * @description
 */
@Table(name = "category")
public class Category {
    private Integer id;
    private String name;
    private String descr;
    private Integer pid;
    private Integer level;

    public Integer getId() {
        return id;
    }

    public Category setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescr() {
        return descr;
    }

    public Category setDescr(String descr) {
        this.descr = descr;
        return this;
    }

    public Integer getPid() {
        return pid;
    }

    public Category setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Category setLevel(Integer level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                ", pid=" + pid +
                ", level=" + level +
                '}';
    }
}
