package 평균은넘겠지;
import java.util.Scanner;
public class OverAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int cnt = 0;

        System.out.print("인원 수 를 입력 하세요 : ");
        int num = sc.nextInt();
        System.out.print("점수를 입력 하세요 : ");
        int[] score = new int[num];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }

        int aver = total / num;

        for (int i = 0; i < score.length; i++) {
            if (score[i] > aver) cnt++;
        }

        double result = (double) (cnt / num) * 100;
        System.out.printf("%.3f%%\n",result);
    }
}

