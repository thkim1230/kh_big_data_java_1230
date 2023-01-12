package 소수판별하기;
// 소수란 1과 자기자신 이외에는 나누어 지지 않는 수
// 소수 판별하기
// 소수의 합 구하기 : 정수 값을 입력 받아, 입력 받은 정수 값 미만의 소수의 합을 구하는 문제
// 정수 입력 : 12
// 결과 : 2 + 3 + 5 + 7 + 11 = 28
// 문제 풀이 : 메소드를 호출 시 정수 값을 입력해서 해당 정수가 소수이면 그 값을 반환
import java.util.Scanner;
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        int sum = 0; // 입력 받은 정수 미만의 소수의 합을 누적
        // 반복문 수행 : 입력 받은 정수 미만의 값으로 메소드 호출 ( 12 => 2 ~ 11)
        for (int i = 2; i < number; i++){
            sum += primeSum(i);
        }
        System.out.println("소수의 합 : " + sum);

    }

    // static 키워드로 선언되면 객체 생성시 생성이 안되고 클래스 생성 시 단 한번 만들어짐 (객체 없이 메소드가 사용하고 싶은 경우 static 을 이용)
    // 해당 메소드 수행후 반환 값이 true/false 임
    // 정수 값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환 함
    static int primeSum(int n) {
        boolean isPrime = true; // 기본값을 소수로 정함
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }
}

