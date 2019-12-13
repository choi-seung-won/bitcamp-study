package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {

    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호: ");
    
    int no = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("이름: ");

    String no1 = keyboard.next();
    
    System.out.print("이메일: ");
    
    String eo = keyboard.next();
    
    System.out.print("암호: ");
    
    String po = keyboard.next();
    
    System.out.print("사진: ");
    
    String po2 = keyboard.next();
    
    System.out.print("전화: ");
    
    String co = keyboard.next();
    
    Date td = new Date(System.currentTimeMillis());
    
//    System.out.print("가입일: ");
    
//    String ro = keyboard.next();
    
    
    keyboard.close();
    System.out.println();
    /*
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", no1);
    System.out.printf("이메일: %s\n", eo);
  //  System.out.printf("암호: %s\n", po);
  //  System.out.printf("사진: %s\n", po2);
    System.out.printf("전화: %s\n", co);
    System.out.printf("가입일: %s\n", ro);
    */
    System.out.printf("%d, %s , %s , %s , %s",no,no1,eo,co,td);
    

  }

}
