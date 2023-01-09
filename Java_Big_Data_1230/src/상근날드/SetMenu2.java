package 상근날드;
import java.util.Scanner;
public class SetMenu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("가격을 입력 하세요 : ");

        int[] menu = new int[5];
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }

        int minB = menu[0];
        int minD = menu[3];
        for(int i = 0; i < menu.length; i++){
            if((i < 3) && (minB > menu[i])) minB = menu[i];
            if((i > 2) && (minD > menu[i])) minD = menu[i];
        }
        System.out.println(minB + minD -50);
    }
}
