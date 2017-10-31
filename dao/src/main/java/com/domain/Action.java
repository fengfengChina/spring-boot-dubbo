package com.domain;


import javax.persistence.*;

/**
 * 权限表
 *
 * @author zf
 * @date 2017/10/31
 */
@Entity
@Table
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer actionId;

    private String actionName;

    @OneToOne()
    @JoinColumn(name = "action_column_id")
    private ActionColumn actionColumn;

    private String action;


    public Action() {
    }

    public Action(Integer actionId, String actionName, String action) {
        this.actionId = actionId;
        this.actionName = actionName;
        this.action = action;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
