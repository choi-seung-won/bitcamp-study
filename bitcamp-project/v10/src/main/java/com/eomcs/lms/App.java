package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  
  

  
  static Scanner keyboard = new Scanner(System.in);
  static Scanner scan = new Scanner(System.in);
  static Scanner Lscan = new Scanner(System.in);


  
  
  

  public static void main(String[] args) {
    //LessonHandler의 메서드를 사용하기 전에 해당 메서드가 필요로 하는 키보드 객체를 설정해야함,
    LessonHandler.keyboard = keyboard;
    //MemberHandler 메서드 사용을 위해 객체설정.
    MemberHandler.scan = scan;
    //log
    LogHandler.Lscan = Lscan;
    //sign
    SignHandler.keyboard = keyboard;
    
    String command;
    
    do {
      
      ///lesson/ - lesson
      ///member/ - number/name
      ///log/ - number/description
      ///sign/ - member profile - photo etc
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      switch(command) {
        case "/lesson/add":
          
          //다른 클래스로 분리한 메서드를 호출할 경우 클래스 이름을 지정해야 함
          LessonHandler.addLesson();
          break;
        case "/lesson/list":
          LessonHandler.listLesson();
          break;
        case "/member/add":
          MemberHandler.addMember();
        break;
        case "/member/list":
          MemberHandler.listMember();
        break;
        case "/log/add":
          LogHandler.addlog();
          break;
        case "/log/list":
          LogHandler.listlog();
          break;
        case "/sign/add":
          SignHandler.addsign();
          break;
        case "/sign/list":
          SignHandler.listsign();
          break;
        default:
        
          if(!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다");
          }
      }//switch end

    }while(!command.equalsIgnoreCase("quit")); // quit이 아닐경우 반복
    System.out.println("안 녕 !");
    
  }

  


 


  



}