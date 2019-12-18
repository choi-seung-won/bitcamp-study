/*
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
****
***
**
*
``` 
*/
package com.eomcs.basic.ex06;


import java.util.Scanner;

public class test02 {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int i = 0;
    int i2 = 1;
    
    System.out.println("밑변 길이 ? ");
    int scanner = scan.nextInt();
    int var1=scanner,var2;
    
    while (i <= scanner) 
    {
      while(i2 <= i ) 
      {
        System.out.print("*");
        i2++;
      }
        System.out.print("\n");
        i++;
        i2 = 1;
        if(i > scanner) 
        {
          while(var1 > 0) {
            var2=0;           
            while(var2++<var1-1)
            {
            System.out.print("*");
            }
          }
          System.out.println();
          var1--;          
        }
    }
   scan.close(); 
  }

}