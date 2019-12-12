package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    
    System.out.print("번호: ");
    
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.println("내용: ");
    
    //currentTimeMillis = 1970/1/1 0:00:00 부터 현재까지 경과된 시간 밀리초로 리턴함.
    // new Date(밀리초) > 넘겨받은 밀리초를 가지고 년, 월,일,시,분,초,밀리초를 계산
    Date today = new Date(System.currentTimeMillis());
    // java.sql을 import한 후는 java.util.date를쓸경우 java.util경로 입력을 전부 해야함
    
//    int count = 0;
    
    String descript = keyboard.nextLine();

    
 //   System.out.println("작성일: ");
    
 //   String rwdate= keyboard.nextLine();

    
    System.out.println("조회수: ");
    
    String flw = keyboard.nextLine();

    
    System.out.printf("번호: %d \n", no);
    System.out.printf("내용: %s \n",descript);
    System.out.printf("작성일: %s \n", today);
    System.out.printf("조회수: %s \n",  flw);

    keyboard.close();

  }
  

}
