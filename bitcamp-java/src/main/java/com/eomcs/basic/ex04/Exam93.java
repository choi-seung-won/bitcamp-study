package com.eomcs.basic.ex04;

public class Exam93 {

//정수변수간 형변환

  public static void main(String[] args) {
    
    byte b = 127;
    short s = 32767;
    int i = 21_0000_0000;
    long l = 922_0000_0000_0000_0000L;
    float f = 3.14f;
    double d = 3.14;
    
    //1)정수 메모리끼리 형변환 가능
    //작은 메모리의 값을 큰 메모리에 넣을 시 형변환 할 필요가 없음.
   
    
    l = i;
    i = s;
    s = b;
    
    i = (int)l; // 정수 형변환, 값이 짤림(=의도하지않은 값이 나올 수 있음).
    s = (short)i;
    b = (byte)s;
    
    // 2) 부동소수점을 정수 메모리에 저장 가능 > 명시적 형변환 필요(exam92)
    
    //정수를 부동소수점 메모리에 저장 가능. 명시적 형변환 필요 x(exam92)
    
    //숫자를 문자 변수에 저장 가능
    
    i = 65;
    
    char c = (char)i;
    System.out.println(c);
    
    //그외 형변환 불가
   //ex) 
    boolean bool;
    /*
    bool = (boolean)b;
    bool = s;
    bool = i;
    bool = l;
    bool = f;
    bool = d;
    bool = c;
    bool="true;
    
    */
    
    //i = "10";
    //c = "가";
    //f = "3.14f";
    
    //i = bool;
    //f = bool;
    //  c = bool;  
    //f = bool;
  }
  
}
