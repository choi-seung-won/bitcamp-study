package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    class Lesson{
      
      int no;
      String title;
      String description;
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
      
    }

    Scanner keyboard = new Scanner(System.in);

    final int SIZE = 100;


    int count = 0;
    
    Lesson[] lecture = new Lesson[SIZE];
    
    for (int i = 0; i < SIZE; i++) {
      count++;
      
      Lesson lec = new Lesson();
      
      System.out.print("번호? ");
      lec.no = keyboard.nextInt();

      keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.

      System.out.print("수업명? ");
      lec.title = keyboard.nextLine();

      System.out.print("설명? ");
      lec.description = keyboard.nextLine();

      System.out.print("시작일? ");
      // "yyyy-MM-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
      lec.startDate = Date.valueOf(keyboard.next());

      System.out.print("종료일? ");
      lec.endDate = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      lec.totalHours = keyboard.nextInt();

      System.out.print("일수업시간? ");
      lec.dayHours = keyboard.nextInt();
      
      lecture[i] = lec;
      keyboard.nextLine(); // 일수업시간 입력 값 다음에 남아 있는 줄바꿈 값 제거
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    System.out.println();

    for (int i = 0; i < count; i++) {
      
      Lesson lec = lecture[i];
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          lec.no, lec.title, lec.startDate, lec.endDate, lec.totalHours);
    }

    keyboard.close();
  }
}






