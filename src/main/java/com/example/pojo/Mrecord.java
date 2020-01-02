package com.example.pojo;

import java.util.Date;

@SuppressWarnings("ALL")
public class Mrecord {
    private String carhno;

    private String status;

    private String btype;

    private String rorder;

    private String ordertype;

    private Date ordertime;

    private String colsing;

    public String getCarhno() {
        return carhno;
    }

    public void setCarhno(String carhno) {
        this.carhno = carhno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public String getRorder() {
        return rorder;
    }

    public void setRorder(String rorder) {
        this.rorder = rorder;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getColsing() {
        return colsing;
    }

    public void setColsing(String colsing) {
        this.colsing = colsing;
    }
}