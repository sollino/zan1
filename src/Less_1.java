public class Less_1 {
    public static void main(String[] args) {

//        byte a = 1;
//        short b = 1;
//        int c = 1;
//        long d =1;
//        float  a1 = 1;
//        double b1 = 1;
//        char c1 = 1;
//        boolean d1;

        System.out.println(printSumm(1, 1, 1, 1));
        System.out.println(serch(3, 4));
        negative(3);
        System.out.println(nega(4));
        name("don");

    }


    public static double printSumm(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean serch(double a, double b) {
        double x = a + b;
        if ((x <= 20) && (x >= 10)) {
            return true;
        } else {
            return false;
        }

    }
    public static void negative (int a) {
        if (a>=0) {
            System.out.println("норм");
        }else {
            System.out.println("не норм");
        }
    }

    public static boolean nega (int x) {
        if(x<0){
            return false;
        }else {
            return true;
        }
    }

    public static void name (String name){
        System.out.println("привет " + name);
    }


}

