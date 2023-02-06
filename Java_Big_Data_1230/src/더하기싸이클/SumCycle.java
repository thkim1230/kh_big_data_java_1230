package 더하기싸이클;
import java.util.Scanner;
public class SumCycle {
    public static void main(String[] args) {
        int cnt = 0;
        int sum = 0;
        int newN = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        while (true) {
            sum = (n / 10) + (n % 10);
            newN = ((n % 10) * 10) + (sum % 10);
            n = newN;
            cnt++;
        if (newN == num) break;
        }
        System.out.println(cnt);
    }
}
