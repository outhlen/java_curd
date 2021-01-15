package com.example.demo.bean;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("user")
public class User {
    private int id;
    private String username;
    private String password;
    private Date gmtCreate;
    private Date gmtModified;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
