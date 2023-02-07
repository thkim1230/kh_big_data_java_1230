package 소수단어;
import java.util.Scanner;
public class PrimeWord {
    public static void main(String[] args) {

        int sum = 0;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력 하세요 : ");
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
             else sum += word.charAt(i) - 'A' + 27;
        }

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) isPrime = false;
        }

        if (isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
