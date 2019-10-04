package com.pgj.basicmodule.model;

import java.io.Serializable;

public class Amount implements Serializable {
    private Long amountId;

    private String amountName;

    private Integer phone;

    private String email;

    private String address;

    private String qq;

    private String password;

    private String role;

    private static final long serialVersionUID = 1L;

    public Long getAmountId() {
        return amountId;
    }

    public void setAmountId(Long amountId) {
        this.amountId = amountId;
    }

    public String getAmountName() {
        return amountName;
    }

    public void setAmountName(String amountName) {
        this.amountName = amountName == null ? null : amountName.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}