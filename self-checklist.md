# 컴퓨터와 소프트웨어		
[o]컴퓨터와 소프트웨어의 관계를 이해한다.	

A 소프트웨어는 저장된 저장소에서 명령을 cpu에 송출하여 cpu의 연산결과값을 표기하게 한다

	
[o]시스템 소프트웨어와 응용 소프트웨어를 구분할 수 있다.		

A 드라이버, OS등을 필두로 한 시스템 소프트웨어는 하드웨어에 직접적으로 관련된, low level / static 코딩을 전제로 한 소프트웨어
	응용 소프트웨어는 하드웨어의 구동에 관여하지 않는 OS에 탑재되어 구동하는 기능성 소프트웨어이다


# 프로그램의 구동 원리		
[o]컴퓨터에서 프로그램이 실행되는 원리를 이해한다.

A 소프트웨어의 실행은 저장장치에 저장된 작성 완료된 명령어(CPU Instruction) 인풋을 RAM에 Loading후 CPU에 인계해 연산을 실행시킴
그 이후 연산된 결과는 RAM에 다시 전송됨.

		
[O]CPU 인스트럭션이 무엇인지 이해한다. (ARM CPU 기준)	검색	http://vision.gel.ulaval.ca/~jflalonde/cours/1001/h17/docs/arm-instructionset.pdf

/* ARM에서는 모든 CPU명령은 모든 명령문실행은 현재 상태 레지스터와 상태 레지스터 플래그에 의거하여 실행된다, C,N,Z,V 플래그가 설정된 필드의 조건을 만족할경우 명령문은 실행되고 그렇지 않을경우 무시된다.
명령문 실행은 branch에서 general register에서 전송된 명령문을 복사하여 Program counter에 전송해 다음으로 실행 될 명령어의 주소를 가져 그것을 실행할 기계어 코드의 위치를 지정한다
이는 CPU가 모든 시간동안 여러 명령구문을 각각 다른 클럭에서 실행 가능하게 한다 */

CPU Instruction이란 CPU가 인식가능한 기계어로 연산을 요청하는 프로세스를 의미한다


[O]CPU 인스트럭션과 실행 파일, OS의 관계를 이해한다.

A 저장장치에서 실행된 명령구문은 OS의 명령문 실행 요청에 따라 CPU에서 연산 및 처리됨

		
[o]같은 CPU에 맞춰 작성된 실행 파일이더라도 OS가 다르면 실행되지 않는 이유를 설명할 수 있다.		

A CPU는 동일한 기계어를 사용하나 각각의 OS는 요구하는 규격이 다르므로 실행될 수 없다

# 중간 언어와 가상 머신		
[O]중간 언어와 가상 머신이 등장한 이유와 이점을 설명할 수 있다.	

A Compiler는 각각 한 종류의 OS에만 대응하므로 OS에 따라서 다른 Compiler의 사용이 강제되는것이 불편하다 느껴 Java가 개발되었다. Java Compiler는 가상 기계어인 Bytecode로 언어를 변환하여 Win/Linux/macOS와 같은 OS에 모두 대응이 가능하다.
	
[O]VM과 인터프리터, 런타임, 플레이어, 엔진의 역할을 이해한다.

A 엔진,플레이어,런타임,VM은 동일하게 Intermediate representation의 실행기로서 작용한다.
//런타임은 특수한 기능을 배제하고 온전히 프로그램의 실행만을 위한 환경이다.
//VM은 샌드박스 실행환경을 조성해준다. 따라서 JVM같은경우는 OS의 구분없이 실행이 가능하다.



[o]JIT(Just-in-time)과 AOT(ahead-of-time)이 무엇이고 등장한 이유를 이해한다.		

JIT는 설치시 AOT대비 설치속도가 빠름, 실행시마다 컴파일을 거치기에 실행시 간헐적인 딜레이가 생김
JIT의 문제점을 해결하고자 AOT가 등장. AOT는 설치시 기계어 컴파일을 포함하기에 설치 속도는 느리나 실행후 간헐적 딜레이가 없음

# 자바 바이트코드와 자바 가상 머신		
[o]자바 바이트코드 실행 환경을 준비할 수 있다.		OpenJDK 설치, JAVA_HOME 과 PATH 환경 변수 설정, Sublime 편집기 설치

A system enviroment-JAVA_HOME에서 JAVA의 \bin폴더를 입력함으로서 어느 디렉토리에서나 JAVA를 사용할 수 있다.
PATH 환경변수를 입력함으로서 JAVA가 아닌 컨텐츠 또한 어느 디렉토리에서나 이용할 수 있다.


[O]자바 바이트코드를 이해한다.	검색	https://docs.oracle.com/javase/specs/jvms/se13/jvms13.pdf

A JAVA ByteCode란 모든 종류의 OS에서 JAVA의 개별 컴파일러를 실행할 필요 없이 JavaCompiler로 컴파일하여 JVM에서 바로 실행 가능한 IR을 지칭한다


[O]바이트코드와 클래스 파일(.class)의 관계를 이해한다.	/HelloWorld.class	https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad

.Class(가상기계어) JVM에서 실행 가능한 Bytecode()

[o]클래스 파일과 JVM의 관계를 이해한다.		$ javap HelloWorld.class, $ javap -verbose HelloWorld.class

JVM=ByteCode-IR을 실행하는 실행기

[o]JVM을 이용하여 클래스 파일을 실행할 수 있다.		$ java HelloWorld

CLI에서 javafile 대상으로 한 javac 커맨드를 이용하여 class파일을 생성

# 프로그래밍 언어와 컴파일		
[O]컴파일 방식 프로그래밍이 등장한 이유를 이해한다.		

A 매 시퀀스마다 VM에서 번역하는 과정을 없애 속도향상을 도모하기위하여 도입되었다.


[O]프로그래밍 언어와 컴파일, CPU 인스트럭션의 관계를 이해한다.	

A 프로그래밍 언어는 각각의 OS에 대응되는 컴파일러를 통해서 IR 혹은 ByteCode 로 변환된다, 이는  CPU에 전송되어 

[O]컴파일러를 이용하여 소스 코드를 목적 코드(CPU 인스트럭션)로 생성하는 과정을 이해한다. (C 프로그래밍 언어 기준)	/module.c, /main.c	$ gcc -c 소스파일

A 작성완료된 .C 파일은 컴파일러를 통하여 링커의 라이브러리와 함께 같은 파일로 묶이게된다, 이 결과로 .exe파일이 산출된다.

[O]링커를 이용하여 목적 코드가 들어 있는 파일을 하나로 묶어 실행 파일을 만드는 과정을 이해한다. (C 프로그래밍 언어 기준)		$ ld -o 실행파일 목적파일 목적파일 … -lSystem -macosx_version_min 10.13

A .C언어의 컴파일은 링커의 관여에 따라서 라이브러리와 같은 파일로 묶이게된다

[O]"소스 파일, 목적파일, 실행 파일"과 "컴파일러, 링커"의 관계를 이해한다. (C 프로그래밍 언어 기준)		

A sourcefile은 컴파일러에의하여 목적파일로 compile되고 이는 링커가 작용함에 따라서 실행파일로 컴파일된다.


# 컴파일러와 인터프리터		
[O]인터프리트 방식 프로그래밍과 실행 과정을 이해한다.

A .js와 같은 인터프리트 방식 프로그래밍은 실행되는 구문만을 컴파일한다,/* linker와 관련될수 없으므로 외부 라이브러리가 필요하지 않다.*/

[O]Node.js 자바스크립트 인터프리터를 준비할 수 있다.		https://nodejs.org/en/

A scoop 이용

[O]인터프리터를 사용하여 소스 파일을 직접 실행하는 과정을 이해한다. (Node.js 기준)	/hello.js	$ node hello.js

A 소스파일중 실행될 구문만이 매 실행마다 검사된다. 속도는 떨어지며 버그리포트가 힘들어지지만 이로인하여 쉬운 유지보수가 가능하게된다

[O]컴파일 방식과 인터프리트 방식의 구동 원리를 이해한다.		

A 컴파일방식은 전체 프로그램을 컴파일하며 인터프리트 방식은 매 실행시마다 구동에 필요한 코드만 검사 후 실행한다

[O]컴파일 방식과 인터프리트 방식의 장단점을 비교할 수 있다.		

A 컴파일방식은 버그리포트가 쉽고 첫 실행후엔 실행속도가 빠르지만 인터프리트 방식보다는 유지보수가 힘들다


# 자바 프로그래밍 절차		
[O]자바의 프로그래밍 방식과 실행 원리를 이해한다.		

A JAVA는 .c와 달리, 모든 method/class를 각각의 하위문서로 분류한다.

[O]자바 코드와 바이트코드, 소스 파일과 클래스 파일의 관계를 이해한다.		

A java source는 컴파일러를 거쳐 Bytecode(classfile)로 변환되고 이는 JVM을 거쳐 실행된다.

[O]자바 컴파일러와 JVM의 역할을 이해한다.		

A Java compiler 의 IR을 JVM은 OS의 구분없이 일괄적으로 실행할 수 있게 한다

[O]CLI 환경에서 컴파일을 수행할 수 있다.	/Hello.java	$ javac Hello.java

A command line interface 

[O]CLI 환경에서 자바 클래스 파일을 실행할 수 있다.	/Hello.java	$ java  Hello

A .java > javac > .class > java > result

# 소스 파일과 컴파일 결과 파일 분리 		
[O]Maven 표준 디렉토리 구조를 만들 수 있다.		Maven 표준 디렉토리 구조에 맞춰 폴더를 생성

A bin / src - main / java

[O]각 디렉토리의 용도를 이해한다.		

A binariy = .class파일 저장소 src = .java sourcefile 저장소

[O]프로젝트 디렉토리에서 소스 디렉토리에 있는 자바 소스 파일을 컴파일 할 수 있다.	src/main/java/Hello2.java	$ javac src/main/java/Hello2.java
[O]컴파일 할 때 컴파일 결과로 생성된 클래스 파일을 별도 디렉토리에 분리할 수 있다.	src/main/java/Hello2.java	$ javac -d bin/main src/main/java/Hello2.java
[O]다른 디렉토리에 있는 클래스 파일을 실행할 수 있다.	src/main/java/Hello2.java	$ java -classpath bin/main Hello2

# 패키지와 소스 파일		
[O]패키지의 용도를 이해하고 패키지를 생성할 수 있다.	com.ohoracs.basic	src/main/java/com/ohoracs/basic 디렉토리 생성

A javac -d 커맨드 사용시 정의할 폴더생성

[O]소스 파일에 작성한 코드가 패키지에 소속되게 할 수 있다.	src/main/java/com/ohoracs/basic/Hello3.java	

A package .com.~.~

[O]패키지에 소속된 소스 파일의 적절한 디렉토리 경로와 왜 그 위치에 놓아야 하는지 이해한다.		

A 유지보수목적

[O]컴파일 한 후 생성된 클래스 파일의 디렉토리 경로와 그 위치에 있어야 하는 이유를 안다.		

A 패키지의 상위폴더에 위치할 경우 발생하는 파일 중복등의 경우를 방지하기 위함/유지보수목적

[O]패키지에 소속된 클래스 파일을 실행할 수 있다.	src/main/java/com/ohoracs/basic/Hello3.java	$ java -cp bin/main com.ohoracs.basic.Hello3

A javac 로 .java를 bin/ 폴더의 .class로 변환후 java 커맨드로 .class 를 실행

[O]패키지를 적용하지 않은 채로 그 소스 파일을 그냥 패키지 폴더에 둔다면 컴파일 할 때 어떤 문제가 발생하는지 안다.	src/main/java/com/ohoracs/basic/Hello4.java	

A 컴파일시 .class 파일이 경로를 따르지않고 패키지폴더 최상위에 생성된다

# Gradle 빌드 도구		
[O]Gradle 빌드 도구를 이용하여 작업 폴더를 자바 프로젝트 폴더로 구성할 수 있다.	/프로젝트폴더	$ gradle init

[O]Gradle로 생성된 src 디렉토리의 구조를 이해하고 설명할 수 있다.	/src	

A 원본 sourcefile 이 저장되는 곳

[O]src 디렉토리 외에 다른 디렉토리나 파일의 용도를 이해한다.		


A distribution에 실행 가능한 bat파일과 ok파일이 생성되며 libs에는 실행에 필요한 라이브러리가 저장됨, 또한 test폴더에는 테스트용 파일이 생성됨.

