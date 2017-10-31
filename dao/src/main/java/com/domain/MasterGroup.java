package com.domain;

import javax.persistence.*;

/**
 * 组 和 人员映射表
 *
 * @author zf
 * @date 2017/10/31
 */
@Entity
@Table
public class MasterGroup {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer masterGroupId;
    private Integer masterId;
    private String masterGroupName;
    private Integer groupId;
    private String masterName;
    private String createTime;

    public MasterGroup() {
    }

    public MasterGroup(Integer masterGroupId, Integer masterId, String masterGroupName, Integer groupId, String masterName, String createTime) {
        this.masterGroupId = masterGroupId;
        this.masterId = masterId;
        this.masterGroupName = masterGroupName;
        this.groupId = groupId;
        this.masterName = masterName;
        this.createTime = createTime;
    }

    public Integer getMasterGroupId() {
        return masterGroupId;
    }

    public void setMasterGroupId(Integer masterGroupId) {
        this.masterGroupId = masterGroupId;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public String getMasterGroupName() {
        return masterGroupName;
    }

    public void setMasterGroupName(String masterGroupName) {
        this.masterGroupName = masterGroupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
