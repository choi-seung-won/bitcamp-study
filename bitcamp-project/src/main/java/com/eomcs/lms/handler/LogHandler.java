package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.log;

public class LogHandler {

  


  //instance field > new 명령을 실행해야만 생성되는 변수
  //개별적으로 관리되어야 하는 값일 경우 instance field로 선언함.
  
  log[] logs = new log[LogSIZE]; 
  int Log_count = 0;
  
  //class field > method area에 class code가 loading될 때 자동생성.
  //공통으로 사용할 값일 경우 class field로 선언함.
  
  static final int LogSIZE = 300;
  
  public static Scanner Lscan;
  
  
  //class method > instance없이 호출하는 메서드
  //>instance를 사용하려면 parameter를 통해 호출할 때 외부에서 받아야 한다.
  public static void addlog(LogHandler logHandler) {
    log logging = new log();
    
    System.out.print("번호? ");
    logging.no = Lscan.nextInt();
    
    Lscan.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    logging.title = Lscan.next();

    logging.date = new Date(System.currentTimeMillis());
    logging.viewCount = 0;
    
    
    logHandler.logs[logHandler.Log_count++] = logging;
    
   // logs[Log_count++] = logging;
    System.out.print("저장하였다\n");

  }
  
  public static void listlog(LogHandler logHandler) {
    for (int i = 0; i < logHandler.Log_count; i++) {
      
      log logng = logHandler.logs[i];
      
      System.out.printf("%d, %s, %s, %d\n", 
          logng.no, logng.title, logng.date, logng.viewCount);
    }
  }
  
  public static void detailLog(LogHandler logHandler) {
    System.out.print("게시물 번호? ");
    int no = Lscan.nextInt();
    
    log logging = null;
    for( int i = 0; i < logHandler.Log_count; i ++) {
    if(logHandler.logs[i].no == no) {
      logging = logHandler.logs[i];
      break;

    }
    }
    if(logging == null) {
      System.out.println("게시물 번호가 유효하지 않습니다");
      return;
    }
    
    System.out.printf("번호: %d\n", logging.no);
    System.out.printf("제목: %s\n",logging.title);
    System.out.printf("일자: %s\n",logging.date);
    System.out.printf("조회수: %d\n",logging.viewCount);
    
  }
}
