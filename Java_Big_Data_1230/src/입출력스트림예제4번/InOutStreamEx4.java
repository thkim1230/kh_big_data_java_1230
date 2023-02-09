package 입출력스트림예제4번;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
// Reader 는 문자 스트림의 최상위 추상 클래스 입니다.
public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
//        int readData;
        int readNo;
        char[] cBuf = new char[256];
        String data = "";
        while (true) {
//            readData = reader.read(); // 한개의 문자(2byte)를 읽어 4byte int 타입으로 반환
//            if (readData == -1) break;
//            System.out.print((char) readData);
            readNo = reader.read(cBuf);
            if (readNo == -1) break;
            data += new String(cBuf,0,readNo);
        }
        System.out.println(data);
        reader.close();
    }
}
