package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 이 자동으로 추가 됨
    int MIN_TEMP = 0;
    void airConOn(); // 자동으로 추상 메소드가 됨 (abstract 가 자동 추가 됨)
    void airConOff();
    void setAirConTemp(int tmp);


}
