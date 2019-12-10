package com.eomcs.basic.ex03;


public class Exam5 {

  public static void main(String[] args)

  {
    System.out.println(true);
    System.out.println(false);
    System.out.println(true); // should be error

    System.out.println(4 < 5);//비교연산-논리값return
    System.out.println(4 > 5);

    System.out.println(true && true);
    System.out.println(true && false);

    System.out.println(true || true);
    System.out.println(true || false);

    //charcode '' calc

  
    System.out.println('가' == 44032); // 연산/비교연산 수행시 해당코드는 정수로 간주
    System.out.println('가' == 44011);

  }
}

//boolean(논리) 값을 다룰 때 메모리 크기 - JVM은 boolean 값을 저장할 때 4 byte 정수 메모리를 사용
//true(1), false(0)
//배열인 경우 1byte 정수 메모리를 사용