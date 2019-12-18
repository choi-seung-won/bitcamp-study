package com.eomcs.basic.ex04;


//variable and block
public class Exam81 {


  public static void main(String[] args) {
    int a;
    
    // method 안에 블록을 이용하여 변수의 사용 범위를 통제가능
    {
      //블록안에 선언된 변수는 블록을 실행 시 준비됨
      int b;
      b = 200;
      
    }
   // b = 300;컴파일 오류
    {
    //  int a;//블록 밖 변수와 같은 이름을 가진 변수선언 불가
      int b;
    }
    if(true) {
      //int a = 200;
      int b = 200;
    }
//    b= 300; 오류
  }
  

}
