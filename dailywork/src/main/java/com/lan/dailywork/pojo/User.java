package com.lan.dailywork.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    private String uuid;
    private String userName;
    private String userPass;
    private String userTel;
    private String userType;
    private String userInfo;
    private Integer userScore;
    private String status;

    public void setUuid(String value) {
        this.uuid = value;
    }
    public String getUuid() {
       return this.uuid;
    }
    public void setUserName(String value) {
        this.userName = value;
    }
    public String getUserName() {
       return this.userName;
    }
    public void setUserPass(String value) {
        this.userPass = value;
    }
    public String getUserPass() {
       return this.userPass;
    }
    public void setUserTel(String value) {
        this.userTel = value;
    }
    public String getUserTel() {
       return this.userTel;
    }
    public void setUserType(String value) {
        this.userType = value;
    }
    public String getUserType() {
       return this.userType;
    }
    public void setUserInfo(String value) {
        this.userInfo = value;
    }
    public String getUserInfo() {
       return this.userInfo;
    }
    public void setUserScore(Integer value) {
        this.userScore = value;
    }
    public Integer getUserScore() {
       return this.userScore;
    }
    public void setStatus(String value) {
        this.status = value;
    }
    public String getStatus() {
       return this.status;
    }
}
