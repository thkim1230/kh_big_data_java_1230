package 평균점수구하기;
import java.util.Scanner;
// 상현이가 가르치는 학생은 총 5명 ( 안유진 ,유나 , 채원, 카즈하, 장원영)
// 기말고사를 치고 난 후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적을 조정해줌
// 모든 학생이 보충학습을 들음.
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0점 이상이고, 100점이하인 5의 배수이다.
public class ArrayExAver {
    public static void main(String[] args) {
        // 스캐너 객체를 생성
        // 5명의 성적을 저장하기 위한 배열 생성
        // 배열을 순회하면서 5명의 성적을 입력 받으면서 성적이 40점 미만일 경우 40점으로 조정
        // 평균을 구하기 위해서 성적으로 모두 합산 함
        // 합산된 성적을 인원수로 나누어 평균을 구함

        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력 하세요 : ");
        int[] test = new int[5];
        int sum = 0 ;
        for (int i = 0; i < test.length; i++){
            test[i] = sc.nextInt();
            if(test[i] < 40){
                test[i] = 40;
            }
            sum += test[i];
        }
        System.out.println(sum / 5);
    }
}
