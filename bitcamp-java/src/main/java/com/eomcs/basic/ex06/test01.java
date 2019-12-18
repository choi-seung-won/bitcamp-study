/*
사용자로부터 직삼각형의 밑변 숫자를 입력 받아 '*' 문자로 그려라. 

## 구현 조건
반복문을 사용할 때는 while 또는 do ~ while 문만을 사용하라!

## 실행 결과
```

밑변 길이? 5
*
**
***
****
*****
``` 
*/

package com.eomcs.basic.ex06;

import java.util.Scanner;

public class test01 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("밑변길이 입력");
    
    int input = scan.nextInt();    
    int i = 0;
    /*
    loop:
    do
    {i = ++i;     
      o = o++;
      System.out.printf("*");
      if(i >= 1)
      {
        System.out.println("*");
        if(i == ++i)
        {
          System.out.println("\n");
        }
        else break;
      }else
      {
        return;
      }
    }
    while(i < input);
    
    */

    int var2 = 1;
   
    while(i <= input) {
      while (var2 <= i) {
        System.out.print("*");
        var2++;
      }
      System.out.print("\n");
      i++;
      var2 = 1;
    }
      
    
  
    
    
    scan.close();
  }
  

}
// i의 갯수를 역수열로 출력
// 증가한 i 가 i보다 클 경우 *를 출력 println terminate line
// 증가한 i가 i와 같을경우 \n, 줄바꿈
// return
// while i < input(5)