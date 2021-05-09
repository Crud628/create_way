package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 896467577739145410L;
	@Id
    private String id;
    private String password;
    private String name;
    private String sex;
    private String longno;
    private String shortno;

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
}
