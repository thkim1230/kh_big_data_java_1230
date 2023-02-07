package 진수변경;
import java.util.Map;
import java.util.Scanner;
// 배열 없이 풀기
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("이진수 : " + val);
        val = binToDec(val);
        System.out.println("십진수 : " + val);
    }

    static int decToBin(int dec) { // 10 진수를 입력 받아서 2 진수 변환
        int calc; // 계산으로 만들어진 이진수
        int bin = 0; // 최종 결과
        int pos = 1; // 자리 이동을 위한 포지션 변수
        while (dec != 0) {
            calc = dec % 2;
            bin = bin + calc * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return bin;
    }

    static int binToDec(int bin) { // 2 진수를 입력 받아서 10 진수 변환
        int dec = 0; // 최종 결과
        int i = 0; // 인덱스 계산용 변수
        int tmp; // 계산을 위한 임시 값 저장용
        while (bin != 0) {
            tmp = bin % 10;
            bin = bin / 10;
            dec += tmp * Math.pow(2 , i++);
        }
        return dec;
    }

}
