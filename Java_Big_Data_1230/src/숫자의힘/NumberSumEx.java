package 숫자의힘;
import java.util.Scanner;
// 문제 : N개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 0;
            System.out.print("입력 : ");
            String num = sc.next();
            if (num.equals("0000")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }
            System.out.println("출력 : " + sum);
        }
    }
}
