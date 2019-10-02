package com.pgj.basicmodule.model;

import java.io.Serializable;
import java.util.Date;

public class Dream implements Serializable {
    private Integer dreamId;

    private Date createDate;

    private Date updateDate;

    private Byte isDelete;

    private String dreamTxt;

    private static final long serialVersionUID = 1L;

    public Integer getDreamId() {
        return dreamId;
    }

    public void setDreamId(Integer dreamId) {
        this.dreamId = dreamId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getDreamTxt() {
        return dreamTxt;
    }

    public void setDreamTxt(String dreamTxt) {
        this.dreamTxt = dreamTxt == null ? null : dreamTxt.trim();
    }
}