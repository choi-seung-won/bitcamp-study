package com.eomcs.lms.handler;

import java.sql.Timestamp;
import java.util.Scanner;
import com.eomcs.lms.domain.Note;

public class MemberHandler {
  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

  public static Scanner scan;

  /*
  static class Note{
    int number;
    String name;
    String dailyCheck;
    String login;
  }//class Note end
  
  */
  static final int LSIZE = 200;
  static Note[] Infl = new Note[LSIZE];
  static int Lesson_Count = 0;

  
  public static void addMember() {
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
    
    Infl[Lesson_Count++] = Infl2;
    
    System.out.print("저장하였다\n");
  }
  
  public static void listMember() {
    for(int i = 0; i < Lesson_Count; i ++) 
    {
      Note Infl3 = Infl[i];
      System.out.printf("%d,%s,%s,%s,%s \n", Infl3.number,Infl3.name,Infl3.dailyCheck,Infl3.login,
          timestamp);
    }
  }

}
