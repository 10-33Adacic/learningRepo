package com.learning.controller;

import com.learning.model.Compose;
import com.learning.model.Model;
import com.learning.model.entity.IsExistException;
import com.learning.view.View;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Templar on 18.07.2019.
 */
public class Controller {
    private View view;
    private Model model;
    private Compose compose;

    public Controller (View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void programRun() {
        Scanner scan = new Scanner(System.in);
        languageChoose(scan);
        view.setProgramLanguage(view.getLanguage(),
                view.getLocale());
        InputData inputData = new InputData(scan, view, model);
        inputData.inputNote();
        compose = new Compose();
        compose.setModel(inputData.getModel());
        try {
            compose.composeData();
        } catch (IsExistException e) {
            view.printWrongNicknameInput();
        }

    }
        // подправить проверку на ввод - исключить ввод не цыфры
    public void languageChoose(Scanner scan) {
        view.printMessage(View.CHOOSE_LANGUAGE);
        while (view.getLanguage() == null) {
//            try {
                switch (scan.nextInt()) {
                    case 1:
                        view.setLanguage("en");
                        view.setLocale(new Locale(view.getLanguage()));
                        view.setBundle(view.setProgramLanguage(view.getLanguage(), view.getLocale()));
                        break;
                    case 2:
                        view.setLanguage("ua");
                        view.setLocale(new Locale(view.getLanguage()));
                        view.setBundle(view.setProgramLanguage(view.getLanguage(), view.getLocale()));
                        break;
                    default:
                        view.printMessage(View.WRONG_LANGUAGE_INPUT);
                }
//                }
//            } catch (InputMismatchException e) {
//                view.printMessage(View.WRONG_LANGUAGE_INPUT);
//                break;
        }
    }
}
