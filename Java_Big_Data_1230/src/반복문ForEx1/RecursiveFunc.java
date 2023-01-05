package 반복문ForEx1;
import java.util.Scanner;
// 메소드를 이용한 반복문
public class RecursiveFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);
    }
    public static int recursiveFunc(int n){
        if(n == 1) return 1;
        return n + recursiveFunc(n -1);
    }
}
