package 주사위게임;
// 주사위 2개를 던져서 합이 12이면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int i,j;
        int cnt= 0;
        while (true){
            cnt++;
            i = (int) ((Math.random() * 6) + 1);// 랜덤 함수는 실수형으로 값이 생성되므로 형변환이 필요
            j = (int) ((Math.random() * 6) + 1);
            if(i+j==12){
                System.out.printf("무인도를 %d 번만에 탈출 합니다.\n", cnt);
                break;
            }else {
                System.out.println("주사위의 합이 " + (i + j) + "입니다.");
            }
        }
    }
}
