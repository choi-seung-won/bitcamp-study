package com.eomcs.oop.testO;
//헬스장 회원 정보를 입력받아 출력
public class Test03 {
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
    //자바 원시 데이터 타입은 변수를 선언하는 순간 메모리도 준비된다.
    //변수가 곧 메모리이다.
    
    int i;
    i = 100;

    //레퍼런스는 메모리의 주소를 담는 변수다.
    //레퍼런스를 선언했다고 해서 해당 설계도의 메모리가 준비되는 것은 아니다.
    
    Member m1;
    
    
    //m1은 메모리의 주소를 저장하는 변수이다.
    // 주소를 저장하지 않고 사용할 수 없다
    //m1.no = 100;
    
    //m1의 사용하려할시 메모리(인스턴스)를 생성한 후 주소를 할당해야함
    m1 = new Member();
    
    m1.no = 100;
    
  }

}
