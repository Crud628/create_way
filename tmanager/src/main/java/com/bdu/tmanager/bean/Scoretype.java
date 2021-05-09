package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "scoretype")
public class Scoretype implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3472118944079308301L;
	@Id
    private String id;
    private String typename;

    public void setId(String value) {
        this.id = value;
    }
    public String getId() {
       return this.id;
    }
    public void setTypename(String value) {
        this.typename = value;
    }
    public String getTypename() {
       return this.typename;
    }
}
