/**
 * Created by Templar on 26.07.2019.
 */
public class ExceptionExample9 {
    public static void main(String[] args) {
        sqr1(2);
        sqr2 (2);
        sqr3 (2);
        sqr4(2);
    }

    public static double sqr1 (double arg) {
        return arg*arg;
    }

    public static double sqr2 (double arg) {
        int k = 1;
        return k;
    }

    public static double sqr3 (double arg) {
        int k = 1;
        return (double) k;
    }

//    public static double sqr4 (double arg) {
//        return "Hello";
//    }
}


