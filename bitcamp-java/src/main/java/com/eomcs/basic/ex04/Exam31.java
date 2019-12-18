package com.eomcs.basic.ex04;

public class Exam31 {

  public static void main(String[] args){
    float f;

    f = 3.141592f;

    System.out.println(f);

    f = 3.1415929f;// 31415923
    System.out.println(f);


    f = 0.0000003141592f;  // 2진수방식으로 처리할 때 계산되는 숫자만이(소수점을 왼쪽으로 당김) 부동소수점 7자리로 책정됨

    System.out.println(f);

    f = 0.00000031415929f; 
 
    System.out.println(f);

    f = 31415920000.0f;

    System.out.println(f);

    double d;

    d = 9.87654321234567;

    System.out.println(d);


    d = 98765432123456.7;

    System.out.println(d);

    d = 98765432123456.74; // 15자리수까지 정상출력

    System.out.println(d);


    // 변수와 리터럴

    f = 99999.99f;

    System.out.println(f);
    f = 99999.887777f; // 이미 리터럴이 4바이트 부동소수점 유효자릿수(7)를 넘어감, 출력시 값이 바뀌는것이 아니라 리터럴이 비정상

    System.out.println(f);

    
    d = 99999.88f; // 4byte 부동소수점 > 8byte메모리 = 에러

    System.out.println(d);

    
    d = 99999.88; // 8byte 부동소수점 > 8byte메모리

    System.out.println(d);

    // 부동소수점은 byte규격에 맞게 값을 넣어야함

    float f1 = 99988.88f;

    float f2 = 11.11111f;

  
    System.out.println(f1);
    System.out.println(f2);

    float f3 = f1 + f2; // 연산시 99999.99111,7자리 + 이므로 값이 정상출력되지 않음, float + float = float, 결과에서 값이 왜곡

    double r = f1 + f2;//

    System.out.println(f3);

    System.out.println(r);
    //정수와 부동소수점 연산시 부동소수점으로 출력됨

    double d1 = 99988.88;

    double d2 = 11.11111;

    double d3 = d1 + d2;
  
    System.out.println(d3);
    System.out.println();

    f1 = 3.141592f;
    d1 = f1; // 컴파일 가능하나 값이 왜곡될수있음
    System.out.println(d1);
    

   // f1 = d1;

    
  }

}