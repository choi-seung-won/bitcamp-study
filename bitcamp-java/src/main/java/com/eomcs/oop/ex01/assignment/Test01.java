package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01 {


  public static void main(String[] args) {
    class Score {
      String name;
      int kor;
      int eng;
      int math;
    }

    Scanner keyScan = new Scanner(System.in);
    int SIZE = 100;

    
    Score[] arr = new Score[SIZE];

    //    int count = 0;

    System.out.println("입력 ");
  

    for (int i = 0; i < arr.length; i++) {
      System.out.print("입력: ");
      Score s = new Score();
      
      s.name = keyScan.next();
      s.kor = keyScan.nextInt();
      s.eng = keyScan.nextInt();
      s.math = keyScan.nextInt();
      
      arr[i] = s;
    }
    
    for (int i = 0; i < arr.length; i++) {
      System.out.print("입력: ");
      Score s = new Score();

      s.name = keyScan.next();
      s.kor = keyScan.nextInt();
      s.eng = keyScan.nextInt();
      s.math = keyScan.nextInt();

      arr[i] = s;
    }


    //   String[] name = new String[SIZE];
    //   int[] score = new int[SIZE];
    /*   
    for(int i = 0;i < SIZE; i ++ ) {
      score[i] 
    }
     */  

    //   int kSc,eSc,mSc = 0;

    /*

    for(int i = 0; i < count; i ++) {
    data date2 = new data();

    System.out.print("입력 : ");
    date2.name = scan.next();
    date2.Ksc = scan.nextInt();
    date2.eSc = scan.nextInt();
    date2.mSc = scan.nextInt();

    count ++;

    }
     */
    for (int i = 0; i < arr.length; i++) {
      Score s = arr[i];
      int sum = s.kor + s.eng + s.math;
      float aver = sum / 3f;
      System.out.printf("%s %d %d %d %d %.1f\n", 
          s.name, s.kor, s.eng, s.math, sum, aver);
    }
    /*

    float sum = (float) + (float)sce + (float)scm;

    System.out.println("------------");


    for(int i = 0; i < )

    System.out.print("");

     */

    }

}
