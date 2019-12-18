package com.eomcs.basic.ex06;

import java.util.Scanner;

public class test03x4 {

  public static void main(String[] args) {


    int width = inputInt();

    

    if(width % 2 == 0)
      width--;

    int spacesize = width >> 1;

    int line = 0; 
    while(line++ < width) 
    {       
      if(line % 2 == 0) {
        continue; // line / 2 가 짝수일 경우 출력하지않고 다음 라인으로 넘어감
      }

      int count = 0;

      drawLine(spacesize, ' ');
      spacesize--;

      drawLine(line, '*');
      System.out.println();
    }
  }

  static int inputInt() 
  { 
    Scanner scan = new Scanner(System.in);
    System.out.println("밑변 길이?"); // println은 줄바꿈을 자동으로함
    int width = scan.nextInt();

    scan.close();
    return width;
    
  }
  static void drawLine(int length, char ch)
  {    
    int j = 0;
    while (j++ < length ) { // j++ 현재x값 사용후 값 증가, int j = 의 변수값을 증가시키고 while문에 사용하는 j는 1이됨
      System.out.print(ch);       
    }
  }
    
}
