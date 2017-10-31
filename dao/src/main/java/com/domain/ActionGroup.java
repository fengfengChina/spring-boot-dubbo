package com.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 权限映射表
 *
 * @author zf
 * @date 2017/10/31
 */
@Entity
@Table
public class ActionGroup {
    private Integer actionGroupId;
    private String action;
    private Integer groupId;
    private Integer masterId;
    private String masterName;
    private String createTime;

    public ActionGroup() {
    }

    public ActionGroup(Integer actionGroupId, String action, Integer groupId, Integer masterId, String masterName, String createTime) {
        this.actionGroupId = actionGroupId;
        this.action = action;
        this.groupId = groupId;
        this.masterId = masterId;
        this.masterName = masterName;
        this.createTime = createTime;
    }

    public Integer getActionGroupId() {
        return actionGroupId;
    }

    public void setActionGroupId(Integer actionGroupId) {
        this.actionGroupId = actionGroupId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
