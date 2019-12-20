package com.eomcs.lms;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Scanner;

public class App {
  static Scanner keyboard = new Scanner(System.in);
  static Scanner scan = new Scanner(System.in);
  static Scanner Lscan = new Scanner(System.in);
  static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
  
  static String command;
  static class Lesson{
    int no;
    String title;
    String description;
    Date startDate;
    Date endDate;
    int totalHours;
    int dayHours;
  }
  static class Note{
    int number;
    String name;
    String dailyCheck;
    String login;
  }//class Note end
  
  static class log{
    int no;
    String title;
    Date date;
    int viewCount;
  }
  static class signin{
    int no;
    String  name;
    String  email;
    String  password;
    String  photo;
    String  tel;
    Date  registeredDate;
  }
  
  static final int SIZE = 100;
  static final int LSIZE = 200;
  static final int LogSIZE = 300;
  static final int signSIZE = 400;
  
  static int Member_Count = 0;
  static int Lesson_Count = 0;
  static int Log_count = 0;
  static int sign_count = 0;
  
  static Lesson[] lecture = new Lesson[SIZE]; // SIZE만큼의 reference array 생성
  static Note[] Infl = new Note[LSIZE];
  static log[] logs = new log[LogSIZE]; 
  
  static signin[] signi = new signin[signSIZE];
  public static void main(String[] args) {
    do {
      
      ///lesson/ - lesson
      ///member/ - number/name
      ///log/ - number/description
      ///sign/ - member profile - photo etc
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      switch(command) {
        case "/lesson/add":
          addLesson();
          break;
        case "/lesson/list":
          listLesson();
          break;
        case "/member/add":
          addMember();
        break;
        case "/member/list":
          listMember();
        break;
        case "/log/add":
          addlog();
          break;
        case "/log/list":
          listlog();
          break;
        case "/sign/add":
          addsign();
          break;
        case "/sign/list":
          listsign();
          break;
        default:
        
          if(!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다");
          }
      }//switch end

    }while(!command.equalsIgnoreCase("quit")); // quit이 아닐경우 반복
    System.out.println("안 녕 !");
    
  }

  public static void listsign() {
    for (int i = 0; i < sign_count; i++) {
      
      signin sigc = signi[i];
      
      System.out.printf("%d, %s, %s, %s, %s\n", 
          sigc.no, sigc.name, sigc.email, sigc.tel, sigc.registeredDate);
    }
  }

  public static void addsign() {
    signin sig = new signin();
    
    System.out.print("번호? ");
    sig.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    sig.name = keyboard.nextLine();

    System.out.print("이메일? ");
    sig.email = keyboard.nextLine();

    System.out.print("암호? ");
    sig.password = keyboard.nextLine();

    System.out.print("사진? ");
    sig.photo = keyboard.nextLine();

    System.out.print("전화? ");
    sig.tel = keyboard.nextLine();

    sig.registeredDate = new Date(System.currentTimeMillis());
    
    signi[sign_count++] = sig;
  }


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
  }
  
  public static void listlog() {
    for (int i = 0; i < Log_count; i++) {
      
      log logng = logs[i];
      
      System.out.printf("%d, %s, %s, %d\n", 
          logng.no, logng.title, logng.date, logng.viewCount);
    }
  }

  public static void listMember() {
    for(int i = 0; i < Lesson_Count; i ++) 
    {
      Note Infl3 = Infl[i];
      System.out.printf("%d,%s,%s,%s,%s \n", Infl3.number,Infl3.name,Infl3.dailyCheck,Infl3.login,
          timestamp);
    }
  }

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
}