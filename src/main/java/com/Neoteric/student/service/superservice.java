package com.Neoteric.student.service;

public class superservice {

   public static void age() {


      System.out.println("super class age: 30");
   }


   public static void main(String[] args) {
      superservice service = new subservice();//can't override static methods in upcasting
      service.age();
      superservice s = new superservice();
      s.age();
      subservice s1 = new subservice();
      s1.age();

   }
}