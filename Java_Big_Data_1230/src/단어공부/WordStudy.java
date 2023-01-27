package 단어공부;
import java.util.Scanner;
// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제 (알파벳 대소문자 구분 x)
// 입력은 대소문자를 입력하고, 결과는 대문자로 출력
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우 ? 로 출력
// 입력 : AaAAabBcdD  결과 : A
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int[26]; // 알파벳 개수 만큼의 배열 생성 (가장 많이 등장하는 알파벳을 count 하기위해)
        int max = 0; // 제일 큰수 찾기
        char result = 0; // 결과값으로 출력할 알파벳을 구하기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) { // 입력 받은 단어의 길이 만큼 순회 alphabet 배열에 횟수 누적
            if (word.charAt(i) >= 'a') {
                alphabet[word.charAt(i) - 'a']++;
            } else alphabet[word.charAt(i) - 'A']++;
        }
        for (int i = 0; i < alphabet.length; i++) { // 배열에 가장 많이 입력되어 큰 수 max 에 대입
            if (alphabet[i] == max) result = '?';
            else if (alphabet[i] > max){
                max = alphabet[i];
                result = (char) ('A'+ i);
            }
        }
        System.out.println("가장 많은 알파벳 : " + result);
    }
}





