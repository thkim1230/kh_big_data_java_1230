package Calendar클래스;
import java.util.Calendar;
// Calendar 클래스는 추상클래스 이므로 객체 생성 없이 사용, 날짜 시간과 달리 캘린더 표기법은 각 나라별로 상이 하기 때문
// 정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져옴, 포함된 필드도 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1);
//        System.out.println(now.get(Calendar.DAY_OF_WEEK));
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));
        // yyyy년MM월dd HH시mm분ss초
        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        int sce =  now.get(Calendar.SECOND);
        System.out.println(year + "년" + mon + "월" + day + "일 " + hour + "시" + min + "분" + sce + "초");
    }
}
