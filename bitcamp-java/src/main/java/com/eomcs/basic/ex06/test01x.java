package com.eomcs.basic.ex06;

import java.util.Scanner;
//import com.eomcs.basic.ex06.Graphic;
public class test01x {
  
  public static void main(String[] args) {

    int width = inputInt();    
    int line = 0; // while은 조건문에 boolean값을 사용해야하므로 정의가 필요함
    while (line++ < width) {
      Graphic.drawLine(line);

      System.out.println();
      }
  
      
      System.out.println();      
   }
  static int inputInt() 
  { 
    Scanner scan = new Scanner(System.in);
    System.out.println("밑변 길이?"); // println은 줄바꿈을 자동으로함
    int width = scan.nextInt();

    scan.close();
    return width;
    
  }

    
    

  
}



