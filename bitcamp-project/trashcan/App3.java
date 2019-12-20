package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

// 입력을 카운트하기
public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int SIZE = 1000;
    
    class log{
    
      int no;
      String title;
      Date date;
      int viewCount;
    }

    String response;

    log[] logs = new log[SIZE]; 
    
    
    int count = 0;
    for (int i = 0; i < 100; i++) {
      
      log logging = new log();
      
      count++;
      
      System.out.print("번호? ");
      logging.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("내용? ");
      logging.title = keyboard.nextLine();

      logging.date = new Date(System.currentTimeMillis());
      logging.viewCount = 0;
      
      
      logs[i] = logging;
      
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    keyboard.close();

    System.out.println();

    for (int i = 0; i < count; i++) {
      
      log logging = logs[i];
      
      System.out.printf("%d, %s, %s, %d\n", 
          logging.no, logging.title, logging.date, logging.viewCount);
    }
  }
}








