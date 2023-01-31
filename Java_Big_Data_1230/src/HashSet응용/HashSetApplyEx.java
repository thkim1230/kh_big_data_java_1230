package HashSet응용;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// 1. 길이가 짧은 것 부터
// 2. 길이가 같으면 사전 순위
// 3. 중복 제거
// 입력 : 13 but i wont hesitate no more no more it cannot wait im yours
// 출력 : i im it no but more wait wont yours cannot hesitate
public class HashSetApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] word = new String[length];
        for (int i = 0; i < length; i++) {
            word[i] = sc.next();
        }
        // HashSet 을 이용해 중복 제거 (배열을 HashSet 에 넣었다가 다시 배열에 넣는 코드)
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
        word = set.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열 크기가 지정 됨
        // 길이 순서대로 정렬
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() == o2.length()) return o1.compareTo(o2);
                return -1;
            }
        });
        // 출력
        System.out.println(Arrays.toString(word));
        for (String e : word) System.out.print(e + " ");
    }
}
