package 저항;
import java.util.Scanner;
public class ResistanceEx {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, num3 = 0;
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        String[] sel = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.print("색을 입력 하세요 : ");
        for (int i = 0; i < sel.length; i++) {
            sel[i] = sc.next();
        }
        for (int i = 0; i < color.length; i++) {
            if (sel[0].equals(color[i])) num1 = i;
            if (sel[1].equals(color[i])) num2 = i;
            if (sel[2].equals(color[i])) num3 = num[i];
        }
        System.out.println(Long.parseLong(String.valueOf(num1) + String.valueOf(num2)) * num3);
    }
}






