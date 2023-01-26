package Math클래스;
import java.util.Arrays;
// Math 클래스의 모든 메소드는 클래스 메소드 이므로 객체를 생성하지 않고 바로 사용
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환

public class MathMainEx {
    public static void main(String[] args) {

        // 0 ~ 99 사이의 임의의 수 생성 하기
//        for (int i = 0; i < 100; i++) {
//            System.out.println((int) (Math.random() * 100));
//        }
        // 3 ~ 8 사이의 임의의 수 생성 하기
//        System.out.println((int) (Math.random() * 6) + 3);

        // 로또 생성
//        int[] lotto = new int[7];
//        for (int i = 0; i < 6; i++){
//        lotto[i] = (int)(Math.random() * 51);
//        }
//        lotto[6] = (int)(Math.random() * 51) + 50;
//        System.out.println(Arrays.toString(lotto));

        // abs() : 절대값 구하는 메소드, 양수면 양수 , 음수도 양수로 반환
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(-3.14));

        // floor() : 소수점 이하를 무조건 지움
        // ceil() : 소수점 이하가 있으면 무조건 올림
        // round() : 반올림
//        System.out.println(Math.floor(10.9999));
//        System.out.println(Math.ceil(10.011111));
//        System.out.println(Math.round(10.4845));
//        System.out.println(Math.round(10.5789));

        System.out.println(Math.max(11,9.99)); // 둘중 큰값 찾기
        System.out.println(Math.min(11,8)); // 둘중 작은값 찾기
        System.out.println(Math.pow(2,3)); // 앞의수에서 뒤의수 제곱
    }
}
