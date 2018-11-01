package com.jiangyuqin.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Z_USR_LOGINLOG")
public class UsrLoginLog {
    @Id
    @Column(name = "UUID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uuid;

    @Column(name = "USERUUID")
    private String useruuid;

    @Column(name = "LOGINTIME")
    private Date logintime;

    @Column(name = "LOGINFLAG")
    private String loginflag;

    @Column(name = "LOGINPASS")
    private String loginpass;

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
     * @return USERUUID
     */
    public String getUseruuid() {
        return useruuid;
    }

    /**
     * @param useruuid
     */
    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid;
    }

    /**
     * @return LOGINTIME
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * @param logintime
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * @return LOGINFLAG
     */
    public String getLoginflag() {
        return loginflag;
    }

    /**
     * @param loginflag
     */
    public void setLoginflag(String loginflag) {
        this.loginflag = loginflag;
    }

    /**
     * @return LOGINPASS
     */
    public String getLoginpass() {
        return loginpass;
    }

    /**
     * @param loginpass
     */
    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
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