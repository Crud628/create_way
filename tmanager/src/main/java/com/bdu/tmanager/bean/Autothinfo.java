package com.bdu.tmanager.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "autothinfo")
public class Autothinfo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2872370628659091567L;
	@Id
    private String id;
    private String typename;
    private String auoth;

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
    public void setAuoth(String value) {
        this.auoth = value;
    }
    public String getAuoth() {
       return this.auoth;
    }
}
