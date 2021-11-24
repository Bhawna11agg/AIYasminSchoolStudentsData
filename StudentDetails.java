package com.tw.assignment1;

public class StudentDetails {

    private String name;
    private int rollNumber;
    private String address;

    StudentDetails(String name,int rollNumber,String address){
        this.address=address;
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return address;
    }

}
