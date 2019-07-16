import java.util.Scanner;

/**
 * Created by Templar on 12.07.2019.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private void GenerateHiddenNumber() {
        int max = 100;
        final int hidden = (int)(Math.random()*++max);
        model.setHiddenNumber(hidden);
    }

    //Run
    public void run() {
        GenerateHiddenNumber();
        view.printMessage(View.GREETINGS);
        model.setMin(0);
        model.setMax(100);

        Scanner scan = new Scanner(System.in);
        while (model.getHiddenNumber() != model.getInputNumber()) {
            while (!scan.hasNextInt()) {
                try{
                    model.setInputNumber(Integer.parseInt(scan.nextLine()));
                    model.setPreviousInput(model.getInputNumber());
                } catch (Exception e) {
                    view.printMessage(View.WRONG_INPUT);
                }
            }
            if (scan.hasNextInt()) {
                model.setInputNumber(scan.nextInt());
                model.setPreviousInput(model.getInputNumber());
            }
            view.printMessage(View.YOUR_INPUT + model.getInputNumber());
            if (model.getInputNumber() > model.getHiddenNumber()) {
                view.printMessage(View.AFTER_INPUT  + model.getMin() + View.AFTER_INPUT_CONTINUE + model.getInputNumber());
                model.setMax(model.getInputNumber());
            } if (model.getInputNumber() < model.getHiddenNumber()) {
                view.printMessage(View.AFTER_INPUT  + model.getInputNumber() + View.AFTER_INPUT_CONTINUE + model.getMax());
                model.setMin(model.getInputNumber());
            } if (model.getInputNumber() == model.getHiddenNumber()) {
                view.printMessage(View.WIN);
                view.printMessage("");
                view.printMessage(View.STEPS);
                view.printSteps(model.getPreviousInput());
            }
        }
        scan.close();
    }
}
