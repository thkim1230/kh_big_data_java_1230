package 쓰레드예제3번;
import java.awt.*;
import static java.lang.Thread.sleep;
// sleep() : 실행중인 스레드를 일정 시간동안 대기 상태로 만듬,
// (반복 수행에 대한 시간을 늦추거나 인터럽트 예외처리를 위해서 사용)
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
         toolkit.beep();
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
