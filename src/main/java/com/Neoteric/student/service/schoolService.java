package com.Neoteric.student.service;

public class schoolService {
    private static int teachercount=20;
    private static  schoolService schoolservice;
    public schoolService(){
        System.out.println("From counting in School Teachers: "+teachercount);

    }
    public static int getteacher(){
        System.out.println("Hello teachers");
        return 0;
    }
    public int getTeachercount(){
        return teachercount;

    }
    public int getadd(){
        return teachercount=teachercount+1;
    }
    public int getremove(){
        return teachercount=teachercount-1;
    }
    public static schoolService getschoolService(){

        if (schoolservice == null){
            System.out.println("Exsisting teacher Inner count: "+teachercount);
             schoolservice=new schoolService();
             return schoolservice;
        }else{
            System.out.println("Esisting teacher outer count: "+teachercount);
            return schoolservice;

        }

    }
}
