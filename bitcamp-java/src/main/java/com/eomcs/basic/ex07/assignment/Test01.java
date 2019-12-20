package com.eomcs.basic.ex07.assignment;

public class Test01 {
  static int[] values = {34,4,-3,78,12,22,45,0, - 22};
  
  static void max(int[] values) {
    //parameter로 배열을 받아 그 값 중에서 최대 값을 찾아 리턴한다.
    for(int i=0;i<9; i++) {
      if(values[i] > 77) {
        values[0]=values[i];
      }
    }
  }
  
  public static void main(String[] args) {
    //배열의 값 중에서 최대 값을 출력하라.
    
    max(values);
    
    int value = values[0];
    
    System.out.println(value);
    //출력결과 78
  }
  

}
