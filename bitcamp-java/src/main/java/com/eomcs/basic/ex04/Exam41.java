package com.eomcs.basic.ex04;


public class Exam41{


public static void main(String[] args){



short s;

char c;

s = -32768;
s = 32767;


c = 0;
c = 65535;

char c1 = 65;
char c2 = 0x41;
char c3 = 0b0100_0001;
char c4 = 'A'; // 문자를 저장하는것이 아니라 문자 코드를 저장함

int i1 = 'A' ; // int = 정수변수, 따라서 int에 A값을넣어도 정수값이 출력

i1 = i1 + 10;


System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
System.out.println(c4);
System.out.println(i1);
System.out.println((char)i1);

for ( int i = 65; i < 'A'+26; i ++)
{
    System.out.print((char)i);

}

}
}