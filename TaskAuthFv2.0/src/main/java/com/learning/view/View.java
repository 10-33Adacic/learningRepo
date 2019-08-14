package com.learning.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.learning.view.TextConstants.INPUT_STRING_DATA;
import static com.learning.view.TextConstants.WRONG_INPUT_DATA;
import static com.learning.view.TextConstants.LOGIN_EXIST;

/**
 * Created by Templar on 18.07.2019.
 */
public class View {
    public static final String CHOOSE_LANGUAGE = "Please, choose language (1 or 2):\n\r1. English\n\r2. Українська";
    public static final String WRONG_LANGUAGE_INPUT = "Wrong input. Please, try again";
    private String language;
    private Locale locale;
    private ResourceBundle bundle;

    public final ResourceBundle setProgramLanguage (String language, Locale locale) {
        String MESSAGES_BUNDLE_NAME = "messages";
        final ResourceBundle bundle =
                ResourceBundle.getBundle(
                        MESSAGES_BUNDLE_NAME,
                        getLocale());
        return bundle;
    }

    //Utilities methods
    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }
    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                getBundle().getString(INPUT_STRING_DATA),
                getBundle().getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                getBundle().getString(WRONG_INPUT_DATA),
                getBundle().getString(INPUT_STRING_DATA),
                getBundle().getString(message)));
    }

    public void printWrongNicknameInput(String message) {
        printMessage(concatenationString(
                getBundle().getString(LOGIN_EXIST),
                getBundle().getString(INPUT_STRING_DATA),
                getBundle().getString(message)));
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }
}
