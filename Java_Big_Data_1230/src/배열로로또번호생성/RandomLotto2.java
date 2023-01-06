package 배열로로또번호생성;
import java.util.Arrays;
//중복 제거 하기
public class RandomLotto2 {
    public static void main(String[] args) {
        // 6개의 정수 배열 생성
        int[] lotto = new int[6];
        int tmp; // 생성된 로또 번호를 배열에 넣기전에 임시로 저장
        boolean isExist = false; // 번호의 중복 여부 확인
        int index = 0;
        while (true) {
            tmp = ((int) (Math.random() * 45) + 1);
            // 중복 확인 구간
            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == tmp) isExist = true;// 배열에 생성된 로또 번호가 있으면 true
            }
            // 생성된 번호가 배열내에 없으면 저장하는데, index 계산 해줘야 함.
            if (isExist == false) lotto[index++] = tmp;
            // 로또 번호가 6개 만들어 졌으면 반복문 탈출
            if(index == lotto.length) break;
            // 존재 여부 확인하는 변수를 초기화 시킴
            isExist = false;
        }
        System.out.println(Arrays.toString(lotto)); //메소드로 배열 출력하는 코드
    }
}