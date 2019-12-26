package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.log;

public class LogHandler {

  public static Scanner Lscan;


  static final int LogSIZE = 300;
  static int Log_count = 0;
  static log[] logs = new log[LogSIZE]; 
  public static void addlog() {
    log logging = new log();
    
    System.out.print("번호? ");
    logging.no = Lscan.nextInt();
    
    Lscan.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    logging.title = Lscan.next();

    logging.date = new Date(System.currentTimeMillis());
    logging.viewCount = 0;
    
    logs[Log_count++] = logging;
    System.out.print("저장하였다\n");

  }
  
  public static void listlog() {
    for (int i = 0; i < Log_count; i++) {
      
      log logng = logs[i];
      
      System.out.printf("%d, %s, %s, %d\n", 
          logng.no, logng.title, logng.date, logng.viewCount);
    }
  }
  
  public static void detailLog() {
    
    System.out.print("게시물 번호? ");
    int no = Lscan.nextInt();
    if(no < 0 || no >= Log_count) {
      System.out.println("게시물 번호가 유효하지 않습니다");
      return;
    }
    log logging = logs[no];
    System.out.printf("번호: %d\n", logging.no);
    System.out.printf("제목: %s\n",logging.title);
    System.out.printf("일자: %s\n",logging.date);
    System.out.printf("조회수: %d\n",logging.viewCount);
    
  }
}
