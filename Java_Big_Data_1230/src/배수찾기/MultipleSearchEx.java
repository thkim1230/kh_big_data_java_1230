package 배수찾기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 문제 : 정수 n과 수의 목록이 주어 졌을때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램
// 입력 : 첫째 줄에 n이 주어짐, 다음 줄에 한줄에 한 개 씩 목록에 들어있는 수가 주어짐 (0 ~ 10000 사이의 수)
// 출력 : 입력한 수들이 배수라면 is a multiple of n 배수가 아니라면 is Not a multiple of n 출력
public class MultipleSearchEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val;
        List<Integer> multiple = new ArrayList<>();

        while (true) { // 무한으로 입력받는 식
            val = sc.nextInt();
            if (val == 0) break;
            multiple.add(val);
        }

        for (Integer e : multiple) { // 향상된 포문으로
            if (e % num == 0) System.out.println(e + " is a multiple of " + num);
            else System.out.println(e + " is Not a multiple of " + num);
        }

//        for (int i = 0; i < multiple.size(); i++) {
//            if (multiple.get(i) % num == 0) {
//                System.out.println(multiple.get(i) + " is a multiple of " + num);
//            } else System.out.println(multiple.get(i) + " is Not a multiple of " + num);
//        }
    }
}
