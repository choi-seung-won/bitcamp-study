package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;

// 과제: 재귀호출을 이용하여 직삼각형을 출력하라.
// 실행)
// 밑변의 길이? 5
// *
// **
// ***
// ****
// *****
//
public class Test05 {
  static String[] array = new String[1000];
  public static void main(String[] args) {
    // 사용자로부터 밑변의 길이를 입력 받는다.
    
    
    Scanner scan = new
        Scanner(System.in);
    System.out.println("밑변길이입력  :  \n");
    
    int UserInput = scan.nextInt();
    
    int base = 0;
    
    base = UserInput;
    
    // 직삼각형을 출력한다.
    printTriangle(base);
//    System.out.print(array[maxL]);

    scan.close();
  }
  
  static void printTriangle(int base) {
    // 코드를 완성하시오!
    
    if(base == 0) {
      return;
    }
    
    printTriangle(base - 1);
    
    for (int i =0; i < base; i ++) { // 모든 재귀호출 연산 후 출력시행방식
      System.out.print("*");
    }
    System.out.println();
    
  }
  //  int maxL = 0;
  //  int Lcount = 1;
    
  //  for(maxL = 0; maxL < base.length; maxL++) {
  //  Lcount++;
  //  if (maxL >= Lcount) {
      
 //     System.out.println();
  //    array[maxL] = "\n";

    //}else {
//      System.out.println("*");
    //  array[maxL] = "*";
   // printTriangle(maxL + 1);
    //System.out.print(array[maxL]);
    
    
  }

