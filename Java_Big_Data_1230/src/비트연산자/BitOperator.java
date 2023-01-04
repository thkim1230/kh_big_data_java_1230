package 비트연산자;
// 비트 연산자 : 비트 단위로 연산하는것 ( 1 과 0)
// & (비트 AND) : 두개의 비트가 모두 1이면 1
// | (비트 OR) : 둘 중 한개의 비트만 1이면 1
// ^ (XOR) : 두개의 비트의 값이 같으면 0 다르면 1
// ~ (비트의 값을 반전) : 비트가 0이면 1, 1이면 0으로 변경
// <<,>> (Shift 연산자) : 지정된 수만큼 왼쪽 또는 오른쪽으로 비트를 이동
public class BitOperator {
    public static void main(String[] args) {

        int num1 = 10; // 00001010
        int num2 = 12; // 00001100
        System.out.println(num1 & num2 ); // 00001000
        System.out.println(num1 | num2); // 00001110
        System.out.println(num1 ^ num2); // 00000110
        System.out.println(~num1); // 11110101
        System.out.println(num1 << 1);//00010100
        System.out.println(num1 >> 1); //00000101
    }
}
