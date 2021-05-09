package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "rzgl")
public class Rzgl implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8094895711658306518L;
	@Id
    private Integer rno;
    private String rid;
    private String rname;
    private java.util.Date intime;
    private java.util.Date outtime;

    public void setRno(Integer value) {
        this.rno = value;
    }
    public Integer getRno() {
       return this.rno;
    }
    public void setRid(String value) {
        this.rid = value;
    }
    public String getRid() {
       return this.rid;
    }
    public void setRname(String value) {
        this.rname = value;
    }
    public String getRname() {
       return this.rname;
    }
    public void setIntime(java.util.Date value) {
        this.intime = value;
    }
    public java.util.Date getIntime() {
       return this.intime;
    }
    public void setOuttime(java.util.Date value) {
        this.outtime = value;
    }
    public java.util.Date getOuttime() {
       return this.outtime;
    }
}
