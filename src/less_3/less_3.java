package less_3;

import java.util.Scanner;

public class less_3 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {



        bolmen();
        System.out.print("играем ещё? ");
        int c = sc.nextInt();
        if (c == 1){
            bolmen();
        } else {
            System.out.println("всего доброго");
        }





        }
    public static void bolmen() {
        int a = (int) (Math.random() * 9);
        
        for (int i = 0; i < 3; i++) {

            System.out.print("введите число ");
            int b = sc.nextInt();
            System.out.println();
            if (b == a) {
                System.out.println(" вы угадали");
                break;

            } else if (b > a) {
                System.out.println("введеное число больше");
            } else {
                System.out.println("введеное число меньше");
            }


    }


    }

}
