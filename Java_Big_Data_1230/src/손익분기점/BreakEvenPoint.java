package 손익분기점;
import java.util.Scanner;
public class BreakEvenPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        if (num[1] >= num[2]) {
            System.out.println("-1");
            return;
        }

        System.out.println(num[0] / (num[2] - num[1]) + 1);
    }
}
