package com.eomcs.basic.ex03;

public class Exam33 {

  public static void main(String[] args){

   System.out.println(Double.MAX_VALUE);
   System.out.println(Double.MIN_VALUE);
   

   System.out.println(Float.MAX_VALUE);
   System.out.println(Float.MIN_VALUE);


   System.out.println(3.1415926535f);//값이오류남
   System.out.println(3.141592f);//정상값
   

   //개발자가 부동소수점의 정확한 범위계산이 쉽지않다 - 2진수변환 규칙을 참고하여 유효자릿수 값의 범위를 따진다
   System.out.println(3141.592f);
   System.out.println(31415.92f);
   System.out.println(314159.26f); // 값이오류남

   // 4byte memory에 저장할 수 있는 부동소수점은 소수점의 위치에 관계없이 7개일경우 정상적으로 저장,출력가능 exception 발생가능
   // 부동소수점은 메모리에서 꺼낸 값을 내부의 규칙에따라 JVM이보정하여 return 한다

   //부동소수점을 2진수로 바꿀 떄 IEEE 754 규칙에따라 변경하는 과정에서 일부 부동소수점은 2진수로 정확히 변경되지 못함

   System.out.println((1.1f + 0.2f) == 1.3f); // == operator(연산자) 비교연산


   
  

  }
}