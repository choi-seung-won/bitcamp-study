package com.eomcs.basic.ex04;


public class Exam23{


public static void main(String[] args){


  
  byte b = 100;
  short s = 100;
  int i = 100;
  long l = 100;
  
  byte b2;
  short s2;
  int i2;
  long l2;


  //큰 메모리의 값을 작은 메모리에 저장하려 할 때 컴파일 오류 발생.
//  b2 = l;
//  s2 = l;
//  i2 = l;
    l2 = l;

//  b2 = i;
//  s2 = i;
  i2 = i;
//  l2 = i;


//  b2 = s;
  s2 = s;
  i2 = s;

  
  b2 = b;
  s2 = b;
  i2 = b;
  l2 = b;


  byte v1 = 10;
  byte v2 = 20;
//  byte v3 = v1 + v2;
}
}