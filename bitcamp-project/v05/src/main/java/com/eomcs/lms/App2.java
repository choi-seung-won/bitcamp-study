package com.eomcs.lms;

import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("번호: \n");
    
    String no = keyboard.nextLine();
    
    System.out.println("이름: \n");

    String no1 = keyboard.nextLine();
    
    System.out.println("이메일: \n");
    
    String eo = keyboard.nextLine();
    
    System.out.println("암호: \n");
    
    String po = keyboard.nextLine();
    
    System.out.println("사진: \n");
    
    String po2 = keyboard.nextLine();
    
    System.out.println("전화: \n");
    
    String co = keyboard.nextLine();
    
    System.out.println("가입일: \n");
    
    String ro = keyboard.nextLine();
    
    
    System.out.println("번호: \n" + no);
    System.out.println("이름: \n" + no1);
    System.out.println("이메일: \n" + eo);
    System.out.println("암호: \n" + po);
    System.out.println("사진: \n" + po2);
    System.out.println("전화: \n" + co);
    System.out.println("가입일: \n" + ro);
    
    
    keyboard.close();

  }

}
