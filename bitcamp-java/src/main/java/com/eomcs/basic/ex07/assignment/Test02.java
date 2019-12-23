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

/*
 * 
  public static void main(String[] args) throws Exception{
 

sort(values);


printValues(values);


 *static void sort(int[] values) throws Exception {
 *
 * 크기 비교를 위해 현재 위치의 값과 앞 쪽의 값을 비교해야 한다, 따라서 배열 개수만큼 반복하지 말고 한 번 적게 반복해야 한다
 * 다음 반복문을 한 번 돌면 가장 큰 수가 맨 오른쪽에 놓인다.
 * 이 반복문을 여러 번 반복하면 된다.
 * 
 *for(int x = (values.length - 1); x > 0; x--){
 *int temp = 0;
 *
 *for(int i =0; i < x ; i++){
 *Thread.currentThread().sleep(1000);
 *printValues(values, i);
 *
 *if(values[i]) values[i+1]){
 *System.out.println(values[i] + " ,");
 *temp = values[i];
 *values[i] = values[i + 1];
 *values[i + 1] = temp;
 *}
 *Thread.currentThread().sleep(100); // 현재 스레드 실행 후  1초 단위로 딜레이
 *printValues(values , i);
 *}
 *}
 *
 *}
 *
 *
 *static void printValues(int[] values, int currPos){
 *  for(int i =0; i< values.length; i++){
 *  if ( i == currPos) {
 *  System.out.printf("%3d<- " , values[i]);
 *  }else {
 *  System.out.printf("%3d  ",values[i]);
 *  }
 *  }
 *  System.out.println();
 *}

 */