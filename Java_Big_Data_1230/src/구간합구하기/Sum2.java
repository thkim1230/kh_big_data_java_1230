package 구간합구하기;
import java.util.Scanner;
// 수학 공식을 이용한 코드
public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int cnt2 = sc.nextInt();
        int[] arr = new int[cnt];
        long[] arr2 = new long[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) arr2[0] = arr[0];
            else arr2[i] = arr2[i-1] + arr[i];
        }
        int left = 0, right = 0;
        while (cnt2 != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            if (left != 1) System.out.println(arr2[right - 1] - arr2[left - 2]);
            else System.out.println(arr2[right - 1] - 0);
            cnt2--;
        }
    }
}
