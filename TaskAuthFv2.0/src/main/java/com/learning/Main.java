package com.learning;

import com.learning.view.View;
import com.learning.model.Model;
import com.learning.controller.Controller;


/**
 * Created by Templar on 18.07.2019.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Warning! This code throws exception. I need more time to rewrite it)))");
//        View view = new View();
//        Model model = new Model();
        Controller controller = new Controller(new View(), new Model());

        controller.programRun();
    }
}
