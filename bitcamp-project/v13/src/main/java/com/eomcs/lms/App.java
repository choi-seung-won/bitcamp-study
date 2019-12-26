package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.LogHandler;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.lms.handler.SignHandler;

public class App {




  public static Scanner keyboard = new Scanner(System.in);
  public static Scanner scan = new Scanner(System.in);
  public static Scanner Lscan = new Scanner(System.in);


  public static void main(String[] args) {
    //LessonHandler의 메서드를 사용하기 전에 해당 메서드가 필요로 하는 키보드 객체를 설정해야함,
    LessonHandler.keyboard = keyboard;
    //MemberHandler 메서드 사용을 위해 객체설정.
    MemberHandler.scan = scan;
    //log
    LogHandler.Lscan = Lscan;
    //sign
    SignHandler.keyboard = keyboard;
    //
 //   LogHandler2.Lscan = Lscan;
    //
    
    
    
    //Handler의 메서드가 사용할 메모리만  게시판마다 따로 생성
    LessonHandler lessonHandler1 = new LessonHandler();
    LessonHandler lessonHandler2 = new LessonHandler();
    LessonHandler lessonHandler3 = new LessonHandler();
    
    LogHandler logHandler1 = new LogHandler();
    LogHandler logHandler2 = new LogHandler();
    
    MemberHandler memberHandler1 = new MemberHandler();
    MemberHandler memberHandler2 = new MemberHandler();
    
    SignHandler signHandler1 = new SignHandler();
    
    
    String command;

    do {

      ///lesson/ - lesson
      ///member/ - number/name
      ///log/ - number/description
      ///sign/ - member profile - photo etc
      //add,list,detail
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      switch(command) {
        //다른 클래스로 분리한 메서드를 호출할 경우 클래스 이름을 지정해야 함
        case "/lesson/add":
          LessonHandler.addLesson(lessonHandler1);
          break;
        case "/lesson/list":
          LessonHandler.listLesson(lessonHandler1);
          break;
          //
        case "/lesson/detail":
          LessonHandler.detailLesson(lessonHandler1);
          break;
        //
          
        case "/member/add":
          MemberHandler.addMember(memberHandler1);
          break;
        case "/member/list":
          MemberHandler.listMember(memberHandler1);
          break;
        case "/member/detail":
          MemberHandler.detailMember(memberHandler1);
          break;
          
        case "/log/add":
          LogHandler.addlog(logHandler1);
          break;
        case "/log/list":
          LogHandler.listlog(logHandler1);
          break;
          //
        case "/log/detail":
          LogHandler.detailLog(logHandler1);
          break;
          //
        case "/sign/add":
          SignHandler.addsign(signHandler1);
          break;
        case "/sign/list":
          SignHandler.listsign(signHandler1);
          break;
        case "/sign/detail":
          SignHandler.detailsign(signHandler1);
          break;
          //
          
        case "/lesson2/add":
          LessonHandler.addLesson(lessonHandler2);
          break;
        case "/lesson2/list":
          LessonHandler.listLesson(lessonHandler2);
          break;
        case "/lesson2/detail":
          LessonHandler.detailLesson(lessonHandler3);
          break;
          
        case "/lesson3/add":
          LessonHandler.addLesson(lessonHandler3);
          break;
        case "/lesson3/list":
          LessonHandler.listLesson(lessonHandler3);
          break;
        case "/lesson3/detail":
          LessonHandler.detailLesson(lessonHandler3);
          break;
          
        case "/log2/add":
          LogHandler.addlog(logHandler2);
          break;
        case "/log2/list":
          LogHandler.listlog(logHandler2);
        break;
        case "/log2/detail":
          LogHandler.detailLog(logHandler2);
          break;
          //

        default:

          if(!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다");
          }
      }//switch end

    }while(!command.equalsIgnoreCase("quit")); // quit이 아닐경우 반복
    System.out.println("안 녕 !");

  }











}