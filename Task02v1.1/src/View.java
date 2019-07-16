import java.util.ArrayList;

/**
 * View class
 *
 * Version 1.1
 *
 * Updated 15.07.2019
 *
 * Created by Templar on 12.07.2019.
 */
public class View {
    public static final String GREETINGS = "Hello! This program made a number between 0 and 100. You need to enter digits to guess it.";
    public static final String WRONG_INPUT = "Wrong input. Try ones more.";
    public static final String WRONG_LIMIT = "Wrong input. You have entered a digit, that is out of limit. Try ones more";
    public static final String YOUR_INPUT = "You have input ";
    public static final String AFTER_INPUT = "Now you need to guess number beetween ";
    public static final String AFTER_INPUT_CONTINUE = " and ";
    public static final String STEPS = "Your input steps:";
    public static final String WIN = "Yes! It is! You win!";

    public void printMessage (String s) {
        System.out.println(s);
    }

    public void printSteps (ArrayList<Integer> ls) {
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
