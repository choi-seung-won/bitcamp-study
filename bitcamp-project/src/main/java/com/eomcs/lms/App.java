/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {



  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    final int SIZE = 10000;

    //    int[] count = new int[size];
    int[] number = new int[SIZE];
    String[] title = new String[SIZE];
    String[] description = new String[SIZE];
    Date[] startdate = new Date[SIZE];
    Date[] enddate = new Date[SIZE];
    int[] totalhours = new int[SIZE];
    int[] dayhours = new int[SIZE];     



    int count = 0;


    for(int i = 0 ; i < SIZE; i ++) {      

      count++;
      
      System.out.print("번호?");

      number[i] = scan.nextInt();

      scan.nextLine();

      System.out.print("수업명?\n");    

      title[i] = scan.nextLine();

      System.out.print("수업내용?\n");

      description[i] = scan.nextLine();

      System.out.print("시작일?\n");    

      startdate[i] = Date.valueOf(scan.next());    

      System.out.print("종료일?\n");

      enddate[i] = Date.valueOf(scan.next());

      System.out.print("총수업시간?\n");

      totalhours[i] = scan.nextInt();

      System.out.print("일수업시간?\n");

      dayhours[i] = scan.nextInt();

      scan.nextLine();//남아있는 줄바꿈 값 제거

      System.out.println("계속 입력 (Y/n)");
      
      String response = scan.nextLine();

      if(!response.equalsIgnoreCase("Y")) {
        break;
      }
    }
    System.out.println();
    // count[0] = 0;
    for(int i = 0; i < count; i ++) 
    {
      System.out.printf("%d, %s ,%s ~ %s,%d\n",number[i],title[i],startdate[i],enddate[i],totalhours[i]);
    
    }
    scan.close();
  }
}

//System.out.println("daily?");