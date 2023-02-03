package 쓰레드예제6번;
import static java.lang.Thread.sleep;
// 스레드의 안전한 종료 방법 : stop 플래그를 구현 하거나 interrupt() 메소드를 사용
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {

//        RunThread runThread = new RunThread();
//        runThread.start();
//        sleep(10000);
//        runThread.setStop(true); // stop 플래그 구현 방법으로 종료

        InterruptThread intTh = new InterruptThread();
        intTh.start();
        sleep(10000);
        intTh.interrupt(); // 일시 정지 상태의 스레드에 Interrupt Exception 을 발생 시킴
    }
}
