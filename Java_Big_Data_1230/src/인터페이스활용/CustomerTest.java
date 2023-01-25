package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Buy buyer = customer;
        // Customer 타입의 customer 참조 변수를 Buy 인터페이스형 buyer 참조 변수에 대입(형변환이 일어남)
        buyer.buy();
        // buyer 는 Buy 인터페이스의 메소드만 호출 가능
        buyer.order();
        // 재정의된 메소드가 호출 됨
        Sell sell = customer; // 위와 같음
        sell.sell();
        sell.order();

        Customer customer1 = (Customer) sell; // 다시 역으로 형변환 (다운 캐스팅 이라함)
        customer1.buy();
        customer1.sell();
    }
}
