package com.eomcs.basic.ex99;




public class Exam22 {
  public static void main(String[] args){
    

    java.io.InputStream keyboard = System.in;

    //java.io.PrintStream console = System.out;
    java.util.Scanner scanner = new java.util.Scanner(keyboard);

    System.out.println("input>");



    int i1 = scanner.nextInt(); // nextline과 달리 다음 int값을 인지하면 스캔함


    int i2 = scanner.nextInt();

    int i3 = scanner.nextInt();



    System.out.println("---------");

    System.out.println(i1);

    System.out.println(i2);

    System.out.println(i3);
    scanner.close();




  }
}