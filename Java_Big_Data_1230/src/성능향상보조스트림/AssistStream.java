package 성능향상보조스트림;
import java.io.*;

public class AssistStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null; // 입력에 대한 보조 스트림
        BufferedOutputStream bos = null; // 출력에 대한 보조 스트림

        int data = -1; // 더이상 읽을 데이터가 없음을 의미 함
        long start = 0; // 경과 시간 계산을 위한 변수
        long end = 0; // 경과 시간 계산을 위한 변수

        fis = new FileInputStream("src/성능향상보조스트림/Kane_0209.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("cloneKane.jpg");
        start = System.currentTimeMillis();

        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용 하지 않은 경우 걸리는 시간 : " + (end - start) + "ms");

        fis = new FileInputStream("src/성능향상보조스트림/Kane_0209.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("cloneKane.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용 한 경우 걸리는 시간 : " + (end - start) + "ms");
        }
}
