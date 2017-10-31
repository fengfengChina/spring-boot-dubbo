package com.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 权限分栏表
 *
 * @author zf
 * @date 2017/10/31
 */
@Entity
@Table
public class ActionColumn {
    private Integer actionColumnId;
    private String actionColumnName;

    public ActionColumn() {
    }

    public ActionColumn(Integer actionColumnId, String actionColumnName) {
        this.actionColumnId = actionColumnId;
        this.actionColumnName = actionColumnName;
    }

    public Integer getActionColumnId() {
        return actionColumnId;
    }

    public void setActionColumnId(Integer actionColumnId) {
        this.actionColumnId = actionColumnId;
    }

    public String getActionColumnName() {
        return actionColumnName;
    }

    public void setActionColumnName(String actionColumnName) {
        this.actionColumnName = actionColumnName;
    }
}
