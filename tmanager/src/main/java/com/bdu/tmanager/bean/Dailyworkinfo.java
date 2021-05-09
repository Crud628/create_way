package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "dailyworkinfo")
public class Dailyworkinfo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1402926475009516647L;
	@Id
    private String autono;
    private String typeid;
    private String teacherid;
    private java.util.Date dailytime;
    private String address;
    private String phoneno;
    private String studentid;
    private String content;

    public void setAutono(String value) {
        this.autono = value;
    }
    public String getAutono() {
       return this.autono;
    }
    public void setTypeid(String value) {
        this.typeid = value;
    }
    public String getTypeid() {
       return this.typeid;
    }
    public void setTeacherid(String value) {
        this.teacherid = value;
    }
    public String getTeacherid() {
       return this.teacherid;
    }
    public void setDailytime(java.util.Date value) {
        this.dailytime = value;
    }
    public java.util.Date getDailytime() {
       return this.dailytime;
    }
    public void setAddress(String value) {
        this.address = value;
    }
    public String getAddress() {
       return this.address;
    }
    public void setPhoneno(String value) {
        this.phoneno = value;
    }
    public String getPhoneno() {
       return this.phoneno;
    }
    public void setStudentid(String value) {
        this.studentid = value;
    }
    public String getStudentid() {
       return this.studentid;
    }
    public void setContent(String value) {
        this.content = value;
    }
    public String getContent() {
       return this.content;
    }
}
