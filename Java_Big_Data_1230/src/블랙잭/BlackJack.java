package 블랙잭;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("카드 개수 입력 : ");
        int cnt = sc.nextInt();
        System.out.print("값 입력 : ");
        int m = sc.nextInt();

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < cnt; i++) {
            for (int j = i + 1; j < cnt; j++) {
                for (int k = j + 1; k < cnt; k++) {
                    sum = list.get(i) + list.get(j) + list.get(k);
                    if (sum <= m) {
                        list2.add(sum);
                    }
                }
            }
        }
        System.out.println(Collections.max(list2));
    }
}
