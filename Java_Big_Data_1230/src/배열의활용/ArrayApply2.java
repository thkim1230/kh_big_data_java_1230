package 배열의활용;
import java.util.Arrays;
// copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사
public class ArrayApply2 {
    public static void main(String[] args) {
        int[] arr1 = {90, 30, 35, 40, 50}; // 원본 데이터
        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr3));
    }
}
