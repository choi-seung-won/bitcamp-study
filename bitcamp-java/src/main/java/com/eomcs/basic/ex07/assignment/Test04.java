package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;

// 과제: 재귀호출을 이용하여 n! 을 계산하라.
// 실행)
// 입력? 5
// 5! = 1 * 2 * 3 * 4 * 5 = 120
//
public class Test04 {
  
  static Scanner scan = new Scanner(System.in);
  static int summary;
  public static void main(String[] args) {
    // 사용자로부터 정수 값을 입력 받는다.
    
    
    System.out.println("num ? \n");
    int n = scan.nextInt();
   // int n = summary;
    
    // n! 을 계산한다.
    int result = factorial(n);
    
    // 결과 값을 출력한다.
    
    System.out.print(result);
  }
  
  static int factorial(int n) {
    int sum = n;
    
    if(n == 1) 
    {
    // 코드를 완성하시오!
    sum = 1;
    
    }
    else
    {
      sum = n * factorial(n - 1);
    }
    return sum;
  }//factorial end
  
  
}




