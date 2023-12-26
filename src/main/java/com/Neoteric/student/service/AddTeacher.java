package com.Neoteric.student.service;

public class AddTeacher {
    public static  int count =10;
    public  int studId=100;
    public void addTeacher(){
        count=count+1;
        studId=studId+count+1;

        System.out.println("Value of count  : "+count);
        System.out.println("Value of studId: "+studId);
    }

    public static void main(String[] args) {
        AddTeacher a1=new AddTeacher();
        AddTeacher a2 = new AddTeacher();
        AddTeacher a3 = new AddTeacher();
        a1.addTeacher();
        a2.addTeacher();
        a3.addTeacher();
    }
}
