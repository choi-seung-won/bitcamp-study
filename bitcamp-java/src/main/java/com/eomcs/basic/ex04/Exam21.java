package com.eomcs.basic.ex04;


public class Exam21{


public static void main(String[] args){



    byte b;
    b = -128;
    b = 127;

    // b = -129; //error

    short s; // : -32768~ 32767

    s = -32768;
    s = 32767;
    
//    s = -32769;
//    s = 32768;


    int i; // -2^16 ~ 2^16-1

    i = -21_0000_0000;

    i = 21_0000_0000;
    
    
    long l; // -2^128 ~ 2^128-1

    l = 922_0000_0000_0000_0000L;
    l = 922_0000_0000_0000_0000L;


//    l = 923_0000_0000_0000_0000L java data type은 +-2^128을 넘을 수 없음 bigE big Long을 사용해야함


    


}
}