/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  
 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    final int size = 10000;
    
//    int[] count = new int[size];
    int[] number = new int[size];
    String[] classname = new String[size];
    String[] classdesc = new String[size];
    Date[] startdate = new Date[size];
    Date[] enddate = new Date[size];
    int[] overall = new int[size];
    int[] daily = new int[size];     
    
    String response;
    
    int count = 0;
    
    
    for(int i = 0 ; i < size; i ++) {      
      
    System.out.println("번호?\n");

    number[i] = scan.nextInt();
    
    scan.nextLine();
    
    System.out.println("수업명?\n");    
    
    classname[i] = scan.nextLine();

    System.out.println("수업내용?\n");
    
    classdesc[i] = scan.nextLine();
    
    System.out.println("시작일?\n");    
    
    startdate[i] = Date.valueOf(scan.next());    
    
    System.out.println("종료일?\n");
    
    enddate[i] = Date.valueOf(scan.next());
 
    System.out.println("총수업시간?\n");
    
    overall[i] = scan.nextInt();
    
    System.out.println("일수업시간?\n");
        
    daily[i] = scan.nextInt();
    
    scan.nextLine();
    
    System.out.println();
    System.out.println("계속 입력하시겠습니까(Y/n)");
    
    response = scan.nextLine();
    count++;
    
    if(!response.equalsIgnoreCase("y")) 
     {
      break;
     }
    
    
    }
    
    
    scan.close();

    System.out.println();
    
   // count[0] = 0;
    for(int i = 0; i < count; i ++) 
    {
      
    System.out.printf("%d, %s ,%s ~ %s,%d\n",number[i],classname[i],startdate[i],enddate[i],overall[i]);
    }
  
    
  
  
  }
}

//System.out.println("daily?");