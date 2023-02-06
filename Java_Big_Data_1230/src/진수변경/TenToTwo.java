package 진수변경;
import java.util.*;
public class TenToTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int n = sc.nextInt();

        if (n == 1) {
                System.out.print("000");
        } else if (n > 1 && n < 4) {
            System.out.print("00");
        } else if (n > 3 && n < 8 ) {
            System.out.print("0");
        }

        while (true) {
            if (n < 1) break;
            int binaryNum = n % 2;
            n = n / 2;
            list.add(String.valueOf(binaryNum));
        }

        Collections.reverse(list); // 어레이리스트 값 순서를 역순으로 바꾸는 코드
        for (String e : list) System.out.print(e);
    }
}
