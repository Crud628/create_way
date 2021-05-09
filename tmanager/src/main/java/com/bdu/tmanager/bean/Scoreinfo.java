package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "scoreinfo")
public class Scoreinfo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3894598024612263665L;
	@Id
    private Integer autono;
    private java.util.Date jtime;
    private String id;
    private String scoretype;
    private String content;
    private Integer score;
    private String recorderid;
    private String object;

    public void setAutono(Integer value) {
        this.autono = value;
    }
    public Integer getAutono() {
       return this.autono;
    }
    public void setJtime(java.util.Date value) {
        this.jtime = value;
    }
    public java.util.Date getJtime() {
       return this.jtime;
    }
    public void setId(String value) {
        this.id = value;
    }
    public String getId() {
       return this.id;
    }
    public void setScoretype(String value) {
        this.scoretype = value;
    }
    public String getScoretype() {
       return this.scoretype;
    }
    public void setContent(String value) {
        this.content = value;
    }
    public String getContent() {
       return this.content;
    }
    public void setScore(Integer value) {
        this.score = value;
    }
    public Integer getScore() {
       return this.score;
    }
    public void setRecorderid(String value) {
        this.recorderid = value;
    }
    public String getRecorderid() {
       return this.recorderid;
    }
    public void setObject(String value) {
        this.object = value;
    }
    public String getObject() {
       return this.object;
    }
}
