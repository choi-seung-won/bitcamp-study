// 과제 1 : 가위,바위,보 게임 애플리케이션을 작성하라.
// - 실행1
// 가위,바위,보? 보
// 컴퓨터: 가위  (랜덤 값이 출력된다. 힌트: Math.random())
// => 졌습니다.
//
// - 실행2
// 가위,바위,보? 바위
// 컴퓨터: 가위
// => 이겼습니다.
//

package com.eomcs.basic.ex04;

import java.util.Scanner;

public class test022 {
  public static void main (String[] args)
  
  {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("가위,바위,보? 보");
    String response = keyScan.nextLine();
    System.out.printf(response);
    System.out.println("컴퓨터: 가위");
    System.out.println(">>졌습니다");
    

    keyScan.close();
    


  }

}