package 리스트로로또번호생성;
import java.util.ArrayList;
import java.util.List;
// ArrayList 를 이용한 중복제거 로또 출력
public class LottoArrayList {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(); // 갯수 지정 필요 없음
        int tmp;// 로또 번호 임시로 저장하는 변수
        
        while (true){
            tmp = ((int) (Math.random() * 45) + 1);
            if(!list.contains(tmp)) list.add(tmp); // 중복 체크
            if(list.size() == 6)break;
        }
        for (Integer e : list) System.out.print(e + " ");
    }
}
