package com.jiangyuqin.model;

/**
 *
 */
public class UsrAdmin {
    private String uuid;
    private String dacc;
    private String dpwd;
    private String nickname;
    private String lastlogin;
    private String yxbz;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDacc() {
        return dacc;
    }

    public void setDacc(String dacc) {
        this.dacc = dacc;
    }

    public String getDpwd() {
        return dpwd;
    }

    public void setDpwd(String dpwd) {
        this.dpwd = dpwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    @Override
    public String toString() {
        return "UsrAdmin{" +
                "uuid='" + uuid + '\'' +
                ", dacc='" + dacc + '\'' +
                ", dpwd='" + dpwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", lastlogin='" + lastlogin + '\'' +
                ", yxbz='" + yxbz + '\'' +
                '}';
    }
}
