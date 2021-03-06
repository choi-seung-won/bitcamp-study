package com.eomcs.basic.ex03;


public class Exam41 { 

public static void main(String[] args){

  //직접문자 작성가능 > 'letter' 
  System.out.println('A');
  System.out.println('가');
  System.out.println('A');
  System.out.println('人'); // [\ u](CodeValue 값 사용 선언)[UCS-2 Code]
  
  //CodeValue 값으로 문자 지정 가능
  System.out.println('\u0041'); // A
  System.out.println('\u0030'); // 0
  System.out.println('\u0025'); // %
  System.out.println('\uac00'); // 가

}

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