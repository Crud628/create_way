package com.lan.dailywork.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_task_type")
public class TaskType implements Serializable {

    @Id
    private Integer taskTypeId;
    private String typeDescription;

    public void setTaskTypeId(Integer value) {
        this.taskTypeId = value;
    }
    public Integer getTaskTypeId() {
       return this.taskTypeId;
    }
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }
    public String getTypeDescription() {
       return this.typeDescription;
    }
}
