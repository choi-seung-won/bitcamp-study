package com.eomcs.basic.ex06;

import java.util.Scanner;

public class test03x03 {
  
   public static void main(String[] args) {
     
     Scanner scan = new Scanner(System.in);
     System.out.println("밑변 길이?"); 
     
     int width = scan.nextInt();
     
     if(width % 2 == 0)
       width--;
     
     int spacesize = width >> 1;
     
     int line = 0; 
     while(line++ < width) 
     {       
       if(line % 2 == 0) {
         continue; // line / 2 가 짝수일 경우 출력하지않고 다음 라인으로 넘어감
       }
       
       int count = 0;
       
       while(count++ < spacesize);{
         System.out.print("");
       }
       spacesize--;
              
       int j = 0;
       
       while (j++ < line ) {
         System.out.print("*");       
       }
       System.out.println();      
     }
     
     
     
     scan.close();
     
   }

}
