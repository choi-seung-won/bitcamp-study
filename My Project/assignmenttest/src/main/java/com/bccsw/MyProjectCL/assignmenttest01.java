package com.bccsw.MyProjectCL;

import java.util.Scanner;

public class assignmenttest01 {
  
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
      
      System.exit(0); // jvm down

    }
    if(num3 == 2)
    {
      System.out.println(num1 - num2);
      
      System.exit(0); // jvm down
    }
    if(num3 == 3)
    {
      System.out.println(num1 * num2);
      
      System.exit(0); // jvm down
    }
    if(num3 == 4)
    {
      System.out.println(num1 / num2);
      
      System.exit(0); // jvm down
    }
    if(num3 >= 5) {
      
      System.out.println("올바르지 않은 값");
      
      System.exit(0);
      
      
    }
    else
    {
      System.out.println("Error");
//      throw Exception()

      System.exit(0); // jvm down
//      return 0;
    }
 


    calc.close();
    calc2.close();

  }

}
