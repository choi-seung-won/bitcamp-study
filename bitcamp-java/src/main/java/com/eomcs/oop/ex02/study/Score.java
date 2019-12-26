package com.eomcs.oop.ex02.study;

public class Score {
//변수 선언을 통해 메모리 구조 설계 : 인스턴스 변수

  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  //method를 다음과 같이 호출할 때, 인스턴스주소.메서드명(); > 
  //메서드를 통해 값을 계산하는 기능을 추가 : 연산자 정의
  //합계와 평균을 계산하는 기능을 추가한다,.
  
  public void calculator() {
    //instance method는 instance 주소를 받는 내장 변수Build-in가 있다(this)
    //
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum /3f;
   
    

  }
}
