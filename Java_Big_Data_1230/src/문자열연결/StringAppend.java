package 문자열연결;
// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 3
// 첫번째 문자열에서 입력 받은 정수 개수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
// 출력 : oulkorea
import java.util.Scanner;
public class StringAppend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자를 입력하세요 : ");
        String str1 = sc.next();
        System.out.print("두번째 문자를 입력하세요 : ");
        String str2 = sc.next();
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        System.out.println(str1.substring((str1.length())-num) + str2);
    }
}