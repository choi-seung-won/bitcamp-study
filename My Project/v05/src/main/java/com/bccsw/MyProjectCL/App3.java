package com.bccsw.MyProjectCL;

import java.sql.Timestamp;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner ok = new Scanner(System.in);
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    
    System.out.println("번호 :\n");
    String number = ok.nextLine();
    
    System.out.println("내용 : \n");
    String description = ok.nextLine();
    
    System.out.println("조회수 : \n");
    String View = ok.nextLine();
    
    
    System.out.printf("번호: %s \n",number);
    System.out.printf("내용: %s \n",description);
    System.out.printf("작성일: %s \n", timestamp);
    System.out.printf("조회수: %s \n", View);
  }

}
