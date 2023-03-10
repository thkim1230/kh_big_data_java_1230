package 함수형프로그램예제1번;
// 함수형프로그램 : 자바8에서 도입, 수학공식과 유사, 불변성의 원칙, 조건문 반복문 사용 x
// 람다 (Lambda) : 화살표 표현식으로 사용, 생략 가능한 모든것을 생략하는 것이 기본 원칙
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 함수형 인터페이스가 필요 함.

@FunctionalInterface // 함수형 인터페이스 어노테이션 선언 (메소드 한개 만 사용 가능)
interface Calculator {
    int sum(int a,int b);
//    int sub(int a, int b); 2개 선언시 에러
}
@FunctionalInterface
interface MyFuncInterface {
    void method (int x); // 매개변수가 있는 타입
}
@FunctionalInterface
interface MyFuncInterface2 {
    int min (int x , int y); // 반환 타입이 있는 형식
}

public class FunctionEx1 {
    public static void main(String[] args) {

        Calculator mc = (a,b) -> a + b;
        int rst = mc.sum(3,4);
        System.out.println(rst);

        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y; // 구현부
        System.out.println(fi2.min(3,4));
    }

}
