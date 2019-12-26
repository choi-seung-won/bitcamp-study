package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.signin;

public class SignHandler {

  public static Scanner keyboard;


  

  
  
  static final int signSIZE = 400;
  static int sign_count = 0;
  static signin[] signi = new signin[signSIZE];

  
  public static void listsign() {
    for (int i = 0; i < sign_count; i++) {
      
      signin sigc = signi[i];
      
      System.out.printf("%d, %s, %s, %s, %s\n", 
          sigc.no, sigc.name, sigc.email, sigc.tel, sigc.registeredDate);
    }
  }

  public static void addsign() {
    signin sig = new signin();
    
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
    
    signi[sign_count++] = sig;
    
    System.out.print("저장하였다\n");

  }
}
