package com.eomcs.basic.ex04;

public class Exam71 {
  
  int instanceVar; // 인스턴스 필드
  
  static int classVar;

  public static void main(String[] args/*로컬 변수(parameter)*/) {


    int local; // local변수, method 내부에 선언된 변수
    int local2;
    
    classVar=200;
    
    //static이 안붙은 instance변수는 사용 불가
    //instanceVar=300;
    
  }
  
  static void m1() {
    //method 블록이 다르면 변수도 다름 > 따라서 같은 이름의 변수 선언가능
    int local; // local변수
    //local2 = 200; 에러
    
    //같은 static member는 사용가능
    
    classVar=100;
  }
  
  // instance method
  void m2() {
    int local; 
    classVar = 200; // staticmember 사용가능
    instanceVar = 200; // static이 없는 변수사용 가능
  }

}
