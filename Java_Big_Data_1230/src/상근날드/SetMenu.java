package 상근날드;
import java.util.Scanner;
// 상근날드 가게에서는 세트메뉴를 판매합니다.
// 햄버거는 3가지 종류가 있고
// 음료는 2가지 종류가 있음
// 입력은 총 5개의 값을 연속으로 입력 하는데 햄버거 3가지 가격 , 음료 2가지 가격을 연속으로 입력
// 햄버거3가지 중 가장 싼 가격 선택 , 음료 2중 가장 싼 가격 선택하고, 세트 메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액 구하는 문제
public class SetMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("가격을 입력 하세요 : ");

        int[] menu = new int[5];
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }

        int minB = menu[0];
        for (int j = 0; j < 3; j++) {
            if (minB > menu[j]) minB = menu[j];
        }

        int minD = menu[3];
        for (int k = 3; k < 5; k++) {
            if (minD > menu[k]) minD = menu[k];
        }

        System.out.println("세트 메뉴의 가격은 " + ((minB + minD) - 50) + " 원입니다.");
    }
}