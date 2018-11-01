package com.jiangyuqin.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Z_USR_ADMIN")
public class UsrAdmin {
    @Id
    @Column(name = "UUID")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "SELECT SYS_GUID() FROM DUAL")
    private String uuid;

    @Column(name = "DACC")
    private String dacc;

    @Column(name = "DPWD")
    private String dpwd;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "LASTLOGIN")
    private Date lastlogin;

    @Column(name = "YXBZ")
    private String yxbz;

    /**
     * @return UUID
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return DACC
     */
    public String getDacc() {
        return dacc;
    }

    /**
     * @param dacc
     */
    public void setDacc(String dacc) {
        this.dacc = dacc;
    }

    /**
     * @return DPWD
     */
    public String getDpwd() {
        return dpwd;
    }

    /**
     * @param dpwd
     */
    public void setDpwd(String dpwd) {
        this.dpwd = dpwd;
    }

    /**
     * @return NICKNAME
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return LASTLOGIN
     */
    public Date getLastlogin() {
        return lastlogin;
    }

    /**
     * @param lastlogin
     */
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    /**
     * @return YXBZ
     */
    public String getYxbz() {
        return yxbz;
    }

    /**
     * @param yxbz
     */
    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }
}