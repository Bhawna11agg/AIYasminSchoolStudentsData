package com.tw.assignment1;

import java.util.LinkedList;
import java.util.Scanner;


class MaintainStudentRecord{

    static void addStudentInLast(LinkedList<StudentDetails> studentList, StudentDetails studentDetails){
        studentList.add(studentDetails);
    }

    static void removeStudent(LinkedList<StudentDetails> studentList, int position){
        if(position>= studentList.size()){
            System.out.println("Sorry, The record which you want to update doesn't exists!!");
            return;
        }
        studentList.remove(position);
    }

    static void addStudent(LinkedList<StudentDetails> studentList, StudentDetails studentDetails,int position){
        if(position>=studentList.size()){
            addStudentInLast(studentList,studentDetails);
        }
        studentList.add(position,studentDetails);
    }

    static void updateStudentDetails(LinkedList<StudentDetails> studentList, StudentDetails studentDetails,int position){

        if(position>= studentList.size()){
            System.out.println("Sorry, The record which you want to update doesn't exists!!");
            return;
        }
        removeStudent(studentList,position);
        addStudent(studentList,studentDetails,position);
    }


}

public class StudentsRecord{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your userId");
        String userId= sc.nextLine();
        System.out.println("Enter your password");
        String password= sc.nextLine();
        LinkedList<StudentDetails> studentsList = new LinkedList<StudentDetails>();
        if(userId.equals("ABC") && password.equals("123")) {

            while (sc.hasNext()){

                int flag=0;

                switch (sc.nextInt()){
                    case 1:
                        System.out.println("Enter the name of student");
                        String name= sc.nextLine();
                        System.out.println("Enter the roll Number of student");
                        int rollNumber= sc.nextInt();
                        System.out.println("Enter the address of student");
                        String address= sc.nextLine();
                        MaintainStudentRecord.addStudentInLast(studentsList, new StudentDetails(name, rollNumber, address));
                        break;
                    case 2:
                        MaintainStudentRecord.updateStudentDetails(studentsList, new StudentDetails("Shivani", 1, "Delhi"), 0);
                        break;
                    case 3:
                        MaintainStudentRecord.removeStudent(studentsList,0);
                        break;
                    case 4:
                        flag=1;
                }

                if(flag==1)
                    break;

            }

            for(StudentDetails studentDetails: studentsList){
                System.out.println(studentDetails.getName()+" "+studentDetails.getRollNumber()+" "+studentDetails.getAddress());
            }

        }
        else{

            for(StudentDetails studentDetails: studentsList){
                System.out.println(studentDetails.getName()+" "+studentDetails.getRollNumber()+" "+studentDetails.getAddress());
            }
        }
    }

}
