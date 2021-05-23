package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@DynamicUpdate(true)
@Entity
@Table(name = "student")
public class Student implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8201684736204639954L;
	@Id
    private String id;
	@Column(updatable=false)
    private String password;
    @Column(updatable=false)
    private String classid;
    @Column(updatable=false)
    private String name;
    @Column(updatable=false)
    private String sex;
    @Column(updatable=false)
    private java.util.Date birthday;
    @Column(updatable=false)
    private String qinshiid;
    @Column(updatable=false)
    private String longno;
    @Column(updatable=false)
    private String shortno;
    @Column(updatable=false)
    private String address;
    @Column(updatable=false)
    private String idcard;
    @Column(updatable=false)
    private String postno;
    @Column(updatable=false)
    private String fname;
    @Column(updatable=false)
    private String mname;
    @Column(updatable=false)
    private String zzmm;

    public void setId(String value) {
        this.id = value;
    }
    public String getId() {
       return this.id;
    }
    public void setPassword(String value) {
        this.password = value;
    }
    public String getPassword() {
       return this.password;
    }
    public void setClassid(String value) {
        this.classid = value;
    }
    public String getClassid() {
       return this.classid;
    }
    public void setName(String value) {
        this.name = value;
    }
    public String getName() {
       return this.name;
    }
    public void setSex(String value) {
        this.sex = value;
    }
    public String getSex() {
       return this.sex;
    }
    public void setBirthday(java.util.Date value) {
        this.birthday = value;
    }
    public java.util.Date getBirthday() {
       return this.birthday;
    }
    public void setQinshiid(String value) {
        this.qinshiid = value;
    }
    public String getQinshiid() {
       return this.qinshiid;
    }
    public void setLongno(String value) {
        this.longno = value;
    }
    public String getLongno() {
       return this.longno;
    }
    public void setShortno(String value) {
        this.shortno = value;
    }
    public String getShortno() {
       return this.shortno;
    }
    public void setAddress(String value) {
        this.address = value;
    }
    public String getAddress() {
       return this.address;
    }
    public void setIdcard(String value) {
        this.idcard = value;
    }
    public String getIdcard() {
       return this.idcard;
    }
    public void setPostno(String value) {
        this.postno = value;
    }
    public String getPostno() {
       return this.postno;
    }
    public void setFname(String value) {
        this.fname = value;
    }
    public String getFname() {
       return this.fname;
    }
    public void setMname(String value) {
        this.mname = value;
    }
    public String getMname() {
       return this.mname;
    }
    public void setZzmm(String value) {
        this.zzmm = value;
    }
    public String getZzmm() {
       return this.zzmm;
    }
}
