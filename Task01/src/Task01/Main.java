package Task01;

/**
 * Created by Templar on 10.07.2019.
 */
public class Main {
    public static void main(String[] args) {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);

    controller.resultOutput();
    }
}
