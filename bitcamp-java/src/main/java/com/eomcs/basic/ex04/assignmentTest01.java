// 과제 1 : 계산기 애플리케이션을 작성하라.
// - 실행
// 값1? 10
// 값2? 20
// 연산자(+,-,*,/)? +
// => 10 + 20 = 30 
//
package com.eomcs.basic.ex04;

import java.util.Scanner;

public class assignmentTest01 {
  public static void main(String[] args) {




    Scanner calc = new Scanner(System.in);

    Scanner calc2 = new Scanner(System.in);

    System.out.println("계산할값 1 :\n");

    int num1 = calc.nextInt();

    System.out.println("계산할값 2 :\n");
    
    int num2 = calc.nextInt();
    
//    System.out.println("연산자선택");
    
    System.out.println("연산자 선택 \n 1.+ 2.- 3. * 4./ ");

    int num3 = calc.nextInt();


    if(num3 == 1)
    {
      System.out.println(num1 + num2);

    }
    if(num3 == 2)
    {
      System.out.println(num1 - num2);
    }
    if(num3 == 3)
    {
      System.out.println(num1 * num2);
    }
    if(num3 == 4)
    {
      System.out.println(num1 / num2);
    }
    else{
      System.out.println("Error");
//      throw Exception()

      System.exit(0); // jvm down
//      return 0;
    }



  }
}
