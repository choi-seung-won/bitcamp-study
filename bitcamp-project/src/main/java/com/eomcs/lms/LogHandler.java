package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class LogHandler {

  static Scanner Lscan;

  static class log{
    int no;
    String title;
    Date date;
    int viewCount;
  }
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
}
