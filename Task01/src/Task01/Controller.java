package Task01;

import java.util.Scanner;

/**
 * Created by Templar on 10.07.2019.
 */
public class Controller {

    private Model model;
    private View view;


    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void resultOutput() {
        Scanner scan = new Scanner(System.in);
        view.printMessage(inputValue(scan));
    }

    public String inputValue (Scanner scan) {
        view.printMessage(View.EXPECT_INPUT_HELLO);
        while (!model.GetInputString().equals("Hello world!"))  {
            String s = scan.nextLine();
                if (s.equals("Hello")) {
                    model.SetInputString(s);
                    while (!model.GetInputString().equals("Hello world!")) {
                        view.printMessage(View.EXPECT_INPUT_WORLD);
                        s = scan.nextLine();
                        if (s.equals("world!")) {
                            model.SetInputString(model.GetInputString() + " " + s);
                        } else {
                            view.printMessage(View.INCORRECT_INPUT);
                        }
                    }
                } else {
                    view.printMessage(View.INCORRECT_INPUT);
            }
        }
        return model.GetInputString();
    }


}
