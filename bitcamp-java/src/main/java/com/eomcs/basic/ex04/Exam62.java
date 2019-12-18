package com.eomcs.basic.ex04;

public class Exam62 {

  
  public static void main(String[] args) {
    int a;
    a = 100;
    a = 200;
    
    final int b;
    b = 100;
   // b = 200;final선언된경우 저장된값 변경불가
    
    final int c = 100;
    //c = 200;
  }
}
