package com.eomcs.basic.ex03;

public class Exam22 {

  public static void main(String[] args){

    System.out.println(-2147483648); //-2^31 : 4byte최소 음수
    System.out.println(2147483647); //2^31 - 1 : 4byte최대 양수
 //non literal

    System.out.println(9223372036854775807L);
    System.out.println(-9223372036854775808L);

    System.out.println(100);
    System.out.println(100L);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    
    System.out.println(Long.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
  }
}