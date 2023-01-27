package com.example.transactionalControl.exceptions;

import java.util.Date;

public class CustomError {
    private String url;
    private String msg;
    private Date date;

    public CustomError(String url, String msg, Date date) {
        this.url = url;
        this.msg = msg;
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
