package com.eomcs.basic.ex04;

public class Exam16{

  public static void main(String[] args){

    // java variable의 종류

    byte b; // 1byte-size memory 0000 0000 ~ 1111 1111 / 00~ff / -128~127
    short s; // 2
    int i; // 4
    long l; //8

    float f; // 4
    double d; // 8

    boolean bool; //jvm에서 4byte,int로 취급

    char c; // 2
    // > primitive data tive

    // > reference : 다른 메모리의 주소를 저장하는 변수

    String str;
    java.sql.Date date;
    Thread t;
    java.net.Socket socket; // object.Reference variable /// socket = network connection 정보를 저장하는 메모리의 주소

  }
}