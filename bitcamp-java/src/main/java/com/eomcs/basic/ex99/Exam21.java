package com.eomcs.basic.ex99;




public class Exam21{
  public static void main(String[] args){
    

    java.io.InputStream keyboard = System.in;

    //java.io.PrintStream console = System.out;
    java.util.Scanner scanner = new java.util.Scanner(keyboard);

    //keyboard 객체에 값을읽어주는 객체를 붙임

    //키보드로부터 들어온 바이트배열을 분석하여 줄바꿈 기호를 만나면 그 앞에 입력한 바이트 배열을 문자열로 변환하고 리턴

    String s1 = scanner.nextLine();


    String s2 = scanner.nextLine();

    String s3 = scanner.nextLine();


    System.out.println("---------");


    scanner.close();




  }
}