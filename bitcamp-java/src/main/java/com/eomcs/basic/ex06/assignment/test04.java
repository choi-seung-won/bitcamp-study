package com.eomcs.basic.ex06.assignment;

//나이를 입력받아 성년/미성년 여부 출력

public class test04 {
  
  

  public static void main(String[] args) {

    int age2 = Console.inputInt(); // deprecated annotation

    
    int age = Console.inputInt("나이? : ");
    
    if( age >= 18 ) {
      System.out.println("성인");
    }else {
      System.out.println("미성년");
      
    }
  

  
    
}
}