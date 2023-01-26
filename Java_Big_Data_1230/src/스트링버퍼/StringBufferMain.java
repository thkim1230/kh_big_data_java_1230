package 스트링버퍼;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨, 동기화 지원 (멀티쓰레드에서 안전)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨, 동기화 지원 안됨, 성능은 우수
// String : 객체 생성 x, 문자열 추가 시 계속 새로운 문자열이 만들어 짐, 문자열 추가가 길어 지면 성능 저하
// append() : 문자열 추가 할 때 사용
// insert() : 특정 위치에 문자열을 삽입
// substring() : 문자열 구간을 정해 잘라 냄
public class StringBufferMain {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(); // Buffer 와 Builder 는 완전 똑같은 문법을 사용함
        StringBuilder sb2 = new StringBuilder();

        sb.append("hello ");
        sb.append("haha");
        sb.insert(0,"안녕하세요 "); // sb.delete(1,3); // 1번 인덱스에서 3번 미만(1, 2 번 인덱스가 지워짐)

        sb2.append("hello");

        System.out.println(sb);
        System.out.println(sb.substring(6));

        String st = "hello";
        st += " ";
        st += "to java";
        System.out.println(st);
    }
}
