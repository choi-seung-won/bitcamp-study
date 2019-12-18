package com.eomcs.basic.ex04;


//형변환  - 정수변수값을 부동소수점 변수에 삽입

public class Exam91 {


  public static void main(String[] args) {

    
    byte b =100;
    short s = 200;
    int i = 18_3456_6789;
    long l = 344_9876_9998_7654_3219l;
    
    //메모리 크기에 상관없이 정수변수의 값을 부동소수점 변수에 넣을 때 컴파일오류가 발생하지 않음
 //   실행시 유효자릿수를 초과시 값이 짤릴 수 있음.
    float f;
    f = b;
    System.out.println(f);
    f = s;
    System.out.println(f);
    f = i;
    System.out.println(f);
    f = l;
    System.out.println(f);
    
    double d;

    d = b;
    System.out.println(d);
    d = s;
    System.out.println(d);
    d = i;
    System.out.println(d);
    d = l;
    System.out.println(d);
    
    
    
  }
  
}
