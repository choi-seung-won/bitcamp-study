// 산술 연산자 : 명시적 형변환
package com.eomcs.basic.ex05;

public class Exam01_7 {
  public static void main(String[] args) {
    
    byte b;
    
    //4byte크기를 갖는 정수 literal을 byte변수에 저장할 수 없다.
    //b=256;컴파일오류
    
    //저장을 원할 시 형변환type casting을 명시적으로 지정하라
    //메모리에 들어가기에 큰 값이라면 형변환 할 시 값이 잘림.
    
    b = (byte)256;
    //int(4 byte) > 0000 0000 0000 0000 0000 0001 0000 0000
    //byte(1 byte)> ---- ---- ---- ---- ---- ---- 0000 0000
    //4byte중 앞의 3바이트가 잘리고 1바이트만 b에 저장됨
    
    System.out.println(b);
    
    //>> 큰 메모리의 값을 작은 메모리에 저장을 목적으로 형변환을 사용하기도 하나 형변환 하더라도 값이 잘리지 않을경우만 시도.
    //>> 형변환후 값이 소실되지 않을경우만 명시적 형변환 지시
    
    
    float r1 = 5 / 2 + 3.1f;
    System.out.println(r1);
    
    //r1 = int(5) / int(2) + float(3.1);
    //r1 = int(2) + float(3.1);
    //r1 = float(2.0) + float(3.1)
    //r1 = float(5.1)
    // > 연산우선순위에 따라 계산하는 순간에 암시적 형변환이 이루어진다.
    // > 모든 값을 최종 결과타입으로 바꾸고 계산하지는 않는다.
    
    float r2 = 3.1f + 5 / 2;
    //계산 순서
    //r2 = float(3.1) + int(5) / int(2)
    //r2 = float(3.1) + int(2)
    //r2 = float(3.1) + float(2.0)
    //r2 = float(5.1)
    System.out.println(r2);
  }

}
