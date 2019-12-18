package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {


    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100;

    int[] num = new int[SIZE];
    int[] no1 = new int[SIZE];
    String[] eo= new String[SIZE];
    String[] po = new String[SIZE];
    String[] po2 = new String[SIZE];
    String[] co = new String[SIZE];
    Date[] td = new Date[SIZE];
    String[] ro = new String[SIZE];

    int count = 0;
    for(int i = 0; i < SIZE; i ++ ) {
      count++;
      System.out.print("번호: ");
      no1[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("이름: ");

      eo[i] = keyboard.next();
      
      System.out.print("이메일: ");

      po[i] = keyboard.next();

      System.out.print("암호: ");

      po2[i] = keyboard.next();

      System.out.print("사진: ");

      co[i] = keyboard.next();

      System.out.print("전화: ");

      co[i] = keyboard.next();
      
      keyboard.nextLine();

    //  Date[i] td = new Date(System.currentTimeMillis());
 //     System.out.print("가입일: ");
      
      td[i] = new Date(System.currentTimeMillis());
 //     ro[i] = keyboard.next();
      
      
      System.out.println("계속 입력 (Y/n)");
      String response = keyboard.nextLine();
      
      if(!response.equalsIgnoreCase("Y")) {
        break;
      }
    }

    keyboard.close();
    
    System.out.println();
    
    for (int i = 0; i < count; i ++) {
      System.out.printf("%d,%s,%s,%s,%s\n",no1[i],po[i],eo[i],co[i],td[i]);
    }
    /*
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", no1);
    System.out.printf("이메일: %s\n", eo);
  //  System.out.printf("암호: %s\n", po);
  //  System.out.printf("사진: %s\n", po2);
    System.out.printf("전화: %s\n", co);
    System.out.printf("가입일: %s\n", ro);
     */
  //  System.out.printf("%d, %s , %s , %s , %s",no1,po,eo,co,td);


  }

}
