package com.eomcs.basic.ex07.assignment;

public class Test02 {

  public static void main(String[] args) {
  //배열의 값 중에서 최대 값을 출력하라.
    
    int[] values = {34,4,-3,78,12,22,45,0, - 22};
    sort(values);//배열값을 오름차순으로 정렬을 수행(-22~78)
    
    for(int value : values) {
      System.out.println(value);
    }
  }
  //// 34   4       4    -3         -3      78      78  12      12      22
  public static void sort(int[] values) {
    int[] temp = {0,34,4,-3,78,12,22,45,0,-22};
    int[] dump = new int[100];
    for(int i = 0; i < 9; i ++) {
//      temp[i] = values[i+1];
      if(values[i] < temp[i]) {
        values[i]=temp[i];
      }

    }
    for(int i = 0; i < 9; i ++) {
    values[i] = temp[i];
    }
  }
  
  //출력결과:
  //-22,-3,0,4,12,22,34,45,78
 
}

//조건문 비교연산 사용고려 > 임의변수 temp값을 기점으로함