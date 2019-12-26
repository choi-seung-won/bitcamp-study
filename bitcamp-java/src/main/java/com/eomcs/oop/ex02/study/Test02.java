package com.eomcs.oop.ex02.study;

public class Test02 {
  public static void main(String[] args) {

    int a = 100, b = 150;

    Calculator c1 =new Calculator();
    Calculator c2 =new Calculator();


    //method 호출 시 어떤 result 변수에 그 계산결과를 저장할 것인지 파라미터로 인스턴스 주소를 넘겨야 함.
    c1.plus(2);
    c2.plus(3);
    c1.plus(7);
    c2.minus(1);
    c1.multiple(7);
    c2.divide(3);
    System.out.printf("result: %d\n", c1.result);
    System.out.printf("result2: %d\n", c2.result);
  }



}
