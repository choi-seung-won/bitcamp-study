package com.eomcs.basic.ex03;


public class Exam43 { 

public static void main(String[] args)
{
  
    System.out.println(0xac00);//정수
    System.out.println((char)0xac00);
    System.out.println('가');
    System.out.println((int)'가'); // 문자코드를 정수로 간주하고 출력 =(ac00)16 = 44032 > 다른 수와 연산을 수행할 수 있음 ((16^4)x10) + ((16^2)x12)) 16진수
    System.out.println('가' + 1); // 문자코드에 정수값을 [연산]하는 순간 결과값은 일반 정수값이 나옴, 연산결과를 문자코드값으로 출력을 원할 시 (char)을 연산 이전에 정의
    System.out.println((char)('걱' + 1));



}
//(char) > character code 임을 정의한다. fontfile에서 해당 이미지를 불러옴
}

//ASCII(7bit)

//A > 1000001
//b > 1000010
//c > 1000011
//d > 1100001
//e..

//2^7 = 128 영어 대소문 / 숫자 / 특수문자 등 90여개 문자에 대해 code value 정의 -> ISO-8859-1(ISO LATIN I = ASCII+western language/8bit->256문자 정의가능)
//iso) A -> 01000001 B-> 01000010 C -> 01000011
//실질적으로 사용하는 숫자 = 200여개 > 
//>EUC-KR의 등장(16bit,=<windows 3.x ) english ->ISO-8859-1(8bit 그대로 사용) > 한글> 2byte code value로 정의 ex) 가 > 0xB0A1 / 각 > 0xB0A2 ... 각 문자별 정의
//조합형 한글코드의 등장 > (KSC 5601) 128~159에 문자 코드를 사용하여 국제표준을 위반함. 이로인하여 .hwp에서만 기용됨
//국가의 문서가 특정 기업에 종속되는것을 피하기 위하여 open document가 구현됨. 이는 xml을 이용함 / MS측도 코드소스를 공개하여 docx/pptx/xlsx포멧 공개(xml이용)
//ECMA에 제출 후 국제표준으로 인정받음
//MS949의 등장(11172자/windows95 +) 국제 표준X
//CharSet 은 문자에대한 코드값을 정의한 표를 의미
//