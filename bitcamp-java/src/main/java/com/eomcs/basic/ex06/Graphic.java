package com.eomcs.basic.ex06;
//실행을 하지 않을경우 main method 선언이 필요없음
public class Graphic {
  static void drawLine(int length)
  {    
    int j = 0;
    while (j++ < length ) { // j++ 현재x값 사용후 값 증가, int j = 의 변수값을 증가시키고 while문에 사용하는 j는 1이됨
      System.out.print("*");       
    }
  }
    
}
