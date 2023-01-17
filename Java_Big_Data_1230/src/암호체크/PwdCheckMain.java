package 암호체크;
import java.util.Scanner;
// 암호체크
//암호의 길이는 10 ~30 자 사이
//암호에는 숫자 , 소문자 , 대문자 ,특수 문자가 포함되어야 함
//특수문자는 (!,%,_,#,&,+,-,*,/)의 9개 중의 하나
//입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password" 출력
//반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료
public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] spw = {"!", "%", "_", "#", "&", "+", "-", "*", "/"};
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        int cnt = 0;
        while (true) {
            System.out.print("암호를 입력 하세요 :");
            String pwd = sc.next();

            if ((pwd.length() > 9) || (pwd.length() < 31)) {
                for (int i = 0; i < spw.length; i++) {
                    if (pwd.contains(spw[i]) == true)
                        for (int j = 0; j < num.length; j++) {
                            if (pwd.contains(num[j]) == true)
                                for (int k = 0; k < pwd.length(); k++) {
                                    if (pwd.charAt(k) >= 'a' && pwd.charAt(k) <= 'z')
                                        for (int l = 0; l < pwd.length(); l++) {
                                            if (pwd.charAt(l) >= 'A' && pwd.charAt(l) <= 'Z') cnt++;
                                        }
                                }
                        }
                }
            }
            if (cnt > 0) System.out.println("Good password");
            else System.out.println("Bad password");
            cnt = 0;
            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;
        }
    }
}

