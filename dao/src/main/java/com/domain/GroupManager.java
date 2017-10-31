package com.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 管理组表
 *
 * @author zf
 * @date 2017/10/31
 */
@Entity
@Table
public class GroupManager {
    private Integer groupManagerId;
    private String groupName;
    private String groupInfo;
    private Integer masterId;
    private String masterName;
    private String createTime;

    public GroupManager() {
    }

    public GroupManager(Integer groupManagerId, String groupName, String groupInfo, Integer masterId, String masterName, String createTime) {
        this.groupManagerId = groupManagerId;
        this.groupName = groupName;
        this.groupInfo = groupInfo;
        this.masterId = masterId;
        this.masterName = masterName;
        this.createTime = createTime;
    }

    public Integer getGroupManagerId() {
        return groupManagerId;
    }

    public void setGroupManagerId(Integer groupManagerId) {
        this.groupManagerId = groupManagerId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(String groupInfo) {
        this.groupInfo = groupInfo;
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
