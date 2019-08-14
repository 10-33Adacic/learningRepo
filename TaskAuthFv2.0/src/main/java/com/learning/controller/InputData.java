package com.learning.controller;

import com.learning.model.Compose;
import com.learning.model.Model;
import com.learning.model.entity.Groups;
import com.learning.view.View;
import java.util.Scanner;

import static com.learning.controller.Regex.*;
import static com.learning.view.TextConstants.*;

/**
 * Created by Templar on 19.07.2019.
 */
public class InputData {
    private View view;
    private Scanner scan;

    public Model getModel() {
        return model;
    }

    private Model model;

    InputData (Scanner scan, View view, Model model) {
        this.view = view;
        this.scan = scan;
        this.model = model;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scan.hasNext() &&
                (res = scan.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

    public void inputNote() {
//        String str = (String.valueOf(view.getBundle().getLocale()).equals("ua"))
//                ? REGEX_FIRST_NAME_UKR : REGEX_FIRST_NAME;
//
//        model.setFirstName(inputStringValueWithScanner
//                (FIRST_NAME, str));
//
//        str = (String.valueOf(view.getBundle().getLocale()).equals("ua"))
//                ? REGEX_LAST_NAME_UKR : REGEX_LAST_NAME;
//
//        model.setLastName(inputStringValueWithScanner
//                (LAST_NAME, str));
//
//        model.setLastNamePlusNameLetter(model.getLastName()
//                + " "
//                + model.getFirstName().substring(0,1)
//                + ".");
//
//        str = (String.valueOf(view.getBundle().getLocale()).equals("ua"))
//                ? REGEX_PATRONYMIC_UKR : REGEX_PATRONYMIC;
//
//        model.setPatronymic(inputStringValueWithScanner
//                (PATRONYMIC, str));

        model.setNickName(inputStringValueWithScanner
                (NICKNAME, REGEX_NICKNAME));
        

//        model.setComment(inputStringValueWithScanner
//                (COMMENT, REGEX_COMMENT));
//
//        model.setGroup(Groups.valueOf(inputStringValueWithScanner
//                (GROUP, REGEX_GROUP)));
//
//        model.setTelephone(inputStringValueWithScanner
//                (TELEPHONE, REGEX_TELEPHONE));
//
//        model.setTelephoneMobile(inputStringValueWithScanner
//                (TELEPHONE_MOB, REGEX_TELEPHONE_MOB));
//
//        model.setTelephoneMobile2(inputStringValueWithScanner
//                (TELEPHONE_MOB_SECOND, REGEX_TELEPHONE_MOB_SECOND));
//
//        model.setEmail(inputStringValueWithScanner
//                (EMAIL, REGEX_EMEAIL));
//
//        model.setSkype(inputStringValueWithScanner
//                (SKYPE, REGEX_SKYPE));
//
//        model.setIndex(inputStringValueWithScanner
//                (INDEX, REGEX_INDEX));
//
//        model.setCity(inputStringValueWithScanner
//                (CITY, REGEX_CITY));
//
//        model.setStreet(inputStringValueWithScanner
//                (STRRET, REGEX_STREET));
//
//        model.setHouse(inputStringValueWithScanner
//                (HOUSE, REGEX_HOUSE));
//
//        model.setAppartment(inputStringValueWithScanner
//                (APPARTMENT, REGEX_APPARTMENT));
//
//        model.setFullAdress(model.getIndex()
//                + ", "
//                + model.getCity()
//                + ", "
//                + model.getStreet()
//                + ", "
//                + model.getHouse()
//                + ", "
//                + model.getAppartment());
//
//        model.setCreateDate(inputStringValueWithScanner
//                (CREATE_DATE, REGEX_CREATE_DATE));
//
//        model.setChangeDate(inputStringValueWithScanner
//                (CHANGE_DATE, REGEX_CHANGE_DATE));
    }
}
