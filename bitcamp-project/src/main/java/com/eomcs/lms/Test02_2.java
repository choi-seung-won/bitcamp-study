package com.eomcs.lms;

import java.util.Scanner;

public class Test02_2 {
  
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    
    System.out.println("숫자 입력 ?");
    while(true)
    {
      int no = scan.nextInt();      
      if(no == 0)  //입력값으로 0 을 사용할 수 없는 문제
      
        break;
      
      min = no < min ? no : min;
      max = no > max ? no : max;
        
    }
    

    System.out.printf("최소값 : %d\n",min);

    System.out.printf("최대값 : %d\n",max);


    scan.close();
  }

}
