package com.eomcs.oop.testO;
//헬스장 회원 정보를 입력받아 출력
public class Test11 {
  public static void main(String[] args) {
    

    //대신 자바는 다영한 종류의 데이터를 담을 수 있는 메모리를 설계하는 문법을 제공 
    
    //ex2)회원 데이터를 저장할 메모리를 설계
    class Member{
    int size = 10000;
    int no;
    String name;
    int birthYear;
    boolean gender;
    float height; // f
    float weight;
    boolean personalTraining;
    }
    //여러개의 인스턴스 주소를 저장하려면 당연히 여러 개의 레퍼런스가 필요하다.
    //
    //reference 변수를 여러개 만들기
    Member m0,m1,m2,m3,m4;
    //인스턴스를 생성하여 각 레퍼런스 (변수)에 저장하기
    m0 = new Member();
    m1 = new Member();
    m2 = new Member();
    m3 = new Member();
    m4 = new Member();
    
    m0.no = 100;
    m1.no = 200;
    m2.no = 300;
    m3.no = 400;
    m4.no = 500;
    

    //reference 배열
 // new Member[5]; // instance를 생성한 후 그 주소를 반드시 담아야함
    
    //배열주조 저장 변수선언
    // 배열의 주소를 저장하는 변수도 reference
    Member[] arr;
    // 레퍼런스 배열을 선언한다.
    // 즉 reference배열은 다음과 같다.
    //Member m0, m1,m2,m3,m4;
    //5개 변수를 선언한 것과 같다.
    arr = new Member[5]; 
    
  }
}
