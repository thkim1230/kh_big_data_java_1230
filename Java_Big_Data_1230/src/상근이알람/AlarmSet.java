package 상근이알람;
import java.util.Scanner;
// 상근이라는 친구는 매일 학교를 지각 합니다.
// 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려 줍니다.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함.
// 24시간제
public class AlarmSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        int hour = sc.nextInt();
        System.out.println("분을 입력하세요 : ");
        int minute = sc.nextInt();

        int calc = (hour * 60) +minute;
        if ( calc < 45 ) {
            calc = (24 * 60) + minute;
         }
        calc -= 45;
        System.out.printf("%d시 %d분\n", (calc / 60), (calc % 60));
        
//        if((minute-45)>45){
//            System.out.println(hour + "시" + (minute-45) + "분");
//        } else if ((minute - 45)< 45) {
//            System.out.println((hour-1) + "시" + (60 + (minute-45)) + "분");
//        }
    }
}



