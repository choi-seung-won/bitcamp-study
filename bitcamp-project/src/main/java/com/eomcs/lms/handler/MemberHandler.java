package com.eomcs.lms.handler;

import java.sql.Timestamp;
import java.util.Scanner;
import com.eomcs.lms.domain.Note;

public class MemberHandler {
  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

  Note[] Infl = new Note[LSIZE];
  int Lesson_Count = 0;

  /*
  static class Note{
    int number;
    String name;
    String dailyCheck;
    String login;
  }//class Note end
  
  */
  
  public static Scanner scan;
  static final int LSIZE = 200;
  
  //classfield = staticfield > 공유하는 변수

  
  public static void addMember(MemberHandler memberHandler) {
    
    
    
    Note Infl2 = new Note();

    System.out.print("번호 ? :");
    Infl2.number = scan.nextInt();
    scan.nextLine();

    System.out.print("성함 ? :");
    Infl2.name = scan.nextLine();

    if(Infl2.number > 1) {
      Infl2.dailyCheck = "thanks for visiting";     
    }//boolean check
    else
    {
      Infl2.dailyCheck = "NO";
    }

    System.out.println("처음 로그인인가(Y/n) :");
    
    String repo = scan.nextLine();
    if(!repo.equalsIgnoreCase("Y")) {
      Infl2.login = "Need Sign in";
    }else {
      Infl2.login = "Cerified access";
    }
    
    memberHandler.Infl[memberHandler.Lesson_Count++] = Infl2;
    
    System.out.print("저장하였다\n");
  }
  
  public static void listMember(MemberHandler memberHandler) {
    for(int i = 0; i < memberHandler.Lesson_Count; i ++) 
    {
      Note Infl3 = memberHandler.Infl[i];
      System.out.printf("%d,%s,%s,%s,%s \n", Infl3.number,Infl3.name,Infl3.dailyCheck,Infl3.login,
          timestamp);
    }
  }
  
  public static void detailMember(MemberHandler memberHandler) {
    Note Infl2 = null;
    System.out.print("게시물 번호? ");
    int no = scan.nextInt();
    scan.nextLine();
    
    for( int i = 0; i < memberHandler.Lesson_Count; i ++) 
    {
    if(memberHandler.Infl[i].number == no) 
    {
      Infl2 = memberHandler.Infl[i];
      break;
    }
   }
    if(Infl2 == null) 
    {
      System.out.println("게시물 번호가 유효하지 않습니다");
      return;
    }
    
    System.out.printf("번호: %d\n", Infl2.number);
    System.out.printf("성함: %s\n",Infl2.name);
    System.out.printf("확인: %s\n",Infl2.dailyCheck);
    System.out.printf("유무: %s\n",Infl2.login);
    
  }
  
  

}
