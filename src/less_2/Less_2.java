package less_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Less_2 {
    public static void main(String[] args) {


        // 1

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

//        int[] arr2 = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
//        arr = arr2;
//        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));


        // 2


        int[] arr2 = new int[8];
        arr2[0] = 0;
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr2));


        // 3


        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));


        // 4


        int [][] arr4 = new int [6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j == i) || (i + j == 5)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
