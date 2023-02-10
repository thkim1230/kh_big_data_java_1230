package 콘솔입출력;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 콘솔 입출력 : 키보드로 입력 받고 화면에 출력하는 것을 말합니다.
// System.in : 표준 입력 스트림
// System.out : 표준 출력 스트림
// System.err : 표준 오류 스트림 (System.out 과 거의 동일 하며 버퍼 사용 방법만 다름, 더 좋은게 있어 사용 x)
public class ConsoleEx {
    public static void main(String[] args) throws IOException {

//        System.out.println("=== 메뉴 ===");
//        System.out.println("1. 예금 조회");
//        System.out.println("2. 예금 출금");
//        System.out.println("3. 예금 입금");
//        System.out.println("4. 종료 하기");
//        System.out.print("메뉴를 선택 하세요 : ");
//
//        InputStream is = System.in; // 키보드 입력 스트림 얻기
//        char inputChar = (char) is.read(); // ASCII 코드를 읽어 문자로 리턴
//        switch(inputChar) {
//            case '1' :
//                System.out.println("예금 조회를 선택 하셨습니다.");
//                break;
//            case '2' :
//                System.out.println("예금 출금을 선택 하셨습니다.");
//                break;
//            case '3' :
//                System.out.println("예금 입금을 선택 하셨습니다.");
//                break;
//            case '4' :
//                System.out.println("종료 하기를 선택하셨습니다.");
//                break;
//        }
        OutputStream os = System.out;
        for (byte b = 48; b < 58; b++) {
            os.write(b);
        }
        os.write(10);

        for (byte b = 65; b < 91; b++) {
            os.write(b);
        }
        os.write(10);

        for (byte b = 97; b < 123; b++) {
            os.write(b);
        }
        os.write(10);
    }
}

