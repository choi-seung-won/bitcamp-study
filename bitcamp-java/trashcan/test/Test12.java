package com.eomcs.basic.ex07.test;
//헬스장 회원 정보를 입력받아 출력
public class Test12 {
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

    //인스턴스를 3000개 만들 것이다.
    // 레퍼런스를 3000개 준비하라
    //배열을 이용하면 많은 레퍼런스 변수를 손쉽게 만들 수 있다.
    //레퍼런스 배열의 주소 또한 레퍼런스 변수에 담아야 한다.
    //Member 인스턴스를 3천개 만드는것이 아님
    
    //// 배열문법으로는 인스턴스를 3천개 만들 수 없음
    Member[] array = new Member[3000];
    
 //   array[0].no = 100; // java nullpointerexception, runtime error
    
    int count = 0;
    while(count < 3000) {
      array[count] = new Member();
      count++;
    }//loop 조건문으로 인스턴스를 3천개 만듦
    
    
    array[1].no = 100;  //레퍼런스 1번 배열에 instance 할당
    
    System.out.println("ok");
  }
}
