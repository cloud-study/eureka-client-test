package com.cloud.datasourcetest.dto;

import javax.persistence.Table;
import java.util.Date;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2018/2/26 20:41
 * @description
 */
@Table(name = "user")
public class User {
    private Integer userId;
    private String nickName;
    private String password;
    private String phone;
    private String email;
    private String validateCode;

    private Date createDate;
    private Integer createBy;
    private Date lastUpdateDate;
    private Integer lasUpdateBy;

    public Integer getUserId() {
        return userId;
    }

    public User setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public User setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public User setValidateCode(String validateCode) {
        this.validateCode = validateCode;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public User setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public User setCreateBy(Integer createBy) {
        this.createBy = createBy;
        return this;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public User setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    public Integer getLasUpdateBy() {
        return lasUpdateBy;
    }

    public User setLasUpdateBy(Integer lasUpdateBy) {
        this.lasUpdateBy = lasUpdateBy;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", validateCode='" + validateCode + '\'' +
                ", createDate=" + createDate +
                ", createBy=" + createBy +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lasUpdateBy=" + lasUpdateBy +
                '}';
    }
}
