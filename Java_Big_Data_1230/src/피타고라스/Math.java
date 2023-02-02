package 피타고라스;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String rst;
        while (true) {
            rst = Math.calcFunc(); // 클래스 생략한 rst = calcFunc(); 로도 가능
            if (rst.equals("exit")) break;
            list.add(rst);
        }
        for (String e : list) System.out.println(e);
    }

    static String calcFunc() {
        int sum = 0;
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
         }
        if (sum == 0) return "exit";
        Arrays.sort(num);
        if ((num[2] * num[2]) == (num[0] * num[0]) + (num[1] * num[1])) {
            return "right";
        }
        return "wrong";
    }
}


