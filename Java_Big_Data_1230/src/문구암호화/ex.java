package 문구암호화;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        String text = sc.next();
        int cnt = 0;
        int code = 0;
        while (true) {
            for (int i = 0; i < text.length(); i++) {
                cnt = (key.charAt(i) - 'a') + 1;
                if (cnt < 0) {
                    cnt += 26;
                }
                code = text.charAt(i) - cnt;
                System.out.print((char) code);
            }
        }
    }
}


