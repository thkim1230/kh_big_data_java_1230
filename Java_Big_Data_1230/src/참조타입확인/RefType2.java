package 참조타입확인;
//참조 변수의 ==
public class RefType2 {
    public static void main(String[] args) {
        String name1 = "진부연"; // name1 과 name2 의 메모리 주소는 같음 static 메모리에 저장하기때문
        String name2 = "진부연";
        String name3 = new String("진부연");
        if(name1 == name3){ // 두개의 메모리 주소가 같은가
            System.out.println("두개의 이름에 대한 참조가 같음");
        }else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        }
        if (name1.equals((name3))){ // 두개의 내용(값)이 같은가
            System.out.println("두개의 이름의 내용이 같음");
        }else {
            System.out.println("두개의 이름의 내용이 다름");
        }
    }
}
