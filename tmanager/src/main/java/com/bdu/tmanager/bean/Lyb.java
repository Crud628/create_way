package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "lyb")
public class Lyb implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2157574077850204200L;
	@Id
    private Integer lno;
    private String ltime;
    private String lcontent;
    private String lid;
    private String lteacherid;

    public void setLno(Integer value) {
        this.lno = value;
    }
    public Integer getLno() {
       return this.lno;
    }
    public void setLtime(String value) {
        this.ltime = value;
    }
    public String getLtime() {
       return this.ltime;
    }
    public void setLcontent(String value) {
        this.lcontent = value;
    }
    public String getLcontent() {
       return this.lcontent;
    }
    public void setLid(String value) {
        this.lid = value;
    }
    public String getLid() {
       return this.lid;
    }
    public void setLteacherid(String value) {
        this.lteacherid = value;
    }
    public String getLteacherid() {
       return this.lteacherid;
    }
}
