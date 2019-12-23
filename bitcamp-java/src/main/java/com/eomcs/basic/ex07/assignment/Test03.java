package com.eomcs.basic.ex07.assignment;

public class Test03 {

  public static void main(String[] args) {
  //배열의 값 중에서 최대 값을 출력하라.
    
    int[] values = {34,4,-3,78,12,22,45,0, - 22};
    
    // 배열의 들어있는 값의 순서를 거꾸로 바꾸어라
    reverse(values);
    
    for ( int value : values) {
      
      
      System.out.println(value);
      
  }
  
  }
  
  static void reverse(int[] values) {
    int count = values.length >> 1;
    int temp = 0;
    int endPos = values.length - 1;
    for(int i = 0; i < count; i ++) {
      temp = values[i];
      values[i] = values[endPos - i];
      values[endPos -i] = temp;
    }
  }
  
  static void printValues(int[] values) {
    for (int i = 0; i < values.length; i++) {
      System.out.printf("%3d", values[i]);
    }
  }
  
  //출력결과:
  //-22,0,45,22,12,78,-3,4,34
}

