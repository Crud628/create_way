package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "classteacher")
public class Classteacher implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7841073340387679256L;
	@Id
    private String classid;
    private String teacherid;

    public void setClassid(String value) {
        this.classid = value;
    }
    public String getClassid() {
       return this.classid;
    }
    public void setTeacherid(String value) {
        this.teacherid = value;
    }
    public String getTeacherid() {
       return this.teacherid;
    }
}
