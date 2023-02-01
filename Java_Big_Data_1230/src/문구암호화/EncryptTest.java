package 문구암호화;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EncryptTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine();
        System.out.print("암호화 키 : ");
        String encrypt = sc.next();
        char[] enc = encrypt.toCharArray(); // 암호화키를 문자 배열로 변경
        char value = 0;
        List<Character> vig = new ArrayList<>();
        for (int i = 0; i < normal.length(); i++) {
            if (normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char)(normal.charAt(i) - (enc[i % encrypt.length()] - 'a') - 1);
                if (value < 'a') value += 26;
                vig.add(value);
            }
        }
        for (Character e : vig) System.out.print(e);
    }
}