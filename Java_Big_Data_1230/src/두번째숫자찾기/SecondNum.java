package 두번째숫자찾기;
import java.util.Scanner;
// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기
// 임의의 수 입력 : 1 2 3 4 5 6 5 7 8 2
// 찾을 수 : 5
// 결과 : 7
// 만약에 2번째 등장하는 수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {

        int[] num = new int[10];
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력 하세요 : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("찾을 수를 입력 하세요 : ");
        int findNum = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (findNum == num[i]) cnt++;
            if (cnt == 2) {
                System.out.println(i+1);
                cnt = 0;
            }
        }
        if (cnt == 1) System.out.println(-1);
    }
}
