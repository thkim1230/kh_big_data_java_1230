package 참조타입확인;

public class RefType {
    public static void main(String[] args) {

        int x = 0; //기본타입 변수 기본값 초기화값
        String str = null; // 참조타입의 변수가 객체를 참조하지 않는다는 의미
        int[] arr = null; //배열도 null 표기

        Integer val = null;//래퍼변수 기본타입을 참조타입으로 바꾸는
        int val2 = val; // NullPoint Exception 발생
    }
}
