package 셋으로로또번호생성;
import java.util.HashSet;
// Set 을 이용한 중복 제거 로또 출력
public class LottoSet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        while (true){
            int tmp = ((int) (Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6)break;
        }
        System.out.println(set);
    }
}
