package com.eomcs.basic.ex03;

//# 부동소수점 리터럴 - 유효자릿수
//- 정수처럼 메모리 크기(4바이트 또는 8바이트)에 따라 표현할 수 있는 부동소수점의 범위가 다르다.
//- 단 IEEE 754 명세에 따라 2진수로 변환되기 때문에 
//  정확하게 '소수점 이상 얼마까지 소수점 이하 얼마까지' 식으로 정의할 수 없다.  
//  대신 '유효자릿수'라는 방식으로 대략적으로 값의 범위를 표현한다. 
//  


//부동소수점의 리터럴은 기본이 왜 8바이트 인가
public class Exam342 {
  public static void main(String[] args) {
    
    System.out.println(54345.66f);
    System.out.println(11.2345f);

    //  54345.66(length:7)
    //     11.23456(length:7)

    //--------
    //  54356.89456(length:10 : result should be error)

    System.out.println(54345.66f + 11.23456f);


  }
}
//계산결과가 유효자릿수를 쉽게 넘어가기때문에 자바는 기본으로 8byte 메모리를 사용
//자바로 프로그래밍을 할 때 부동소수점은 8byte로 쓴다