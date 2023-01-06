package 반복문ForEx1;
import java.util.Scanner;
public class ForWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int sum = 0;

//        while (number > 0){
//            sum += number;
//            number--;
//        }
//        System.out.println("정수의 합은 : " + sum);

        for(int i = 1; i <= number; i++ ){
            sum += i;
        }
        System.out.println("정수의 합은 : " + sum);
    }
}
