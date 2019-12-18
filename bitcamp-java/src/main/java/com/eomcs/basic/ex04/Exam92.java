package com.eomcs.basic.ex04;


//형변환  - 정수변수값을 부동소수점 변수에 삽입

public class Exam92 {


  public static void main(String[] args) {
    
    float f = 3.14f;
    double d = 3.14;
    
    int i;
    long l;
    
    //i = f; // compile error
    
    //i = l;
    
    //l = f;
    //l = d;
    
    
    //부동소수점은 정수 변수에 저장할 수 없음
    //부동소수점 값을 정수 변수에 저장하고 싶다면 형변환(type casting/type conversion)문법을 사용해야함
    
    i = (int) f;//소수점 이하의 수 (지수부?) 는 제거됨
    System.out.println(i);
    
    i = (int) d;
    System.out.println(i);
    
    l = (long) f;
    l = (long) d;
    //개발자가 명확하게 다른 형의 값의 저장을 지시하는 문법을 "명시적 형변환(explicit type conversion/casting)"이라 칭함
  }
  
}
