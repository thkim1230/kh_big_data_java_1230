package 깊은복사얕은복사;

import java.util.Arrays;

// 깊은 복사 : 할당된 메모리 공간에 실제 값이 복사 되는 것(기본 타입은 모두 여기에 해당함)
// 얕은 복사 : 참조 타입에 해당되며 실제 값이 복사가 되는 것이 아니라 주소가 복사되는 것을 의미
public class DeepCopy {
    public static void main(String[] args) {

        // 얕은 복사가 발생하는 경우
        int [] arr1 = new int[4];
        arr1[0] = 100;
        int [] arr2 = arr1; // 얕은복사가 일어나서 주소가 복사되었기 때문에 값을 변경할때마다 똑같이 바뀜
        arr1[0] = 200;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // 문법을 사용하여 복사하면 변경할때마다 똑같이 바뀌지 않음
        arr1[0] = 150;
        int [] arr3 = new int[4];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        arr1[0] = 60;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr3));


    }
}
