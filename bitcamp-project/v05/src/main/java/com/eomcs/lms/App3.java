package com.eomcs.lms;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    
    System.out.println("번호: ");
    
    String no = keyboard.nextLine();

    System.out.println("내용: ");
    
    String descript = keyboard.nextLine();

    
    System.out.println("작성일: ");
    
    String rwdate= keyboard.nextLine();

    
    System.out.println("조회수: ");
    
    String flw = keyboard.nextLine();

    
    System.out.println("번호: \n" + no);
    System.out.println("내용: \n" + descript);
    System.out.println("작성일: \n" + rwdate);
    System.out.println("조회수: \n" + flw);

    keyboard.close();

  }
  

}
