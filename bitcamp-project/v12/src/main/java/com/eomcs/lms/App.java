package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.LessonHandler2;
import com.eomcs.lms.handler.LessonHandler3;
import com.eomcs.lms.handler.LogHandler;
import com.eomcs.lms.handler.LogHandler2;
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
    LessonHandler2.keyboard = keyboard;
    LessonHandler3.keyboard = keyboard;
    LogHandler2.Lscan = Lscan;
    //
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
          //
        case "/lesson/detail":
          LessonHandler.detailLesson();
          break;
        //
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
          //
        case "/log/detail":
          LogHandler.detailLog();
          break;
          //
        case "/sign/add":
          SignHandler.addsign();
          break;
        case "/sign/list":
          SignHandler.listsign();
          break;
          //
          
        case "/lesson2/add":
          LessonHandler2.addLesson();
          break;
        case "/lesson2/list":
          LessonHandler2.listLesson();
          break;
        case "/lesson2/detail":
          LessonHandler2.detailLesson();
          break;
          
        case "/lesson3/add":
          LessonHandler3.addLesson();
          break;
        case "/lesson3/list":
          LessonHandler3.listLesson();
          break;
        case "/lesson3/detail":
          LessonHandler3.detailLesson();
          break;
          
        case "/log2/add":
          LogHandler2.addlog();
          break;
        case "/log2/list":
          LogHandler2.listlog();
        break;
        case "/log2/detail":
          LogHandler2.detailLog();
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