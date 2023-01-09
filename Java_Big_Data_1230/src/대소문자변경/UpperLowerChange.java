package 대소문자변경;
// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤 , 대문자는 소문자로 , 소문자는 대문자로 변경하기
// 무조건 입력은 영문자이다.
// WrongAnswer => wRONGaNSWER
// 문자열에서 문자를 추출하는 메소드는 charAt()이다.
// 자바에서의 문자는 정수값을 사용한다.
// 정수값으로 계산후 char 로 형변환
import java.util.Scanner;
public class UpperLowerChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력 하세요 : ");
        String word = sc.next();
        char ch;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));
        }
    }
}

