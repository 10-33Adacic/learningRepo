/**
 * Created by Templar on 26.07.2019.
 */
public class ExceptionExample6 {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NumberFormatException e) {
        try {
            throw e;
        } catch (NumberFormatException npe) {
            f(npe);
        }
    }
}
