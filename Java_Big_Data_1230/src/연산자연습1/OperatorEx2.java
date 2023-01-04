package 연산자연습1;
// 삼항 연산자 : ?:;
import java.util.Scanner;
public class OperatorEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19)? true : false;

        System.out.println(isAdult);
    }
}
