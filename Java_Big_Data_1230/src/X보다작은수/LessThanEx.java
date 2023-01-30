package X보다작은수;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 정수 어레이리스트로 개수와 정수X 가 주어지면 리스트 내에서 X보다 작은 수를 모두 출력
// 입력 :10 5 => 개수와 정수 X // 1 10 4 9 2 3 8 5 7 6 => 리스트 내에 들어갈 값
// 결과 : 1 4 2 3
public class LessThanEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++){
         list.add(sc.nextInt());
         if (list.get(i) < num) System.out.print(list.get(i) + " ");
        }
    }
}
