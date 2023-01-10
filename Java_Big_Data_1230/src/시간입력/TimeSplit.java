package 시간입력;
import java.util.Scanner;
// 입력 : 23 : 5 : 3 (24시간제로 시간을 콜론 (:) 기준으로 입력)
// 출력 : 오후 11시 05분 03
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times = sc.next();
        String[] time = times.split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);

//        if (hour > 12 && min < 10)
//            System.out.println("오후 " + (hour - 12) + "시 0" + min + "분 0" + sec + "초");
//        else if (hour > 12 && min > 10)
//            System.out.println("오후 " + (hour - 12) + "시 " + min + "분 " + sec + "초");
//        else if (hour < 12 && min < 10)
//            System.out.println("오전 " + hour + "시 0" + min + "분 0" + sec + "초");
//        else System.out.println("오전" + hour + "시 " + min + "분 " + sec + "초");
        if (hour > 11) {
            hour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", hour, min, sec);
        }else System.out.printf("오전 %02d시 %02d분 %02d초\n", hour, min, sec);

    }
}




