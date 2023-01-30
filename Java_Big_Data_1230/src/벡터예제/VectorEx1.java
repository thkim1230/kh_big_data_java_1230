package 벡터예제;
import java.util.List;
import java.util.Vector;
// Vector 는 ArrayList 내부적으로 동일한 구조 입니다. 메소드의 사용 방법도 완전 동일합니다.
// 멀티스레드에 안전한대신 성능이 떨어집니다.
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우","010 - 1234- 5678","yyy.@gmail.com",
                "변호사","서울시 강남구 역삼동"));
        list.add(new NameCard("동그라미","010 - 2222- 3333","ddd.@gmail.com",
                "무직","경기도 인천광역시"));
        list.add(new NameCard("이준호","010 - 3333- 5555","ljh.@gmail.com",
                "사무직","서울"));

        for (NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호: " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직업 : " + e.position);
            System.out.println("주소 : " + e.address);
            System.out.println();
        }
    }
}

class NameCard{
    String name;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}

