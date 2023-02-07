package 진수변경;
import java.util.*;
public class TenToTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.print("십진수 입력 : ");
        int n = sc.nextInt();
        while (true) {
            if (n < 1) break;
            int binaryNum = n % 2;
            n = n / 2;
            list.add(String.valueOf(binaryNum));
        }
        System.out.print("이진수 : " );
        Collections.reverse(list); // 어레이리스트 값 순서를 역순으로 바꾸는 코드
        for (String e : list) System.out.print(e);
    }
}
