package 변수의생존범위;
// 상수란 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미함
// 변수와 다른점은 프로그램이 실행되는 동안 값이 변경이 안됨

public class ScopeData2 {
    public static void main(String[] args) {

        final int age; // 자바에서 상수는 final 키워드로 정의 하고 단한번만 값을 선정할 수 있음.
        age = 30;
        System.out.println("당신의 나이는 " + age + " 입니다.");
        double taxRate = 0.10;

    }
}


