package com.eomcs.oop.ex02.study;

public class Calculator {
  
  //method가 작업한 결과를 보관하기 위해 필드 문법을 도입
 // static int result; // field는 0으로 자동 초기화됨
  int result;
  
  //Calculator의 result 변수는 static이므로 클래스에 한 개만 존재함.
  //여러개의 결과를 동시에 관리할 수 없음
  //하나의 식을 끝낸 후 다른 식을 계산해야함
  //결과의 개별관리를 원할 경우 non-static/instance field로 선언. 
  //개별적으로 관리되는 인스턴스변수 result 사용을 원할 시 파라미터로 인스턴트의 주소를 받아야 함 > 변수의 static 제거 + 
  //instance field로 만들면 된다.
  //reserved keyword
  
  void plus(int value) {
    this.result += value; // result = result + value
  }

  void minus(int value) {
    this.result -= value; // result = result - value
  }
  void multiple(int value) {
    this.result *= value;
  }

  void divide(int value) {
    this.result /= value;
  }
  
 
}
