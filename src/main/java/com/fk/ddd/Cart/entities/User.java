package com.fk.ddd.Cart.entities;

/**
 * Created by kishan.gajjar on 15/12/16.
 */
public class User {
    String userName;
    String phone;

    public User(String userName, String phone) {
        this.userName = userName;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
