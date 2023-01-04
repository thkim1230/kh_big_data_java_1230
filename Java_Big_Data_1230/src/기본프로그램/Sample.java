package 기본프로그램; // 접근제한자 (캡슐화) 와 연관성이 있음.
//접근제한자 :public, protected, default, private
/*
범위 주석
 */

public class Sample { // 클래스 이름을 지정, 파일이름과 클래스이름이 같아야함. public 클래스는 하나만 존재
    // main 메소드는 프로그램의 시작 위치를 의미하며, JVM이 호출 함.
    // void 는 메소드 실행 이후의 반환 타입 중 하나 입니다. return 값이 없을때 void 사용
    // {} : 중괄호 : 클래스, 메소드 등의 범위를 결정
    // (): 소괄호 : 메소드의 매개변수를 넣는 곳
    // []: 대괄호 : 배열 등을 정의 할 때 사용 됨
    public static void main(String[] args) {
        System.out.println("Hello, Java!!!");

    }
}

