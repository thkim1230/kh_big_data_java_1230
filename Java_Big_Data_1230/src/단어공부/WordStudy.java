package 단어공부;
import java.util.Scanner;
// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대문자로 출력
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우 ? 로 출력
// 입력 : AaAAabBcdD  결과 : A
public class WordStudy {
    public static void main(String[] args) {
       char result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == word.charAt(i)){
                result = word.charAt(i);
            }
        }
        System.out.println(result);
    }



}
