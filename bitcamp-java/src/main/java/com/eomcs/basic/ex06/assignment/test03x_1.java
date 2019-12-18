package com.eomcs.basic.ex06.assignment;

public class test03x_1 {

  public static void main(String[] args) {


    int width = Console.inputInt();
    
    if(width % 2 == 0)
      width--;

    int spacesize = width >> 1;

    int line = 0; 
    while(line++ < width) 
    {       
      if(line % 2 == 0) {
        continue; // line / 2 가 짝수일 경우 출력하지않고 다음 라인으로 넘어감
      }
      
      Graphic.drawLine(spacesize, ' ');
      spacesize--;

      Graphic.drawLine(line, '*');
      System.out.println();
    }
  }

  
    
}
