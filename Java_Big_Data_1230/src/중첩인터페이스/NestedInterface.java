package 중첩인터페이스;
// 중첩 인터페이스 : 클래스 내부에 선언한 인터페이스를 말합니다.
// 주로 UI 프로그래밍에서 이벤트 처리를 위해 사용 합니다.

public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch(); // touch() 메소드 호출, 등록된 리스터의 onClick() 를 호출
        button.setOnClickListener(new MessageListener());
        button.touch();

    }
}
