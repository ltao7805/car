package com.example.pojo;

import java.util.Date;

@SuppressWarnings("ALL")
public class Client {
    private String clientid;

    private String clientname;

    private String clientiphone;

    private String clientaddress;

    private Date clientbirthday;

    private String clientbz;

    private String clientlb;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientiphone() {
        return clientiphone;
    }

    public void setClientiphone(String clientiphone) {
        this.clientiphone = clientiphone;
    }

    public String getClientaddress() {
        return clientaddress;
    }

    public void setClientaddress(String clientaddress) {
        this.clientaddress = clientaddress;
    }

    public Date getClientbirthday() {
        return clientbirthday;
    }

    public void setClientbirthday(Date clientbirthday) {
        this.clientbirthday = clientbirthday;
    }

    public String getClientbz() {
        return clientbz;
    }

    public void setClientbz(String clientbz) {
        this.clientbz = clientbz;
    }

    public String getClientlb() {
        return clientlb;
    }

    public void setClientlb(String clientlb) {
        this.clientlb = clientlb;
    }
}