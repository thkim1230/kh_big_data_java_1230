package 구간합구하기;
import java.util.*;
// 단순 합산 코드
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int cnt2 = sc.nextInt();

        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = 0;
        while (cnt2 != 0) {
            long sum = 0;
            left = sc.nextInt();
            right = sc.nextInt();
            for (int i = left -1; i < right; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            cnt2--;
        }
    }
}

