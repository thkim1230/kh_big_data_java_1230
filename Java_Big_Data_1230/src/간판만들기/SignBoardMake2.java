package 간판만들기;
import java.util.Scanner;
public class SignBoardMake2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수를 입력 하세요 : ");
            String num = sc.next();

            if(num.equals("0")) break;

            int sum = 0;
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') sum += 4;
                if (num.charAt(i) == '1') sum += 2;
                if (num.charAt(i) != '0' && num.charAt(i) != '1') sum += 3;
            }
            System.out.println("간판의 필요한 칸 수는 " + (sum + (num.length() + 1)) + " 입니다.");
            System.out.println();
        }
    }
}
