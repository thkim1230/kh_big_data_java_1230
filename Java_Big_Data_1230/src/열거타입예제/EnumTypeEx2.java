package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("김태훈",DevType.MOBILE,Career.JUNIOR,Gender.MALE);
        developer.devInfo();
    }
}
