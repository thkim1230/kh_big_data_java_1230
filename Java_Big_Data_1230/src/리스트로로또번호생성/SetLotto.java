package 리스트로로또번호생성;
import java.util.HashSet;
public class SetLotto {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        while(true) {
             set.add(((int) (Math.random() * 45) + 1));
            if (set.size() == 6) break;
        }
        System.out.println(set);
    }
}
