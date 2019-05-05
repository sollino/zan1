package less_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Less_2 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

//        int[] arr2 = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
//        arr = arr2;
//        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] += 1;
            } else if (arr[i] >= 1) {
                arr[i] -= 1;
            }
            System.out.println(Arrays.toString(arr));
        }


        

    }
}
