package com.eomcs.basic.ex07.test;

public class Test01 {

  public static void main(String[] args) {
    
    //입력 값 : X, 리턴 값: X
    
    m1(); // method 실행
    //입력 값 : o, 리턴 값: x
    m2("홍길동"); // static void m2(String name) 
    
    //입력 값 X, 리턴 값: o
    String s;
    s = m3();
    System.out.println(s);
    
    //입력 값 : O, 리턴 값 : O
    String s2 = m4("홍길동");
    System.out.println(s2);
    
  }
  
  
  static void m1() {
    System.out.println("hello!");
  }
  
  static void m2(String name) {
    //함수안에 선언된 변수를 "로컬(local)변수" 라 부름.
    //로컬 변수중 method가 호출될 때 넘어온 값을 받는 변수를 "파라미터parameter" 라 부름
    //함수 호출 시 넘겨주는 값을 "argument" 라 부름
     System.out.println("Hello, "+ name);
  }
  
  static String m3() { // return값이 있으므로 void를 쓸 수없음
    String message = "Hello";
    return message;
    
  }
  
  static String m4(String name) { // (String var) = 해당 변수타입 데이터를 받는다는 선언
    
    String message = name + "hello"; //받은 변수타입을 받아 리턴
    return message;    // message를 리턴, value는 하나만 리턴할 수 있음. 여러 값을 리턴하는것을 원할시 class를받아 리턴
  }
}
