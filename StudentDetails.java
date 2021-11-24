package com.tw.assignment1;

public class StudentDetails {

    String name;
    int rollNumber;
    String address;

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
