package com.jiangyuqin.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Z_SYS_LOG")
public class SysLog {
    @Id
    @Column(name = "UUID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uuid;

    @Column(name = "FUUID")
    private String fuuid;

    @Column(name = "FTYPE")
    private String ftype;

    @Column(name = "FCONTENT")
    private String fcontent;

    @Column(name = "FTIME")
    private Date ftime;

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
     * @return FUUID
     */
    public String getFuuid() {
        return fuuid;
    }

    /**
     * @param fuuid
     */
    public void setFuuid(String fuuid) {
        this.fuuid = fuuid;
    }

    /**
     * @return FTYPE
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * @param ftype
     */
    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    /**
     * @return FCONTENT
     */
    public String getFcontent() {
        return fcontent;
    }

    /**
     * @param fcontent
     */
    public void setFcontent(String fcontent) {
        this.fcontent = fcontent;
    }

    /**
     * @return FTIME
     */
    public Date getFtime() {
        return ftime;
    }

    /**
     * @param ftime
     */
    public void setFtime(Date ftime) {
        this.ftime = ftime;
    }
}