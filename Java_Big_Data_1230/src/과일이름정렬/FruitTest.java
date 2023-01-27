package 과일이름정렬;
// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전순(알파벳순서)으로 정렬하기
// String  length() : 양수,음수
// String compareTo() 사용 하기 (값을 정수로 변환하여 크기 비교 하는 메소드 값이 크면 1 같으면 0 작으면 -1 반환)
// Arrays.sort(배열이름, new Comparator<String>(){ compare() 메소드 구현 });
import java.util.Arrays;
import java.util.Comparator;
public class FruitTest {
    public static void main(String[] args) {

        String[] fruit = {"Banana","Tomato","Orange","Melon","Mango",
                "Kiwi","Apple","Peach","WaterMelon","Papaya"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 더 길면 오름차순으로 정렬
                else if (o1.length() == o2.length()) return o1.compareTo(o2);
                // 길이가 같으면 정수로 변환하여 비교후 큰 값이 오름차순 (알파벳순이 됨)
                return -1; // 현상태유지
            }
        });
        for (String e : fruit) System.out.print(e + " ");
    }
}
