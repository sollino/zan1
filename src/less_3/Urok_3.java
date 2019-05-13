package less_3;

import java.util.Random;
import java.util.Scanner;

public class Urok_3 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(x + " " + y);
//        String s = sc.nextLine();
//        s = sc.nextLine();
//        System.out.println(s);
//
////        multiply(10);
//        System.out.printf("сумма  %d + %d = %d \n", x, y, x + y);
//        System.out.println(summ(5,3,6,4,4));
        equalasString("qwerty", "romb ");

    }
    public static String equalasString (String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i) + ", ");
        }
        return s1;
    }



    public static void multiply(int n) {
        int a = rand.nextInt();
//        int b = rand.nextInt();
        int b = (int) (Math.random() * n);
        int c = -1;
        do {
            System.out.println(a + " * " + b + " = ");
            c = sc.nextInt();
        } while (c != a * b);

    }

    public static int countDiv(int[] arr, int n) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n == 0) {
                k++;
            }
        }
        return k;
    }

    public static int countDiAbetweenB(int[] arr, int a, int b) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= a) && (arr[i] <= b)) {
                k++;
            }
        }
        return k;

    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static int summ(int a, int b, int c) {
        return a + b + c;
    }

    public static int summ(int ... arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        return summ;
    }

    public static int[] fillArr ( int n){
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt( 200) - 100;

        }
        return  arr;
    }

}
