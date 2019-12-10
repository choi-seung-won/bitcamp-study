package com.eomcs.basic.ex03;

public class Exam06 {


//문자열 literal

  public static void main(String[] args){
    System.out.println("ㅎㄱㄷ");
    System.out.println("가"); // " " - double quotation은 문자가아닌 문자열
    
    //+연산자(Operator - 특정기능을 수행하는 명령)를 이용하여 여러 문자열을 하나로 합쳐 새 문자열을 만들 수 있다.
    System.out.println("홍길동"+"입니다.");
    //문자열과 다른 종류의 값을 더함 > 다른 종류의값을 문자열로 변환한 후 기존문자열에 결합하여 새 문자열을 만듦

    System.out.println("홍길동" + 20 + "살입니다.");
    System.out.println("취업여부 : " + false);
    
    System.out.println("키 : " + 180.7F); // f-4byte부동소수점을 표현하는 접미사, 따라서 문자열로 변환되지 않음.

    //String s = "aabb"; // s = address variable
  }
}

//문자열의 저장 - java는 char(2byte) 배열(여러개의 메모리)에 문자열의 유니코드를(Unicde; UCS-2) 저장. ex)"AB가각" > [0041][0042][ac00][ac01] < 각 문자열이 2byte메모리 4개에 저장됨.
