package PC방알바;

import java.util.Scanner;

// 피씨방에 피씨가 100대 있음
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음
// 만약 자기가 앉고 싶어 하는 자리에 다른 손님이 있으면 거절을 해야 하고, 아니면 자리를 사용 허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는 자리 번호 : 1 3 5 => 0
// 손님의 수 입력 : 5
// 자리 번호 : 1 1 3 3 5
// 거절 횟수 출력 : 2
public class PcRoomEx {
    public static void main(String[] args) {
        // 피씨방 좌석에 대한 100개의 배열이 필요
        // 배열의 초기값은 0이다. 즉 , 0이면 비어 있는 자리이다.
        int[] seat = new int[100];
        int rejectCnt = 0; // 거절 횟수
        int num; // 손님이 원하는 좌석 번호를 입력 받기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("손님의 수를 입력 하세요 : ");
        int per = sc.nextInt();// 손님의 수를 입력 받음
        for (int i = 0; i < per; i++){
            num = sc.nextInt();// 좌석 번호는 1번 부터 시작
            if (seat[num - 1] == 1) { // 해당 배열의 값이 1이라는건 이미 사용하고 있다는 뜻
                rejectCnt++;
            }else seat[num - 1] = 1;// 비어있는 자리를 사용 함
            }
        System.out.println(rejectCnt);
        }
    }

