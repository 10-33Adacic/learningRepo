/**
 * Main class
 *
 * Version 1.1
 *
 * Updated 15.07.2019
 *
 * Created by Templar on 12.07.2019.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.run();
    }
}