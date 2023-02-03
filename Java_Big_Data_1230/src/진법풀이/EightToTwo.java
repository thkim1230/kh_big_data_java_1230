package 진법풀이;
import java.util.Scanner;
public class EightToTwo {
    public static void main(String[] args) {
        String[] eight1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] eight2 = {"", "1", "10", "11", "100", "101", "110", "111"};

        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (num.length() == 1 && num.charAt(0) - '0' == 0) {
            System.out.println("0");
        }
        if (num.charAt(0) < '4') {
            System.out.print(eight2[num.charAt(0) - '0']);
            for (int i = 1; i < num.length(); i++) {
                System.out.printf("%s",eight1[(num.charAt(i) - '0')]);
            }
        } else {
            for (int i = 0; i < num.length(); i++) {
                System.out.print(eight1[(num.charAt(i) - '0')]);
            }
        }
    }
}
