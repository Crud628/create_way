package com.lan.dailywork.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_task")
public class Task implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8499004811371090026L;
	
	@Id
    private Integer taskId;
    private Integer typeId;
    private String content;
    private String uuid;
    private String schedule;
    private String scheduleDescription;
    private Integer status;
    private java.util.Date createTime;
    private java.util.Date updateTime;
    private java.util.Date startTime;
    private java.util.Date endTime;

    public void setTaskId(Integer value) {
        this.taskId = value;
    }
    public Integer getTaskId() {
       return this.taskId;
    }
    public void setTypeId(Integer value) {
        this.typeId = value;
    }
    public Integer getTypeId() {
       return this.typeId;
    }
    public void setContent(String value) {
        this.content = value;
    }
    public String getContent() {
       return this.content;
    }
    public void setUuid(String value) {
        this.uuid = value;
    }
    public String getUuid() {
       return this.uuid;
    }
    public void setSchedule(String value) {
        this.schedule = value;
    }
    public String getSchedule() {
       return this.schedule;
    }
    public void setScheduleDescription(String value) {
        this.scheduleDescription = value;
    }
    public String getScheduleDescription() {
       return this.scheduleDescription;
    }
    public void setStatus(Integer value) {
        this.status = value;
    }
    public Integer getStatus() {
       return this.status;
    }
    public void setCreateTime(java.util.Date value) {
        this.createTime = value;
    }
    public java.util.Date getCreateTime() {
       return this.createTime;
    }
    public void setUpdateTime(java.util.Date value) {
        this.updateTime = value;
    }
    public java.util.Date getUpdateTime() {
       return this.updateTime;
    }
    public void setStartTime(java.util.Date value) {
        this.startTime = value;
    }
    public java.util.Date getStartTime() {
       return this.startTime;
    }
    public void setEndTime(java.util.Date value) {
        this.endTime = value;
    }
    public java.util.Date getEndTime() {
       return this.endTime;
    }
}
