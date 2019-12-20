package com.eomcs.oop.test;
//헬스장 회원 정보를 입력받아 출력
public class Test21 {
  
  static class Member{
    int size = 10000;
    int no;
    String name;
    int birthYear;
    boolean gender;
    float height; // f
    float weight;
    boolean personalTraining;
  }
  
  public static void main(String[] args) {

// instance 주소 주고 받기
    
    // 1) instance 주소 받기
    
    Member m1;
    m1 = createMember(); // createMember method가 member instance를 만든 후 값을 넘겨줌
    
    // 2) instance의 주소 넘기기
    setMemberValues(m1);
    printMember(m1);
    
  }
  static Member createMember() { // createmember block 은 실행을 완료하면  m instance를 리턴함
    Member m = new Member();
    return m;
  }
  
  static void setMemberValues(Member m) {
    
    m.no = 100;
    m.name = "honggildong";
    m.birthYear = 2000;
    
  }
  
  static void printMember(Member m) { // Member  = local variable  m = parameter
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.birthYear);
  }
}
