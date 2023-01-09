package 문자열반전;
import java.util.Scanner;
// abcdefg => gfedcba
// for 문을 이용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String word = sc.next();

//        int index = word.length();    while 문 사용
//        while (true){
//            index--;
//            System.out.print(word.charAt(index));
//            if (index == 0) break;

        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }


    }
}
