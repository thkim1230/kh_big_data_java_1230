package 평균은넘겠지;
import java.util.Scanner;
public class OverAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        double cnt = 0;
        System.out.print("인원 수 를 입력 하세요 : ");
        int num = sc.nextInt();
        System.out.print("점수를 입력 하세요 : ");
        int[] aver = new int[num];

        for (int i = 0; i < aver.length; i++) {
            aver[i] = sc.nextInt();
            a += aver[i];
            b = a / num;
        }
        for (int i = 0; i < aver.length; i++) {
            if (aver[i] > b) cnt++;
        }
        double result = (cnt / (double)num) * 100;
        System.out.printf("%.3f%%\n",result);
    }
}

