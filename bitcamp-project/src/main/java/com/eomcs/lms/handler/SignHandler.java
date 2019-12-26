package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.signin;

public class SignHandler {
  
  int sign_count = 0;
  signin[] signi = new signin[signSIZE];

  
  
  public static Scanner keyboard;
  static final int signSIZE = 400;
  
  

  
  public static void listsign(SignHandler signHandler) {
    for (int i = 0; i < signHandler.sign_count; i++) {
      
      signin sigc = signHandler.signi[i];
      
      System.out.printf("%d, %s, %s, %s, %s\n", 
          sigc.no, sigc.name, sigc.email, sigc.tel, sigc.registeredDate);
    }
  }

  public static void addsign(SignHandler signHandler) {
    
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
    
    signHandler.signi[signHandler.sign_count++] = sig;
    
    System.out.print("저장하였다\n");

  }
  
  public static void detailsign(SignHandler signHandler) {
    System.out.print("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    signin sig = null;
    for(int i = 0; i < signHandler.sign_count; i ++) {
      if (signHandler.signi[i].no == no) {
        sig = signHandler.signi[i];
        break;
      }
    }
    
    if(sig == null) {
      System.out.println("게시물 번호가 유효하지 않습니다");
      return;
    }
    
    System.out.printf("번호: %d\n", sig.no);
    System.out.printf("이름: %s\n",sig.name);
    System.out.printf("이메일: %s\n",sig.email);
    System.out.printf("사진: %s\n",sig.photo);
    System.out.printf("전화: %s\n",sig.tel);
    
  }
}
