package com.eomcs.basic.ex04;

public class Exam151{


  public static void main(String[] args){


    int i;
    i = 100;

    
    int j;
    j = i;// i변수 할당값을 j변수에 할당
    
    j = i*3;
    j = Math.abs(-200); // 표현식
    j = (i > 100) ? 1 : -1; // 표현식
    // j = System.out.println(100); sysout은 표현식이 아닌 문장
    
    System.out.println(j); // i변수에 할당된 값을 전달, (100)
   //문장Statement = 자바 언어로 작성한 명령어
   //표현식expression = 문장 중 값을 리턴하는 문장
  }
}