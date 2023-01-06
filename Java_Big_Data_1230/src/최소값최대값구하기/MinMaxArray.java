package 최소값최대값구하기;
import java.util.Scanner;
// 정수 값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
//  해당 배열에서 제일 작은 값과 제일 큰 값 찾기
public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 정수값 입력 받음
        System.out.print("배열 개수를 입력 하세요 : ");
        int num = sc.nextInt();
        // 입력 받은 정수로 배열 생성
        int[] number = new int[num];
        // 생성된 배열 개수 만큼 순회 하면서 정수값을 입력 받음
        for (int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }
        // 값을 비교하기 위해서 기준 값이 필요한데 배열 0번째 값을 기준값으로 저장
        int min = number[0];
        int max = number[0];
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        for(int e : number){
            if(min > e) min = e;
            if(max < e) max = e;
        }
        // 출력
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}
