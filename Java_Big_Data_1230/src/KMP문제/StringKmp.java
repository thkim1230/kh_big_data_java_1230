package KMP문제;
import java.util.Scanner;
// 입력 : Knuth - Morris - Pratt
// 출력 : KMP
public class StringKmp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("입력 : ");
        String name1 = sc.next();

        // 1. split 을 이용한 방법
             String[] name2 = name1.split("-");
               for (int i = 0; i < name2.length; i++) {
                   System.out.print(name2[i].charAt(0));
               }

        //  2. 대문자만 골라내는 방법
        /*     for (int i = 0; i < name1.length(); i++) {
               if(name1.charAt(i) >= 'A' && name1.charAt(i) <= 'Z'){
               System.out.println(name1.charAt(i));
               } */

        //  3. 0번째 문자 출력, 그리고 - 다음 문자 출력
        /*     for (int i = 0; i < name1.length(); i++){
               if (i == 0) System.out.println(name1.charAt(i));
               else {
               if (name1.charAt(i) == '-') System.out.println(name1.charAt(i+1));
                 }
               }*/

        // 4. 문자 배열로 변경 후 대문자 골라 내기
        /*    char[] chName = name1.toCharArray();
              for (char e : chName) {
              if (e >= 'A' && e <= 'Z') System.out.print(e);
        }*/
    }
}

