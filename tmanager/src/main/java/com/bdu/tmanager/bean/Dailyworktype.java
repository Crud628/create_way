package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "dailyworktype")
public class Dailyworktype implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3822335422207883858L;
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
