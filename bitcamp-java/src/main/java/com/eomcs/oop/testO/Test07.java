package com.eomcs.oop.testO;
//헬스장 회원 정보를 입력받아 출력
public class Test07 {
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
    
    
    Member m1;
    
    m1 = new Member();
    m1.no = 100;
    // reference의 주소를 없애는 방법
    
    m1 = null;  // null = java에서 지정한, 주소가 없다는 의미의 명령, 실제 메모리를 0으로 설정함
    
    
    Member m2 = m1; // m2는 m1과 같은 주소를 갖고 있다.
    
    //기존 레퍼런스에 새 인스턴스의 주소를 저장한다
    //따라서 m1과 m2는 서로 다른 인스턴스의 주소를 갖고 있다.
    // 즉 m1과 m2가 가리키는 인스턴스가 다르다.
    

    m1 = new Member();
    m1.no = 200;
    
    m2 = m1;

    //이제 m2도 m1과 같은 인스턴스 주소를 갖고있다
    // = 같은 인스턴스를 가리킴
    // 처음에 만들었던 인스턴스는 주소를 잃어버려 사용할 수 없다.
    //이렇게 주소를 잃어버려 사용할 수 없는 인스턴스를 garbage 라 부름

  }

}
