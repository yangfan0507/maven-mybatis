package com.yangfan.entity;


import java.util.Date;

/**
 * @Author: Cuber
 * @Date: 2021/11/9 19:28
 */
public class User {
    private int id;
    private String userName;
    private java.sql.Date birthDay;
    private String sex;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public java.sql.Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(java.sql.Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{"+"User信息" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
