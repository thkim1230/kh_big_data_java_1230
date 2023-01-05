package 반복문유효값체크;
import java.util.Scanner;
// do~while() : 먼저 수행 후 조건 확인
public class DoWhile {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(" 나이를 입력 하세요 : ");
            age = sc.nextInt();
        }while (age <= 0 || age >= 200);

        System.out.println("입력 하신 나이는 " + age + "입니다.");
    }
}
