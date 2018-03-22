package com.shanghai.caiyun.demo2.model;



public class Student{
    private int num;
    private String classroom;
    private String name;
    private String gender;
    private String address;
    private String telNum;

    public String getClassroom() {
        return classroom;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
}
