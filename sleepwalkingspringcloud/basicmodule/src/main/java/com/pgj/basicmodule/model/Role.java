package com.pgj.basicmodule.model;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer roleId;

    private String roleName;

    private String roleGrades;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleGrades() {
        return roleGrades;
    }

    public void setRoleGrades(String roleGrades) {
        this.roleGrades = roleGrades == null ? null : roleGrades.trim();
    }
}