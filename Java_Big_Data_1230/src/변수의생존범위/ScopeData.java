package 변수의생존범위;

public class ScopeData {
    public static void main(String[] args) {
        int value = 20; // 지역 변수
        int m = 0;// 초기화 하는 이유는 명령문이 수행이 될지 안될지 모르는 상황에서는 명령문이 실행이 안되기 때문.

        if (value > 10) {
          m = value - 10;
        }
        System.out.println(m); // 범위를 표시잘해야함


    }
}
