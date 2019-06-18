package com.liy.springboot01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private int id;

    private String username;

    private String sex;

    private String[] array;

    private List<Book> boos;

    public List<Book> getBoos() {
        return boos;
    }

    public void setBoos(List<Book> boos) {
        this.boos = boos;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }




}
