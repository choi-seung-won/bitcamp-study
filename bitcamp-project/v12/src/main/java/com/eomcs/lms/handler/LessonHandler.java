package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {
  public static Scanner keyboard; // 다른 패키지에 있는 클래스에서도 이 변수를 사용시 공개해야함
  static final int SIZE = 100;
  static Lesson[] lecture = new Lesson[SIZE]; // SIZE만큼의 reference array 생성
  static int Member_Count = 0;
  
  static final int LSIZE = 200;
  
  public static void listLesson() {
    for (int i = 0; i < Member_Count; i++) {
      Lesson l = lecture[i]; // 변수 중복을 막기위하여 var네임 변경
      System.out.printf("%d, %s, %s ~ %s, %d\n",
          l.no, l.title, l.startDate, l.endDate, l.totalHours);
    }
  }
  
  public static void addLesson() {
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
    keyboard.nextLine(); // 일수업시간 입력 값 다음에 남아 있는 줄바꿈 값 제거

    lecture[Member_Count++] = lec; // lec을 count++로 증가한 번호의 배열에 저장

    System.out.print("저장하였다\n");
  }
  
  public static void detailLesson() {
    System.out.print("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    Lesson lec = null;
    for(int i = 0; i < Member_Count; i ++) {
      if (lecture[i].no == no) {
        lec = lecture[i];
        break;
      }
    }
    
    
    if(lec == null) {
      System.out.println("게시물 번호가 유효하지 않습니다");
      return;
    }
    
    System.out.printf("번호: %d\n", lec.no);
    System.out.printf("제목: %s\n",lec.title);
    System.out.printf("시작일: %s\n",lec.startDate);
    System.out.printf("종료일: %s\n",lec.endDate);
    System.out.printf("총수업시간: %s\n",lec.totalHours);
    
  }

}
