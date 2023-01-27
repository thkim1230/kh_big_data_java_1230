package 제네릭;
import java.util.ArrayList;
import java.util.List;
// 컴파일 시 강한 타입 체크 / 자바 8 이전 대비 변경 사항
// 타입 변환 제거 / 자바 8 이전 대비 변경 사항
public class GenericTestEx {
    public static void main(String[] args) {

//        List list = new ArrayList(); // 자바 8 이전 스타일
//        list.add("안녕하세요.");
//        String str = (String) list.get(0);

        // 제네릭 타입
        // List 에서 사용할 데이터 타입을 미리 지정함으로 컴파일시 타입 체크가 일어나도록함
        List<String> list = new ArrayList<>();
        list.add("hello");
        String str = list.get(0); // 타입변환 제거
        System.out.println(str);
    }
}
