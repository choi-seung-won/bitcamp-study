package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 { 
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100;
    
    class signin{
      
      int no;
      String  name;
      String  email;
      String  password;
      String  photo;
      String  tel;
      Date  registeredDate;
    }


    int count = 0;
    
    signin[] signi = new signin[SIZE];
    
    for (int i = 0; i < SIZE; i++) {
      signin sig = new signin();
      count++;
      
      
      
      System.out.print("번호? ");
      sig.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("이름? ");
      sig.name = keyboard.nextLine();

      System.out.print("이메일? ");
      sig.email = keyboard.nextLine();

      System.out.print("암호? ");
      sig.password = keyboard.nextLine();

      System.out.print("사진? ");
      sig.photo = keyboard.nextLine();

      System.out.print("전화? ");
      sig.tel = keyboard.nextLine();

      sig.registeredDate = new Date(System.currentTimeMillis());
      
      signi[i] = sig;
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    keyboard.close();

    System.out.println();

    for (int i = 0; i < count; i++) {
      
      signin sig = signi[i];
      
      System.out.printf("%d, %s, %s, %s, %s\n", 
          sig.no, sig.name, sig.email, sig.tel, sig.registeredDate);
    }
  }
}
