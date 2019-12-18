package com.eomcs.basic.ex99;


public class Exam11{


public static void main(String[] args){


    System.out.println(100); //
    System.out.println(3.14f);
    System.out.println(true);
    System.out.println('가');
    System.out.println("안녕");


    System.out.print(100); //
    System.out.print(3.14f);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕\n");

    System.out.print("OK");
    System.out.print("NO");


   // printf > 형식,값,지정
    System.out.printf("\n이름: %s","홍길동");
    System.out.printf("\n나이: %d",26);

    System.out.printf("\n이름(나이) : %s(%d)","길동",25);

    System.out.printf("\n %d,%x,%c",65,65,65); // %d decimal , %x Hexaldecila, %c charcater
//    삽입될 값 지정
//% 값위치$(1부터 시작)d

    System.out.printf("\n %1$d,%1$x,%1$c", 65);

    //논리값

    System.out.printf("\n재직자 : %s %b", true,true);

    System.out.printf("\n나이 %s %d",20,20 );


    //출력공간확보
    System.out.printf("\n 이름: [%s]","홍길동");
    System.out.printf("\n이름: [%20s]","홍길동");
    System.out.printf("\n이름: [%-20s]","홍길동");

    System.out.printf("\n숫자: [%d]",12345);
    System.out.printf("\n숫자: [%10d",12345);
    System.out.printf("\n숫자: [%-10d]",12345);
    System.out.printf("\n숫자: [%010d]",12345);
    System.out.printf("\n숫자: [%+010d],[%+010d]",12345,-12345);


    //일시다루기

    java.util.Date today = new java.util.Date();

    today.setDate(9); // deprecated , 
    System.out.printf("\n%s",today);

    //%t* 날짜 객체에서 년Y(4)y(2),월B(December)b(Dec)m(숫자) - (OS 표기설정을 따라 표기),일d(0x)e(x)시H()I()분초S L(밀리) N(나노) 요일A(x요일)a(x)오전오후p(일반)P(대문자) 추출
    System.out.printf("\n%tY,%ty,%tb",today,today,today);
    System.out.printf("\n%tB,%tb",today,today);
    System.out.printf("\n%tm",today);
    System.out.printf("\n%td,%te",today,today);
    System.out.printf("\n%tA,%ta",today,today);
    System.out.printf("\n%tM",today);
    System.out.printf("\n%tS,%tL,%tN",today,today,today);
    System.out.printf("\n%tH,%tI",today,today);
    System.out.printf("\n%tp,%Tp",today,today);


    //2019-12-12 12:37:45


    System.out.printf("\n%1$tY-%1$tB-%1$td %1$tH:%1$tM:%1$tS",today);

    String str;
    str = String.format("\n%1$tY-%1$tB-%1$td %1$tH:%1$tM:%1$tS",today);

    System.out.print(str);


}
}



