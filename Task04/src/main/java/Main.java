import Controller.Controller;
import Model.*;
import View.View;

public class Main {
    public static void main(String[] args) {
      Controller controller = new Controller(new Model(), new View());
      Model model = new Model();
      View view = new View();

      controller.programRun();
    }
}
