package 중첩반복문;
import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력 하세요 : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++){
            System.out.printf("|%d|",i );
            for(int j = 0; j < number; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
