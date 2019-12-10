package com.eomcs.basic.ex03;

public class Exam7 {
  public static void main(String[] args){

    //escape character - character than has control-character function.
    //-문법 
    // \ [n|r|f|t|b|'|'"|"|\]
    System.out.println("Hello, world");
    System.out.println("Hello,\nworld");//New line
    System.out.println("Hello,\rABC");//cursor 를 처음으로 돌림(return), > for example. result is ABClo
    //cursor - 문자를 출력할 위치를 가르키는 것
    System.out.println("Hello,\b\b\bworld");// cursor를 뒤로 한칸 이동

    System.out.println("Hello,\tworld");//tab space 추가 문자열
    System.out.println("Hello,\fworld");//formfeed 추가문자열
    System.out.println("Hello, \"w\"orld"); // \" - " 추가시키는 문자
    System.out.println("Hello,'w'orld"); // "" 안에서 '문자 사용
    System.out.println('\''); // ''내부에서 '문자를 출력 시 \'
    System.out.println('"'); // '' 내부에서 "는 그냥적는다.
    System.out.println("c:\\Users\\user\\git"); // java는 \이후 문자는 무조건적으로 escape character로 간주, \\ 사용시 일반 문자출력
  }
}

//줄바꿈코드 
//Carrage Return(CR) : 0d
//Line Feed(LF) : 0a