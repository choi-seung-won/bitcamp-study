package com.eomcs.basic.ex04;

public class Exam61 {
  public static void main(String[] args) {
    // 배열 사용 전
    int kor,eng,math,soc,mus;

    // 배열 선언
    int[] score = new int[5]; // OK!
    int score2[] = new int[5]; // OK! C-style.

    score[0] = 100; // [x] x= index,배열의 저장소
    score[1] = 90;
    score[2] = 80;
    score[3] = 70;
    score[4] = 60;

    //score[-1] = 100;//runtime error
    //score[5] = 100;

    //배열 레퍼런스와 인스턴스 따로선언
    int[] arr1 = null; // address = 0 > 메모리를 가리키지않음

    //arr1[0] = 100;//runtime error;

    arr1 = new int[5]; 
    arr1[0] = 100; //ok
    arr1[1] = 100; // ok

    System.out.println(arr1[0]);
    System.out.println(arr1[0]);
 
    
    int[] arr2;

    //배열 레퍼런스는 배열 인스턴스의 주소를 담는다.
    arr2 = arr1; // arr1에 저장된 배열 인스턴스의 주소를 담는다.

    System.out.println(arr1[0]);
    arr2[0] = 300;
    System.out.println(arr1[0]);

    //배열 인스턴스의 각 항목은 생성되는 순간 기본값으로 자동 초기화된다.
    //byte short int long 배열 : 0
    //float double 배열 : 0.0
    //boolean 배열 : false
    //char 배열 : \u0000;
    System.out.println(arr1[2]);

    int[] arr3 = new int[3];
    

    arr3[0] = 30;
    arr2 = arr3;
    

    System.out.println(arr2[0]);


    arr1 = arr2;
    // arr1 에 저장되었던 기존 배열 인스턴스주소를 갖고있는 인스턴스의 주소를 가진 레퍼런스가 없기에 접근할 수 없음
    // > 주소를 잃어 접근 불가능한경우 사용이 불가능하므로 메모리가 낭비됨=garbage메모리
    // jvm 실행중 메모리가 부족할때 garbage collector에 의하여 garbage는 메모리할당이 해제됨
    // jvm종료시에도 jvm이 사용하던 모든 메모리는 os에 반납되기에 garbage또한 할당이 해제됨
    // 전산학에서는 garbage를 dangling object 라 칭함

    System.out.println(arr1[0]);


    int[] arr4 = new int[3];

    arr4[0] = 100;
    arr4[1] = 90;
    arr4[2] = 80;


    //초기화 시키는 값 개수 만큼 배열 항목이 생성된다.
    int[] arr5 = new int[] {100,90,80}; // 배열 3개 0-100,1-90,2-80

    
    //int[] arr6 = new int[4] {100,90,80}; // 인스턴스 생성과 동시에 값 지정시 배열갯수 지정 불가


    //  배열 선언과 동시에 인스턴스를 초기화 시킬때 new int[] 를 생략가능하나
    //  레퍼런스 생성후 값 초기화할시 인스턴스 배열 갯수 생략불가능
    int[] arr7 = {100,90,80}; 


    //arr8 = {100,90,80};
    
    int[] arr8 = {100,90,80};

    
  }
}


