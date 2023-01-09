package 배열의활용;
import java.util.Arrays;
// arraycopy() :  배열 값을 복사 할 때 사용
public class ArrayApply {
    public static void main(String[] args) {
        int[] arr1 = {90, 30, 35, 40, 50}; // 원본 데이터
        int len = 10;
        int[] arr2 = new int[len];
        System.arraycopy(arr1, 0, arr2, 4, arr1.length);//문법사용
        //for (int i = 0; i < arr1.length; i++){ 포문사용
        //    arr2[i + 3] = arr1[i];
        //    }
        System.out.println(Arrays.toString(arr2));
    }
}
