package com.jiangyuqin.model;

import javax.persistence.*;

@Table(name = "Z_DBA_DATASOURCE")
public class DbaDatasource {
    @Id
    @Column(name = "UUID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uuid;

    @Column(name = "DBTYPE")
    private String dbtype;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "IPADDRESS")
    private String ipaddress;

    @Column(name = "SERVICENAME")
    private String servicename;

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
     * @return DBTYPE
     */
    public String getDbtype() {
        return dbtype;
    }

    /**
     * @param dbtype
     */
    public void setDbtype(String dbtype) {
        this.dbtype = dbtype;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return IPADDRESS
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * @param ipaddress
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * @return SERVICENAME
     */
    public String getServicename() {
        return servicename;
    }

    /**
     * @param servicename
     */
    public void setServicename(String servicename) {
        this.servicename = servicename;
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