package com.eomcs.basic.ex06.assignment;


//import com.eomcs.basic.ex06.Graphic;
public class test01x {
  
  public static void main(String[] args) {

    int width = Console.inputInt();    
    int line = 0; // while은 조건문에 boolean값을 사용해야하므로 정의가 필요함
    while (line++ < width) {
      Graphic.drawLine(line);

      System.out.println();
      }
  
      
      System.out.println();      
   }

    
    

  
}



