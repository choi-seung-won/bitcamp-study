package com.eomcs.basic.ex99;




public class Exam23 {
  public static void main(String[] args){
    

    java.io.InputStream keyboard = System.in;

  
    //java.io.PrintStream console = System.out;
    java.util.Scanner scanner = new java.util.Scanner(keyboard);


    //nextInt() 이후 nextLine()을 호출할 때 공백문자가 읽히는 문제 해결
    System.out.println("input>");

    int i1 = scanner.nextInt();
    int i2 = scanner.nextInt();
  
    //공백 스캔, next() > token을 읽음. 다시 공백을 인지할때까지 읽고 공백을제거함, 
    
    // String s = scanner.nextLine();
    //
    int i3 = scanner.nextInt();
    String s1 = scanner.next();

    String s2 = scanner.next();


    String s3 = scanner.next();

    System.out.println("---------");

    System.out.println(i1);

    System.out.println(i2);

    System.out.println(i3);

    System.out.println(s1); // white space(tab/space/new line)공백을 nextInt에서 scan할때 처리하지 못했으므로 출력시 new line을 포함 앞의 empty string공백문자를 포함하여 그대로 리턴됨
    
    System.out.println(s2);

    System.out.println(s3);
    scanner.close();




  }
}