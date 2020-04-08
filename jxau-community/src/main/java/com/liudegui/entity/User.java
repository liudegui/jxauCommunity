package com.liudegui.entity;

public class User {
    private String stud_id;
    private String stud_password;
    private String stud_image;
    private String stud_name ;
    private String stud_gender;
    private String stud_class;
    private String stud_status;
    private String stud_address;
    private String stud_motto;

    public User() {
    }

    public User(String stud_id, String stu_password, String stud_image, String stud_name, String stud_gender, String stud_class, String stud_status, String stud_address, String stud_motto) {
        this.stud_id = stud_id;
        this.stud_password = stu_password;
        this.stud_image = stud_image;
        this.stud_name = stud_name;
        this.stud_gender = stud_gender;
        this.stud_class = stud_class;
        this.stud_status = stud_status;
        this.stud_address = stud_address;
        this.stud_motto = stud_motto;
    }

    public String getStud_password() {
        return stud_password;
    }

    public void setStud_password(String stud_password) {
        this.stud_password = stud_password;
    }

    public String getStud_id() {
        return stud_id;
    }

    public void setStud_id(String stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_image() {
        return stud_image;
    }

    public void setStud_image(String stud_image) {
        this.stud_image = stud_image;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public String getStud_gender() {
        return stud_gender;
    }

    public void setStud_gender(String stud_gender) {
        this.stud_gender = stud_gender;
    }

    public String getStud_class() {
        return stud_class;
    }

    public void setStud_class(String stud_class) {
        this.stud_class = stud_class;
    }

    public String getStud_status() {
        return stud_status;
    }

    public void setStud_status(String stud_status) {
        this.stud_status = stud_status;
    }

    public String getStud_motto() {
        return stud_motto;
    }

    public void setStud_motto(String stud_motto) {
        this.stud_motto = stud_motto;
    }

    public String getStud_address() {
        return stud_address;
    }

    public void setStud_address(String stud_address) {
        this.stud_address = stud_address;
    }

    @Override
    public String toString() {
        return "User{" +
                "stud_id='" + stud_id + '\'' +
                ", stud_image='" + stud_image + '\'' +
                ", stud_name='" + stud_name + '\'' +
                ", stud_gender='" + stud_gender + '\'' +
                ", stud_class='" + stud_class + '\'' +
                ", stud_status='" + stud_status + '\'' +
                ", stud_address='" + stud_address + '\'' +
                ", stud_motto='" + stud_motto + '\'' +
                '}';
    }
}
