// 논리 연산자 : && vs &
package com.eomcs.basic.ex05;

public class Exam03_3 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean r = a && (b = true); 
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

        //계산순서
        // r = a && (b = true)
        // r = false && (b = true)
        // > &&연산에서 왼쪽 값이 true이기때문에 결과가 확정됨
        // > &&연산의 오른쪽을 실행하기 전 결과를 알 수 있기에 JVM은 실행의 효율을 위해 &&연산의 오른쪽을 실행하지 않는다.
        // > (b = true)는 실행되지 않음
        // > r = false
        // r = a &(괄호를 먼저 계산-b=true)
        // r = a &(true)
        
        a = false;
        b = false;
        r = a & (b = true);
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
        
        // r = a & (b = true)
        // r = false & (b = true)
        // &연산자의 경우 왼쪽 값으로 결과를 예측할 수 있다 하더라도,결과에 상관 없이 & 오른쪽 문장을 무조건 실행
        // r = false & (true)
        // r = false & true
        // r = false
    }
}
// &&, ||
// - 앞의 피연산자의 값으로 결과를 알 수 있다면 뒤의 명령은 실행하지 않는다.
// 
// &, |
// - 앞의 피연산자로 결과를 알 수 있을 지라도, 
//   뒤에 놓은 명령까지 모두 실행한다.