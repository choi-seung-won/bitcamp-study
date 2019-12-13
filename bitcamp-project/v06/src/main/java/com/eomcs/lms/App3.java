package com.eomcs.lms;

import java.sql.Date;

//import com.eomcs.lms.Board;

import java.util.Scanner;

//고급
//  배열의 개수를 변수에 저장하여 크기 변경을 쉽게 하기
//  배열의 개수를 저장한 변수를 함부로 변경하지 못하도록 한다.
//  final
//  코드를 관리하기 쉽도록 작은 기능단위로 분리한다. - method
//  method간 공유하는 변수는 class변수로 선언
//  static variable
//  복합데이터를 저장할 메모리 설계 ( class)



public class App3 {
  
  
  
  final static int size = 5734;
  
  static Board[] boards = new Board[size];
  
//  static int[] no = new int[size]; // 배열선언시 일반변수외에는 new 선언, new선언시 해당메모리는 할당됨
//  static String[] title = new String[size];
//  static Date[] date = new Date[size];
//  static int[] viewCount = new int[size];
  static int count = 0;
  

  
  public static void main(String[] args) {
    

    //    int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0;
//    String title1 = "", title2 = "", title3 = "", title4 = "", title5 = "";
//    Date date1 = null, date2 = null, date3 = null,
//        date4 = null, date5 = null;
//    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

    
    
    
    inputBoards();

    System.out.println();

    printBoards(); // 호출

  }
  
  static void inputBoards() {
    
    
    
    Scanner keyboard = new Scanner(System.in); // local지역변수는 public static 쓰지않음
    String response;
    
    for(int i = 0; i < size; i++ )  {               //
      Board b = new Board(); // Board설계에따라 메모리 준비에서 리턴

      System.out.print("번호? ");
      b.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("내용? ");
      b.title = keyboard.nextLine();

      b.date = new Date(System.currentTimeMillis());
      b.viewCount = 0;
      count++;
      
      boards[i] = b;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }

    }
    keyboard.close();

  }
  
  static void printBoards() {
    System.out.println();
    for(int i = 0; i < count; i ++) {
      
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", b.no, b.title, b.date, b.viewCount);

    }
    
  }
}




