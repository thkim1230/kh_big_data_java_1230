package 반복문컨티뉴;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0 )continue;// 값이 돌아감
            System.out.println(i);
        }
    }
}
