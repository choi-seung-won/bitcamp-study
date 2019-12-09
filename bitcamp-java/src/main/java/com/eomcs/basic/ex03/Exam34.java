package com.eomcs.basic.ex03;

public class Exam34 {

  public static void main(String[] args){

    //4byte 부동소수점 유효 자릿수 : 7
   System.out.println(Double.MAX_VALUE);
   System.out.println(Double.MIN_VALUE);
   

   System.out.println(Float.MAX_VALUE);
   System.out.println(Float.MIN_VALUE);


   System.out.println(3.1415926535f);//값이오류남
   System.out.println(3.141592f);//정상값
   

   
   //개발자가 부동소수점의 정확한 범위계산이 쉽지않다 - 2진수변환 규칙을 참고하여 유효자릿수 값의 범위를 따진다
   System.out.println(3141.592f);
   System.out.println(31415.92f);
   System.out.println(314159.26f); // 값이오류남
   
   // 4byte memory에 저장할 수 있는 부동소수점은 소수점의 위치에 관계없이 7개일경우 정상적으로 저장,출력가능 exception 발생가능
   // 부동소수점은 메모리에서 꺼낸 값을 내부의 규칙에따라 JVM이보정하여 return 한다
   
   //부동소수점을 2진수로 바꿀 떄 IEEE 754 규칙에따라 변경하는 과정에서 일부 부동소수점은 2진수로 정확히 변경되지 못함
   
   System.out.println((1.1f + 0.2f) == 1.3f); // == operator(연산자) 비교연산
   //8byte 부동소수점 유효 자릿수 : 15자리
   
   System.out.println(314159265358979.3); // E@로 부동소수점 표기
   System.out.println(914159265358979.3);
   System.out.println(9.141592653589793);
   
   
  //16자리인 경우 일부 부동소수점의 값이 제대로 저장되지 않음

   System.out.println(914159265358979.3);
   System.out.println(91415926.53589793);
   System.out.println(9.141592653589793);

   // 15자리인 경우 대부분 부동소수점값이 제대로 저장됨
   System.out.println(91415926535897.3); 
   System.out.println(91415926.5358973);
   System.out.println(9.141592653589793);
   

   //## 부동소수점을 저장할 때 정확하게 저장되지 않는 예
   System.out.println(7 * 0.1); //결과: 0.7000000000000001
   //- 이유
   //  - IEEE-754 규격에 따라 부동소수점을 2진수로 바꾸다보면
   //    정확하게 2진수로 딱 떨어지지 않는 경우가 있다.
   //    CPU, OS, 컴파일러, JVM의 문제가 아니다.
   //  - IEEE-754의 방법에 내재되어 있는 문제다.
   //- 해결책
   //  - 시스템에서 필요한 만큼 소수점 이하 자리수를 적절히 짤라 사용하라!
  }
}


//// ### IEEE-754
// - 부동소수점을 32비트와 64비트로 표현하는 방법에 대해 정의하고 있다.
// - 32비트로 표현하는 방법을 "single-precision(정밀도 1; 단정도)"이라 한다.
// - 64비트로 표현하는 방법은 32비트에 대비해 두 배 가량 더 정밀하게 표현할 수 있다고 해서 "double-precision(정밀도가 두 배; 배정도)"이라 한다.
// 
// ### 부동소수점을 2진수로 표현하는 방법
// - 자바에서 부동소수점의 정규화는 "IEEE 754-1985" 명세에 따른다.
// - 메모리 크기와 비트의 구성
//   => 32비트 float 타입(32-bit single-precision; 단정도)
//     [부호비트(1)][지수부(8)][가수부(23)]
//   => 64비트 double 타입(64-bit double-precision; 배정도)
//     [부호비트(1)][지수부(11)][가수부(52)]
// - 부호비트(sign bit)
//   음수는 1, 양수는 0.
// - 지수(exponent)
//   127 bias를 사용한다. 즉 2의 지수 값에 127을 더한 결과 값을 사용한다.
// - 가수(fraction/mantissa)
//   sign-magnitude 방식으로 저장한다.
//   1.xxxx 값에서 소수점 왼쪽에 있는 1을 제외한 나머지 수를 사용한다.
//   가수부에 남는 비트가 있다면 0으로 채운다.

// ### 실수 값을 정규화하는 방법 = 실수 값을 32비트 2진수로 만드는 방법
// - 예: 12.375(10진수)
//
// 1) 소수점 앞의 정수 값을 2진수로 변환한다.
//   12(10진수)
//   = 1100(2진수)  
// 
// 2) 소수점 뒤의 값을 2진수로 변환한다.
// - 변환 규칙
// - 소수점을 2로 곱하여 나온 결과에서 정수 부분만을 차례대로 표기한다.
// - 소수 부분이 0이거나 반복되면 계산을 멈춘다.
// - 예: 0.375(10진수)
//   0.375 * 2 = 0.75  --> 0
//   0.75 * 2  = 1.5   --> 1
//   0.5 * 2   = 1.0   --> 1
//   => 0.011(2진수)
//
// 3) 2진수 바꾼 최종 결과
//   12.375(10진수)
//   = 12(10진수) + 0.375(10진수)
//   = 1100(2진수) + 0.011(2진수)
//   = 1100.011(2진수)
//   = 1*2^3 + 1*2^2 + 0*2^1 + 0*2^0 + 0*2^-1 + 1*2^-2 + 1*2^-3
//   = 1*8 + 1*4 + 0*2 + 0*1 + 0*0.5 + 1*0.25 + 1*0.125
// 
// 4) 정규화 
// - 소수점의 위치를 조정하여 가수부와 지수부를 분리한다.
// - IEEE 754 명세는 다음과 같은 형식으로 가수부와 지수부를 나눈다.
//   1.x1x2x3x4...x23(2진수) * 2^e
//   => 소수점 왼쪽에 1만 남도록 소수점을 이동한다.
//   => 소수점 왼쪽은 무조건 1이기 때문에 저장하지 않고 버린다.
//   => 따라서 소수점 오른쪽 수만 가수부에 놓는다.
//      즉 x1, x2 등은 가수부 1번 비트부터 23번 비트까지를 의미한다.
//   => 23번 비트까지 채우지 못하면 나머지 비트는 0으로 채운다.
// - 예)
//   1100.011(2진수)
//   = 1.100011(2진수) * 2^3
//   가수부 => 100011(2진수)
//   지수부 => 3 + 127(bias) = 130(10진수) = 10000010(2진수)
//
// 5) 32비트로 표현하기
//   [0][10000010][10001100000000000000000]
//   => 0100_0001_0100_0110_0000_0000_0000_0000
//   => 0x41460000
//
//주의!
//- 유효 자릿수의 부동소수점이라도 정규화할 때 2진수로 딱 떨어지지 않은 경우가 있다.
//- 예) 2.127
//2 => 0010
//0.127 => 
//0.127 * 2 = 0.254 --> 0
//0.254 * 2 = 0.508 --> 0
//0.508 * 2 = 1.016 --> 1
//0.016 * 2 = 0.032 --> 0
//0.032 * 2 = 0.064 --> 0
//0.064 * 2 = 0.128 --> 0
//0.128 * 2 = 0.256 --> 0
//0.256 * 2 = 0.512 --> 0
//0.512 * 2 = 1.024 --> 1
//0.024 * 2 = 0.048 --> 0
//....
//이처럼 2진수로 완벽히 표현할 수 없는 수가 있다.
//0.00000....1 의 오차가 있다.
//그래서 부동소수점은 정수와 다르게 정확하게 메모리에 저장되지 않는다.