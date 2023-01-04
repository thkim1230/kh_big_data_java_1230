package 연산자연습1;
// 산술연산자 : +, -, *, /, %(나머지)
// 대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : +=, -=, %=,*=,/=
// 증감 연산자 : ++, -- (단항 연산자)
// 비교연산자 : <,>,<=,>=,==
// 논리 연산자 : AND(&&), OR(||), NOT(!)
public class OperatorEx {
    public static void main(String[] args) {

//        int num1 = 10, num2 = 4;
//        System.out.println("/ 연산자 : " + ((double) num1 / num2));
//
//        int num3 = 0;
//        try {
//            System.out.println(num1 / num3);
//        } catch (ArithmeticException e) {
//            System.out.println("값을 0으로 나누면 안됩니다.");
//        }

        int x = 10, y = 20;
        boolean rst1,rst2,rst3;
        rst1 = (x > y) && ( x > 5); //하나라도 거짓이면 거짓으로 판단
        rst2 = (x > y) || ( x > 5); // 하나라도 참이면 참으로 판단
        rst3 = !((x > y) || (x > 5)); // ! 결과값을 부정함
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);


    }
}
