package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Console {



  @Deprecated
  static int inputInt() 
  { 
    Scanner scan = new Scanner(System.in);
    System.out.println("밑변 길이?"); // println은 줄바꿈을 자동으로함
    int width = scan.nextInt();

    scan.close();
    return width;

  }

  static int inputInt(String message) 
  { 
    Scanner scan = new Scanner(System.in);
    System.out.println(message); // println은 줄바꿈을 자동으로함
    int width = scan.nextInt();

    //scan.close();
    return width;

  }

}
